/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raray
 */
public class Circular extends javax.swing.JPanel {
    connection con;
    private String tglp,tglk;
    /**
     * Creates new form Circular
     */
    public Circular() {
        initComponents();
        con = new connection();
        namapeminjam();
    }

    private void namapeminjam() {
        Object header[] = {"No", "Nama", "Buku", "Kode Buku", "Tanggal Pinjam", "tanggal pengembalian"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        jTabledatapinjam.setModel(data);
        String pinjam = "SELECT * FROM circular JOIN book ON circular.book_id=book.id JOIN student ON circular.student_id=student.id order by circular.id";
        try {
            Statement st = con.con.createStatement();
            ResultSet rs = st.executeQuery(pinjam);
            while (rs.next()) {
                String kolom1 = rs.getString(1);
                String kolom2 = rs.getString(15);
                String kolom3 = rs.getString(8);
                String kolom4 = rs.getString(7);
                String kolom5 = rs.getString(2);
                String kolom6 = rs.getString(3);
                String kolom[] = {kolom1, kolom2, kolom3, kolom4, kolom5, kolom6};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error :" + e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledatapinjam = new javax.swing.JTable();
        jLabelcari = new javax.swing.JLabel();
        borrowBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        returnBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 248, 248));

        jTextFieldcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcariActionPerformed(evt);
            }
        });

        jTabledatapinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabledatapinjam);

        jLabelcari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelcari.setForeground(new java.awt.Color(204, 204, 204));
        jLabelcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/pic/search.png"))); // NOI18N
        jLabelcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcariMouseClicked(evt);
            }
        });

        borrowBtn.setBackground(new java.awt.Color(255, 204, 153));
        borrowBtn.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        borrowBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/pic/add.png"))); // NOI18N
        borrowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowBtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kembali");

        returnBtn.setBackground(new java.awt.Color(255, 204, 153));
        returnBtn.setFont(new java.awt.Font("Corbel", 0, 48)); // NOI18N
        returnBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/pic/del.png"))); // NOI18N
        returnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBtnMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pinjam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(jTextFieldcari, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelcari)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrowBtn)
                    .addComponent(returnBtn)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrowBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(returnBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcariActionPerformed
        search();
    }//GEN-LAST:event_jTextFieldcariActionPerformed

    private void jLabelcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcariMouseClicked
        search();
    }//GEN-LAST:event_jLabelcariMouseClicked

    private void borrowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowBtnMouseClicked
        new Borrow().setVisible(true);
    }//GEN-LAST:event_borrowBtnMouseClicked

    private void returnBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBtnMouseClicked
        new Returnee().setVisible(true);
    }//GEN-LAST:event_returnBtnMouseClicked
    
    private void search() {
        String cari;
        cari = jTextFieldcari.getText();
        Object header[] = {"No", "Nama", "Buku", "Kode Buku", "Tanggal Pinjam", "tanggal pengembalian"};
        DefaultTableModel data = new DefaultTableModel(null, header);
        jTabledatapinjam.setModel(data);
        String pinjam = "SELECT * FROM circular INNER JOIN book ON circular.book_id=book.id INNER JOIN student ON circular.student_id=student.id where student.name like '%" + cari + "%' order by circular.id";
        try {
            Statement st = con.con.createStatement();
            ResultSet rs = st.executeQuery(pinjam);
            while (rs.next()) {
                String kolom1 = rs.getString(1);
                String kolom2 = rs.getString(15);
                String kolom3 = rs.getString(8);
                String kolom4 = rs.getString(7);
                String kolom5 = rs.getString(2);
                String kolom6 = rs.getString(3);
                String kolom[] = {kolom1, kolom2, kolom3, kolom4, kolom5, kolom6};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error :" + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel borrowBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelcari;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabledatapinjam;
    private javax.swing.JTextField jTextFieldcari;
    private javax.swing.JLabel returnBtn;
    // End of variables declaration//GEN-END:variables
}
