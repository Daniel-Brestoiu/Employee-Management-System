import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 861768
 */
public class SeeAllEmployeesScreen extends javax.swing.JFrame 
{

    private MyHashTable hashTable;
    
    public SeeAllEmployeesScreen() 
    {
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
    
    
    public void generateTable(){
        int number = hashTable.getNumBuckets();
        
        DefaultTableModel model_2 = (DefaultTableModel) partTimeEmployeeTable.getModel();
                            
        DefaultTableModel model_1 = (DefaultTableModel) fullTimeEmployeeTable.getModel();
                    

        int numInFullTime = 1;
        int numInPartTime = 1;
        model_1.setRowCount(0);
        model_2.setRowCount(0);
        
        for(int x = 0; x< (number); x++){
            for(int i = 0; i < hashTable.buckets[x].size(); i++)
            {
                EmployeeInfo employee = hashTable.buckets[x].get(i);
                
                String gender = "";
                switch(employee.getGender()){
                    case 0:
                        gender = "Male";
                        break;
                        
                    case 1:
                        gender = "Female"; 
                        break;
                        
                    default:
                        gender = "Other";
                        break;
       
                }
                
                
                String workLocation = ""; 
                switch(employee.getWorkLocation())
                {
                    case 0:
                        workLocation = "Other";
                        break;
                        
                    case 1:
                        workLocation = "Toronto";
                        break;
                        
                    case 2:
                        workLocation = "Mississauga";
                        break;
                        
                    case 3:
                        workLocation = "New York";
                        break;
                }
                
                if (employee instanceof FullTimeEmployee){
                    FullTimeEmployee emp = (FullTimeEmployee) employee;

                    
                    model_1.addRow(new Object[]{emp.getEmployeeNumber() , emp.getFirstName(), emp.getLastName(), 
                                            gender, workLocation, emp.getDeductionRate(),emp.getAnnualSalary() });
                }
                
                else if (employee instanceof PartTimeEmployee){
                    PartTimeEmployee emp = (PartTimeEmployee) employee;
                     
                    model_2.addRow(new Object[]{emp.getEmployeeNumber(), emp.getFirstName(), emp.getLastName(),
                                            gender, workLocation, emp.getDeductionRate(), emp.getHourlyWage(), emp.getHoursPerWeek(), emp.getWeeksPerYear() });
                    
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seeAllEmployeesButton = new javax.swing.JButton();
        EmployeeTabbedPane = new javax.swing.JTabbedPane();
        fullTimeEmployeePane = new javax.swing.JScrollPane();
        fullTimeEmployeeTable = new javax.swing.JTable();
        partTimeEmployeePane = new javax.swing.JScrollPane();
        partTimeEmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        seeAllEmployeesButton.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        seeAllEmployeesButton.setText("See All Employees:");
        seeAllEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeAllEmployeesButtonActionPerformed(evt);
            }
        });

        fullTimeEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Number", "First Name", "Last Name", "Gender", "Work Location", "Deduction Rate", "Annual Salary"
            }
        ));
        fullTimeEmployeePane.setViewportView(fullTimeEmployeeTable);

        EmployeeTabbedPane.addTab("Full Time Employee", fullTimeEmployeePane);

        partTimeEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Number", "First Name", "Last Name", "Gender", "Work Location", "Deduction Rate", "Hourly Wage", "Hours Per Week", "Weeks Per Year"
            }
        ));
        partTimeEmployeePane.setViewportView(partTimeEmployeeTable);

        EmployeeTabbedPane.addTab("Part Time Employee", partTimeEmployeePane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(seeAllEmployeesButton)
                .addGap(195, 195, 195))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(EmployeeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(seeAllEmployeesButton)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(EmployeeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeAllEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeAllEmployeesButtonActionPerformed
        // TODO add your handling code here:
        generateTable();
    }//GEN-LAST:event_seeAllEmployeesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SeeAllEmployeesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeeAllEmployeesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeeAllEmployeesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeeAllEmployeesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeeAllEmployeesScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane EmployeeTabbedPane;
    private javax.swing.JScrollPane fullTimeEmployeePane;
    private javax.swing.JTable fullTimeEmployeeTable;
    private javax.swing.JScrollPane partTimeEmployeePane;
    private javax.swing.JTable partTimeEmployeeTable;
    private javax.swing.JButton seeAllEmployeesButton;
    // End of variables declaration//GEN-END:variables
}