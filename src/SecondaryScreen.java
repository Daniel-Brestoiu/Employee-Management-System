/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 861768
 */
public class SecondaryScreen extends javax.swing.JFrame {

    private MyHashTable hashTable;
    
    
    public SecondaryScreen() {
        initComponents();
        
    }

    public void setHashTable(MyHashTable table)
    {
        hashTable = table;
     
    }
    
    public MyHashTable getHashTable()
    {
        return(hashTable);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageEmployeesLabel = new javax.swing.JLabel();
        addEmployeeButton = new javax.swing.JButton();
        removeEmployeeButton = new javax.swing.JButton();
        editEmployeeInfoButton = new javax.swing.JButton();
        seeEmployeesButton = new javax.swing.JButton();
        WelcomePrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 300));

        ManageEmployeesLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ManageEmployeesLabel.setText("Manage Employees");

        addEmployeeButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addEmployeeButton.setText("Find Employee");
        addEmployeeButton.setName("Add an Employee"); // NOI18N
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        removeEmployeeButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeEmployeeButton.setText("Remove an Employee");
        removeEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeButtonActionPerformed(evt);
            }
        });

        editEmployeeInfoButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        editEmployeeInfoButton.setText("Edit Employee Information");
        editEmployeeInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeInfoButtonActionPerformed(evt);
            }
        });

        seeEmployeesButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        seeEmployeesButton.setText("See all Employees");
        seeEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeEmployeesButtonActionPerformed(evt);
            }
        });

        WelcomePrompt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        WelcomePrompt.setText("Would you like to:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WelcomePrompt)
                            .addComponent(ManageEmployeesLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seeEmployeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEmployeeInfoButton))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ManageEmployeesLabel)
                .addGap(18, 18, 18)
                .addComponent(WelcomePrompt)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeButton)
                    .addComponent(editEmployeeInfoButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeEmployeeButton)
                    .addComponent(seeEmployeesButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeButtonActionPerformed
        // TODO add your handling code here:

        FindEmployee findEmployeeJFrame = new FindEmployee();
        findEmployeeJFrame.setVisible(true);
        findEmployeeJFrame.setHashTable(getHashTable());

    }//GEN-LAST:event_removeEmployeeButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
        /*
           AddEmployeeScreen addEmployeeJFrame = new AddEmployeeScreen();
           addEmployeeJFrame.setVisible(true);
           addEmployeeJFrame.setHashTable(getHashTable());
        */
        
        FindEmployee findEmployeeJFrame = new FindEmployee();
        findEmployeeJFrame.setVisible(true);
        findEmployeeJFrame.setHashTable(getHashTable());
        
        
        
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void editEmployeeInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeInfoButtonActionPerformed
        // TODO add your handling code here:
        
        EditEmployee findEmployeeJFrame = new EditEmployee();
        findEmployeeJFrame.setVisible(true);
        findEmployeeJFrame.setHashTable(getHashTable());

    }//GEN-LAST:event_editEmployeeInfoButtonActionPerformed

    private void seeEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeEmployeesButtonActionPerformed
        // TODO add your handling code here:
        
        SeeAllEmployeesScreen allEmployeesJFrame = new SeeAllEmployeesScreen();
        allEmployeesJFrame.setVisible(true);
        allEmployeesJFrame.setHashTable(getHashTable());
        

    }//GEN-LAST:event_seeEmployeesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SecondaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondaryScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManageEmployeesLabel;
    private javax.swing.JLabel WelcomePrompt;
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JButton editEmployeeInfoButton;
    private javax.swing.JButton removeEmployeeButton;
    private javax.swing.JButton seeEmployeesButton;
    // End of variables declaration//GEN-END:variables
}