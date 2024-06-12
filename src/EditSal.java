import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Jose Eliud Bernal
 */
public class EditSal extends javax.swing.JPanel {

    /**
     * Creates new form Subpanel1
     */
    
    public EditSal() {
        initComponents();
        Logica logica = new Logica();
        DefaultTableModel modelo = logica.mostrarsalidas();
        jTable1.setModel(modelo);
        jDateChooser2.setMaxSelectableDate(new date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtNumSa = new javax.swing.JTextField();
        TxtDesSa = new javax.swing.JTextField();
        TxtPreSa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(119, 171, 183));
        jPanel1.setMinimumSize(new java.awt.Dimension(287, 290));
        jPanel1.setPreferredSize(new java.awt.Dimension(287, 320));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("editar salidas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(119, 171, 183));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guardar edición");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 120, 30));

        jPanel3.setBackground(new java.awt.Color(119, 171, 183));
        jPanel3.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("átras");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 120, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel4.setText("Numero de salida");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 20));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel5.setText("descripción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 20));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel6.setText("fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 20));

        TxtNumSa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNumSaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumSaKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNumSa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 140, -1));
        jPanel1.add(TxtDesSa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, -1));

        TxtPreSa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPreSaKeyTyped(evt);
            }
        });
        jPanel1.add(TxtPreSa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 140, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel7.setText("Precio gastado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 360, 90));

        jDateChooser2.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 140, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel2.setBackground(new Color(29,62,83));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jPanel3.setBackground(new Color(29,62,83));
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jPanel2.setBackground(new Color(119,171,183));
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jPanel3.setBackground(new Color(119,171,183));
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        MenúSal s = new MenúSal();
        s.setSize(410, 440);
        s.setLocation(0, 0);
        
        Home.Prin.removeAll();
        Home.Prin.add(s);
        Home.Prin.revalidate();
        Home.Prin.repaint();
    }//GEN-LAST:event_jLabel3MouseClicked
  
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Con con = new Con();
        Connection cn = (Connection) con.conexion();
        try {
            if (TxtNumSa.getText().isEmpty()|TxtDesSa.getText().isEmpty()|TxtPreSa.getText().isEmpty()|jDateChooser2.getDate()==null) {
                JOptionPane.showMessageDialog(null, """
                                              Atención:
                                              Por favor ingrese los valores solicitados""",  
                            "Error", JOptionPane.ERROR_MESSAGE); 
            } else {
                int num = Integer.valueOf(TxtNumSa.getText());
                String des = TxtDesSa.getText();
                int prec = Integer.valueOf(TxtPreSa.getText());
                String fec = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
                PreparedStatement pst = cn.prepareStatement("UPDATE salida SET descripción=?, precio=?, fecha=? WHERE número=?");
                pst.setString(1, des);
                pst.setInt(2, prec);
                pst.setString(3, fec);
                pst.setInt(4, num);
             int n = pst.executeUpdate();
             if(n>0){
                 JOptionPane.showMessageDialog(null, "Se ha cambiado los valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                 TxtDesSa.setText(null);
                 TxtNumSa.requestFocus();
                 TxtNumSa.setText(null);
                 TxtPreSa.setText(null);
                 jDateChooser2.setDate(null);
             }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar"+ex, "Ingreso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void TxtNumSaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumSaKeyReleased
        buscarPersona(TxtNumSa.getText());
    }//GEN-LAST:event_TxtNumSaKeyReleased

    private void TxtPreSaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPreSaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') 
            evt.consume();
    }//GEN-LAST:event_TxtPreSaKeyTyped

    private void TxtNumSaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumSaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') 
            evt.consume();
    }//GEN-LAST:event_TxtNumSaKeyTyped
    public void buscarPersona (String buscar){
        Logica logica = new Logica();
        
        DefaultTableModel modelo = logica.buscarsalidas(buscar);
        
        jTable1.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDesSa;
    private javax.swing.JTextField TxtNumSa;
    private javax.swing.JTextField TxtPreSa;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private static class date extends java.util.Date {

        public date() {
        }
    }
}
