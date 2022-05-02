/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SalesManager;

import ui.CustomerRole.*;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.OrderItems;
import model.Supplier;
import model.User;

/**
 *
 * @author Zerel
 */
public class CreatePromotionlJPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form ViewOrderItemDetailJPanel
     */
    public ArrayList<User> customerList=new ArrayList<User>();
    public User customer;
    private JPanel userProcessContainer;
    public CreatePromotionlJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblProductName = new javax.swing.JLabel();
        txtPromotionCode = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        txtFlatDiscount = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPercentageDiscount = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtExpiry = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnCreatePromotion = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("Create Promotion");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProductName.setText("Promotion code");

        txtPromotionCode.setEditable(false);

        lblProductId.setText("Flat Discount:");

        txtFlatDiscount.setEditable(false);

        lblPrice.setText("Percentage Discount:");

        txtPercentageDiscount.setEditable(false);

        lblQuantity.setText("Expiry:");

        txtExpiry.setEditable(false);

        lblTotal.setText("Description:");

        txtDescription.setEditable(false);

        btnCreatePromotion.setText("Create Promotion");
        btnCreatePromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePromotionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblProductName)
                                    .addComponent(lblPrice)
                                    .addComponent(lblTotal)
                                    .addComponent(lblProductId)
                                    .addComponent(lblQuantity)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnBack)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPromotionCode, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPercentageDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFlatDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnCreatePromotion)))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDescription, txtExpiry, txtFlatDiscount, txtPercentageDiscount, txtPromotionCode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPromotionCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlatDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPercentageDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal))
                .addGap(48, 48, 48)
                .addComponent(btnCreatePromotion)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDescription, txtExpiry, txtFlatDiscount, txtPercentageDiscount, txtPromotionCode});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreatePromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePromotionActionPerformed
        // TODO add your handling code here:
        if(validateFields()){
            
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String regState="pending";
        String role="supplier";
        String query = "INSERT INTO discount(`code`, `discountamount`, `expiry`,`discountpercent`,`discountdescription`)" 
                + " VALUES ('"+txtPromotionCode.getText()+"','"+txtFlatDiscount.getText()+"','"+txtPercentageDiscount.getText()+"','"+txtExpiry.getText()+"','"+txtDescription.getText()+"')";     
        
        Statement st = connection.createStatement();
        int rs = st.executeUpdate(query);
        if(rs>0){
            JOptionPane.showMessageDialog(null, "Promotion created", "Info", JOptionPane.INFORMATION_MESSAGE);
            sendUserMessage();
        }               
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }      
        }
    }//GEN-LAST:event_btnCreatePromotionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePromotion;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtExpiry;
    private javax.swing.JTextField txtFlatDiscount;
    private javax.swing.JTextField txtPercentageDiscount;
    private javax.swing.JTextField txtPromotionCode;
    // End of variables declaration//GEN-END:variables

    private boolean validateFields() {
        return true;
    }

    private void sendUserMessage() {
        
    }
    
        private void populateCustomersFromDB() {
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "Select * from users where role='customer'";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            String userId = rs.getString("userId");
            String password = rs.getString("password");
            String role = rs.getString("role");
            String mailId = rs.getString("mailId");
            String address = rs.getString("address");
            String contactNumber = rs.getString("contactNumber");
            String SSN = rs.getString("SSN");
            String registrationState = rs.getString("registrationState");
            createSupplierObject(userId, password, role, mailId, address, contactNumber, SSN, registrationState);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void createSupplierObject(String userId, String password, String role, String mailId, String address, String contactNumber, String SSN, String registrationState) {
        customer = new User();
        customer.setUserId(userId);
        customer.setPassword(password);
        customer.setRole(role);
        customer.setMailId(mailId);
        customer.setAddress(address);
        customer.setContactNumber(contactNumber);
        customer.setSSN(SSN);
        customer.setRegistrationState(registrationState);
        customerList.add(customer);
    }
}
