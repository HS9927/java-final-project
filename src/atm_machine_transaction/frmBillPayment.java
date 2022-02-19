/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_machine_transaction;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hengs
 */
public class frmBillPayment extends javax.swing.JFrame {

    String accNo = "";
    frmAtmMachine frmMain = new frmAtmMachine();

    /**
     * Creates new form frmBillPayment
     */
    public frmBillPayment() {
        initComponents();

        accNo = "1111";
    }
    
    public frmBillPayment(String accNo) {
        initComponents();

        this.accNo = accNo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inp_amount = new javax.swing.JTextField();
        inp_pwd = new javax.swing.JTextField();
        btn_pay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        inp_invoice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_back.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hack", 1, 18)); // NOI18N
        jLabel1.setText("Bill Payment");

        cb_type.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        cb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electricity Du Cambodia", "Private Water Supply" }));

        jLabel2.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel2.setText("Select Type Payment");

        jLabel3.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel3.setText("Amount");

        jLabel4.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        inp_amount.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N

        inp_pwd.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N

        btn_pay.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        btn_pay.setText("Pay");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        jLabel5.setText("Invoice No.");

        inp_invoice.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inp_amount)
                            .addComponent(inp_pwd)
                            .addComponent(btn_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inp_invoice))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inp_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inp_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inp_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pay)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        /// Button Back

        frmMain.moveToMain(accNo);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        // TODO add your handling code here:
        /// Button Pay

        /// Variable 
        String type = "";
        String invoice = "";
        Long amount;
        String pwd = "";

        /// - Protect Field
        /// Invoice No
        if ("".equals(inp_invoice.getText())) {
            JOptionPane.showMessageDialog(null, "Please Fill In Invoice No. !", "Missing Data", JOptionPane.WARNING_MESSAGE);
            return;
        }
        /// Amount
        if ("".equals(inp_amount.getText())) {
            JOptionPane.showMessageDialog(null, "Please Fill In Amount !", "Missing Data", JOptionPane.WARNING_MESSAGE);
            return;
        }
        /// Password
        if ("".equals(inp_pwd.getText())) {
            JOptionPane.showMessageDialog(null, "Please Fill In Password !", "Missing Data", JOptionPane.WARNING_MESSAGE);
            return;
        }

        /// - Get Data From Field
        type = cb_type.getSelectedItem().toString();
        invoice = inp_invoice.getText();
        amount = Long.parseLong(inp_amount.getText());
        pwd = inp_pwd.getText();

        /// - Check Data
        ClsGetDataFile myData = new ClsGetDataFile(accNo);
        try {
            myData.getAllData();

            /// Check Password
            if (!pwd.equals(myData.getAccPwd())) {
                JOptionPane.showConfirmDialog(null, "Password Invalid !", "Data Missing", JOptionPane.WARNING_MESSAGE);
                inp_pwd.setText("");
                return;
            }

            /// Check Amount
            if (amount > myData.getAccBalance()) {
                JOptionPane.showConfirmDialog(null, "Insufficient account balance for this Transaction !", "Data Missing", JOptionPane.WARNING_MESSAGE);
                inp_amount.setText("");
                return;
            }

            /// - Update Data
            /// - Update Cash To Transfer
            try {
                String repData = myData.getAccId() + "@@" + myData.getAccName() + "@@" + myData.getAccNo() + "@@" + myData.getAccPwd() + "@@" + (myData.getAccBalance() - amount) + "@@" + myData.getAccStatus();
                frmMain.updateDataInFile(myData.getAccNumOfLine(), repData);
            } catch (IOException ex) {
                Logger.getLogger(frmCashDesposit.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmBillPayment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        frmMain.moveToMain(accNo);
        this.dispose();

        System.out.print("Successfully");

    }//GEN-LAST:event_btn_payActionPerformed

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
            java.util.logging.Logger.getLogger(frmBillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBillPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBillPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_pay;
    private javax.swing.JComboBox<String> cb_type;
    private javax.swing.JTextField inp_amount;
    private javax.swing.JTextField inp_invoice;
    private javax.swing.JTextField inp_pwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
