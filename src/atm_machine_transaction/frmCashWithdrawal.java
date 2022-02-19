/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine_transaction;

import atm_machine_transaction.frmAtmMachine;
import static atm_machine_transaction.frmCashDesposit.setVarialed;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Heng-Sok
 */
public class frmCashWithdrawal extends javax.swing.JFrame {

    /// Get Account No
    String accNo = "";

    /// Get File to Read
    File dataFile = new File("src/atm_machine_transaction/data.txt");

    /**
     * Creates new form frmCashWithdrawal
     */
    public frmCashWithdrawal() {
        initComponents();

        txt_accountNo.setText("1111");
        accNo = txt_accountNo.getText();
        getDataFromFile(accNo);
    }
    
    public frmCashWithdrawal (String accNo) {
        initComponents();
        this.accNo = accNo;
        txt_accountNo.setText(accNo);
        getDataFromFile(this.accNo);
    }

    /// Function Move to Main Form
    public void moveToMain(String accNo) {
        frmAtmMachine frm = new frmAtmMachine(accNo);
        frm.setVisible(true);
        this.dispose();
    }

    /// Function to Check is Numeric
    public static boolean isNumeric(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Please input only numeric !", "Input Invalid", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    /// Function Update Data in File using Line Number
    public static void updateDataInFile(int lineNumber, String data) throws IOException {
        Path path = Paths.get("src/atm_machine_transaction/data.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        lines.set(lineNumber - 1, data);
        Files.write(path, lines, StandardCharsets.UTF_8);
    }

    /// Function Get Data From File
    public void getDataFromFile(String userId) {

        try {
            Scanner sc = new Scanner(dataFile);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();

                String[] spData = data.split("@@", 10);

                if (spData[2].equals(userId)) {
                    txt_accountName.setText(spData[1]);
                    txt_accountBalance.setText("$ " + spData[4]);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        btn_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_accountBalance = new javax.swing.JLabel();
        txt_accountName = new javax.swing.JLabel();
        txt_accountNo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inp_withdrawal = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hack", 1, 24)); // NOI18N
        jLabel1.setText("Cash Withdrawal");

        btn_back.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel2.setText("Account No:");

        jLabel3.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel3.setText("Account Name:");

        jLabel6.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel6.setText("Balance:");

        txt_accountBalance.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        txt_accountBalance.setText("$ 1000");

        txt_accountName.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        txt_accountName.setText("Heng Sok");

        txt_accountNo.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        txt_accountNo.setText("12231");

        jLabel7.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel7.setText("Cash Withdrawal");

        inp_withdrawal.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N

        btn_submit.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(inp_withdrawal)
                            .addComponent(btn_submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_accountName, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(txt_accountBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_accountNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_accountNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_accountName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_accountBalance))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inp_withdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_submit)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        /// Button Back

        moveToMain(accNo);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        /// Button Submit

        /// Variable
        String accId = "";
        String accName = "";
        String accPwd = "";
        int accBalance = 0;
        String accStatus = "";
        int accNumOfLine = 0;
        int inpWithdrawal = 0;
        /// Protect Input Feild Cash Withdrawal
        if ("".equals(inp_withdrawal.getText())) {
            JOptionPane.showMessageDialog(null, "Please fill in Cash Withdrawal !", "Cash Withdrawal", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!isNumeric(inp_withdrawal.getText())) {
            inp_withdrawal.setText("");
        }

        /// Read a File and Get Data from File
        try {
            Scanner readData = new Scanner(dataFile);
            /// Get Line Number of File
            int numOfLine = 0;

            while (readData.hasNextLine()) {
                String data = readData.nextLine();
                numOfLine += 1;
                String[] spData = data.split("@@", 10);
                if (spData[2].equals(accNo)) {
                    accId = spData[0];
                    accName = spData[1];
                    accNo = spData[2];
                    accPwd = spData[3];
                    accBalance = Integer.parseInt(spData[4]);
                    accStatus = spData[5];
                    accNumOfLine = numOfLine;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /// Get Data from Input Cash Withdrawal
        inpWithdrawal = Integer.parseInt(inp_withdrawal.getText());
        
        /// Check is accBalance > inpWithdrawal
        if (accBalance < inpWithdrawal) {
            JOptionPane.showMessageDialog(null, "Insufficient account balance for this Transaction !", "Cash Withdrawal", JOptionPane.ERROR_MESSAGE);
            inp_withdrawal.setText("");
            return;
        }
        
        /// Update Data to File
        try {
            String repData = accId + "@@" + accName + "@@" + accNo + "@@" + accPwd + "@@" + (accBalance - inpWithdrawal) + "@@" + accStatus;
            setVarialed(accNumOfLine, repData);
        } catch (IOException ex) {
            Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /// Update Data to Form
        getDataFromFile(accNo);
        
        /// Reset Deposit Field
        inp_withdrawal.setText("");
        
        /// Move to Main Form
        moveToMain(accNo);
        
        System.err.print("Successfully");
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(frmCashWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCashWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCashWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCashWithdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCashWithdrawal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_submit;
    private javax.swing.JTextField inp_withdrawal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel txt_accountBalance;
    private javax.swing.JLabel txt_accountName;
    private javax.swing.JLabel txt_accountNo;
    // End of variables declaration//GEN-END:variables
}
