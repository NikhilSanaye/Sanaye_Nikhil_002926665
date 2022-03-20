package ui.Doctor;

import java.awt.CardLayout;
//import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonCatalog;
import model.VitalSigns;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewVitalSignsDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private VitalSigns vitalSigns;

    public ViewVitalSignsDetailsJPanel(JPanel upc, VitalSigns v) {
        initComponents();
        userProcessContainer = upc;
        vitalSigns = v;        
        
        txtBloodPressure.setText(v.getBloodPressure());
        txtTemperature.setText(v.getTemperature());
        txtDate.setText(v.getDate());
        txtPulse.setText(v.getPulse());

    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("View Patient Details");

        lblTemperature.setText("Temperature:");

        txtTemperature.setEditable(false);
        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        lblPulse.setText("Pulse:");

        txtPulse.setEditable(false);

        btnUpdate.setText("Update Data");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtBloodPressure.setEditable(false);

        lblBloodPressure.setText("Blood Pressure:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblDate.setText("Date:");

        txtDate.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBloodPressure)
                                    .addComponent(lblTemperature)
                                    .addComponent(lblPulse)
                                    .addComponent(lblDate))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(172, 172, 172)
                                .addComponent(lblTitle))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        txtTemperature.setEditable(true);
        txtBloodPressure.setEditable(true);
        txtPulse.setEditable(true);
        txtDate.setEditable(true);
        

        //tblPatientRecord.setUpdateSelectionOnSort(true);
        //tblPatientRecord.putClientProperty("x", Boolean.TRUE);
        // tblPatientRecord.setEnabled(false);
       
        
          
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
          
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length-1];
        ViewPatientDetailsJPanel viewPatientDetailsJPanel = (ViewPatientDetailsJPanel) component;
        viewPatientDetailsJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        /*
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);*/
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if(validateMandatoryFields()){
        
        vitalSigns.setTemperature(txtTemperature.getText());
        vitalSigns.setBloodPressure(txtBloodPressure.getText());
        vitalSigns.setPulse(txtPulse.getText());
        vitalSigns.setDate(txtDate.getText());
     
        JOptionPane.showMessageDialog(null, "Vital signs updated successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
    
    private boolean validateMandatoryFields() {
        
        return true;
        
        /*
        if(txtName.getText().isEmpty() || txtCity.getText().isEmpty() || txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields with * are mandatory", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(txtName.getText().length()>15 || txtCity.getText().length()>15 || txtAddress.getText().length()>15 ){
            JOptionPane.showMessageDialog(null, "Manufacturer, Serial no & Model no can have max 15 characters", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        /*
        if(checkDuplicateSerialNo()){
            JOptionPane.showMessageDialog(null, "Person's serial number should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(!txtlMaintenanceCertificate.getText().isEmpty()){
        if(!validateDate()){
            JOptionPane.showMessageDialog(null, "Invalid date", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        }
        
        if(!txtManufacturingYear.getText().isEmpty()){
            if(txtManufacturingYear.getText().length()!=4 || checkIfCharsPresent(txtManufacturingYear.getText())){
                JOptionPane.showMessageDialog(null, "Invalid manufacturing year", "Info", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        
        if(!txtNoOfSeats.getText().isEmpty()){
            if(txtNoOfSeats.getText().length()>2 || checkIfCharsPresent(txtNoOfSeats.getText())){
                JOptionPane.showMessageDialog(null, "Invalid No of seats", "Info", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        
        return true;
    }

    private boolean checkDuplicateSerialNo() {
        for(Person c: carCatalog.getCarCatalog()){
            if(c.getSerialNumber().equals(txtCity.getText())){
                return true;
            }
        }
        return false;
    }

    private boolean validateDate() {
        String[] result = txtlMaintenanceCertificate.getText().split("/");
        
        if(result.length!=3){
            return false;
        }else{
            if(result[2].length()!=4){
                return false;
            }
            if(result[1].length()>2){
                return false;
            }
            if(result[0].length()>2){
                return false;
            }
            
            if(checkIfCharsPresent(result[2]) || checkIfCharsPresent(result[1]) || checkIfCharsPresent(result[0])){
                return false;
            }
            
            int month = Integer.parseInt(result[0]);
            int day = Integer.parseInt(result[1]);
            if(month>12 || day>31){
                return false;
            }
            }
        
        return true;
    }
    
        public boolean checkIfDigitsPresent(String s){
        for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                     return true;
                }              
            }
        return false;
    }
       
    public boolean checkIfCharsPresent(String s){
        for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                     return true;
                }              
            }
        return false;
        */
    }

}
