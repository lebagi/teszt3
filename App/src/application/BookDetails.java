package application;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class BookDetails extends javax.swing.JFrame {
    
    public static void main(String[] args) {
	new BookDetails().setVisible(true);
    }

    public BookDetails() {
        initComponents();
    }
    
    public void book() {
        /*Kapcsolat létesítése az adatbázissal*/
        try {
            conn con = new conn();
            String sql = "select * from konyv";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        b3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setText("Könyvek Kezelése");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 21, -1, -1));

        t1.setBackground(java.awt.Color.lightGray);
        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 96, 251, 29));

        b1.setBackground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
        b1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b1.setText("Keresés");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 94, 97, 34));

        b2.setBackground(java.awt.Color.red);
        b2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Törlés");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 94, 97, 34));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Könyv azonosító", "Szerző", "Cím", "Ár"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 162, 712, 170));

        b3.setBackground(java.awt.SystemColor.activeCaption);
        b3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("Mégsem");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 391, 107, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/book8.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
       /*kapcsolat létesítés az adatbázissal, majd a t1 nevű text fieldbe bevitt adatok összehasonlítása az adatbázisban található adatokkal, amennyben van
        egyezés akkor a táblázatban megjeleníti az adathoz tartozó sorban található értékeket*/
        try{            
            conn con = new conn();
            if( evt.getSource() == b1){
                String sql = "select * from konyv where concat(name, book_id) like ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, "%" + t1.getText() + "%");
		ResultSet rs = st.executeQuery();

		table.setModel(DbUtils.resultSetToTableModel(rs));
		rs.close();
		st.close();
            }
                          
            con.c.close();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        /*Kapcsolat létesítés az adatbázissal, majd a t1 text field-be beírt adathoz az adatbázisban tartozó sort törli az adatbázisból egy megerősítő 
        kérdés megválaszolását követően, majd felugró ablak jelzi a törlés sikerességét*/
        try{
            
            conn con = new conn();
            if(evt.getSource() == b2){
                String sql = "delete from konyv where book_id = '" + t1.getText() + "'";
		PreparedStatement st = con.c.prepareStatement(sql);

		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Folytatni akarod?", "Confirm",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {

		} else if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Törölve !!");
		} else if (response == JOptionPane.CLOSED_OPTION) {
                
                }
		st.close();
		
            }
            con.c.close();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(evt.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
    }//GEN-LAST:event_b3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
