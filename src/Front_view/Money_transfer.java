/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front_view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Abhijeet_
 */
public class Money_transfer extends javax.swing.JFrame {

    /**
     * Creates new form Money_transfer
     */
    public Money_transfer() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtCAcc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        jLabel1.setText("Account_no to credit money");

        jLabel3.setFont(new java.awt.Font("Elephant", 2, 14)); // NOI18N
        jLabel3.setText("Amount");

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 14)); // NOI18N
        jButton1.setText("Money Transfer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel2.setText("National bank Of india");

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(txtCAcc)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
               
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

            
            
            
            
            
           //Account from which money is debited
            int Bank_Balance=0;
            String sql3="select Bank_Balance from student_details where Account_no= ? ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pst = conn.prepareStatement(sql3);
            pst.setString(1,String.valueOf(Account_no));
            ResultSet rs = pst.executeQuery();
            while(rs.next())
                    {
                        Bank_Balance= rs.getInt("Bank_Balance"); //taking balance in a constant
                    }
            if(Bank_Balance >= Integer.parseInt(txtAmount.getText()))  //checking for account balance
            {
            Bank_Balance= Bank_Balance - Integer.parseInt(txtAmount.getText());
            String sql4; 
            sql4 = "update student_details set Bank_Balance= ? where Account_no=?";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstm = con.prepareStatement(sql4);
            pstm.setString(1,String.valueOf(Bank_Balance));
            pstm.setString(2, String.valueOf(String.valueOf(Account_no)));
            pstm.executeUpdate();
            String sql5 = "insert into transaction values (?,?,?,?,?,?)"; //inserting values in transaction
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstmt = conn1.prepareStatement(sql5);
            pstmt.setString(1,NewClass.getdate());
            pstmt.setString(2, NewClass.gettime());
            pstmt.setString(3, String.valueOf(String.valueOf(Account_no)));
            pstmt.setString(4,txtAmount.getText());
            pstmt.setString(5,"Money Transfer to Account" + txtCAcc.getText());
            pstmt.setString(6,String.valueOf(Bank_Balance));
            pstmt.executeUpdate();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Insufficient Account Balance !");
            }
        
        //Account to which money is Credited
           { 
            int Amm=0;
            String sql4="select Bank_Balance from student_details where Account_no= ? ";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstmt12 = conn2.prepareStatement(sql4);
            pstmt12.setString(1,txtCAcc.getText());
            ResultSet rs1 = pstmt12.executeQuery();
            while(rs1.next())
            {
                Amm =rs1.getInt("Bank_Balance");
                Amm =Amm + Integer.parseInt(txtAmount.getText());
            }
            String sql5="update student_details set bank_balance= ? where Account_no=?";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstmt = conn1.prepareStatement(sql5);
            pstmt.setString(1,String.valueOf(Amm));
            pstmt.setString(2,String.valueOf(txtCAcc.getText()));
            pstmt.executeUpdate();
            String sql6 = "insert into transaction values (?,?,?,?,?,?)";
            Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
            PreparedStatement pstmt3 = conn3.prepareStatement(sql6);
            pstmt3.setString(1,NewClass.getdate()); //using system time of transaction
            pstmt3.setString(2, NewClass.gettime());  //using system date of transaction
            pstmt3.setString(3, String.valueOf(txtCAcc.getText()));
            pstmt3.setString(4,txtAmount.getText());
            pstmt3.setString(5,"Money Transfer from Account " + Account_no);
            pstmt3.setString(6,String.valueOf(Amm));
            pstmt3.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Money transaction is successful");
        }
       }
        catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException |IOException e)
        {
         JOptionPane.showMessageDialog(null, e);
        }     
        //end of money transfer
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
            java.util.logging.Logger.getLogger(Money_transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Money_transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Money_transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Money_transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Money_transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCAcc;
    // End of variables declaration//GEN-END:variables
}