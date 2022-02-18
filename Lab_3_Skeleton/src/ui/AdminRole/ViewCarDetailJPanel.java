package ui.AdminRole;

import java.awt.CardLayout;
//import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.CarCatalog;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewCarDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Car car;
    private CarCatalog carCatalog;
    public ViewCarDetailJPanel(JPanel upc, Car c, CarCatalog cc) {
        initComponents();
        userProcessContainer = upc;
        car = c;
        carCatalog= cc;
        txtManufacturer.setText(c.getManufacturer());
        txtSerialNo.setText(c.getSerialNumber());
        txtModelNo.setText(c.getModelNumber());
        txtCity.setText(c.getCity());
        txtManufacturingYear.setText(c.getManufacturingYear());
        txtNoOfSeats.setText(c.getNumberOfSeats());
        txtlMaintenanceCertificate.setText(c.getMaintenanceCertificate());
        jCheckBoxAvailability.setSelected(Boolean. valueOf(c.getAvailability()));
        jCheckBoxAvailability.setEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        lblModelNo = new javax.swing.JLabel();
        txtModelNo = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtSerialNo = new javax.swing.JTextField();
        lblSerialNo = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblManufacturingYear = new javax.swing.JLabel();
        lblNoOfSeats = new javax.swing.JLabel();
        lblMaintenanceCertificate = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtManufacturingYear = new javax.swing.JTextField();
        txtNoOfSeats = new javax.swing.JTextField();
        txtlMaintenanceCertificate = new javax.swing.JTextField();
        jCheckBoxAvailability = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("View Car Details");

        lblManufacturer.setText("Manufacturer:");

        txtManufacturer.setEditable(false);
        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        lblModelNo.setText("Model No:");

        txtModelNo.setEditable(false);

        btnUpdate.setText("Update Product");
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

        txtSerialNo.setEditable(false);

        lblSerialNo.setText("Serial no:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        lblAvailability.setText("Availability:");

        lblManufacturingYear.setText("Manufacturing Year:");

        lblNoOfSeats.setText("No. Of Seats:");

        lblMaintenanceCertificate.setText("Maintenance Certificate:");

        txtCity.setEditable(false);

        txtManufacturingYear.setEditable(false);

        txtNoOfSeats.setEditable(false);

        txtlMaintenanceCertificate.setEditable(false);

        jCheckBoxAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAvailabilityActionPerformed(evt);
            }
        });

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
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaintenanceCertificate)
                    .addComponent(lblNoOfSeats)
                    .addComponent(lblManufacturingYear)
                    .addComponent(lblAvailability)
                    .addComponent(lblCity)
                    .addComponent(lblSerialNo)
                    .addComponent(lblManufacturer)
                    .addComponent(lblModelNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAvailability))
                .addGap(128, 128, 128))
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
                    .addComponent(lblManufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNo)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNo)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxAvailability)
                    .addComponent(lblAvailability))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufacturingYear)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoOfSeats)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaintenanceCertificate)
                    .addComponent(txtlMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(144, 144, 144))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        txtManufacturer.setEditable(true);
        txtSerialNo.setEditable(false);
        txtModelNo.setEditable(true);
        txtCity.setEditable(true);
        jCheckBoxAvailability.setEnabled(true);
        txtManufacturingYear.setEditable(true);
        txtNoOfSeats.setEditable(true);
        txtlMaintenanceCertificate.setEditable(true);
        
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCarsJPanel manageCarsJPanel = (ManageCarsJPanel) component;
        manageCarsJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if(validateMandatoryFields()){
        
        car.setManufacturer(txtManufacturer.getText());
        car.setSerialNumber(txtSerialNo.getText());
        car.setModelNumber(txtModelNo.getText());
        car.setCity(txtCity.getText());
        if(jCheckBoxAvailability.isSelected()){
            car.setAvailability("true");
        }else{
            car.setAvailability("false");
        }
        car.setManufacturingYear(txtManufacturingYear.getText());
        car.setNumberOfSeats(txtNoOfSeats.getText());
        car.setMaintenanceCertificate(txtlMaintenanceCertificate.getText());
        JOptionPane.showMessageDialog(null, "Car details updated successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        carCatalog.setCatalogeUpdatedDateTime(dateFormat.format(cal.getTime()));
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void jCheckBoxAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAvailabilityActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox jCheckBoxAvailability;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintenanceCertificate;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblManufacturingYear;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblNoOfSeats;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtlMaintenanceCertificate;
    // End of variables declaration//GEN-END:variables
    
    private boolean validateMandatoryFields() {
        if(txtManufacturer.getText().isEmpty() || txtSerialNo.getText().isEmpty() || txtModelNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields with * are mandatory", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(txtManufacturer.getText().length()>15 || txtSerialNo.getText().length()>15 || txtModelNo.getText().length()>15 ){
            JOptionPane.showMessageDialog(null, "Manufacturer, Serial no & Model no can have max 15 characters", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        /*
        if(checkDuplicateSerialNo()){
            JOptionPane.showMessageDialog(null, "Car's serial number should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }*/
        
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
        for(Car c: carCatalog.getCarCatalog()){
            if(c.getSerialNumber().equals(txtSerialNo.getText())){
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
    }

}
