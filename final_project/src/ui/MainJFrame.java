/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import model.SupplierDirectory;
import ui.AdminRole.AdminLoginJPanel;
import ui.AdminRole.AdminWorkAreaJPanel;
import ui.CustomerRole.CustomerLoginJPanel;
import ui.SalesManager.SalesManagerLoginJPanel;
import ui.SupplierRole.SupplierLoginJPanel;
import ui.SupportCenter.SupportLoginJPanel;
import ui.logistics.LogisticsLoginJPanel;

/**
 *
 * @author archil
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    SupplierDirectory supplierDirectory;
    
    public MainJFrame() {
        initComponents();
        supplierDirectory = new SupplierDirectory();
        setSize(830,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnSupplier1 = new javax.swing.JButton();
        btnSupplier2 = new javax.swing.JButton();
        btnSupplier3 = new javax.swing.JButton();
        btnCustomerSupport = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab 5 Skeleton");

        splitPane.setDividerLocation(150);
        splitPane.setOpaque(false);

        btnAdmin.setText("Administrator");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSupplier.setText("Supplier");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        btnSupplier1.setText("Sales Manager");
        btnSupplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier1ActionPerformed(evt);
            }
        });

        btnSupplier2.setText("Customer");
        btnSupplier2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier2ActionPerformed(evt);
            }
        });

        btnSupplier3.setText("Logistics");
        btnSupplier3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier3ActionPerformed(evt);
            }
        });

        btnCustomerSupport.setText("Customer Support");
        btnCustomerSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSupportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSupplier2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSupplier3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustomerSupport, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnSupplier});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSupplier1)
                .addGap(12, 12, 12)
                .addComponent(btnSupplier3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomerSupport)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        AdminLoginJPanel awajp = new AdminLoginJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("AdminLoginJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed

        SupplierLoginJPanel sljp = new SupplierLoginJPanel(userProcessContainer);
        userProcessContainer.add("SupplierLoginJPanel", sljp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        /*
        LoginSupplierJPanel ls = new LoginSupplierJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("LoginSupplierJPanel", ls);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnSupplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplier1ActionPerformed
        // TODO add your handling code here:
        SalesManagerLoginJPanel sljp = new SalesManagerLoginJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("SupplierLoginJPanel", sljp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplier1ActionPerformed

    private void btnSupplier2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplier2ActionPerformed
        // TODO add your handling code here:
        CustomerLoginJPanel cljp = new CustomerLoginJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("CustomerLoginJPanel",cljp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplier2ActionPerformed

    private void btnSupplier3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplier3ActionPerformed
        // TODO add your handling code here:
        LogisticsLoginJPanel lljp = new LogisticsLoginJPanel(userProcessContainer, supplierDirectory);
        userProcessContainer.add("LogisticsLoginJPanel", lljp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplier3ActionPerformed

    private void btnCustomerSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSupportActionPerformed
        // TODO add your handling code here:
        SupportLoginJPanel sljp = new SupportLoginJPanel(userProcessContainer);
        userProcessContainer.add("SupportLoginJPanel", sljp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomerSupportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCustomerSupport;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnSupplier1;
    private javax.swing.JButton btnSupplier2;
    private javax.swing.JButton btnSupplier3;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
