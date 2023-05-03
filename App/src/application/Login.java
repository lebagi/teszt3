package application;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author horto
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        bej = new javax.swing.JButton();
        reg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 44, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Felhasználónév");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 24));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jelszó");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        textField.setBackground(java.awt.Color.lightGray);
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });
        jPanel1.add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 214, 27));

        passwordField.setBackground(java.awt.Color.lightGray);
        passwordField.setPreferredSize(new java.awt.Dimension(97, 26));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 214, -1));

        bej.setBackground(new java.awt.Color(41, 44, 53));
        bej.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        bej.setForeground(new java.awt.Color(255, 255, 255));
        bej.setText("Bejelentkezés");
        bej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bejActionPerformed(evt);
            }
        });
        jPanel1.add(bej, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 53));

        reg.setBackground(new java.awt.Color(41, 44, 53));
        reg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(255, 255, 255));
        reg.setText("Regisztráció");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 200, 53));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 /* Bejelentkezés gomb megnyomása */
    private void bejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bejActionPerformed
        if(evt.getSource() == bej){
 /* Kapcsolódási kísérlet az adatbázishoz */
		try {                   
                    conn con = new conn();
                    String sql = "select * from felhasznalo where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, textField.getText());           
                    st.setString(2, passwordField.getText());

 /*A begépelt adatok összevetése az adatbázisban szereplő adatokkal*/
                    ResultSet rs = st.executeQuery();       
 /*Ha egyezés van akkor a login ablak eltűnik és megnyitja a home ablakot*/
                    if (rs.next()) {
                        this.setVisible(false);             
                        new Home().setVisible(true);        
     
                    } else
			JOptionPane.showMessageDialog(null, "Hibás adatok");    /*Ha nincs egyezés akkor hibaüzenet*/
                       
		} catch (HeadlessException | SQLException e2) {
		}
            }           
    }//GEN-LAST:event_bejActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
  /*A regisztráció gomb megnyomásával az ablak bezárul és megnyitja a Signup ablakot*/
        if(evt.getSource() == reg){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);}
        
        
    }//GEN-LAST:event_regActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed
            public static void main(String[] args) {
                new Login().setVisible(true);}
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bej;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton reg;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
