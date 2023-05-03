
package application;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class AddStudent extends javax.swing.JFrame {
    public static void main(String[] args) {
        new AddStudent().setVisible(true);
        
    }
    
   
    public AddStudent() {
        initComponents();       
        random();
    }
    
        public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(1000 + 1));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t4 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanuló_id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Neve");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Születési helye");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Születés ideje");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Anyja neve");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lakcim");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 231, 32));

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 231, 31));

        t3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 231, 31));

        t5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 231, 31));

        t6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 231, 32));

        b1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b1.setText("Hozzáad");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 106, 43));

        b2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        b2.setText("Vissza");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 106, 43));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanuló hozzáadása");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 26, -1, -1));

        t4.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 230, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application/book4.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

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
 /*A hozzáadás gomb megnyomásával megpróbál kapcsolatot létesíteni az adatbázissal, amennyiben sikerült akkor a t1- től a t6 mezőkig bevitt adatok feltöltése az adatbázisba */
        try{          
            if(evt.getSource() == b1){
                try{
                conn con = new conn();
                String sql = "insert into tanulo(student_id, name, birth1, birth2, mother, cim) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
                st.setString(2, t2.getText());
		st.setString(3, t3.getText());
                st.setString(4, ((JTextField) t4.getDateEditor().getUiComponent()).getText());
                st.setString(5, t5.getText());
                st.setString(6, t6.getText());                          
               
		int i = st.executeUpdate();
 /*IF elággal megoldjuk, hogy amennyiben sikeres az adatok update-elése akkor a Hozzáadva üzenet jelenjen meg, amennyiben sikertelen akkor Hiba üzenet.
 Sikeres update-elés esetén az ablak bezárul és megnyitja a Home ablakot */
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Hozzáadva");
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "Hiba");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
                      
        }catch(Exception e){
            
        }                           
    }//GEN-LAST:event_b1ActionPerformed
        
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private com.toedter.calendar.JDateChooser t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
