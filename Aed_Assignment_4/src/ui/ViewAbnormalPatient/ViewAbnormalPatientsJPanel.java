/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package ui.ViewAbnormalPatient;

import model.Person;
import model.SystemCatalog;
//import ui.SupplierRole.ViewProductDetailJPanel;
import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import ui.Doctor.ViewPatientDetailsJPanel;


/**
 *
 * @author Rushabh
 */
public class ViewAbnormalPatientsJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private SystemCatalog personCatalog;
    //private List<Patient> patientList;
    private List<Patient> patientCopy= new ArrayList<Patient>();


    /** Creates new form BrowseProducts */
    public ViewAbnormalPatientsJPanel(JPanel userProcessContainer, SystemCatalog personCatalog) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.personCatalog= personCatalog;
        filter(personCatalog);
        refreshTable();
    }
    
    public void refreshTable(){
        int rowCount = tblAbnormalPatients.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblAbnormalPatients.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Patient p : patientCopy) {
            Object row[] = new Object[7];
            row[0] = p;
            if(null!= p.getVitalSignsHistory() && p.getVitalSignsHistory().size()>0 ){
            row[1] = p.getVitalSignsHistory().get(0).getTemperature();
            row[2] = p.getVitalSignsHistory().get(0).getBloodPressure();
            row[3] = p.getVitalSignsHistory().get(0).getPulse();
            row[4] = p.getVitalSignsHistory().get(0).getDate();
            }
            if(null!=p.getResidence()){
                if(null!=p.getResidence().getCity())
                    row[5] = p.getResidence().getCity();
                if(null!=p.getResidence().getAddress())
                    row[6] = p.getResidence().getAddress();
            }
            model.addRow(row);
        }
    }

    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAbnormalPatients = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Abnormal Patients                                    ");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(20);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblAbnormalPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Temperature", "Blood Pressure", "Pulse", "Date", "City", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAbnormalPatients);

        btnViewDetails.setText("viewDetails");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnViewDetails)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnViewDetails)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int row = tblAbnormalPatients.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Patient p = (Patient)tblAbnormalPatients.getValueAt(row,0);     
        ViewAbnormalPatientDetailsJPanel vapdjp = new ViewAbnormalPatientDetailsJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewAbnormalPatientDetailsJPanel", vapdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAbnormalPatients;
    // End of variables declaration//GEN-END:variables


    private List<Patient> filter(SystemCatalog personCatalog) {
        //patientList= new ArrayList<Patient>();
        //patientList.addAll(personCatalog.getPatientCatalog());
        
        for(Patient p: personCatalog.getPatientCatalog()){
            
            if(null!= p.getVitalSignsHistory() && p.getVitalSignsHistory().size()>0 ){
            if(Integer.valueOf(p.getVitalSignsHistory().get(0).getBloodPressure())<120 || Integer.valueOf(p.getVitalSignsHistory().get(0).getBloodPressure())>130){
                patientCopy.add(p);
            }
            else if(Integer.valueOf(p.getVitalSignsHistory().get(0).getTemperature())>100){
                patientCopy.add(p);
            }
            else if(Integer.valueOf(p.getVitalSignsHistory().get(0).getPulse())<60 || Integer.valueOf(p.getVitalSignsHistory().get(0).getPulse())>100){
                patientCopy.add(p);
            }
            }
        }
        return patientCopy;
    }


}
