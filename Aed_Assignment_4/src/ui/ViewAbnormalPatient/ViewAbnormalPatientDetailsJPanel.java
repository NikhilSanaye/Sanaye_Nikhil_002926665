package ui.ViewAbnormalPatient;

import ui.Doctor.*;
import java.awt.CardLayout;
//import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class ViewAbnormalPatientDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Person person;
    public ViewAbnormalPatientDetailsJPanel(JPanel upc, Person p) {
        initComponents();
        userProcessContainer = upc;
        person = p;
                
        txtName.setText(p.getName());
        txtCity.setText(p.getCity());
        txtAddress.setText(p.getAddress());
        txtAge.setText(p.getAge());
        txtGender.setText(p.getGender());
        refreshTable();

    }
    
    public void refreshTable(){
        int rowCount = tblPatientRecord.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblPatientRecord.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (VitalSigns v : person.getVitalSignsHistory()) {
            Object row[] = new Object[4];
            row[0] = v;
            row[1] = v.getBloodPressure();
            row[2] = v.getPulse();
            row[3] = v.getDate();
            model.addRow(row);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblModelNo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientRecord = new javax.swing.JTable();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("View Patient Details");

        lblName.setText("Name:");

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblAddress.setText("Address:");

        txtAddress.setEditable(false);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtCity.setEditable(false);

        lblCity.setText("City:");

        lblModelNo1.setText("Vital Record:");

        tblPatientRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Temperature", "Blood pressure", "Pulse", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientRecord);

        lblAge.setText("Age:");

        txtAge.setEditable(false);

        lblGender.setText("Gender:");

        txtGender.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity)
                            .addComponent(lblName)
                            .addComponent(lblAddress)
                            .addComponent(lblModelNo1)
                            .addComponent(lblAge)
                            .addComponent(lblGender))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack)
                        .addGap(172, 172, 172)
                        .addComponent(lblTitle)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModelNo1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewAbnormalPatientsJPanel viewAbnormalPatientsJPanel = (ViewAbnormalPatientsJPanel) component;
        viewAbnormalPatientsJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblModelNo1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatientRecord;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
    private boolean validateMandatoryFields() {
        
        if(checkSpecialCharacters(txtName.getText()) || checkSpecialCharacters(txtCity.getText()) || checkSpecialCharacters(txtAge.getText()) ){
            JOptionPane.showMessageDialog(null, "Special characters not allowed", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        
        if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields with * are mandatory", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(txtName.getText().length()>25 || txtAddress.getText().length()>25 || txtCity.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Nmae, Address & City can have max 25 characters", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
        if(txtAge.getText().length()>2 || checkIfCharsPresent(txtAge.getText())){
            JOptionPane.showMessageDialog(null, "Invalid age", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
         
        if(checkIfDigitsPresent(txtName.getText())){
            JOptionPane.showMessageDialog(null, "Invalid name", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } 
        
        
        if(checkIfDigitsPresent(txtCity.getText())){
            JOptionPane.showMessageDialog(null, "Invalid city", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
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
    
    public boolean checkSpecialCharacters(String s){
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = special.matcher(s);
        return hasSpecial.find();
    } 

}
