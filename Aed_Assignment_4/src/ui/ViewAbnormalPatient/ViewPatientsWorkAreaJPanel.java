/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package ui.ViewAbnormalPatient;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonCatalog;
import model.Person;
import ui.Doctor.ManagePatientJPanel;







/**
 *
 * @author Rushabh
 */
public class ViewPatientsWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonCatalog personCatalog;

    /** Creates new form ProductManagerWorkAreaJPanel */
    public ViewPatientsWorkAreaJPanel(JPanel userProcessContainer, PersonCatalog personCatalog) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.personCatalog= personCatalog;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnViewAbnormalPatients = new javax.swing.JButton();

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Welcome !");
        lblTitle.setIconTextGap(20);

        btnViewAbnormalPatients.setText("View Abnormal Patients >>");
        btnViewAbnormalPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAbnormalPatientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewAbnormalPatients)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addGap(81, 81, 81)
                .addComponent(btnViewAbnormalPatients)
                .addContainerGap(399, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnViewAbnormalPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAbnormalPatientsActionPerformed
        ViewAbnormalPatientsJPanel vapj = new ViewAbnormalPatientsJPanel(userProcessContainer, personCatalog);
        userProcessContainer.add("ViewAbnormalPatientsJPanel", vapj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewAbnormalPatientsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewAbnormalPatients;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
