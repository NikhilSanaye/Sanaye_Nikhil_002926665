/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package ui.CustomerRole;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import model.Car;
import model.CarCatalog;
import ui.AdminRole.ManageCarsJPanel;

/**
 *
 * @author Rushabh
 */
public class ViewCarJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private Car car;
    /** Creates new form CreateProductJPanel */
    public ViewCarJPanel(JPanel userProcessContainer, Car c) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.car= c;
        
        txtManufacturer.setText(c.getManufacturer());
        txtModelNo.setText(c.getModelNumber());
        txtSerialNo.setText(c.getSerialNumber());
        txtNoOfSeats.setText(c.getNumberOfSeats());
        txtCity.setText(c.getCity());
        txtManufacturingYear.setText(c.getManufacturingYear());
        txtlMaintenanceCertificate.setText(c.getMaintenanceCertificate());
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblManufacturer = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        lblSerialNo = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        txtModelNo = new javax.swing.JTextField();
        lblModelNo = new javax.swing.JLabel();
        lblNoOfSeats = new javax.swing.JLabel();
        txtNoOfSeats = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblManufacturingYear = new javax.swing.JLabel();
        txtManufacturingYear = new javax.swing.JTextField();
        lblMaintenanceCertificate = new javax.swing.JLabel();
        txtlMaintenanceCertificate = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("First Available Cab");

        lblManufacturer.setText("Manufacturer:");

        txtManufacturer.setEditable(false);

        lblSerialNo.setText("Serial No:");

        txtSerialNo.setEditable(false);

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtModelNo.setEditable(false);

        lblModelNo.setText("Model No:");

        lblNoOfSeats.setText("No. Of Seats:");

        txtNoOfSeats.setEditable(false);

        lblCity.setText("City:");

        txtCity.setEditable(false);

        lblManufacturingYear.setText("Manufacturing Year:");

        txtManufacturingYear.setEditable(false);
        txtManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturingYearActionPerformed(evt);
            }
        });

        lblMaintenanceCertificate.setText("Maintenance Certificate:");

        txtlMaintenanceCertificate.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(186, 186, 186)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblManufacturer, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblModelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSerialNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNoOfSeats, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(backButton1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaintenanceCertificate)
                                .addGap(18, 18, 18)
                                .addComponent(txtlMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblManufacturingYear)
                                .addGap(18, 18, 18)
                                .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtManufacturer, txtModelNo, txtNoOfSeats, txtSerialNo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton1)
                    .addComponent(jLabel1))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoOfSeats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufacturingYear)
                    .addComponent(txtManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaintenanceCertificate)
                    .addComponent(txtlMaintenanceCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
        
    }//GEN-LAST:event_backButton1ActionPerformed

    private void txtManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturingYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturingYearActionPerformed
    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblMaintenanceCertificate;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblManufacturingYear;
    private javax.swing.JLabel lblModelNo;
    private javax.swing.JLabel lblNoOfSeats;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtManufacturingYear;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtlMaintenanceCertificate;
    // End of variables declaration//GEN-END:variables
    
}
