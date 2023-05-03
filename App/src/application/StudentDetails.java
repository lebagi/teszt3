package application;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends javax.swing.JFrame {
    
    public static void main(String[] args) {
	new StudentDetails().setVisible(true);
    }


    public StudentDetails() {
        initComponents();
    }
    
    public void student() {
        try {
            conn con = new conn();
            String sql = "select * from tanulo";
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
        search = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        b3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 3));
        search.setOpaque(false);
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 303, 33));

        b1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b1.setText("Keresés");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 100, 33));

        b2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b2.setText("Törlés");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 100, 33));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azonosító", "Neve", "Születési helye", "Születési év", "Anyja neve", "Cím"
            }
        ));
        table.setOpaque(false);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 865, 181));

        b3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b3.setText("Vissza");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 100, 31));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanulók Adatai");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/book5.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        try{
            
            conn con = new conn();
            if(evt.getSource() == b2){
                String sql = "delete from tanulo where student_id = '" + search.getText() + "'";
		PreparedStatement st = con.c.prepareStatement(sql);

		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Folytatni akarod?", "Confirm",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {

		} else if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
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

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
            
            conn con = new conn();
            if( evt.getSource() == b1){
                String sql = "select * from tanulo where concat(name, student_id) like ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, "%" + search.getText() + "%");
                ResultSet rs = st.executeQuery();
  
		table.setModel(DbUtils.resultSetToTableModel(rs));		
            }                                   
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_b1ActionPerformed
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
