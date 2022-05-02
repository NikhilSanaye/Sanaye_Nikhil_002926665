package ui.CustomerRole;

import ui.SupplierRole.*;
import java.awt.CardLayout;
import ui.AdminRole.ManageSuppliersJPanel;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import model.Product;
import model.User;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewProfileDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private String userName;
    public User user;
    public ViewProfileDetailJPanel(JPanel upc, String s) {
        initComponents();
        userProcessContainer = upc;
        userName = s;
        populateUserDetails();
        //txtName.setText(p.getProdName());
        //txtId.setText(String.valueOf(p.getProductId()));
        //txtPrice.setText(String.valueOf(p.getPrice()));
        
        txtUserName.setText(user.getUserId());
        txtAddress.setText(user.getAddress());
        txtCity.setText(user.getCity());
        txtContactNo.setText(user.getContactNumber());
        txtSSN.setText(user.getSSN());
        txtMailId.setText(user.getMailId());
        txtState.setText(user.getState());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblProductPrice = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtMailId = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblProductPrice1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblProductPrice2 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblProductPrice3 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblProductPrice4 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("View Profile Details");

        lblProductName.setText("User name:");

        txtUserName.setEditable(false);

        lblProductPrice.setText("Address:");

        txtAddress.setEditable(false);

        btnUpdate.setText("Update Profile");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtMailId.setEditable(false);

        lblProductId.setText("mail id:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblProductPrice1.setText("City:");

        txtCity.setEditable(false);

        lblProductPrice2.setText("State:");

        txtState.setEditable(false);

        lblProductPrice3.setText("Contact No:");

        txtContactNo.setEditable(false);

        lblProductPrice4.setText("SSN:");

        txtSSN.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductPrice4)
                            .addComponent(lblProductPrice3)
                            .addComponent(lblProductPrice2)
                            .addComponent(lblProductPrice1)
                            .addComponent(lblProductId)
                            .addComponent(lblProductName)
                            .addComponent(lblProductPrice))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMailId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductId)
                    .addComponent(txtMailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductPrice)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductPrice1)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductPrice2)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductPrice3)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductPrice4)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtUserName.setEditable(true);
        txtAddress.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //product.setPrice(txtPrice.getText());
        //product.setProdName(txtName.getText());
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductPrice1;
    private javax.swing.JLabel lblProductPrice2;
    private javax.swing.JLabel lblProductPrice3;
    private javax.swing.JLabel lblProductPrice4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtMailId;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateUserDetails() {
       try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "Select * from users where mailId='"+userName+"'";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String userId = rs.getString("userId");
            String mailId = rs.getString("mailId");
            String address = rs.getString("address");
            String city = rs.getString("city");
            String state = rs.getString("state");
            String contactNumber = rs.getString("contactNumber");
            String SSN = rs.getString("SSN");

            createUserObject(userId, mailId, address, contactNumber, SSN, city, state);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void createUserObject(String userId, String mailId, String address, String contactNumber, String SSN, String city, String state) {
        user=new User();
        user.setUserId(userId);
        user.setMailId(mailId);
        user.setAddress(address);
        user.setContactNumber(contactNumber);
        user.setSSN(SSN);
        user.setCity(city);
        user.setState(state);
        
    }
}
