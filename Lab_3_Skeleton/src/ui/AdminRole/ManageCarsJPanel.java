package ui.AdminRole;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarCatalog;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ManageCarsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CarCatalog carCatalog;
    public ManageCarsJPanel(JPanel upc, CarCatalog carCatalog) {
        initComponents();
        userProcessContainer = upc;
        this.carCatalog = carCatalog;
        refreshTable();
    }
  
    public void refreshTable(){
        int rowCount = carsTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) carsTable.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (Car s : carCatalog.getCarCatalog()) {
            Object row[] = new Object[3];
            row[0] = s;
            row[1] = s.getManufacturer();
            row[2] = s.getModelNumber();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        carsTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddSupplier = new javax.swing.JButton();
        lblManageCars = new javax.swing.JLabel();
        btnInitializeCarData = new javax.swing.JButton();
        btnSearchCarWithSerialNo = new javax.swing.JButton();
        lblSearchCarWithSerialNo = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Car Serial No", "Car Manufacturer", "Car Model No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carsTable);
        if (carsTable.getColumnModel().getColumnCount() > 0) {
            carsTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            carsTable.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Delete");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnView.setText("View Car Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddSupplier.setText("Add New..");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        lblManageCars.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblManageCars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCars.setText("Manage Cars");

        btnInitializeCarData.setText("Initialize Car Data");
        btnInitializeCarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitializeCarDataActionPerformed(evt);
            }
        });

        btnSearchCarWithSerialNo.setText("Go");
        btnSearchCarWithSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCarWithSerialNoActionPerformed(evt);
            }
        });

        lblSearchCarWithSerialNo.setText("Search Car with Serial No:");

        txtSerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManageCars, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblSearchCarWithSerialNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnView)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnSearchCarWithSerialNo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInitializeCarData, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(36, 36, 36))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddSupplier, btnRemove, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblManageCars))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnAddSupplier)
                    .addComponent(btnRemove))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchCarWithSerialNo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchCarWithSerialNo)
                        .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnInitializeCarData)
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed

        AddCarJPanel as = new AddCarJPanel(userProcessContainer, carCatalog);
        userProcessContainer.add("AddCarJPanel", as);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = carsTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Car c = (Car)carsTable.getValueAt(row,0);     
        ViewCarDetailJPanel vs = new ViewCarDetailJPanel(userProcessContainer, c, carCatalog);
        userProcessContainer.add("ViewCarDetailJPanel", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int row = carsTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Car c = (Car) carsTable.getValueAt(row, 0);
        carCatalog.removeProduct(c);
        refreshTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed
    int count=0;
    private void btnInitializeCarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitializeCarDataActionPerformed
        // TODO add your handling code here:
        if(count==0){
        Car c1= new Car();
        c1.setManufacturer("Maruti"); c1.setSerialNumber("11111");c1.setModelNumber("Dzire");c1.setCity("Mumbai");c1.setAvailability("true");c1.setManufacturingYear("2020");c1.setNumberOfSeats("4");c1.setMaintenanceCertificate("12/12/2025");
        Car c2= new Car();
        c2.setManufacturer("Maruti"); c2.setSerialNumber("22222");c2.setModelNumber("Baleno");c2.setCity("Delhi");c2.setAvailability("true");c2.setManufacturingYear("2020");c2.setNumberOfSeats("4");c2.setMaintenanceCertificate("12/12/2025");
        Car c3= new Car();
        c3.setManufacturer("Maruti"); c3.setSerialNumber("33333");c3.setModelNumber("Brezza");c3.setCity("Kolkata");c3.setAvailability("true");c3.setManufacturingYear("2020");c3.setNumberOfSeats("4");c3.setMaintenanceCertificate("12/12/2025");
        Car c4= new Car();
        c4.setManufacturer("Maruti"); c4.setSerialNumber("44444");c4.setModelNumber("Swift");c4.setCity("Mumbai");c4.setAvailability("true");c4.setManufacturingYear("2020");c4.setNumberOfSeats("4");c4.setMaintenanceCertificate("12/12/2025");
        Car c5= new Car();
        c5.setManufacturer("Maruti"); c5.setSerialNumber("55555");c5.setModelNumber("Celerio");c5.setCity("Delhi");c5.setAvailability("true");c5.setManufacturingYear("2020");c5.setNumberOfSeats("4");c5.setMaintenanceCertificate("12/12/2025");
        Car c6= new Car();
        c6.setManufacturer("Maruti"); c6.setSerialNumber("66666");c6.setModelNumber("xl6");c6.setCity("Kolkata");c6.setAvailability("true");c6.setManufacturingYear("2020");c6.setNumberOfSeats("6");c6.setMaintenanceCertificate("12/12/2025");
        
        Car c7= new Car();
        c7.setManufacturer("Hundai"); c7.setSerialNumber("77777");c7.setModelNumber("Elentra");c7.setCity("Mumbai");c7.setAvailability("true");c7.setManufacturingYear("2020");c7.setNumberOfSeats("4");c7.setMaintenanceCertificate("12/12/2025");
        Car c8= new Car();
        c8.setManufacturer("Hundai"); c8.setSerialNumber("88888");c8.setModelNumber("Creta");c8.setCity("Delhi");c8.setAvailability("true");c8.setManufacturingYear("2020");c8.setNumberOfSeats("4");c8.setMaintenanceCertificate("12/12/2025");
        Car c9= new Car();
        c9.setManufacturer("Hundai"); c9.setSerialNumber("99999");c9.setModelNumber("Brezza");c9.setCity("Kolkata");c9.setAvailability("true");c9.setManufacturingYear("2020");c9.setNumberOfSeats("4");c9.setMaintenanceCertificate("12/12/2025");
        Car c10= new Car();
        c10.setManufacturer("Hundai"); c10.setSerialNumber("44444");c10.setModelNumber("Accent");c10.setCity("Mumbai");c10.setAvailability("true");c10.setManufacturingYear("2020");c10.setNumberOfSeats("4");c10.setMaintenanceCertificate("12/12/2025");
        Car c11= new Car();
        c11.setManufacturer("Hundai"); c11.setSerialNumber("55555");c11.setModelNumber("Venue");c11.setCity("Delhi");c11.setAvailability("true");c11.setManufacturingYear("2020");c11.setNumberOfSeats("4");c11.setMaintenanceCertificate("12/12/2025");
        Car c12= new Car();
        c12.setManufacturer("Hundai"); c12.setSerialNumber("66666");c12.setModelNumber("i10");c12.setCity("Kolkata");c12.setAvailability("true");c12.setManufacturingYear("2020");c12.setNumberOfSeats("6");c12.setMaintenanceCertificate("12/12/2025");
        
        carCatalog.getCarCatalog().add(c1);
        carCatalog.getCarCatalog().add(c2);
        carCatalog.getCarCatalog().add(c3);
        carCatalog.getCarCatalog().add(c4);
        carCatalog.getCarCatalog().add(c5);
        carCatalog.getCarCatalog().add(c6);
        carCatalog.getCarCatalog().add(c7);
        carCatalog.getCarCatalog().add(c8);
        carCatalog.getCarCatalog().add(c9);
        carCatalog.getCarCatalog().add(c10);
        carCatalog.getCarCatalog().add(c11);
        carCatalog.getCarCatalog().add(c12);
        
        
        refreshTable();
        count++;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        carCatalog.setCatalogeUpdatedDateTime(dateFormat.format(cal.getTime()));
        }else{
            JOptionPane.showMessageDialog(null, "Data Initialization can be done only once", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInitializeCarDataActionPerformed

    private void btnSearchCarWithSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCarWithSerialNoActionPerformed
        if(validateInputSerialNo()){
        Car c = findCarWithSerialNo(txtSerialNo.getText());
        if(null!=c){
        ViewCarDetailJPanel vs = new ViewCarDetailJPanel(userProcessContainer, c, carCatalog);
        userProcessContainer.add("ViewCarDetailJPanel", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "No car founf with serial no", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnSearchCarWithSerialNoActionPerformed

    private void txtSerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInitializeCarData;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearchCarWithSerialNo;
    private javax.swing.JButton btnView;
    private javax.swing.JTable carsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageCars;
    private javax.swing.JLabel lblSearchCarWithSerialNo;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputSerialNo() {
        if(txtSerialNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please provide input serial no", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if(txtSerialNo.getText().length()>25){
            JOptionPane.showMessageDialog(null, "Invalid input serial no", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }  
        
        return true;
    }
    
    private Car findCarWithSerialNo(String serialNo) {
        for(Car c: carCatalog.getCarCatalog()){
            if(c.getSerialNumber().equals(serialNo)){
                return c;
            }
        }
        return null;
    }

}
