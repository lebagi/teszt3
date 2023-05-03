
package application;


import com.mysql.jdbc.PreparedStatement;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.sql.*;
import java.util.*;
import java.sql.Connection;

public class AddBook extends javax.swing.JFrame{

      
    public static void main(String[] args) {
	new AddBook().setVisible(true);
    }
    
    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000 + 1));
        }
    
    public AddBook() {
        initComponents();
        random();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book_id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Szerző");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cím");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ára");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 281, -1, -1));

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 242, 36));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 242, 36));

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 242, 36));

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 274, 242, 36));

        b1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b1.setText("Hozzáad");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 361, 104, 45));

        b2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b2.setText("Vissza");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 104, 45));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/book3.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
 /*A hozzáadás gomb megnyomásával kapcsolat létesítési próba az adatbázissal, amennyiben sikerült akkor a t1-t4 mezőkbe bevitt adatok feltöltése az adatbázisba*/      
        try{
            conn con = new conn();
            if(evt.getSource() == b1){
                String sql = "insert into konyv(book_id, publisher, name, price) values(?, ?, ?, ?)";
		PreparedStatement st = (PreparedStatement) con.c.prepareStatement(sql);
                //  st.setInt(1, Integer.parseInt(textField.getText()));
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(4, t4.getText());

		int rs = st.executeUpdate();
                
 /*IF elágazással megoldva, hogy amennyiben sikeres az adatok update-elése akkor Hozzáadva üzenet jelenjen meg, amennyiben sikertelen akkor Hiba üzenet*/               
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Hozzáadva");
		else
                    JOptionPane.showMessageDialog(null, "Hiba");
                
/*Állítsa a t1-t4 mezőket üresre */                
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
		st.close();
            }
            
        }catch(Exception e){
            
        }   
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
 /*A vissza gomb megnyomásával az ablak bezárul és megnyitja a Home ablakot */       
        if(evt.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);

            }
           
    }//GEN-LAST:event_b2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
