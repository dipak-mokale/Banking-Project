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


/**
 *
 * @author Abhijeet_
 */
public class Payment_Gateway extends javax.swing.JFrame {

    /**
     * Creates new form Payment_Gateway
     */
    public Payment_Gateway() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtFare = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment Gateway");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Merchat's Name :-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Username :-");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Hindustan Travels");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Othres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password :-");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Fare :-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(jRadioButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPass)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jRadioButton1.isSelected())
       {
        String sql ="select Account_no from student_details where UserName=? and Password=?";
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "Abhijeet@123");
           PreparedStatement pstmt=conn.prepareStatement(sql);
           pstmt.setString(1, txtUser.getText());
           pstmt.setString(2, new String(txtPass.getPassword()));
           ResultSet rs = pstmt.executeQuery();
           if(rs.next())
           {
               int Acc = rs.getInt("Account_no");
               String sql3="select Bank_Balance from student_details where Account_no = ? ";
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
               PreparedStatement pst = conn.prepareStatement(sql3);
               pst.setString(1, String.valueOf(Acc));
               ResultSet rs2 = pst.executeQuery();
               conn1.close();
               if(rs2.next())
               {
                   int Bal = rs2.getInt("Bank_Balance");
                   int fare = Integer.parseInt(txtFare.getText());
                   
                   if(Bal<fare)
                   {
                       JOptionPane.showMessageDialog(rootPane, "Low bank balance");
                   }
                   else
                   {
                    Bal = Bal-fare;
                    String s = "update student_details set Bank_balance=?";
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
                    PreparedStatement p =c.prepareStatement(s);
                    p.setString(1,String.valueOf(Bal));
                    p.execute();
                    String sql5 = "insert into transaction values (?,?,?,?,?,?)";
                    Connection conn12 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
                    PreparedStatement pstmt2 = conn12.prepareStatement(sql5);
                    pstmt2.setString(1,NewClass.getdate());
                    pstmt2.setString(2, NewClass.gettime());
                    pstmt2.setString(3, String.valueOf(Acc));
                    pstmt2.setString(4,txtFare.getText());
                    pstmt2.setString(5,"Transfer to bus merchant");
                    pstmt2.setString(6,String.valueOf(Bal));
                    pstmt2.executeUpdate();
                   
                    
                    
                    
        
                   int Amm=0;
                   String sql4="select Bank_Balance from student_details where Account_no= ? ";
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
                   PreparedStatement pstmt12 = conn2.prepareStatement(sql4);
                   pstmt12.setString(1,String.valueOf(12));
                   ResultSet rs1 = pstmt12.executeQuery();
                   while(rs1.next())
                   {
                   Amm =rs1.getInt("Bank_Balance");
                   Amm =Amm + Integer.parseInt(txtFare.getText());
                   }
                   String sq="update student_details set bank_balance= ? where Account_no=?";
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
                   PreparedStatement pstt = con.prepareStatement(sq);
                   pstt.setString(1,String.valueOf(Amm));
                   pstt.setString(2,String.valueOf(12));
                   pstt.executeUpdate();
                   String sql6 = "insert into transaction values (?,?,?,?,?,?)";
                   Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","Abhijeet@123");
                   PreparedStatement pstmt3 = conn3.prepareStatement(sql6);
                   pstmt3.setString(1,NewClass.getdate()); //using system time of transaction
                   pstmt3.setString(2, NewClass.gettime());  //using system date of transaction
                   pstmt3.setString(3, String.valueOf(12));
                   pstmt3.setString(4,txtFare.getText());
                   pstmt3.setString(5,"Bus Ticket booking from Acc "+Acc);
                   pstmt3.setString(6,String.valueOf(Amm));
                   pstmt3.executeUpdate();
                   JOptionPane.showMessageDialog(null,"Ticket Booked Successfully");
                  
                   
                   }
               }
            }
           else
           {
               JOptionPane.showMessageDialog(null, "Invaid Username & password");
           }
           
       }
       catch(HeadlessException | ClassNotFoundException | SQLException e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
   
        finally{
         dispose();
         }
   
       }
       if(jRadioButton2.isSelected())
       {
           JOptionPane.showMessageDialog(null, "You need to login to payment others");
           Front_view f = new Front_view();
           dispose();
           f.setVisible(true);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment_Gateway.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment_Gateway().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtFare;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}