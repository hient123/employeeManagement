/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author thanh
 */
public class forgotForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public forgotForm() {
        initComponents();
        conn = MyConnection.getConnection();
        mainPanel.setFocusable(true);
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
        jLabel3 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQues = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAns = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnRec = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jBackground = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 500));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(350, 500));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Khôi phục mật khẩu");
        headerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        headerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 10, -1));

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("ID người dùng:");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 40));

        txtUname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUname.setForeground(new java.awt.Color(204, 204, 204));
        txtUname.setText("Nhập tên người dùng để tìm kiếm");
        txtUname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 204, 204)));
        txtUname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnameFocusLost(evt);
            }
        });
        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        txtUname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnameKeyPressed(evt);
            }
        });
        mainPanel.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Tên:");
        mainPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 204, 204)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        mainPanel.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Câu hỏi bảo mật:");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txtQues.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQues.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 204, 204)));
        txtQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuesActionPerformed(evt);
            }
        });
        mainPanel.add(txtQues, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 240, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Trả lời:");
        mainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtAns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAns.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 204, 204)));
        txtAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnsActionPerformed(evt);
            }
        });
        mainPanel.add(txtAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Mật khẩu:");
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(204, 204, 204)));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        mainPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 240, 30));

        btnRec.setBackground(new java.awt.Color(0, 153, 102));
        btnRec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRec.setForeground(new java.awt.Color(255, 255, 255));
        btnRec.setText("Khôi phục");
        btnRec.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnRec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecActionPerformed(evt);
            }
        });
        mainPanel.add(btnRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 110, 30));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setLabel("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        mainPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 110, 30));

        jBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bgjv6.png"))); // NOI18N
        mainPanel.add(jBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, -1));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        mainPanel.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuesActionPerformed

    private void txtAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnsActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecActionPerformed
        // TODO add your handling code here:
        String ans = txtAns.getText();
        if (ans.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập câu trả lời để khôi phục mật khẩu");
        } else {
            String sq = "SELECT * FROM `user` WHERE `ans`= ?";
            try {
                ps = conn.prepareStatement(sq);
                ps.setString(1, ans);
                rs = ps.executeQuery();
                if (rs.next()) {
                    String answer = rs.getString("password");
                    txtPass.setText("Mật khẩu của bạn là: " + answer);
                } else {
                    JOptionPane.showMessageDialog(null, "Câu trả lời không khớp với dữ liệu");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_btnRecActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        loginForm l = new loginForm();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnameFocusGained
        // TODO add your handling code here:
        if(txtUname.getText().trim().equals("Nhập tên người dùng để tìm kiếm")){
            txtUname.setText("");
        }
        txtUname.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtUnameFocusGained

    private void txtUnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnameFocusLost
        // TODO add your handling code here:
        if(txtUname.getText().trim().equals("")){
            txtUname.setText("Nhập tên người dùng để tìm kiếm");
            txtName.setText("");
            txtQues.setText("");
            txtAns.setText("");
            txtPass.setText("");
        }
        txtUname.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_txtUnameFocusLost

    private void txtUnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String sql = "SELECT * FROM `user` WHERE `uname` = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, txtUname.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    txtName.setText(rs.getString("lname"));
                    txtQues.setText(rs.getString("ques"));
                } else {
                    JOptionPane.showMessageDialog(null, "Tên người dùng không tìm thấy trong dữ liệu.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(forgotForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtUnameKeyPressed

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
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatIntelliJLaf.registerCustomDefaultsSource("style");
        FlatIntelliJLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRec;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtAns;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtQues;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
