import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Jose Eliud Bernal
 */
public class EditarApart extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private DefaultTableModel model;
    /**
     * Creates new form EditarApart
     */
    public EditarApart() {
        initComponents();
        Logica logica = new Logica();
        DefaultTableModel modelo = logica.mostrarApartado();
        jTable1.setModel(modelo);
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
        TxtDoc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtCelular = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtCoda = new javax.swing.JTextField();
        TxtCodPre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtNuevoSaldo = new javax.swing.JTextField();
        TxtAbonado = new javax.swing.JTextField();
        TxtAbono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(119, 171, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtDocKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDocKeyTyped(evt);
            }
        });
        jPanel1.add(TxtDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 175, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel1.setText("DOCUMENTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel6.setText("NOMBRE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        TxtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNameKeyTyped(evt);
            }
        });
        jPanel1.add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 175, -1));

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel14.setText("TELEFONO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        TxtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 175, -1));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel13.setText("CÓDIGO APARTADO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        TxtCoda.setEditable(false);
        TxtCoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodaActionPerformed(evt);
            }
        });
        TxtCoda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodaKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 175, -1));

        TxtCodPre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCodPreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodPreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCodPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 175, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel7.setText("CÓDIGO PRENDA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel5.setText("ABONADO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        TxtFecha.setEditable(false);
        jPanel1.add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 175, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel4.setText("FECHA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prenda", "Cantidad", "Descripción", "Precio"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 520, 120));

        jPanel4.setBackground(new java.awt.Color(119, 171, 183));
        jPanel4.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel18.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ELIMINAR FILA");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel19.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel19.setText("TOTAL");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        TxtTotal.setEditable(false);
        jPanel1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 77, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("EDITAR APARTADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(119, 171, 183));
        jPanel3.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ATRÁS");
        jLabel12.setMaximumSize(new java.awt.Dimension(63, 14));
        jLabel12.setMinimumSize(new java.awt.Dimension(63, 14));
        jLabel12.setPreferredSize(new java.awt.Dimension(63, 14));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 160, -1));

        jPanel2.setBackground(new java.awt.Color(119, 171, 183));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GUARDAR");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 390, 150, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel10.setText("SALDO EDICIÓN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        TxtNuevoSaldo.setEditable(false);
        jPanel1.add(TxtNuevoSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 70, -1));

        TxtAbonado.setEditable(false);
        jPanel1.add(TxtAbonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 175, -1));

        TxtAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtAbonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtAbonoKeyTyped(evt);
            }
        });
        jPanel1.add(TxtAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 77, -1));

        jLabel20.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel20.setText("ABONA");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDocKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtDocKeyTyped

    private void TxtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNameKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z') && (c<'A'||c>'Z') && c != 'ñ' && (c<'á'||c>'ú') && (c<'Á'||c>'Ú') &&  c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtNameKeyTyped

    private void TxtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCelularKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCelularKeyTyped

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila>=0) {
            try {
                Cone con = new Cone();
                Connection cn = con.conexion();
                String codApa = TxtCoda.getText();
                DefaultTableModel modelo2= (DefaultTableModel) jTable1.getModel();
                        PreparedStatement pst = cn.prepareStatement("UPDATE prenda SET cantidad = cantidad + ?, preciototalcom = cantidad * preciocom, "
                         + "preciototalcom = cantidad * preciocom, preciototalven = cantidad * precioven WHERE cod_p=?") ;
                        PreparedStatement pst1 = cn.prepareStatement("DELETE FROM apartadoprenda WHERE Id_ven = ?");
                pst1.setString(1, codApa);
                pst1.executeUpdate();
                    for (int i = 0; i < modelo2.getRowCount(); i++){
                        int id = Integer.parseInt (modelo2.getValueAt(i, 0).toString ());
                        int cantidad = Integer.parseInt(modelo2.getValueAt(i, 1).toString());
                        pst.setInt(1, cantidad);
                        pst.setInt(2, id);
                        pst.addBatch();
                    }
                int[] n1 = pst.executeBatch();
                boolean Exito = true;
                for (int i = 0; i < n1.length; i++) {
                    if (n1[i] <= 0) { 
                        Exito = false;
                        break;
                    }
                }
                if(Exito){
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                    getModel().removeRow(fila);
                }else{
                    JOptionPane.showMessageDialog(null, "Ha habido un problema", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                }
                  
            } catch (HeadlessException | NumberFormatException | SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona por favor una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jPanel4.setBackground(new Color(29,62,83));
        jLabel18.setForeground(Color.white);
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jPanel4.setBackground(new Color(119,171,183));
        jLabel18.setForeground(Color.black);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        MainApart Pn2 = new MainApart();
        Pn2.setSize(410, 440);
        Pn2.setLocation(0, 0);

        Home.Prin.removeAll();
        Home.Prin.add(Pn2);
        Home.Prin.revalidate();
        Home.Prin.repaint();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jPanel3.setBackground(new Color(29,62,83));
        jLabel12.setForeground(Color.white);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jPanel3.setBackground(new Color(119,171,183));
        jLabel12.setForeground(Color.black);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            Cone con = new Cone();
            Connection cn = con.conexion();
            if (TxtCelular.getText().isEmpty()||TxtCoda.getText().isEmpty() || TxtAbonado.getText().isEmpty() || TxtAbono.getText().isEmpty() || TxtCoda.getText().isEmpty() 
                || TxtDoc.getText().isEmpty() || TxtFecha.getText().isEmpty() || TxtName.getText().isEmpty() 
                || TxtNuevoSaldo.getText().isEmpty() || TxtTotal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, """
                    Atención:
                    Por favor ingrese los valores solicitados""",  
                    "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                int coda = Integer.valueOf(TxtCoda.getText());
                int ced = Integer.valueOf(TxtDoc.getText());
                int valort = Integer.valueOf(TxtTotal.getText());
                int Abono = Integer.valueOf(TxtAbono.getText());
                int Saldo = Integer.valueOf(TxtNuevoSaldo.getText());
                String nom = TxtName.getText();
                long cel = Long.valueOf(TxtCelular.getText());
                PreparedStatement pst2 = cn.prepareStatement("UPDATE apartado SET  Abono = ?, Saldo = ?, Total = ?  WHERE cod_a = ? ") ;
                PreparedStatement ps = cn.prepareStatement ("INSERT INTO apartadoprenda (CodApartado, CodPrenda, Cantidad, Precio) VALUES (?,?,?,?)");  
                PreparedStatement pstc = cn.prepareStatement("UPDATE cliente SET Nombre = ?, Telefono = ? WHERE Id = ?") ;
                pstc.setString(1, nom);
                pstc.setLong(2, cel);
                pstc.setInt(3, ced);
                pst2.setInt(1, Abono);
                pst2.setInt(2, Saldo);
                pst2.setInt(3, valort);
                pst2.setInt(4, coda);
                ps.setInt(1, coda);
                for (int i = 0; i < modelo.getRowCount(); i++){
                 ps.setInt (2, Integer.parseInt(modelo.getValueAt(i, 0).toString()));
                 ps.setInt (3, Integer.parseInt(modelo.getValueAt(i, 1).toString()));
                 ps.setInt (4, Integer.parseInt(modelo.getValueAt(i, 3).toString()));
                 ps.addBatch();
                }
                int[] n3 = ps.executeBatch();
                int n2= pst2.executeUpdate();
                int n4 = pstc.executeUpdate();
                boolean exito = true;
                for (int i = 0; i < n3.length; i++) {
                if (n3[i] <= 0) { 
                    exito = false;
                    break;
                    }
                }
                if(exito && n2>0 && n4>0){
                    JOptionPane.showMessageDialog(null, "Se ha registrado los valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                    TxtDoc.requestFocus();
                    TxtCelular.setText(null);
                    TxtAbono.setText(null);
                    TxtFecha.setText(null);
                    TxtName.setText(null);
                    TxtCodPre.setText(null);
                    TxtCoda.setText(null);
                    TxtDoc.setText(null);
                    TxtTotal.setText(null);
                    TxtNuevoSaldo.setText(null);
                    TxtAbonado.setText(null);
                    // Mientras el modelo tenga alguna fila
                    while (getModel().getRowCount() > 0) {
                        getModel().removeRow(0);
                    }
                    jLabel12.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido registrar los valores", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar : " + ex, "Ingreso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jPanel2.setBackground(new Color(29,62,83));
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jPanel2.setBackground(new Color(119,171,183));
        jLabel11.setForeground(Color.black);
    }//GEN-LAST:event_jLabel11MouseExited

    private void TxtCodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodaActionPerformed

    private void TxtAbonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAbonoKeyReleased
        try {
            int Abono_saldo = Integer.parseInt(TxtTotal.getText());
            int AS = Integer.parseInt(TxtAbono.getText());
            int Apart_F = Abono_saldo - AS;
            String num = String.valueOf(Apart_F);
            TxtNuevoSaldo.setText(num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa valores numéricos válidos.");
        }
    }//GEN-LAST:event_TxtAbonoKeyReleased

    private void TxtDocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDocKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            accionEnter();
            Renovar();
        }
    }//GEN-LAST:event_TxtDocKeyReleased

    private void TxtCodPreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodPreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            leercodigo();
        }
    }//GEN-LAST:event_TxtCodPreKeyPressed

    private void TxtCodaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodaKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCodaKeyTyped

    private void TxtCodPreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodPreKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCodPreKeyTyped

    private void TxtAbonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAbonoKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtAbonoKeyTyped

    public void accionEnter() {
        try {
             Cone con = new Cone();
             Connection cn = con.conexion();
             int cedu = Integer.parseInt(TxtDoc.getText());
                 PreparedStatement pstc = cn.prepareStatement("SELECT cod_a FROM apartado WHERE Cliente_id LIKE ?");
             pstc.setInt(1, cedu);
             ResultSet rs = pstc.executeQuery();
             ArrayList<String> numeros = new ArrayList<>();
             while (rs.next()) {
                 numeros.add(rs.getString("cod_a"));
             }
             String[] opciones = numeros.toArray(String[]::new);
             int seleccion = JOptionPane.showOptionDialog(null, 
                     "Este usuario tiene varios apartados... Seleccione uno", "Selección", JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
             TxtCoda.setText(opciones[seleccion]);
             TxtCodPre.requestFocus();
             TxtName.setText(TxtName.getText());
             String cod = TxtCoda.getText();
             TxtCoda.setText(cod);
             buscarApartado(cod);
             String fecha = ejecutarConsulta("SELECT Fecha FROM apartado WHERE Cod_a LIKE ?", cod, "Fecha");
             TxtFecha.setText(fecha);
             String total = ejecutarConsulta("SELECT Total FROM apartado WHERE Cod_a LIKE ?", cod, "Total");
             TxtTotal.setText(total);
             String abono = ejecutarConsulta("SELECT Abono FROM apartado WHERE Cod_a LIKE ?", cod, "Abono");
             TxtAbonado.setText(abono);
             String id = ejecutarConsulta("SELECT Cliente_id FROM apartado WHERE Cod_a LIKE ?", cod, "Cliente_id");
             TxtDoc.setText(id);
             String doc = TxtDoc.getText();
             String docu = ejecutarConsulta ("SELECT Nombre FROM cliente WHERE Id LIKE ?", doc, "Nombre");
             TxtName.setText(docu);
             String tel = ejecutarConsulta ("SELECT Telefono FROM cliente WHERE Id LIKE ?", doc, "Telefono");
             TxtCelular.setText(tel);
             TxtTotal.setText(Integer.toString(total()));
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage());
        }
    }
    private int total (){
        int contar = jTable1.getRowCount();
        int suma = 0;
        for (int i = 0; i < contar; i++) {
            suma += Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }
        return suma;
    }
    public String ejecutarConsulta(String sql, String parametro, String campo) {
        Cone con = new Cone();
        Connection cn = con.conexion();
        try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, parametro);
                ResultSet rs = pst.executeQuery();
                StringBuilder results = new StringBuilder();
                while (rs.next()) {
                results.append(rs.getString(campo));
                }
                return results.toString();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al conectar");
                return null;
            }
    }
    public void buscarApartado (String buscar){
        Logica logica = new Logica();
        DefaultTableModel modelo = logica.buscarapartado(buscar);
        jTable1.setModel(modelo);
    }
    @SuppressWarnings("AssignmentToForLoopParameter")
    public void leercodigo(){
        Cone con = new Cone();
        Connection cn = con.conexion();
        if (TxtCoda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, """
                Atención:
                Por favor ingrese los valores solicitados""",  
                "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int codp = Integer.parseInt(TxtCodPre.getText());
            int cant = 1;
            try {
                PreparedStatement pst = cn.prepareStatement("SELECT descripción, precioven, cantidad FROM prenda WHERE Cod_p LIKE ?");
                pst.setInt(1,codp);
                try (ResultSet resultSet = pst.executeQuery()) {
                    if (resultSet.next()) {
                    String des = resultSet.getString("descripción");
                    int prec2 = resultSet.getInt("precioven");
                    int cant2 = resultSet.getInt("cantidad");
                    if (cant <= cant2) {
                        int prec3 = prec2 * cant;
                        setModel((DefaultTableModel) jTable1.getModel());
                        Object datos[] = new Object[]{codp, cant, des, prec3};
                        getModel().addRow(datos);
                        int nuevoStock = cant2 - cant;
                        PreparedStatement updateStock = cn.prepareStatement("UPDATE prenda SET cantidad = ? WHERE Cod_p = ?");
                        updateStock.setInt(1, nuevoStock);
                        updateStock.setInt(2, codp);
                        updateStock.executeUpdate();
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad no disponible en Stock", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Producto no existente ", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (HeadlessException | SQLException e) {
            }
            int contar = jTable1.getRowCount(); // obtener el número de filas de la tabla
            for (int i = 0; i < contar - 1; i++) { // recorrer las filas desde la primera hasta la penúltima
                int codp1 = Integer.parseInt(jTable1.getValueAt(i, 0).toString()); // obtener el código de la prenda de la fila actual
                for (int j = i + 1; j < contar; j++) { // recorrer las filas desde la siguiente hasta la última
                    int codp2 = Integer.parseInt(jTable1.getValueAt(j, 0).toString()); // obtener el código de la prenda de la fila comparada
                    if (codp1 == codp2) { // si los códigos son iguales, se trata de la misma prenda
                        // sumar la cantidad y el precio de la fila comparada a la fila actual
                        int cant1 = Integer.parseInt(jTable1.getValueAt(i, 1).toString());
                        int cant2 = Integer.parseInt(jTable1.getValueAt(j, 1).toString());
                        int prec1 = Integer.parseInt(jTable1.getValueAt(i, 3).toString());
                        int prec2 = Integer.parseInt(jTable1.getValueAt(j, 3).toString());
                        jTable1.setValueAt(cant1 + cant2, i, 1); // actualizar la cantidad de la fila actual
                        jTable1.setValueAt(prec1 + prec2, i, 3); // actualizar el precio de la fila actual
                        // eliminar la fila comparada
                        getModel().removeRow(j);
                        // actualizar el número de filas y el índice de la fila comparada
                        contar--;
                        j--;
                    }  
               }
            }
            TxtTotal.setText(Integer.toString(total()));
            TxtCodPre.setText(null);
        }
    }
    public void Renovar(){
        try {
            Cone con = new Cone();
            Connection cn = con.conexion();
            if (TxtName.getText().isEmpty()||TxtDoc.getText().isEmpty()
                ||TxtCelular.getText().isEmpty()||TxtCoda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, """
                    Atención:
                    Por favor ingrese los valores solicitados""",  
                    "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                int opcion = JOptionPane.showConfirmDialog(null,"Recuerda que al restaurar el apartado se eliminarán "
                        + "los abonos del historial, por lo tanto deberás definir la cantidad total de los abonos "
                        + "para tener un registro. ¿Estás seguro de realizar esta acción?", "Confirmación", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (opcion == JOptionPane.YES_OPTION) {
                    // El usuario hizo clic en "Sí"
                    System.out.println("Acción confirmada. Realizando la acción...");
                    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                        PreparedStatement pst = cn.prepareStatement("UPDATE prenda SET cantidad = cantidad + ?, preciototalcom = cantidad * preciocom, "
                         + "preciototalcom = cantidad * preciocom, preciototalven = cantidad * precioven WHERE cod_p=?") ;
                    for (int i = 0; i < modelo.getRowCount(); i++){
                        int id = Integer.parseInt (modelo.getValueAt(i, 0).toString ());
                        int cantidad = Integer.parseInt(modelo.getValueAt(i, 1).toString());
                        pst.setInt(1, cantidad);
                        pst.setInt(2, id);
                        pst.addBatch();
                    }
                    int coda = Integer.parseInt(TxtCoda.getText());
                    PreparedStatement psteliminar = cn.prepareStatement("DELETE FROM apartadoprenda WHERE CodApartado = ?");
                    psteliminar.setInt(1, coda);
                    PreparedStatement pstElimiHisto = cn.prepareStatement("DELETE FROM historial WHERE cod_a = ?");
                    pstElimiHisto.setInt(1, coda);
                    int n2 = pstElimiHisto.executeUpdate();
                    int n = psteliminar.executeUpdate();
                    int[] n1 = pst.executeBatch();
                    boolean Exito = true;
                    for (int i = 0; i < n1.length; i++) {
                        if (n1[i] <= 0) { 
                            Exito = false;
                            break;
                        }
                    }
                    if(Exito && n>0 && n2>0){
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                    TxtTotal.setText(null);
                    jLabel12.setEnabled(false);
                    }
                    String cod = TxtCoda.getText();
                    TxtCoda.setText(cod);
                    buscarApartado(cod);
                } else if (opcion == JOptionPane.NO_OPTION) {
                    // El usuario hizo clic en "No"
                    JOptionPane.showMessageDialog(null, "Acción cancelada. No se realizará ninguna acción.", "Confirmado", JOptionPane.CLOSED_OPTION);
                    // Aquí puedes manejar la situación si el usuario decide no realizar la acción
                } 
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar"+e, "Erros", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAbonado;
    private javax.swing.JTextField TxtAbono;
    private javax.swing.JTextField TxtCelular;
    private javax.swing.JTextField TxtCodPre;
    private javax.swing.JTextField TxtCoda;
    private javax.swing.JTextField TxtDoc;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtNuevoSaldo;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private String getResultAsString(ResultSet resultSet, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the model
     */
    public DefaultTableModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
}
