    package ui.CustomerRole;

import ui.SupplierRole.*;
import model.Product;
import model.User;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Order;
import model.OrderItems;
import model.ProductCatalog;
import ui.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author Rushabh
 */
public class ManageCartJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductCatalogJPanel
     */
    Order order;
    List<OrderItems> orderItems;
    private JPanel userProcessContainer;
    private String userName;
    private double totalAmount=0;
    //private User supplier1;
    Product p;
    //List<Product> productList= new ArrayList<Product>();
    ArrayList<String> productReviews= new ArrayList<String>();
    User loggedInUser;
    ArrayList<OrderItems> orderItemList;

    public ManageCartJPanel(JPanel upc, User loggedInUser, List<OrderItems> orderItemList) {
        initComponents();
        userProcessContainer = upc;
        this.loggedInUser = loggedInUser;
        this.orderItemList=(ArrayList<OrderItems>) orderItemList;
        
        refreshTable();
    }

    public void refreshTable() {
        
        
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);
        
        
           
        for (OrderItems o : orderItemList) {
            Object row[] = new Object[6];
            row[0] = o;
            row[1] = o.getProductName();
            row[2] = o.getUnitPrice();
            row[3] = o.getQuantity();
            row[4] = String.valueOf(o.getUnitPrice()*o.getQuantity());
            row[5] = totalAmount+o.getUnitPrice()*o.getQuantity();
            model.addRow(row);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        txtNewQuantity = new javax.swing.JTextField();
        btnViewOrderItem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        lblItemsInCart = new javax.swing.JLabel();
        btnCheckOut = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Manage Cart");

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        lblItemsInCart.setText("Items in cart:");

        btnCheckOut.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available Promotion", "PROMO20", "PROMO30", "FLAT25" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblItemsInCart)
                                .addComponent(jScrollPane2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnModifyQuantity)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewOrderItem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRemoveOrderItem)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(lblTitle))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addComponent(lblItemsInCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewOrderItem)
                    .addComponent(btnRemoveOrderItem)
                    .addComponent(btnModifyQuantity)
                    .addComponent(txtNewQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
         int row = tblCart.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItems orderItem = (OrderItems) tblCart.getValueAt(row, 0);
        orderItem.setQuantity(Integer.parseInt(txtNewQuantity.getText()));
        
       
        JOptionPane.showMessageDialog(this, "Item quantity updatesd");
        refreshTable();
        
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed
        int row = tblCart.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItems orderItem = (OrderItems) tblCart.getValueAt(row, 0);
        orderItemList.remove(orderItem);
        JOptionPane.showMessageDialog(this, "Item Removed from the cart");

        refreshTable();
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
       int row = tblCart.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        OrderItems orderItem = (OrderItems) tblCart.getValueAt(row, 0);

        
        ViewOrderItemDetailJPanel voidjp = new ViewOrderItemDetailJPanel(userProcessContainer,orderItem);
        userProcessContainer.add("ViewOrderItemDetailJPanel",voidjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        createOrderObject();
        createOrderItemsObject();
        ViewPaymentPageJPanel vppjp = new ViewPaymentPageJPanel(userProcessContainer,order, orderItemList,totalAmount);
        userProcessContainer.add("ViewPaymentPageJPanel",vppjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCheckOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblItemsInCart;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCart;
    private javax.swing.JTextField txtNewQuantity;
    // End of variables declaration//GEN-END:variables

    private void createOrderObject() {
        int orderId= returnMaxOrderId();
        
        order=new Order();
        order.setOrderId((orderId));
        order.setAddress(loggedInUser.getAddress());
        order.setCity(loggedInUser.getCity());
        order.setState(loggedInUser.getState());
        order.setCountry(loggedInUser.getCountry());
        order.setMailId(loggedInUser.getMailId());
        order.setDeliveryState("Order placed");
        order.setOrderDate(getCurrentDate());
        order.setCountry(loggedInUser.getCountry());
        
        for(int i=0;i<orderItemList.size();i++){
            orderItemList.get(i).setOrderId(order.getOrderId());
        }
        }
    
    public int returnMaxOrderId(){
        int maxOrderId=1;
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "select MAX(orderId) orderId from orders;";     
        Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
        if (rs.next()) {      
            int orderId=rs.getInt("orderId");
            maxOrderId= orderId+1;
            //JOptionPane.showMessageDialog(null, "Hi"+orderId, "Info", JOptionPane.INFORMATION_MESSAGE);
            return maxOrderId;
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Credentials", "Info", JOptionPane.INFORMATION_MESSAGE);
               }
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return maxOrderId;
    }

    private void createOrderItemsObject() {
        
    }

    private String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
