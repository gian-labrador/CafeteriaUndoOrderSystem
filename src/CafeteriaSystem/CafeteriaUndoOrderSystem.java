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

    totalLabel.setText(
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

        MainBG = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        undoButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HeaderBG = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainBG.setBackground(new java.awt.Color(255, 255, 204));
        MainBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTable.setBackground(new java.awt.Color(255, 255, 204));
        menuTable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        menuTable.setForeground(new java.awt.Color(0, 51, 51));
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
        menuTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        menuTable.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(menuTable);

        MainBG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 460, 370));

        orderTable.setBackground(new java.awt.Color(255, 255, 204));
        orderTable.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        orderTable.setForeground(new java.awt.Color(0, 51, 51));
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
        orderTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        orderTable.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane2.setViewportView(orderTable);

        MainBG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 270, 360));

        addButton.setBackground(new java.awt.Color(0, 204, 0));
        addButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(204, 255, 204));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(this::addButtonActionPerformed);
        MainBG.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 90, 30));

        removeButton.setBackground(new java.awt.Color(255, 0, 0));
        removeButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 204, 204));
        removeButton.setText("Remove");
        removeButton.setBorder(null);
        removeButton.addActionListener(this::removeButtonActionPerformed);
        MainBG.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 90, 30));

        undoButton.setBackground(new java.awt.Color(0, 153, 255));
        undoButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        undoButton.setForeground(new java.awt.Color(204, 255, 255));
        undoButton.setText("Undo");
        undoButton.setBorder(null);
        undoButton.addActionListener(this::undoButtonActionPerformed);
        MainBG.add(undoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 590, 90, 30));

        nameField.setBackground(new java.awt.Color(255, 255, 204));
        nameField.setBorder(null);
        nameField.addActionListener(this::nameFieldActionPerformed);
        MainBG.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 130, 20));

        priceField.setBackground(new java.awt.Color(255, 255, 204));
        priceField.setBorder(null);
        priceField.addActionListener(this::priceFieldActionPerformed);
        MainBG.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 130, 20));

        nameLabel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(102, 51, 0));
        nameLabel.setText("Item:");
        MainBG.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 70, -1));

        priceLabel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(102, 51, 0));
        priceLabel.setText("Price:");
        MainBG.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 70, -1));

        totalLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(102, 51, 0));
        totalLabel.setText("Total: ₱0.00");
        MainBG.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 130, 30));

        statusLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(102, 51, 0));
        statusLabel.setText("Ready.");
        MainBG.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 210, 20));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("your order is Here!");
        MainBG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 230, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Menu");
        MainBG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 130, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeteriaSystem/download1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        MainBG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 480, 480));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeteriaSystem/download.jpg"))); // NOI18N
        jLabel6.setText("jLabel5");
        MainBG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 290, 430));

        HeaderBG.setBackground(new java.awt.Color(153, 0, 0));
        HeaderBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 51));
        titleLabel.setText("Cafeteria Order System");
        HeaderBG.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 80));

        searchField.setBackground(new java.awt.Color(153, 0, 0));
        searchField.setBorder(null);
        searchField.addActionListener(this::searchFieldActionPerformed);
        HeaderBG.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 260, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("________________________________________________________");
        HeaderBG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 290, 30));

        searchLabel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search :");
        HeaderBG.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 60, 20));

        searchButton.setBackground(new java.awt.Color(255, 51, 0));
        searchButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.addActionListener(this::searchButtonActionPerformed);
        HeaderBG.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 70, 30));

        MainBG.add(HeaderBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 100));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CafeteriaSystem/yellow.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        MainBG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainBG, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

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

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

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
    private javax.swing.JPanel HeaderBG;
    private javax.swing.JPanel MainBG;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
