package ui.CustomerRole;

import ui.SupplierRole.*;
import java.awt.CardLayout;
import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
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
        txtOrderId.setText(String.valueOf(c.getOrderId()));
        txtProductName.setText(c.getProductName());
        //txtProductFeedback.setText(String.valueOf(p.getPrice()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        lblProductPrice = new javax.swing.JLabel();
        txtProductFeedback = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        txtProductFeedback.setEditable(false);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtProductName.setEditable(false);
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        lblProductId.setText("Product name:");

        jButton1.setText("Refund");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Replace");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addGap(172, 172, 172)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductPrice, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductId)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductPrice)
                    .addComponent(txtProductFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtProductFeedback;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
