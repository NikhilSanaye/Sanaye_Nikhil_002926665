package ui.AdminRole;

import model.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
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
        btnManageSuppliers1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        btnManageSuppliers.setText("Manage Suppliers >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator's Work Area");

        btnManageSuppliers1.setText("Approve suppliers request >>");
        btnManageSuppliers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnManageSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnManageSuppliers1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(btnManageSuppliers)
                .addGap(28, 28, 28)
                .addComponent(btnManageSuppliers1)
                .addGap(414, 414, 414))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
        ManageSuppliersJPanel ms = new ManageSuppliersJPanel(userProcessContainer);
        userProcessContainer.add("ManageSupplierAdministrative", ms);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnManageSuppliers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers1ActionPerformed
        SupplierRequestActionJPanel sraj = new SupplierRequestActionJPanel(userProcessContainer);
        userProcessContainer.add("SupplierRequestActionJPanel", sraj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliers1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnManageSuppliers1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
