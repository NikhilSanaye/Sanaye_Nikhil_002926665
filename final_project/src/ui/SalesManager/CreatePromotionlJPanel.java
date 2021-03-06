/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SalesManager;

import ui.CustomerRole.*;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    private Connection connection; 
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
        lblProductId = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCreatePromotion = new javax.swing.JButton();
        txtPromotionCode = new javax.swing.JTextField();
        txtFlatDiscount = new javax.swing.JTextField();
        txtPercentageDiscount = new javax.swing.JTextField();
        txtExpiry = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();

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

        lblProductId.setText("Flat Discount:");

        lblPrice.setText("Percentage Discount:");

        lblQuantity.setText("Expiry:");

        lblTotal.setText("Description:");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFlatDiscount)
                            .addComponent(txtPromotionCode)
                            .addComponent(txtPercentageDiscount)
                            .addComponent(txtExpiry)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnCreatePromotion)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPromotionCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlatDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPercentageDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreatePromotion)
                .addContainerGap(198, Short.MAX_VALUE))
        );
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
        String query = "INSERT INTO discount(`code`, `discountamount`, `expiry`,`discountpercent`,`discountdescription`)" 
                + " VALUES ('"+txtPromotionCode.getText()+"','"+txtFlatDiscount.getText()+"','"+txtPercentageDiscount.getText()+"','"+txtExpiry.getText()+"','"+txtDescription.getText()+"')";     
        
        Statement st = connection.createStatement();
        int rs = st.executeUpdate(query);
        if(rs>0){
            JOptionPane.showMessageDialog(null, "Promotion created", "Info", JOptionPane.INFORMATION_MESSAGE);
            
        }               
        connection.close();
        sendUserMessage();
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
        populateCustomersFromDB();
        String existingMessage;
        StringBuilder newMessage;
        String promoCode=txtPromotionCode.getText();
        String promoDescription=txtDescription.getText();
        //JOptionPane.showMessageDialog(null, "customer size:"+customerList.size(), "Info", JOptionPane.INFORMATION_MESSAGE);
        for(int i=0; i<customerList.size();i++){
            newMessage = new StringBuilder();
            //JOptionPane.showMessageDialog(null, customerList.get(i).getMailId(), "Info", JOptionPane.INFORMATION_MESSAGE);
            existingMessage=customerList.get(i).getMessages();
            newMessage.append(existingMessage);
            newMessage.append("-");
            newMessage.append(promoCode);
            newMessage.append(":");
            newMessage.append(txtDescription.getText());
            updateCustomerMessage(customerList.get(i).getMailId(), newMessage.toString());
            existingMessage="";
        }
    
       // customer.getMessages()
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
            String messages = rs.getString("messages");
            createCustomerObject(userId, password, role, mailId, address, contactNumber, SSN, registrationState, messages);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void createCustomerObject(String userId, String password, String role, String mailId, String address, String contactNumber, String SSN, String registrationState, String messages) {
        customer = new User();
        customer.setUserId(userId);
        customer.setPassword(password);
        customer.setRole(role);
        customer.setMailId(mailId);
        customer.setAddress(address);
        customer.setContactNumber(contactNumber);
        customer.setSSN(SSN);
        customer.setRegistrationState(registrationState);
        customer.setMessages(messages);
        customerList.add(customer);
    }

    private void updateCustomerMessage(String mailId, String newMessage) {
        
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");

        String query = " update users set messages=? where userId=?";
        PreparedStatement preparedStmt = connection.prepareStatement(query);

        query = " update users set messages=? where mailId=?";
        preparedStmt = connection.prepareStatement(query);
        preparedStmt.setString(1, newMessage);
        preparedStmt.setString(2, mailId);
        preparedStmt.execute();
     
        connection.close();
        JOptionPane.showMessageDialog(null, "Message updated"+ newMessage+"    " +mailId, "Info", JOptionPane.INFORMATION_MESSAGE);
        }               
        catch (Exception exception) {
            exception.printStackTrace();
        }
        
    }
}
