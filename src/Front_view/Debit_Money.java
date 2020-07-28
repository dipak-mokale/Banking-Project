/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front_view;

import java.awt.HeadlessException;
import java.io.*;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhijeet_
 */
public class Debit_Money extends javax.swing.JFrame {

    /**
     * Creates new form Debit_Money
     */
    public Debit_Money() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setText("Amount to withdraw:");

        jButton1.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        jButton1.setText("Withdraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel3.setText("National bank Of india");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
             int Bank_Balance=0;
            String sql3="select Bank_Balance from student_details where Username= ? ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pst = conn.prepareStatement(sql3);
            File f1 = new File("C:\\Users\\Abhijeet_\\Documents\\NetBeansProjects\\Banking_project","1.txt");
             FileReader fr = new FileReader(f1);
             String ch ="";
             int t=0;
             while(t!=-1)
             {
               t=fr.read();
               if(t!=-1)
               ch=ch+(char)t;  
             }
             pst.setString(1,ch);
              ResultSet rs = pst.executeQuery();
            while(rs.next())
                    {
                        Bank_Balance= rs.getInt("Bank_Balance");
                    }
            if(Bank_Balance >= Integer.parseInt(txtAmount.getText()))
            {
            Bank_Balance= Bank_Balance - Integer.parseInt(txtAmount.getText());
            String sql4; 
           sql4 = "update student_details set Bank_Balance= ? where Username=?";
            
            
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstm = con.prepareStatement(sql4);
            pstm.setString(1,String.valueOf(Bank_Balance));
            pstm.setString(2,ch);
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Money Debited from Account balance");
          
           int Account_no=0;
           String Sql6 ="Select Account_no from Student_details where Username = ?";
           Connection conn12 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
           PreparedStatement pstmt1 = conn12.prepareStatement(Sql6);
           pstmt1.setString(1,ch);
           ResultSet rs2 = pstmt1.executeQuery();
           while(rs2.next())
           {
               Account_no =rs2.getInt("Account_no");
           }
            
           String sql5 = "insert into transaction values (?,?,?,?,?,?)";
           Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
           PreparedStatement pstmt = conn1.prepareStatement(sql5);
           pstmt.setString(1,NewClass.getdate());
           pstmt.setString(2, NewClass.gettime());
           pstmt.setString(3, String.valueOf(Account_no));
           pstmt.setString(4,txtAmount.getText());
           pstmt.setString(5,"Debit");
           pstmt.setString(6,String.valueOf(Bank_Balance));
           pstmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Transaction successful");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Insufficient Account Balance !");
            }
        }
        catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException  | IOException e)
        {
         JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Login l = new Login();
     l.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Debit_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debit_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debit_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debit_Money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Debit_Money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}