import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Change extends javax.swing.JPanel {
    
    private static final long serialVersionUID = 1L;
    
    private DefaultTableModel model = new DefaultTableModel();
   
    /**
     * Creates new form Subpanel1
     */
    
    public Change() {
        initComponents();
        Logica logica = new Logica();
        DefaultTableModel modelo = logica.mostrarVentas();
        TableEdit.setModel(modelo);
        jTable2.setModel(modelo);
        TxtCodFac.requestFocus();
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
        TxtCodFac = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableEdit = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtCodPre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtTotal1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtDev = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtEfe = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 171, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("cambios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(119, 171, 183));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("cambiar");
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 120, 30));

        TxtCodFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCodFacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodFacKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCodFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 140, -1));

        TableEdit.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableEdit);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 290, 100));

        jPanel5.setBackground(new java.awt.Color(119, 171, 183));
        jPanel5.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel17.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("eliminar fila");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 140, -1));

        TxtName.setEditable(false);
        jPanel1.add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 290, 100));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel5.setText("Nueva factura");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, 20));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel7.setText("Codigo factura");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 20));

        TxtFecha.setEditable(false);
        jPanel1.add(TxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel8.setText("fecha");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, 20));

        TxtCodPre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCodPreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodPreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCodPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 140, -1));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel9.setText("codigo prenda");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 20));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel10.setText("tabla de referencia");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 20));

        TxtTotal.setEditable(false);
        jPanel1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, -1));

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel11.setText("total");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 20));

        TxtTotal1.setEditable(false);
        jPanel1.add(TxtTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 140, -1));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel12.setText("nuevo total");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        TxtDev.setEditable(false);
        jPanel1.add(TxtDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 140, -1));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel13.setText("devolver");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, 20));

        TxtEfe.setToolTipText("");
        TxtEfe.setActionCommand("<Not Set>");
        TxtEfe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtEfeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEfeKeyTyped(evt);
            }
        });
        jPanel1.add(TxtEfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 140, -1));

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel14.setText("efectivo");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel2.setBackground(new Color(29,62,83));
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jPanel2.setBackground(new Color(119,171,183));
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void TxtCodFacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodFacKeyReleased
        buscarVenta(TxtCodFac.getText());
        try {
            Con con = new Con();
            Connection cn = con.conexion();
            PreparedStatement pst = null;
            ResultSet rs = null;
            String Codv = TxtCodFac.getText();
            // Consulta para obtener el cliente_id
            String sql = "SELECT cliente_id FROM venta WHERE cod_ven = ?";
            pst = cn.prepareStatement(sql);
            pst.setString(1, Codv);
            rs = pst.executeQuery();
            if (rs.next()) {
                String clienteId = rs.getString("cliente_id");
                // Consulta para obtener el nombre del cliente
                PreparedStatement pst1 = cn.prepareStatement("SELECT Nombre FROM cliente WHERE Id = ?");
                pst1.setString(1, clienteId);
                ResultSet rs1 = pst1.executeQuery();
                if (rs1.next()) {
                    String nombreCliente = rs1.getString("Nombre");
                    TxtName.setText(nombreCliente);
                } else {
                    JOptionPane.showInputDialog(null, "No se encontró algún cliente","Información",JOptionPane.INFORMATION_MESSAGE);
                }
            } else {   
            }
                PreparedStatement pst2 = cn.prepareStatement("SELECT fecha FROM venta WHERE cod_ven = ?");
            pst2.setString(1, Codv);
            ResultSet fec = pst2.executeQuery();
            while (fec.next()) {
                String fecha = fec.getString("fecha");
                TxtFecha.setText(fecha);
                }
                PreparedStatement pst3 = cn.prepareStatement("SELECT preciot FROM venta WHERE cod_ven = ?");
            pst3.setString(1, Codv);
            ResultSet prec = pst3.executeQuery();
            while (prec.next()) {
                String preci = prec.getString("preciot");
                TxtTotal.setText(preci);
                }
        } catch (NumberFormatException e) {
            JOptionPane.showInputDialog(null, "Número incorrecto insertado","Información",JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showInputDialog(null, "Error en la conexión de base de datos","Información",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TxtCodFacKeyReleased

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int fila = TableEdit.getSelectedRow();
        if (fila >= 0) {
            try {
                Con con = new Con();
                Connection cn = con.conexion();
                String codFac = TxtCodFac.getText();
                DefaultTableModel modelo2 = (DefaultTableModel) TableEdit.getModel();
                PreparedStatement pst = cn.prepareStatement("UPDATE prenda SET cantidad = cantidad + ?, preciototalcom = cantidad * preciocom, "
                        + "preciototalven = cantidad * precioven WHERE cod_p=?");
                PreparedStatement pst1 = cn.prepareStatement("DELETE FROM ventaprenda WHERE Id_ven = ?");
                pst1.setString(1, codFac);
                pst1.executeUpdate();
                for (int i = 0; i < modelo2.getRowCount(); i++) {
                    int id = Integer.parseInt(modelo2.getValueAt(i, 0).toString());
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
                if (Exito) {
                    JOptionPane.showMessageDialog(null, "Se ha actualizado la cantidad correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    modelo2.removeRow(fila); // Elimina la fila del modelo
                } else {
                    JOptionPane.showMessageDialog(null, "Ha habido un problema al actualizar la cantidad", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                // Maneja las excepciones adecuadamente

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona por favor una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jPanel5.setBackground(new Color(29,62,83));
        jLabel17.setForeground(Color.white);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jPanel5.setBackground(new Color(119,171,183));
        jLabel17.setForeground(Color.black);
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Con con = new Con();
            Connection cn = con.conexion();
            if (TxtEfe.getText().isEmpty()|| TxtName.getText().isEmpty()||TxtCodFac.getText().isEmpty()
                ||TxtTotal1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, """
                    Atención:
                    Por favor ingrese los valores solicitados""",  
                    "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                DefaultTableModel modelo = (DefaultTableModel) TableEdit.getModel();
                int codf = Integer.valueOf(TxtCodFac.getText());
                int valortn = Integer.valueOf(TxtTotal1.getText());
                PreparedStatement pst2 = cn.prepareStatement("UPDATE venta SET  preciot = ? WHERE cod_ven = ? ") ;
                PreparedStatement ps = cn.prepareStatement ("INSERT INTO ventaprenda (Id_ven, id_pren, cantidad, prec) VALUES (?,?,?,?)");  
                pst2.setInt(1, valortn);
                pst2.setInt(2, codf);
                ps.setInt(1, codf);
                for (int i = 0; i < modelo.getRowCount(); i++){
                 ps.setInt (2, Integer.parseInt(modelo.getValueAt(i, 0).toString()));
                 ps.setInt (3, Integer.parseInt(modelo.getValueAt(i, 1).toString()));
                 ps.setInt (4, Integer.parseInt(modelo.getValueAt(i, 3).toString()));
                 ps.addBatch();
                }
                int[] n3 = ps.executeBatch();
                int n2= pst2.executeUpdate();
                boolean exito = true;
                for (int i = 0; i < n3.length; i++) {
                if (n3[i] <= 0) { 
                    exito = false;
                    break;
                    }
                }
                if(exito && n2>0){
                    JOptionPane.showMessageDialog(null, "Se ha registrado los valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                    Pdf();
                    TxtCodFac.requestFocus();
                    TxtCodFac.setText(null);
                    TxtFecha.setText(null);
                    TxtName.setText(null);
                    TxtCodPre.setText(null);
                    TxtTotal.setText(null);
                    TxtDev.setText(null);
                    TxtEfe.setText(null);
                    TxtTotal1.setText(null);
                    // Mientras el modelo tenga alguna fila
                    DefaultTableModel mode= (DefaultTableModel) TableEdit.getModel();
                    while (mode.getRowCount() > 0) {
                        mode.removeRow(0);
                    }
                    DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
                    while (model2.getRowCount() > 0) {
                        model2.removeRow(0);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido registrar los valores", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar : " + ex, "Ingreso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void TxtEfeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEfeKeyReleased
        try {
            int Pago = Integer.valueOf(TxtEfe.getText());
            int Total = Integer.valueOf(TxtTotal1.getText());
            int devueltas = Pago - Total;
            TxtDev.setText(String.valueOf(devueltas));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa valores numéricos válidos.");
        }
    }//GEN-LAST:event_TxtEfeKeyReleased

    private void TxtCodPreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodPreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            leercodigo();
        }
    }//GEN-LAST:event_TxtCodPreKeyPressed

    private void TxtCodFacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodFacKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCodFacKeyTyped

    private void TxtCodPreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodPreKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCodPreKeyTyped

    private void TxtEfeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEfeKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtEfeKeyTyped

    public void buscarVenta (String buscar){
        Logica lg = new Logica();
        DefaultTableModel modelo = lg.buscarVentas(buscar);
        DefaultTableModel modelo1 = lg.buscarVentas(buscar);
        TableEdit.setModel(modelo);
        jTable2.setModel(modelo1);
    }
    public void Renovar(){
        try {
            Con con = new Con();
            Connection cn = con.conexion();
            if (TxtName.getText().isEmpty()||TxtName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, """
                    Atención:
                    Por favor ingrese los valores solicitados""",  
                    "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                int opcion = JOptionPane.showConfirmDialog(null,"Recuerda que al restaurar la venta se eliminarán "
                        + "del historial, por lo tanto deberás tener presente"
                        + " la tabla de referencia. ¿Estás seguro de realizar esta acción?", "Confirmación", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (opcion == JOptionPane.YES_OPTION) {
                    // El usuario hizo clic en "Sí"
                    System.out.println("Acción confirmada. Realizando la acción...");
                    DefaultTableModel modelo2= (DefaultTableModel) TableEdit.getModel();
                        PreparedStatement pst = cn.prepareStatement("UPDATE prenda SET cantidad = cantidad + ?, preciototalcom = cantidad * preciocom, "
                         + "preciototalcom = cantidad * preciocom, preciototalven = cantidad * precioven WHERE cod_p=?") ;
                    for (int i = 0; i < modelo2.getRowCount(); i++){
                        int id = Integer.parseInt (modelo2.getValueAt(i, 0).toString ());
                        int cantidad = Integer.parseInt(modelo2.getValueAt(i, 1).toString());
                        pst.setInt(1, cantidad);
                        pst.setInt(2, id);
                        pst.addBatch();
                    }
                    int codFa = Integer.parseInt(TxtCodFac.getText());
                    PreparedStatement psteliminar = cn.prepareStatement("DELETE FROM ventaprenda WHERE Id_ven = ?");
                    psteliminar.setInt(1, codFa);
                    int n = psteliminar.executeUpdate();
                    int[] n1 = pst.executeBatch();
                    boolean Exito = true;
                    for (int i = 0; i < n1.length; i++) {
                        if (n1[i] <= 0) { 
                            Exito = false;
                            break;
                        }
                    }
                    if(Exito && n>0){
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                    while (modelo2.getRowCount() > 0) {
                        modelo2.removeRow(0);
                    }
                    }
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
    private int total (){
        int contar = TableEdit.getRowCount();
        int suma = 0;
        for (int i = 0; i < contar; i++) {
            suma += Integer.parseInt(TableEdit.getValueAt(i, 3).toString());
        }
        return suma;
    }
    @SuppressWarnings("AssignmentToForLoopParameter")
    public void leercodigo(){
        Con con = new Con();
        Connection cn = con.conexion();
        if (TxtCodPre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, """
                Atención:
                Por favor ingrese los valores solicitados""",  
                "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            DefaultTableModel mod= (DefaultTableModel) TableEdit.getModel();
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
                        setModel((DefaultTableModel) TableEdit.getModel());
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
            int contar = TableEdit.getRowCount(); // obtener el número de filas de la tabla
            for (int i = 0; i < contar - 1; i++) { // recorrer las filas desde la primera hasta la penúltima
                int codp1 = Integer.parseInt(TableEdit.getValueAt(i, 0).toString()); // obtener el código de la prenda de la fila actual
                for (int j = i + 1; j < contar; j++) { // recorrer las filas desde la siguiente hasta la última
                    int codp2 = Integer.parseInt(TableEdit.getValueAt(j, 0).toString()); // obtener el código de la prenda de la fila comparada
                    if (codp1 == codp2) { // si los códigos son iguales, se trata de la misma prenda
                        // sumar la cantidad y el precio de la fila comparada a la fila actual
                        int cant1 = Integer.parseInt(TableEdit.getValueAt(i, 1).toString());
                        int cant2 = Integer.parseInt(TableEdit.getValueAt(j, 1).toString());
                        int prec1 = Integer.parseInt(TableEdit.getValueAt(i, 3).toString());
                        int prec2 = Integer.parseInt(TableEdit.getValueAt(j, 3).toString());
                        TableEdit.setValueAt(cant1 + cant2, i, 1); // actualizar la cantidad de la fila actual
                        TableEdit.setValueAt(prec1 + prec2, i, 3); // actualizar el precio de la fila actual
                        // eliminar la fila comparada
                        mod.removeRow(j);
                        // actualizar el número de filas y el índice de la fila comparada
                        contar--;
                        j--;
                    }  
               }
            }
            TxtTotal1.setText(Integer.toString(total()));
            TxtCodPre.setText(null);
        }
    }
    public void Pdf() throws SQLException{
        try{
             Con con = new Con();
             Connection cn = con.conexion();
             PreparedStatement pst = null;
             ResultSet rs = null;
             int codv = Integer.valueOf(TxtCodFac.getText());
             String sql = "SELECT cliente_id FROM venta WHERE cod_ven = ?";
             pst = cn.prepareStatement(sql);
             pst.setInt(1, codv);
             rs = pst.executeQuery();
             int ced = 0;
             if (rs.next()) {
                 ced = rs.getInt("cliente_id");
             }
             int valort = Integer.valueOf(TxtTotal1.getText());
             String nom = TxtName.getText();
             String fec = TxtFecha.getText();
             int efectivoRecibido = Integer.valueOf(TxtEfe.getText());
             int Resultado = efectivoRecibido - valort;
             Rectangle pageSize = new Rectangle(138, 400); // 58 mm de ancho y 100 mm de alto
             Document document = new Document(pageSize);
             document.setMargins(0, 0, 0, 0);
             Image img;
             PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Factura.pdf"));
             document.open();
             Image imagen = Image.getInstance("src/imagenes/Logo.png");
             imagen.scaleToFit(50, 50);
             float x = (pageSize.getWidth() - imagen.getScaledWidth()) / 2;
             float y = (pageSize.getHeight() - imagen.getScaledHeight());
             imagen.setAbsolutePosition(x, y);
             document.add(imagen);
             document.add(new Paragraph("\n"));
             document.add(new Paragraph("\n"));
             document.add(new Paragraph("\n"));
             Font font = new Font(Font.FontFamily.HELVETICA, 8);
             Font font1 = new Font(Font.FontFamily.HELVETICA, 12);
             Paragraph encabezado = new Paragraph("OULET DEL LLANO", font);
             Paragraph ciudad = new Paragraph("Granada Meta", font);
             Paragraph direccion = new Paragraph("Crr 8 N 21-74 Local 101", font);
             encabezado.setAlignment(Element.ALIGN_CENTER);
             ciudad.setAlignment(Element.ALIGN_CENTER);
             direccion.setAlignment(Element.ALIGN_CENTER);
             document.add(encabezado);
             document.add(ciudad);
             document.add(direccion);
             document.add(new Paragraph("\n"));
             Paragraph factura = new Paragraph("Factura " + codv, font);
             factura.setAlignment(Element.ALIGN_CENTER);
             document.add(factura);
             document.add(new Paragraph("N° documento: "+ ced, font));
             document.add(new Paragraph("Nombre: "+ nom, font));
             document.add(new Paragraph("Fecha: " + fec, font));
             document.add(new Paragraph("Compra: ", font));
             document.add(new Paragraph("\n"));
             PdfPTable tabla = new PdfPTable(4);
             tabla.setWidthPercentage(98);
             tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
             tabla.addCell(new Phrase("Código", font));
             tabla.addCell(new Phrase("Cantidad", font));
             tabla.addCell(new Phrase("Descripción", font));
             tabla.addCell(new Phrase("Total", font));
                 PreparedStatement pst1 = cn.prepareStatement("SELECT a.*, b.descripción FROM ventaprenda a JOIN prenda b ON a.id_pren = b.Cod_p WHERE a.Id_ven = ?");
             pst1.setInt(1, codv);
             ResultSet Rs = pst1.executeQuery();
             while (Rs.next()) {
                 tabla.addCell(new Phrase(Rs.getString("id_pren"), font));
                 tabla.addCell(new Phrase(Rs.getString("cantidad"), font));
                 tabla.addCell(new Phrase(Rs.getString("descripción"), font));
                 tabla.addCell(new Phrase(Rs.getString("prec"), font));
                     }
             document.add(tabla);
             Paragraph total = new Paragraph("Total: $"+ valort, font1);
             Paragraph recibido = new Paragraph("Total Recibido: $"+ efectivoRecibido, font1);
             Paragraph devolver = new Paragraph("Cambio: $"+ Resultado, font1);
             total.setAlignment(Element.ALIGN_CENTER);
             recibido.setAlignment(Element.ALIGN_CENTER);
             devolver.setAlignment(Element.ALIGN_CENTER);
             document.add(total);
             document.add(recibido);
             document.add(devolver);
             int Cant = 1;
             Barcode39 code = new Barcode39();
             String cod = TxtCodFac.getText();
             code.setCode(cod);
             img =code.createImageWithBarcode(pdfWriter.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
             img.setAlignment(Element.ALIGN_CENTER);
             for (int i = 0; i < Cant; i++) {
                 document.add(img);
                }
             document.close();
        } catch (FileNotFoundException | DocumentException ex ) {
             Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
             Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        }
        print();
    }
    void print(){
        try {
             String rutaArchivoPDF = "Factura.pdf";
             if (Desktop.isDesktopSupported()) {
                 Desktop desktop = Desktop.getDesktop();
                 File archivoPDF = new File(rutaArchivoPDF);
                 desktop.print(archivoPDF);
             } else {
                 System.out.println("Desktop no es compatible con esta plataforma.");
             }
             } catch (IOException e) {
             }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableEdit;
    private javax.swing.JTextField TxtCodFac;
    private javax.swing.JTextField TxtCodPre;
    private javax.swing.JTextField TxtDev;
    private javax.swing.JTextField TxtEfe;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTotal1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

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


