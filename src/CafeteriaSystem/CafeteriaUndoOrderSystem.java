package CafeteriaSystem;
import javax.swing.JOptionPane;
public class CafeteriaUndoOrderSystem extends javax.swing.JFrame {
    
    private manageOrder manager = new manageOrder();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CafeteriaUndoOrderSystem.class.getName());

    public CafeteriaUndoOrderSystem() {
        initComponents();
        refreshMenuTable();
        refreshTable();
    }
    
    private void refreshTable() {

        javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel)
        orderTable.getModel();

    model.setRowCount(0);

    for (int i = 0; i < manager.getOrderCount(); i++) {

        OrderItem item = manager.getOrder(i);

        Object[] row = {
            item.getName(),
            item.getCategory(),
            String.format("₱%.2f", item.getPrice())
        };

        model.addRow(row);
    }

    totalLabel1.setText(
        String.format("Total: ₱%.2f", manager.getTotal())
    );
}
    
    private void refreshMenuTable() {

    javax.swing.table.DefaultTableModel model =
        (javax.swing.table.DefaultTableModel)
        menuTable.getModel();

    model.setRowCount(0);

    for (int i = 0; i < manager.getMenuCount(); i++) {

        OrderItem item = manager.getMenuItem(i);

        Object[] row = {
            item.getName(),
            item.getCategory(),
            String.format("₱%.2f", item.getPrice())
        };

        model.addRow(row);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 350, -1));

        searchButton.setText("Search");
        searchButton.addActionListener(this::searchButtonActionPerformed);
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 50, -1, -1));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rice", "Food", "₱15.00"},
                {"Fried Chicken", "Food", "₱45.00"},
                {"Adobo", "Food", "₱30.00"},
                {"Pancit", "Food", "₱25.00"},
                {"Lumpia", "Food", "₱10.00"},
                {"Hotdog", "Food", "₱10.00"},
                {"Nuggets", "Food", "₱15.00"},
                {"Egg", "Food", "₱10.00"},
                {"Sisig", "Food", "₱35.00"},
                {"Siomai", "Food", "₱20.00"},
                {"Burger", "Food", "₱30.00"},
                {"Buko Juice", "Drink", "₱25.00"},
                {"Buko Pandan", "Drink", "₱10.00"},
                {"Gulaman", "Drink", "₱15.00"},
                {"Juicy Lemon", "Drink", "₱25.00"},
                {"Coca Cola", "Drink", "₱25.00"},
                {"Pineapple Juice", "Drink", "₱20.00"},
                {"Lemonade", "Drink", "₱15.00"},
                {"Chuckie", "Drink", "₱25.00"},
                {"Minute Maid", "Drink", "₱15.00"},
                {"Mango Shake", "Drink", "₱10.00"},
                {"Water", "Drink", "₱5.00"}
            },
            new String [] {
                "Items", "Category", "Price"
            }
        ));
        jScrollPane1.setViewportView(menuTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 430, 430));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Category", "Price"
            }
        ));
        jScrollPane2.setViewportView(orderTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 290, 370));

        addButton.setText("Add");
        addButton.addActionListener(this::addButtonActionPerformed);
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, -1, -1));

        removeButton.setText("Remove");
        removeButton.addActionListener(this::removeButtonActionPerformed);
        jPanel1.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, -1, -1));

        undoButton.setText("Undo");
        undoButton.addActionListener(this::undoButtonActionPerformed);
        jPanel1.add(undoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, -1));
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, -1));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleLabel.setText("Cafeteria Undo Order System");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 460, 80));

        nameLabel.setText("Item:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, -1));

        searchLabel.setText("Search Item:");
        jPanel1.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 90, -1));

        priceLabel.setText("Price:");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 70, -1));

        totalLabel.setText("Total: ₱0.00");
        jPanel1.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, -1));

        statusLabel.setText("Ready.");
        jPanel1.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

    int selectedRow = menuTable.getSelectedRow();

    if (selectedRow == -1) {

        JOptionPane.showMessageDialog(
            this, "Please select a product from the menu."
        );

        return;
    }

    OrderItem item = manager.getMenuItem(selectedRow);

    if (item == null) {

        JOptionPane.showMessageDialog(
            this, "Invalid menu selection."
        );

        return;
    }

    boolean success = manager.addOrder(
        item.getName(),
        item.getPrice(),
        item.getCategory()
    );

    if (success) {

        refreshTable();

        nameField.setText("");
        priceField.setText("");
        searchField.setText("");

        menuTable.clearSelection();

        statusLabel.setText(
            "Successfully added: " + item.getName()
        );

    } else {

        JOptionPane.showMessageDialog(
            this, "Order list or undo history is full."
        );
    }
    
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed

    int selectedRow = orderTable.getSelectedRow();

    if (selectedRow == -1) {

    JOptionPane.showMessageDialog(
        this, "Please select an order to remove."
    );

    return;
}
    
    boolean success = manager.removeOrder(selectedRow);

    if (success) {

    refreshTable();

    statusLabel.setText("Order removed successfully.");

    } else {

    JOptionPane.showMessageDialog(
        this, "Unable to remove order."
    );
}
    
    }//GEN-LAST:event_removeButtonActionPerformed

    private void undoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoButtonActionPerformed

    boolean success = manager.undo();

    if (success) {

    refreshTable();

    statusLabel.setText(
        "Last operation successfully undone."
    );

    } else {

    JOptionPane.showMessageDialog(
        this, "There are no changes to undo."
    );
}
    
    }//GEN-LAST:event_undoButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

    String keyword = searchField.getText().trim();

    if (keyword.isEmpty()) {

        JOptionPane.showMessageDialog(
            this, "Please enter an item name."
        );

        return;
    }

    int index = manager.searchMenu(keyword);

    if (index != -1) {

        menuTable.setRowSelectionInterval(index, index);

        menuTable.scrollRectToVisible(
            menuTable.getCellRect(index, 0, true)
        );

        OrderItem item = manager.getMenuItem(index);

        nameField.setText(item.getName());

        priceField.setText(
            String.valueOf(item.getPrice())
        );

        statusLabel.setText(
            "Menu item found: " + item.getName()
        );

    } else {

        menuTable.clearSelection();

        nameField.setText("");
        priceField.setText("");

        statusLabel.setText("Menu item not found.");

        JOptionPane.showMessageDialog(
            this, "Item not found in available menu."
        );
    }
    
    }//GEN-LAST:event_searchButtonActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CafeteriaUndoOrderSystem().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton undoButton;
    // End of variables declaration//GEN-END:variables
}
