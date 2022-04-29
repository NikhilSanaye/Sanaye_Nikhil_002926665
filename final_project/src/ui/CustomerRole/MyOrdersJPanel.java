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
import model.Order;
import model.Supplier;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class MyOrdersJPanel extends javax.swing.JPanel {

    private JPanel customerUserProcessContainer;
    private SupplierDirectory supplierDirectory;
    private User loggedInUser;
    private Order order;
    public ArrayList<Order> orderList;
    
    public MyOrdersJPanel(JPanel upc, User loggedInUser) {
        this.orderList = new ArrayList<Order>();
        initComponents();
        customerUserProcessContainer = upc;
        this.loggedInUser=loggedInUser;
        refreshTable();
    }
    
 

  
    public void refreshTable(){
        
        populateOrdersFromDB();
        
        int rowCount = orderTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Order o : orderList) {
            Object row[] = new Object[4];
            row[0] = o;
            row[1] = o.getAddress();
            row[2] = o.getDeliveryState();
            row[3] = o.getOrderDate();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderTableJPanel = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewOrder = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Address", "Order Status", "Order Date"
            }
        ));
        orderTableJPanel.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            orderTable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        btnViewOrder.setText("View Order Details");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("My Orders");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(119, 119, 119)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orderTableJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(30, 30, 30)
                .addComponent(orderTableJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewOrder)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed

        int row = orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order o = (Order)orderTable.getValueAt(row,0);
        viewOrderDetails vodjp = new viewOrderDetails(customerUserProcessContainer,o);
        customerUserProcessContainer.add("viewOrderDetails", vodjp);
        CardLayout layout = (CardLayout) customerUserProcessContainer.getLayout();
        layout.next(customerUserProcessContainer);
        
    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        int row = orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier s = (Supplier)orderTable.getValueAt(row,0);
        ViewSupplier vs = new ViewSupplier(customerUserProcessContainer, s);
        customerUserProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) customerUserProcessContainer.getLayout();
        layout.next(customerUserProcessContainer);
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        customerUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) customerUserProcessContainer.getLayout();
        layout.previous(customerUserProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable orderTable;
    private javax.swing.JScrollPane orderTableJPanel;
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
        String query = "Select * from orders where mailId='"+loggedInUser.getMailId()+"'";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String orderId = rs.getString("orderId");
            String Address = rs.getString("Address");
            String City = rs.getString("City");
            String State = rs.getString("State");
            String deliveryState = rs.getString("deliveryState");
            String orderDate = rs.getString("orderDate");
            String RemainingDeliveryDays = rs.getString("RemainingDeliveryDays");
            String mailId = rs.getString("mailId");
            String country = rs.getString("country");
            createOrderObject(orderId, Address, City, State, deliveryState, orderDate, RemainingDeliveryDays, mailId, country);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void createOrderObject(String orderId, String Address, String City, String State, String deliveryState, String orderDate, String RemainingDeliveryDays, String mailId, String country) {
        order=new Order();
        order.setOrderId(Integer.parseInt(orderId));
        order.setAddress(Address);
        order.setCity(City);
        order.setState(State);
        order.setDeliveryState(deliveryState);
        order.setOrderDate(orderDate);
        order.setRemainingDeliveryDays(RemainingDeliveryDays);
        order.setMailId(mailId);
        order.setCountry(country);
        
        orderList.add(order);
    }

}
