package ui.CustomerRole;

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
public class RefundReturnJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private User loggedInUser;
    private Order order;
    public ArrayList<Order> orderList;
    private Consignment consignment;
    private ArrayList<Consignment> consignmentList= new ArrayList<Consignment>();
    
    public RefundReturnJPanel(JPanel upc, User loggedInUser) {
        this.orderList = new ArrayList<Order>();
        initComponents();
        userProcessContainer = upc;
        this.loggedInUser=loggedInUser;
        refreshTable();
    }

  
    public void refreshTable(){
        
        populateOrdersFromDB();
        
        int rowCount = supplierTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
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
        supplierTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnView1 = new javax.swing.JButton();

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(supplierTable);
        if (supplierTable.getColumnModel().getColumnCount() > 0) {
            supplierTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            supplierTable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setText("Raise Complaint/Request for return or replacement");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Completed Orders");

        btnView1.setText("Provide Feedback");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
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
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView1)
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = supplierTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier s = (Supplier)supplierTable.getValueAt(row,0);
        ViewSupplierCatalogJPanel vs = new ViewSupplierCatalogJPanel(userProcessContainer, s);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        int row = supplierTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier s = (Supplier)supplierTable.getValueAt(row,0);
        ViewSupplier vs = new ViewSupplier(userProcessContainer, s);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnView1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnView1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable supplierTable;
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
        String query = "Select * from orders where mailId='"+loggedInUser.getMailId()+"' and deliveryState='Delivered'";     
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
