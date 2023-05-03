package application;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends javax.swing.JFrame {
    
     public static void main(String[] args) {
        new Statistics().setVisible(true);
     }
   
    public Statistics() {
        initComponents();
        issueKonyv();
        visszavett();
        
    }
    
    public void issueKonyv() {
	try {
            conn con =  new conn();
            String sql = "select * from issuekonyv";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            tab1.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public void visszavett() {
        try {
            conn con = new conn();
            String sql = "select * from visszavett";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            t2.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {			
	}     	  
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setText("Kimutatás");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azonosító", "Szerző", "Cím", "Ár"
            }
        ));
        tab1.setOpaque(false);
        jScrollPane1.setViewportView(tab1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 979, 164));

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azonosító", "Szerző", "Cím", "Ár"
            }
        ));
        jScrollPane2.setViewportView(t2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, 979, 173));

        b1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b1.setText("Vissza");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(819, 603, 131, 51));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Kikölcsönzött könyvek");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Visszahozott könyvek");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/book6.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(evt.getSource() == b1){
                this.setVisible(false);
		new Home().setVisible(true);
            }
    }//GEN-LAST:event_b1ActionPerformed

   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable t2;
    public javax.swing.JTable tab1;
    // End of variables declaration//GEN-END:variables
}
