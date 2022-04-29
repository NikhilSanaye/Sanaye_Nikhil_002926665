package ui.SalesManager;

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
import model.Order;
import model.OrderItems;
import model.Supplier;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class OrganizationOrdersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private User salesUser;
    private OrderItems orderItems;
    public ArrayList<OrderItems> orderList;
    
    public OrganizationOrdersJPanel(JPanel upc, User salesUser) {
        this.orderList = new ArrayList<OrderItems>();
        initComponents();
        userProcessContainer = upc;
        this.salesUser=salesUser;
        refreshTable();
    }



  
    public void refreshTable(){
        
        populateOrdersFromDB();
        
        int rowCount = supplierTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) supplierTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (OrderItems o : orderList) {
            Object row[] = new Object[4];
            row[0] = o;
            row[1] = o.productName;
            row[2] = o.getUnitPrice();
            row[3] = o.getDescription();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Id", "Product name", "Unit Price", "Product Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("All Orders");

        jButton1.setText("Back");
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
                        .addGap(2, 2, 2)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
        String query = "Select * from orderitems where organization='"+salesUser.getOrganization()+"'";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String orderId = rs.getString("orderId");
            String productId = rs.getString("productId");
            int quantity = rs.getInt("quantity");
            String productDescription = rs.getString("productDescription");
            String productName = rs.getString("productName");
            Double unitPrice = rs.getDouble("unitPrice");
            String organization = rs.getString("organization");

            createOrderItemsObject(orderId, productId, quantity, productDescription, productName, unitPrice, organization);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void createOrderItemsObject(String orderId, String productId, int quantity, String productDescription, String productName, Double unitPrice, String organization) {
        orderItems=new OrderItems();
        orderItems.setOrderId(Integer.parseInt(orderId));
        orderItems.setProductId(productId);
        orderItems.setQuantity(quantity);
        orderItems.setDescription(productDescription);
        orderItems.setProductName(productName);
        orderItems.setUnitPrice(unitPrice);
        orderItems.setOrganization(organization);

        
        orderList.add(orderItems);
    }

}
