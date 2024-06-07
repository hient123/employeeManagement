/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;



/**
 *
 * @author thanh
 */
public class loginForm extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    public loginForm() {
        initComponents();
        conn = MyConnection.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUname = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 400));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.setPreferredSize(new java.awt.Dimension(350, 500));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        headerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Đăng nhập");
        headerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel4.setText("jLabel4");
        headerPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 229, 450, 290));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 350, 100));

        lblUname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblUname.setText("Tên đăng nhập:");
        mainPanel.add(lblUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lblPass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblPass.setText("Mật khẩu:");
        mainPanel.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtUname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 204, 204)));
        txtUname.setMinimumSize(new java.awt.Dimension(64, 20));
        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        mainPanel.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 240, 30));

        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        txtPass.setMinimumSize(new java.awt.Dimension(64, 20));
        mainPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Quên mật khẩu?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        btnLogin1.setBackground(new java.awt.Color(0, 153, 102));
        btnLogin1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Login");
        btnLogin1.setBorder(new javax.swing.border.MatteBorder(null));
        btnLogin1.setBorderPainted(false);
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogin1MouseClicked(evt);
            }
        });
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        mainPanel.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 240, 30));

        btnSignup.setBackground(new java.awt.Color(0, 0, 0));
        btnSignup.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Đăng ký ngay");
        btnSignup.setBorderPainted(false);
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        mainPanel.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 140, 30));

        label1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 153, 153));
        label1.setText("Chưa có tài khoản?");
        mainPanel.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 350, 400));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bgjava5.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignupActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        // TODO add your handling code here:
        signupForm s = new signupForm();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignupMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        forgotForm f = new forgotForm();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseClicked
        // TODO add your handling code here:
         String uname = txtUname.getText();
        String pass = String.valueOf(txtPass.getPassword());
        if(uname.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Tên đăng nhập bị trống");
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "Mật khẩu bị trống");
        }else{
            String query = "SELECT * FROM `user` WHERE `uname`=? AND`pass`=?";
            try {
                ps = conn.prepareStatement(query);
                ps.setString(1, uname);
                ps.setString(2, pass);
                
                rs = ps.executeQuery();
                
                if(rs.next()){
                    String name = rs.getString(3);
                    String des = rs.getString(5);
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công.");
                    mainForm m = new mainForm(name, des);
                    m.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Đăng nhập thất bại.");
                    txtUname.setText("");
                    txtPass.setText("");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnLogin1MouseClicked

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnSignup;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUname;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
