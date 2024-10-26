
import dao.ConnectionProvider;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Aayus
 */
public class ItemManagement extends javax.swing.JFrame {

    /**
     * Creates new form ItemManagement
     */
    public ItemManagement() {
        initComponents();
        setLocationRelativeTo(null);

        showItemInfo(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        expirySort = new javax.swing.JButton();
        quantitySort = new javax.swing.JButton();
        showAll = new javax.swing.JButton();
        deleteItem = new javax.swing.JButton();
        addItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        almostExpirySort = new javax.swing.JButton();
        resetForm = new javax.swing.JButton();
        productType = new javax.swing.JButton();
        updateItem = new javax.swing.JButton();
        jl3 = new javax.swing.JLabel();
        enterEDate = new javax.swing.JTextField();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        enterPName = new javax.swing.JTextField();
        enterPType = new javax.swing.JTextField();
        enterQty = new javax.swing.JTextField();
        closeForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Item Management Space");

        expirySort.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        expirySort.setText("Sort by Expiry Date");
        expirySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expirySortActionPerformed(evt);
            }
        });

        quantitySort.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        quantitySort.setText("Sort by Quantity");
        quantitySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitySortActionPerformed(evt);
            }
        });

        showAll.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        showAll.setText("Show All");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        deleteItem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deleteItem.setText("Delete Item");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });

        addItem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addItem.setText("Add Item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Expiry Date", "Status", "Product Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemTable.getTableHeader().setReorderingAllowed(false);
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        almostExpirySort.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        almostExpirySort.setText("View Close To Expiry");
        almostExpirySort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almostExpirySortActionPerformed(evt);
            }
        });

        resetForm.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        resetForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/9042013_reset_forward_icon.png"))); // NOI18N
        resetForm.setText("Reset");
        resetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetFormActionPerformed(evt);
            }
        });

        productType.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        productType.setText("Sort by Product Type");
        productType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeActionPerformed(evt);
            }
        });

        updateItem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        updateItem.setText("Update Item");
        updateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemActionPerformed(evt);
            }
        });

        jl3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl3.setText("Expiry Date");

        enterEDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enterEDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterEDateActionPerformed(evt);
            }
        });

        jl1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl1.setText("Product Name:");

        jl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl2.setText("New Quantity");

        jl4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl4.setText("Product Type");

        enterPName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enterPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPNameActionPerformed(evt);
            }
        });

        enterPType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        enterQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        closeForm.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        closeForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close2.png"))); // NOI18N
        closeForm.setText("Close");
        closeForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl1, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enterQty, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterPType, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterPName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(showAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitySort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expirySort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(almostExpirySort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productType))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(deleteItem)
                        .addGap(45, 45, 45)
                        .addComponent(updateItem)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1120, 1120, 1120)
                    .addComponent(closeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(57, 57, 57)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showAll)
                        .addGap(18, 18, 18)
                        .addComponent(quantitySort)
                        .addGap(18, 18, 18)
                        .addComponent(expirySort)
                        .addGap(18, 18, 18)
                        .addComponent(almostExpirySort)
                        .addGap(18, 18, 18)
                        .addComponent(productType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addItem)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(enterQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(enterEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(enterPType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteItem)
                            .addComponent(updateItem))
                        .addGap(239, 239, 239))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(688, Short.MAX_VALUE)
                    .addComponent(closeForm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int count2 = 0;

    private void almostExpirySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almostExpirySortActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            if (count2 == 0) {
                rs = st.executeQuery("SELECT * FROM pantryItems WHERE Expiry_Date BETWEEN CURDATE()+1 AND DATE_ADD(CURDATE(), INTERVAL 14 DAY) ORDER BY Expiry_Date DESC");
                count2 = 1;
            } else {
                rs = st.executeQuery("SELECT * FROM pantryItems WHERE Expiry_Date BETWEEN CURDATE()+1 AND DATE_ADD(CURDATE(), INTERVAL 14 DAY) ORDER BY Expiry_Date ASC;");
                count2 = 0;
            }
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_id"), rs.getString("product_name"), rs.getString("quantity"), rs.getString("Expiry_Date"), rs.getString("status"), rs.getString("product_type")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_almostExpirySortActionPerformed

    private void resetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetFormActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ItemManagement().setVisible(true);
    }//GEN-LAST:event_resetFormActionPerformed

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from pantryItems ORDER BY product_id ASC");

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_id"), rs.getString("product_name"), rs.getString("quantity"), rs.getString("Expiry_Date"), rs.getString("status"), rs.getString("product_type")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_showAllActionPerformed
    private int count = 0;
    private void quantitySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitySortActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            if (count == 0) {
                rs = st.executeQuery("SELECT * FROM pantryItems ORDER BY quantity ASC");
                count = 1;
            } else {
                rs = st.executeQuery("SELECT * FROM pantryItems ORDER BY quantity DESC");
                count = 0;
            }

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_id"), rs.getString("product_name"), rs.getString("quantity"), rs.getString("Expiry_Date"), rs.getString("status"), rs.getString("product_type")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_quantitySortActionPerformed

    int count3 = 0;

    private void expirySortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expirySortActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            if (count3 == 0) {
                count3 = 1;
                rs = st.executeQuery("SELECT * FROM pantryItems where status = 'Expired' ORDER BY Expiry_Date ASC");
            } else {
                count3 = 0;
                rs = st.executeQuery("SELECT * FROM pantryItems where status = 'Expired' ORDER BY Expiry_Date DESC");
            }
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_id"), rs.getString("product_name"), rs.getString("quantity"), rs.getString("Expiry_Date"), rs.getString("status"), rs.getString("product_type")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_expirySortActionPerformed
    private int count4 = 0;

    private void productTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTypeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();

        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            ResultSet rs;

            if (count4 == 0) {
                count4 = 1;
                rs = st.executeQuery("SELECT * FROM pantryItems ORDER BY product_type ASC");
            } else {
                count4 = 0;
                rs = st.executeQuery("SELECT * FROM pantryItems ORDER BY product_type DESC");
            }

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_id"), rs.getString("product_name"), rs.getString("quantity"), rs.getString("Expiry_Date"), rs.getString("status"), rs.getString("product_type")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_productTypeActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddItem().setVisible(true);
    }//GEN-LAST:event_addItemActionPerformed

    private void enterPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPNameActionPerformed

    private void showItemInfo(boolean in) {
        jl1.setVisible(in);
        jl2.setVisible(in);
        jl3.setVisible(in);
        jl4.setVisible(in);

        enterPName.setVisible(in);
        enterEDate.setVisible(in);
        enterPType.setVisible(in);
        enterQty.setVisible(in);

        updateItem.setVisible(in);
        deleteItem.setVisible(in);
    }

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        // TODO add your handling code here:
        String productName = enterPName.getText();
        String expiryDate = enterEDate.getText();
        // String productType = ept.getText();
        Integer qtyToDelete = Integer.parseInt(enterQty.getText());
        PreparedStatement ps;

        try {
            Connection con = ConnectionProvider.getConnection();

            ps = con.prepareStatement("delete from pantryItems where productName=? and expiryDate=?");
            ps.setString(1, productName);
            ps.setString(2, expiryDate);

            JOptionPane.showMessageDialog(null, "Item Updated Succesfully");
            showItemInfo(false);
            con.close();
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteItemActionPerformed

    private int userKey = 0;

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
        // TODO add your handling code here:
        showItemInfo(true);

        int index = itemTable.getSelectedRow();
        TableModel model = itemTable.getModel();

        String ID = model.getValueAt(index, 0).toString();
        userKey = Integer.parseInt(ID);

        String name = model.getValueAt(index, 1).toString();
        enterPName.setText(name);

        String expDate = model.getValueAt(index, 3).toString();
        enterEDate.setText(expDate);

        String productType = model.getValueAt(index, 5).toString();
        enterPType.setText(productType);
        
        enterPName.setEditable(false);
        enterEDate.setEditable(false);
        enterPType.setEditable(false);
    }//GEN-LAST:event_itemTableMouseClicked

    private void closeFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFormActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeFormActionPerformed

    private void updateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemActionPerformed
        // TODO add your handling code here:
        String productName = enterPName.getText();
        String expiryDate = enterEDate.getText();
        String productType = enterPType.getText();
        Integer newQty = Integer.parseInt(enterQty.getText());
        PreparedStatement ps;
        
        if (newQty <= 0){
            JOptionPane.showMessageDialog(null, "Invalid Quantity Entered!");
            return;
        }
        
        try {
            Connection con = ConnectionProvider.getConnection();

            ps = con.prepareStatement("update pantryItems set quantity=? where productName=? and expiryDate=?");
            ps.setInt(1, newQty);
            ps.setString(2, productName);
            ps.setString(3, expiryDate);

            JOptionPane.showMessageDialog(null, "Item Updated Succesfully");
            showItemInfo(false);
            ps.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateItemActionPerformed

    private void enterEDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterEDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterEDateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton almostExpirySort;
    private javax.swing.JButton closeForm;
    private javax.swing.JButton deleteItem;
    private javax.swing.JTextField enterEDate;
    private javax.swing.JTextField enterPName;
    private javax.swing.JTextField enterPType;
    private javax.swing.JTextField enterQty;
    private javax.swing.JButton expirySort;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JButton productType;
    private javax.swing.JButton quantitySort;
    private javax.swing.JButton resetForm;
    private javax.swing.JButton showAll;
    private javax.swing.JButton updateItem;
    // End of variables declaration//GEN-END:variables
}
