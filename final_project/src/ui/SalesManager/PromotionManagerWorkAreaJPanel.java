package ui.SalesManager;

import ui.AdminRole.*;
import model.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import model.User;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class PromotionManagerWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public User salesManagerUser;
    public PromotionManagerWorkAreaJPanel(JPanel userProcessContainer,User salesManagerUser) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
        this.salesManagerUser=salesManagerUser;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageSuppliers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageSuppliers2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        btnManageSuppliers.setText("View Orders >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Promotion manager's Work Area");

        btnManageSuppliers2.setText("Create promotions >>");
        btnManageSuppliers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageSuppliers2)
                    .addComponent(btnManageSuppliers))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(btnManageSuppliers)
                .addGap(18, 18, 18)
                .addComponent(btnManageSuppliers2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
    OrganizationOrdersJPanel ms = new OrganizationOrdersJPanel(userProcessContainer, salesManagerUser);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnManageSuppliers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers2ActionPerformed
        // TODO add your handling code here:ManagePromptionsJPanel
        ManagePromptionsJPanel mpjp = new ManagePromptionsJPanel(userProcessContainer, salesManagerUser);
    userProcessContainer.add("ManagePromptionsJPanel", mpjp);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliers2ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnManageSuppliers2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
