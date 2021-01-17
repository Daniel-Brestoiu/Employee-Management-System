/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 861768
 */
import java.io.*;
        
public class MainScreen extends javax.swing.JFrame {

    private MyHashTable hashTable;  // The main hash table for the EMS
    

    public MainScreen() {
        initComponents();
        hashTable = new MyHashTable(10); // Instantiate the main hash table.
        
        hashTable.displayTable();
        hashTable.loadFromFile();
        hashTable.displayTable();
        
        
    }


    public MyHashTable getHashTable()
    {
        return(hashTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageEmployeesButton = new javax.swing.JButton();
        WelcomeMessageLabel = new javax.swing.JLabel();
        WelcomeOptionsLabel = new java.awt.Label();
        FindEmployeesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Management System");
        setName("MainScreen"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        ManageEmployeesButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ManageEmployeesButton.setText("Add Employee");
        ManageEmployeesButton.setAlignmentY(0.0F);
        ManageEmployeesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ManageEmployeesButton.setMaximumSize(new java.awt.Dimension(100, 25));
        ManageEmployeesButton.setMinimumSize(new java.awt.Dimension(100, 25));
        ManageEmployeesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageEmployeesButtonMouseClicked(evt);
            }
        });
        ManageEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEmployeesButtonActionPerformed(evt);
            }
        });

        WelcomeMessageLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        WelcomeMessageLabel.setText("Welcome to the Employee Management System!");

        WelcomeOptionsLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        WelcomeOptionsLabel.setText("Would you like to...");

        FindEmployeesButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FindEmployeesButton.setText("Manage Employees");
        FindEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindEmployeesButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Add a new employee into the Employee Management System");

        jLabel2.setText("See all Employees, Find an Employee, Remove an Employee or edit Employee Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(WelcomeOptionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(WelcomeMessageLabel)
                        .addComponent(FindEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ManageEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jLabel1))))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(WelcomeMessageLabel)
                .addGap(69, 69, 69)
                .addComponent(WelcomeOptionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ManageEmployeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(FindEmployeesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEmployeesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageEmployeesButtonActionPerformed

    private void ManageEmployeesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageEmployeesButtonMouseClicked
        // TODO add your handling code here:
        
        // Start up new tab. Change Jframe into new thing

        /*
        SecondaryScreen manageEmployeesJFrame = new SecondaryScreen();
        manageEmployeesJFrame.setVisible(true);
        manageEmployeesJFrame.setHashTable(this.getHashTable());
        */
        
        
        AddEmployeeScreen addEmployeesJFrame = new AddEmployeeScreen();
        addEmployeesJFrame.setVisible(true);
        addEmployeesJFrame.setHashTable(this.getHashTable());
 
    
    }//GEN-LAST:event_ManageEmployeesButtonMouseClicked

    private void FindEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindEmployeesButtonActionPerformed
        // TODO add your handling code here:
        
        /*
        FindEmployee findEmployeeJFrame = new FindEmployee();
        findEmployeeJFrame.setVisible(true);
        findEmployeeJFrame.setHashTable(getHashTable());
        */
        
        SecondaryScreen manageEmployeesJFrame = new SecondaryScreen();
        manageEmployeesJFrame.setVisible(true);
        manageEmployeesJFrame.setHashTable(this.getHashTable());
        
        
        
       
       

    }//GEN-LAST:event_FindEmployeesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                MainScreen firstScreen = new MainScreen();
                firstScreen.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindEmployeesButton;
    private javax.swing.JButton ManageEmployeesButton;
    private javax.swing.JLabel WelcomeMessageLabel;
    private java.awt.Label WelcomeOptionsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}