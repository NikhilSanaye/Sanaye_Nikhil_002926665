package ui.SupportCenter;

import ui.SupplierRole.*;
import model.Product;
import model.User;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Complaint;
import model.OrderItems;
import model.ProductCatalog;

/**
 *
 * @author Rushabh
 */
public class ManageComplaintsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProductCatalogJPanel
     */
    private JPanel userProcessContainer;
    ArrayList<Complaint> ComplaintList;
    private Complaint c;

    public ManageComplaintsJPanel(JPanel upc) {
        initComponents();
        userProcessContainer = upc;
       
        refreshTable();
    }

    public void refreshTable() {
        ComplaintList= new ArrayList<Complaint>();
         getCompaintList();
         DefaultTableModel model = (DefaultTableModel) tblComplaintTable.getModel();
        model.setRowCount(0);
           
        for (Complaint c : ComplaintList) {
            Object row[] = new Object[5];
            row[0] = c;
            row[1] = c.getDescription();
            row[2] = c.getProductName();
            row[3] = c.getResolutionType();
            row[4] = c.getStatus();
            model.addRow(row);
        }
    }

    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        btnreplace = new javax.swing.JButton();
        btnRefund = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComplaintTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(650, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Complaint Catalog");

        lblSupplier.setText("Supplier:");

        btnreplace.setText("Replace");
        btnreplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreplaceActionPerformed(evt);
            }
        });

        btnRefund.setText("Refund");
        btnRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefundActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        tblComplaintTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "order ID", "Description", "Product Name", "Resolution Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblComplaintTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefund, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreplace, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(lblTitle))
                            .addComponent(lblSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(lblSupplier)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefund)
                    .addComponent(btnreplace)
                    .addComponent(btnDecline))
                .addGap(315, 315, 315))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnreplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreplaceActionPerformed

       int row = tblComplaintTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Complaint complaint = (Complaint) tblComplaintTable.getValueAt(row, 0);
        
        for(Complaint c:ComplaintList){
            if(c.equals(complaint))
                c.setStatus("Replace initiated");
        }
        
        JOptionPane.showMessageDialog(this, "Replace initiated");

        refreshTable();
    }//GEN-LAST:event_btnreplaceActionPerformed

    private void btnRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefundActionPerformed

      int row = tblComplaintTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Complaint complaint = (Complaint) tblComplaintTable.getValueAt(row, 0);
        
        for(Complaint c:ComplaintList){
            if(c.equals(complaint))
                c.setStatus("Refunded");
        }
        
        JOptionPane.showMessageDialog(this, "Refunded");

        refreshTable();
    }//GEN-LAST:event_btnRefundActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        JOptionPane.showMessageDialog(this, "The request is declined");
    }//GEN-LAST:event_btnDeclineActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnRefund;
    private javax.swing.JButton btnreplace;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblComplaintTable;
    // End of variables declaration//GEN-END:variables

    private void getCompaintList() {
        try {
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market_schema", "root", "admin");
        String query = "Select * from customer_support";     
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
            int id = rs.getInt("orderId");
            String description = rs.getString("ComplaintDescription");
            String prductName = rs.getString("ProductName");
            String resolutionType = rs.getString("ResolutionType");
           
            createProductObject(id, description, prductName, resolutionType);
            ComplaintList.add(c);
        } 
        connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void createProductObject(int id, String description, String prductName, String resolutionType) {
       c=new Complaint();
       c.setOrderId(id);
       c.setDescription(description);
       c.setProductName(prductName);
       c.setResolutionType(resolutionType);
    }
}
