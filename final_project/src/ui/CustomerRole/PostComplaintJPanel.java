package ui.CustomerRole;

import ui.SupplierRole.*;
import java.awt.CardLayout;
import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Consignment;
import model.Product;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class PostComplaintJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Consignment c;
    public PostComplaintJPanel(JPanel upc, Consignment c) {
        initComponents();
        userProcessContainer = upc;
        this.c = c;
        loadDropDown();
        txtOrderId.setText(String.valueOf(c.getOrderId()));
        txtProductName.setText(c.getProductName());
    }

    private void loadDropDown(){
         
        String[] s= new String[2];
        s[0]= "Refund";s[1]= "Replace";
        
        cmbResolutionType.setModel(new javax.swing.DefaultComboBoxModel<>(s));      
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        lblProductPrice = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFeedback = new javax.swing.JTextArea();
        cmbResolutionType = new javax.swing.JComboBox();
        lblProductPrice1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Complaint");

        lblProductName.setText("Order id:");

        txtOrderId.setEditable(false);
        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });

        lblProductPrice.setText("Complaint:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtProductName.setEditable(false);
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        lblProductId.setText("Product name:");

        jFeedback.setColumns(20);
        jFeedback.setRows(5);
        jScrollPane1.setViewportView(jFeedback);

        cmbResolutionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbResolutionTypeActionPerformed(evt);
            }
        });

        lblProductPrice1.setText("What do u Expect:");

        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductPrice, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblProductPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addComponent(cmbResolutionType, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(btnBack1)
                    .addContainerGap(464, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductId)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductPrice))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbResolutionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductPrice1))
                .addGap(33, 33, 33)
                .addComponent(btnSubmit)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(btnBack1)
                    .addContainerGap(416, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String complaintDesc=jFeedback.getText();
        String resolutionType=cmbResolutionType.getSelectedItem().toString();
        String record_Type="Record_Type";
        try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
                String regState="pending";
                String role="supplier";
                String query = "INSERT INTO customer_support(`orderId`, `ComplaintDescription`,`ProductName`,`ResolutionType`,`Record_Type`)"
                + " VALUES ('"+c.getOrderId()+"','"+complaintDesc+"','"+c.getProductName()+"','"+resolutionType+"','"+record_Type+"')";

                Statement st = connection.createStatement();
                int rs = st.executeUpdate(query);
                if(rs>0){
                    JOptionPane.showMessageDialog(null, "Your Complaint has been recorded", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }        
     
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void cmbResolutionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbResolutionTypeActionPerformed
        

    }//GEN-LAST:event_cmbResolutionTypeActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbResolutionType;
    private javax.swing.JTextArea jFeedback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductPrice1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
