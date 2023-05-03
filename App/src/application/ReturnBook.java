package application;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReturnBook extends javax.swing.JFrame {
    
    public static void main(String[] args) {
	new ReturnBook().setVisible(true);
    }

    public ReturnBook() {
        initComponents();
    }
    public void delete() {
        try {
            conn con = new conn();
            String sql = "delete from issueKonyv where book_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, text2.getText());
            int i = st.executeUpdate();
            if (i > 0)
                JOptionPane.showConfirmDialog(null, "Visszavéve!");
            else
                JOptionPane.showMessageDialog(null, "Hiba a törlésben");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
	}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        t6 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanulo_id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Könyv_id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        b1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        b1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b1.setText("Keresés");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 106, 34));

        text1.setBackground(java.awt.Color.lightGray);
        text1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 88, 176, -1));

        text2.setBackground(java.awt.Color.lightGray);
        text2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 176, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cím");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Neve");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kölcsönzés ideje");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 296, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Visszavétel ideje");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        text5.setEditable(false);
        text5.setBackground(java.awt.Color.darkGray);
        text5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 296, 176, -1));

        b2.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        b2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b2.setText("Visszavétel");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 290, -1, 32));

        b3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b3.setText("Vissza");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 347, 111, 32));

        text3.setEditable(false);
        text3.setBackground(java.awt.Color.darkGray);
        text3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 176, -1));

        text4.setEditable(false);
        text4.setBackground(java.awt.Color.darkGray);
        text4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 154, 176, -1));

        t6.setBackground(java.awt.Color.lightGray);
        t6.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 359, 176, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/book10.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(evt.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed
    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
            conn con = new conn();
            if(evt.getSource() == b1){
                String sql = "select * from issueKonyv where student_id =? and book_id =?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, text1.getText());
		st.setString(2, text2.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    text3.setText(rs.getString("bname"));
                    text4.setText(rs.getString("sname"));
                    text5.setText(rs.getString("dateOfIssue"));
		}
		st.close();
		rs.close();          
                       			
            }
        }catch(Exception e){
                  
    }//GEN-LAST:event_b1ActionPerformed
    }
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
      try{
            conn con = new conn();
            if(evt.getSource() == b2){
                String sql = "insert into visszavett(book_id, student_id, bname, sname, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, text1.getText());
		st.setString(2, text2.getText());
		st.setString(3, text3.getText());
		st.setString(4, text4.getText());
		st.setString(5, text5.getText());
		st.setString(6, ((JTextField) t6.getDateEditor().getUiComponent()).getText());
		
		int i = st.executeUpdate();
		if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Visszavéve");                   
		} else
                    JOptionPane.showMessageDialog(null, "Hiba");
		 
                st.close();	
                
                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");               
            
      }
    }   catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JDateChooser t6;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    // End of variables declaration//GEN-END:variables
}
