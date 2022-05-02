package ui.logistics;

import ui.CustomerRole.*;
import ui.AdminRole.*;
import model.User;
import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Consignment;
import model.Order;
import model.Supplier;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class LogisticsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private User loggedInUser;
    private Order order;
    public ArrayList<Order> orderList;
    private Consignment consignment;
    private ArrayList<Consignment> consignmentList= new ArrayList<Consignment>();
    
    public LogisticsJPanel(JPanel userProcessContainer) {
        this.orderList = new ArrayList<Order>();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        refreshTable();
    }


  
    public void refreshTable(){
        
        populateOrdersFromDB();
        
        int rowCount = tblOrders.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Consignment c : consignmentList) {
            Object row[] = new Object[3];
            row[0] = c;
            row[1] = c.getDeliveryState();
            row[2] = c.getProductName();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Consignment Id", "Delivery Status", "Product name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);
        if (tblOrders.getColumnModel().getColumnCount() > 0) {
            tblOrders.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblOrders.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("All Orders");

        jButton1.setText("Update delivery status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = tblOrders.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Consignment c = (Consignment)tblOrders.getValueAt(row,0);
        ViewConsignmentDetailJPanel vcdjp = new ViewConsignmentDetailJPanel(userProcessContainer, c);
        userProcessContainer.add("ViewConsignmentDetailJPanel", vcdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables


    private void createSupplierObject(String userId, String password, String role, String mailId, String address, String contactNumber, String SSN, String registrationState) {
        Supplier newSupplier = new Supplier();
        newSupplier.setUserId(userId);
        newSupplier.setPassword(password);
        newSupplier.setRole(role);
        newSupplier.setMailId(mailId);
        newSupplier.setAddress(address);
        newSupplier.setContactNumber(contactNumber);
        newSupplier.setSSN(SSN);
        newSupplier.setRegistrationState(registrationState);
        supplierDirectory.getSupplierlist().add(newSupplier);
    }

    private void populateOrdersFromDB() {
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "Select * from orders";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            int orderId = rs.getInt("orderId");
            String Address = rs.getString("Address");
            String City = rs.getString("City");
            String State = rs.getString("State");
            String deliveryState = rs.getString("deliveryState");
            String orderDate = rs.getString("orderDate");
            String RemainingDeliveryDays = rs.getString("RemainingDeliveryDays");
            String mailId = rs.getString("mailId");
            String country = rs.getString("country");    
            
            createOrderObject(orderId, Address, City, State, deliveryState,orderDate, RemainingDeliveryDays, mailId, country);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void createOrderObject(int orderId, String Address, String City, String State, String deliveryState, String orderDate, String RemainingDeliveryDays, String mailId, String country) {
        order=new Order();  
        
        order.setOrderId(orderId);
        order.setAddress(Address);
        order.setCity(City);
        order.setState(State);
        order.setDeliveryState(deliveryState);
        order.setOrderDate(orderDate);
        order.setRemainingDeliveryDays(RemainingDeliveryDays);
        order.setMailId(mailId);
        order.setCountry(country);
        
        //int itemNumber= calculateNumberOfItemsInOrder(orderId);
        //for(int i=0;i<itemNumber;i++){
            fetchOrderItemsFromOrderId(order);
        //}   
    }
    
    public void fetchOrderItemsFromOrderId(Order order){
       try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "Select * from orderitems where orderId='"+order.getOrderId()+"'";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String productId = rs.getString("productId");
            int quantity = rs.getInt("quantity");
            String description = rs.getString("productDescription");
            Double unitPrice = rs.getDouble("unitPrice");
            String productName = rs.getString("productName");
            createConsignmentObject(order,productId, quantity, description, unitPrice, productName);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        } 
    }

    private int calculateNumberOfItemsInOrder(int orderId) {
        int itemNumber=0;
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "Select count(*) count from orderitems where orderId='"+orderId+"'";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        if(rs.next()) {
            itemNumber = rs.getInt("count");            
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        } 
        return itemNumber;
    }

    private void createConsignmentObject(Order order, String productId, int quantity, String description, double unitPrice, String productName) {
        Consignment c= new Consignment();
        c.setOrderId(order.getOrderId());
        c.setAddress(order.getAddress());
        c.setCity(order.getCity());
        c.setState(order.getState());
        c.setDeliveryState(order.getDeliveryState());
        c.setOrderDate(order.getOrderDate());
        c.setRemainingDeliveryDays(order.getRemainingDeliveryDays());
        c.setCountry(order.getCountry());
        c.setMailId(order.getMailId());
        c.setProductId(productId);
        c.setProductName(productName);
        c.setQuantity(quantity);
        c.setDescription(description);
        c.setUnitPrice(unitPrice);
        
        consignmentList.add(c);
    }


}
