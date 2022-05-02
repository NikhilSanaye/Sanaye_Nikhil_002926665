package ui.SalesManager;

import ui.AdminRole.*;
import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import ui.CustomerRole.CustomerWorkAreaJPanel;
/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class SalesManagerWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public User salesManagerUser;
    public SalesManagerWorkAreaJPanel(JPanel userProcessContainer,User salesManagerUser) {
        
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
        btnManageSuppliers1 = new javax.swing.JButton();
        btnManageSuppliers3 = new javax.swing.JButton();
        btnManageSuppliers2 = new javax.swing.JButton();
        btnManageSuppliers4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        btnManageSuppliers.setText("View Orders >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales manager's Work Area");

        btnManageSuppliers1.setText("View Sales By Brand >>");
        btnManageSuppliers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers1ActionPerformed(evt);
            }
        });

        btnManageSuppliers3.setText("View Monthly chart >>");
        btnManageSuppliers3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers3ActionPerformed(evt);
            }
        });

        btnManageSuppliers2.setText("View Sales By Category >>");
        btnManageSuppliers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers2ActionPerformed(evt);
            }
        });

        btnManageSuppliers4.setText("View Yearly chart >>");
        btnManageSuppliers4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers4ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageSuppliers2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageSuppliers1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageSuppliers3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageSuppliers4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(btnManageSuppliers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageSuppliers1)
                .addGap(9, 9, 9)
                .addComponent(btnManageSuppliers2)
                .addGap(18, 18, 18)
                .addComponent(btnManageSuppliers3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageSuppliers4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
    OrganizationOrdersJPanel oojp = new OrganizationOrdersJPanel(userProcessContainer, salesManagerUser);
    userProcessContainer.add("OrganizationOrdersJPanel", oojp);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnManageSuppliers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers1ActionPerformed
        // TODO add your handling code here:
        PolarChart test = new PolarChart();
        test.runChart();
        
        
 
    //userProcessContainer.add("TestJpanel", test);
    //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    //layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliers1ActionPerformed

    private void btnManageSuppliers3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers3ActionPerformed
        // TODO add your handling code here:
        BarChart m = new BarChart();
        m.ShowBarChart();
    }//GEN-LAST:event_btnManageSuppliers3ActionPerformed

    private void btnManageSuppliers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers2ActionPerformed
        // TODO add your handling code here:
        PolarChart2 test = new PolarChart2();
        test.runChart();
    }//GEN-LAST:event_btnManageSuppliers2ActionPerformed

    private void btnManageSuppliers4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers4ActionPerformed
        // TODO add your handling code here:
        BarChart2 m = new BarChart2();
        m.ShowBarChart();
    }//GEN-LAST:event_btnManageSuppliers4ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnManageSuppliers1;
    private javax.swing.JButton btnManageSuppliers2;
    private javax.swing.JButton btnManageSuppliers3;
    private javax.swing.JButton btnManageSuppliers4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
