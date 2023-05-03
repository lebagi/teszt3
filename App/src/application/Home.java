package application;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends javax.swing.JFrame {
    
    public static void main(String[] args) {
            new Home().setVisible(true);
	}
  
    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 44, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBackground(new java.awt.Color(41, 44, 53));
        b1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Film hozzáadása");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 40));

        b2.setBackground(new java.awt.Color(41, 44, 53));
        b2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Kimutatás");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 170, 40));

        b3.setBackground(new java.awt.Color(41, 44, 53));
        b3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Ügyfél hozzáadása");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 220, 40));

        b4.setBackground(new java.awt.Color(41, 44, 53));
        b4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("Kölcsönzés");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 40));

        b5.setBackground(new java.awt.Color(41, 44, 53));
        b5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("Ügyfél kezelése");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 170, 40));

        b6.setBackground(new java.awt.Color(41, 44, 53));
        b6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("Visszavétel");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 170, 40));

        b7.setBackground(new java.awt.Color(41, 44, 53));
        b7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("Kijelentkezés");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 270, 180, 32));

        b8.setBackground(new java.awt.Color(41, 44, 53));
        b8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("Filmek Kezelése");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*A film hozzáadása gomb megnyomásával az ablak bezárul és megnyitja az AddFilm ablakot   
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     
        if(evt.getSource() == b1){
                setVisible(false);
		new AddFilm().setVisible(true);
        }
    }//GEN-LAST:event_b1ActionPerformed
*/
    /*A statisztika gomb megnyomásával az ablak bezárul és megnyitja a Statistics ablakot  */
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    
        if(evt.getSource() == b2){
                setVisible(false);
		new Statistics().setVisible(true);
        }
    }//GEN-LAST:event_b2ActionPerformed

     /*Az ügyfél hozzáadása gomb megnyomásával az ablak bezárul és megnyitja az AddCustomer ablakot 
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
     
        if(evt.getSource() == b3){
                setVisible(false);
		new AddCustomer().setVisible(true);
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
/*A kölcsönzés gomb megnyomásával az ablak bezárul és megnyitja az IssueFilm ablakot      
        if(evt.getSource() == b4){
                setVisible(false);
		new IssueFilm().setVisible(true);
        }
    }//GEN-LAST:event_b4ActionPerformed
*/
    
     /*Az ügyfél kezelése gomb megnyomásával az ablak bezárul és megnyitja a CustomerDetails ablakot
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       
        if(evt.getSource() == b5){
                setVisible(false);
		new CustomerDetails().setVisible(true);
        }
    }//GEN-LAST:event_b5ActionPerformed
*/
     /*A visszavétel gomb megnyomásával az ablak bezárul és megnyitja a ReturnFilm ablakot
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
      
        if(evt.getSource() == b6){
                setVisible(false);
		new ReturnFilm().setVisible(true);
        }
    }//GEN-LAST:event_b6ActionPerformed
*/ 
    
    
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
       
        if(evt.getSource() == b7){
                setVisible(false);
		new Login().setVisible(true);
        }
    }//GEN-LAST:event_b7ActionPerformed
/*A kijelentkezés gomb megnyomásával az ablak bezárul és megnyitja a Login ablakot
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
      if(evt.getSource() == b8){
                setVisible(false);
		new FilmDetails().setVisible(true);
        }
    }//GEN-LAST:event_b8ActionPerformed
*/
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
