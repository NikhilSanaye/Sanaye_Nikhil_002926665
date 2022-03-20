package ui.Doctor;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
public class ManagePatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PersonCatalog personCatalog;
    public ManagePatientJPanel(JPanel upc, PersonCatalog personCatalog) {
        initComponents();
        userProcessContainer = upc;
        this.personCatalog = personCatalog;
        refreshTable();
    }
  
    public void refreshTable(){
        int rowCount = patientTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Person p : personCatalog.getPersonCatalog()) {
            Object row[] = new Object[7];
            row[0] = p;
            if(null!= p.getVitalSignsHistory() && p.getVitalSignsHistory().size()>0 ){
            row[1] = p.getVitalSignsHistory().get(0).getTemperature();
            row[2] = p.getVitalSignsHistory().get(0).getBloodPressure();
            row[3] = p.getVitalSignsHistory().get(0).getPulse();
            row[4] = p.getVitalSignsHistory().get(0).getDate();
            }
            row[5] = p.getAddress();
            row[6] = p.getCity();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnAddPatient = new javax.swing.JButton();
        lblManagePatient = new javax.swing.JLabel();
        btnInitializeData = new javax.swing.JButton();
        btnSearchPatient = new javax.swing.JButton();
        lblSearchPatient = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Temperature", "Blood Pressure", "Pulse", "Date", "Address", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            patientTable.getColumnModel().getColumn(0).setMaxWidth(150);
            patientTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            patientTable.getColumnModel().getColumn(3).setMaxWidth(50);
            patientTable.getColumnModel().getColumn(5).setPreferredWidth(200);
            patientTable.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View & update Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnAddPatient.setText("Add New..");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        lblManagePatient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblManagePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePatient.setText("Manage Patient");

        btnInitializeData.setText("Initialize Data");
        btnInitializeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitializeDataActionPerformed(evt);
            }
        });

        btnSearchPatient.setText("Go");
        btnSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatientActionPerformed(evt);
            }
        });

        lblSearchPatient.setText("Search Patient:");

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInitializeData, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblSearchPatient)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchPatient))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewDetails)))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddPatient, btnDelete, btnViewDetails});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblManagePatient))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPatient)
                    .addComponent(btnViewDetails)
                    .addComponent(btnDelete))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchPatient)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchPatient)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnInitializeData)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed

        AddPatientJPanel acjp = new AddPatientJPanel(userProcessContainer, personCatalog);
        userProcessContainer.add("AddCarJPanel", acjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed

        int row = patientTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person p = (Person)patientTable.getValueAt(row,0);     
        ViewPatientDetailsJPanel vpdjp = new ViewPatientDetailsJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewPatientDetailsJPanel", vpdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int row = patientTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person p = (Person) patientTable.getValueAt(row, 0);
        personCatalog.getPersonCatalog().remove(p);
        refreshTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed
    int count=0;
    private void btnInitializeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitializeDataActionPerformed
        // TODO add your handling code here:
        
        if(count==0){
        Person p1= new Person();p1.setVitalSignsHistory(new ArrayList<>());
        p1.setName("Ajay");p1.setAddress("Parker Hill");p1.setCity("Boston");
        VitalSigns e1= new VitalSigns();
        e1.setBloodPressure("1");e1.setTemperature("1");e1.setPulse("1");e1.setDate("1");
        p1.getVitalSignsHistory().add(e1);
        
        VitalSigns e2= new VitalSigns();
        e2.setBloodPressure("2");e2.setTemperature("2");e2.setPulse("2");e2.setDate("2");
        p1.getVitalSignsHistory().add(e2);
        
        Person p2= new Person();p2.setVitalSignsHistory(new ArrayList<>());
        p2.setName("Amit");p2.setAddress("Mission Hill");p2.setCity("Boston");
        VitalSigns e3= new VitalSigns();
        e3.setBloodPressure("1");e3.setTemperature("1");e3.setPulse("1");e3.setDate("1");
        p2.getVitalSignsHistory().add(e3);
        
        VitalSigns e4= new VitalSigns();
        e4.setBloodPressure("2");e4.setTemperature("2");e4.setPulse("2");e4.setDate("2");
        p2.getVitalSignsHistory().add(e4);
        
        personCatalog.getPersonCatalog().add(p1);
        personCatalog.getPersonCatalog().add(p2);

        
        
        refreshTable();
        count++;

        }else{
            JOptionPane.showMessageDialog(null, "Data Initialization can be done only once", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnInitializeDataActionPerformed

    private void btnSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatientActionPerformed
        
        if(validateInputName()){
        Person p = findPersonWithSerialNo(txtPatientName.getText());
        if(null!= p){
        ViewPatientDetailsJPanel vpd = new ViewPatientDetailsJPanel(userProcessContainer, p);
        userProcessContainer.add("ViewPatientDetailsJPanel", vpd);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "No person found with input name", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnSearchPatientActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInitializeData;
    private javax.swing.JButton btnSearchPatient;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManagePatient;
    private javax.swing.JLabel lblSearchPatient;
    private javax.swing.JTable patientTable;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputName() {
        if(txtPatientName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please provide input name", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if(txtPatientName.getText().length()>15){
            JOptionPane.showMessageDialog(null, "Invalid input serial no", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }  
        
        return true;
    }
    
    //find person
    private Person findPersonWithSerialNo(String name) {
        for(Person p: personCatalog.getPersonCatalog()){
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }
    
}
