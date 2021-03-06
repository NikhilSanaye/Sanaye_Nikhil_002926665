package ui.AdminRole;

import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Car;
import model.CarCatalog;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class AddCarJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CarCatalog carCatalog;
    
    public AddCarJPanel(JPanel upc, CarCatalog carCatalog) {
        initComponents();
        userProcessContainer = upc;
        this.carCatalog = carCatalog;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblSerialNo = new javax.swing.JLabel();
        lblModelNo = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblManufacturingYear = new javax.swing.JLabel();
        lblNoOfSeats = new javax.swing.JLabel();
        lblMaintenanceCertificate = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        txtModelNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtManufacturingYear = new javax.swing.JTextField();
        txtNoOfSeats = new javax.swing.JTextField();
        txtMaintenanceCertificate = new javax.swing.JTextField();
        jCheckBoxAvailability = new javax.swing.JCheckBox();

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("New Car Information");

        lblManufacturer.setText("Manufacturer*:");

        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSerialNo.setText("Serial No*:");

        lblModelNo.setText("Model No*:");

        lblCity.setText("City:");

        lblAvailability.setText("Availability:");

        lblManufacturingYear.setText("Manufacturing Year:");

        lblNoOfSeats.setText("No. Of Seats:");

        lblMaintenanceCertificate.setText("Maintenance Certificate: ");

        txtMaintenanceCertificate.setText("mm/dd/yyyy");
        txtMaintenanceCertificate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaintenanceCertificateFocusGained(evt);
            }
        });
        txtMaintenanceCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaintenanceCertificateActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNoOfSeats)
                                    .addComponent(lblManufacturingYear)
                                    .addComponent(lblMaintenanceCertificate)
                                    .addComponent(lblAvailability)
                                    .addComponent(lblCity)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSerialNo)
                                        .addComponent(lblModelNo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblManufacturer)
                                        .addGap(1, 1, 1)))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxAvailability)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtNoOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtManufacturingYear, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtModelNo, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtSerialNo, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(txtMaintenanceCertificate, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNo)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNo)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailability, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBoxAvailability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturingYear)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoOfSeats)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaintenanceCertificate)
                    .addComponent(txtMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAdd)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        boolean availability=false;
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if(validateMandatoryFields()){
        Car car = carCatalog.addCar();
        //logic to add car details
        if(availability){
            car.setAvailability("true");
        }else{
            car.setAvailability("false");
        }
        car.setManufacturer(txtManufacturer.getText());
        car.setManufacturingYear(txtManufacturingYear.getText());
        car.setNumberOfSeats(txtNoOfSeats.getText());
        car.setSerialNumber(txtSerialNo.getText());
        car.setModelNumber(txtModelNo.getText());
        car.setCity(txtCity.getText());
        car.setMaintenanceCertificate(txtMaintenanceCertificate.getText());
        JOptionPane.showMessageDialog(null, "Car added successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        
        //update date & time
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        carCatalog.setCatalogeUpdatedDateTime(dateFormat.format(cal.getTime()));
        
        //clear form
        txtManufacturer.setText("");
        txtManufacturingYear.setText("");
        txtNoOfSeats.setText("");
        txtSerialNo.setText("");
        txtModelNo.setText("");
        txtCity.setText("");
        txtMaintenanceCertificate.setText("");
        jCheckBoxAvailability.setSelected(false);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void jCheckBoxAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAvailabilityActionPerformed
        // TODO add your handling code here:
        availability= true;
    }//GEN-LAST:event_jCheckBoxAvailabilityActionPerformed

    private void txtMaintenanceCertificateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaintenanceCertificateFocusGained
        // TODO add your handling code here:
        if(txtMaintenanceCertificate.getText().equals("mm/dd/yyyy")){
            txtMaintenanceCertificate.setText("");
        }
    }//GEN-LAST:event_txtMaintenanceCertificateFocusGained

    private void txtMaintenanceCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaintenanceCertificateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaintenanceCertificateActionPerformed

    private void backAction(){
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        ManageCarsJPanel ms = (ManageCarsJPanel) c;
        ms.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
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
    private javax.swing.JTextField txtMaintenanceCertificate;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialNo;
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
        
        if(checkDuplicateSerialNo()){
            JOptionPane.showMessageDialog(null, "Car's serial number should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(txtMaintenanceCertificate.getText().equals("mm/dd/yyyy")){
            txtMaintenanceCertificate.setText("");
        }
        if(!txtMaintenanceCertificate.getText().isEmpty()){
   
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
        String[] result = txtMaintenanceCertificate.getText().split("/");
        
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
