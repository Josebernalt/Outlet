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
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.text.JTextComponent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Jose Eliud Bernal
 */
public class Sell extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private static DefaultTableModel model;

    /**
     * Creates new form Subpanel1
     */
    public Sell() {
        initComponents();
        generarSerie();
        jDateChooser1.setMaxSelectableDate(new date());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCod = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtCed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtCel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtCodVe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtTot = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        TxtEfe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtDev = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 171, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel1.setText("CÓDIGO PRENDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 20));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("VENDER PRODUCTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        TxtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCodKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 175, -1));

        jPanel2.setBackground(new java.awt.Color(119, 171, 183));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VENDER");
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
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prenda", "Cantidad", "Descripción", "Precio"
            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 530, 130));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel4.setText("FECHA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel6.setText("CÉDULA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        TxtCed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCedKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 175, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel7.setText("NOMBRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 20));

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 175, -1));

        TxtCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCelKeyTyped(evt);
            }
        });
        jPanel1.add(TxtCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 175, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel8.setText("CELULAR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 20));

        TxtCodVe.setEditable(false);
        jPanel1.add(TxtCodVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 175, -1));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel9.setText("TOTAL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel14.setText("CÓDIGO VENTA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 20));

        TxtTot.setEditable(false);
        jPanel1.add(TxtTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, -1));

        jPanel5.setBackground(new java.awt.Color(119, 171, 183));
        jPanel5.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel13.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ELIMINAR FILA");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 170, -1));

        TxtEfe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtEfeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEfeKeyTyped(evt);
            }
        });
        jPanel1.add(TxtEfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 160, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel10.setText("EFECTIVO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, 20));

        TxtDev.setEditable(false);
        jPanel1.add(TxtDev, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 160, -1));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel12.setText("DEVOLVER");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jPanel2.setBackground(new Color(29,62,83));
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jPanel2.setBackground(new Color(119,171,183));
        jLabel11.setForeground(Color.black);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Rectangle pageSize = new Rectangle(138, 400); // 58 mm de ancho y 100 mm de alto
        Document fact = new Document(pageSize);
        fact.setMargins(0, 0, 0, 0);
        try {
            PdfWriter writer = PdfWriter.getInstance(fact, new FileOutputStream("src/Facturas/Venta/Facturadeventa.pdf"));
            fact.open();
            Cone con = new Cone();
            Reporte.GenerarReporteInv(con, fact, writer);
            fact.close();
            writer.close();
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al crear documento");
        } catch (IOException ex) {
            Logger.getLogger(ReportInven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void TxtCedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedKeyReleased
        try {
            // Obtén el valor de entrada desde TxtCed
            String cedStr = TxtCed.getText();
            // Verifica si el valor de entrada está vacío
            if (cedStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un valor numérico válido.");
                return;
            }
            // Convierte el valor de entrada a un entero
            int ced = Integer.parseInt(cedStr);
            // Crea una conexión a la base de datos
            Cone con = new Cone();
            Connection cn = con.conexion();
            // Consulta para obtener el nombre desde la base de datos
            PreparedStatement pst = cn.prepareStatement("SELECT Nombre FROM cliente WHERE Id LIKE ?");
            pst.setInt(1, ced);
            try (ResultSet resultSet = pst.executeQuery()) {
                StringBuilder results = new StringBuilder();
                while (resultSet.next()) {
                    results.append(resultSet.getString("Nombre"));
                }
                TxtNombre.setText(results.toString());
            }
            // Consulta para obtener el número de teléfono desde la base de datos
            PreparedStatement pst1 = cn.prepareStatement("SELECT Telefono FROM cliente WHERE Id LIKE ?");
            pst1.setInt(1, ced);
            try (ResultSet resultSet = pst1.executeQuery()) {
                StringBuilder results = new StringBuilder();
                while (resultSet.next()) {
                    results.append(resultSet.getString("Telefono"));
                }
                TxtCel.setText(results.toString());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa valores numéricos válidos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la base de datos.");
        }
    }//GEN-LAST:event_TxtCedKeyReleased

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila>=0) {
            try {
                Cone con = new Cone();
                Connection cn = con.conexion();
                DefaultTableModel modelo2= (DefaultTableModel) jTable1.getModel();
                int idEli = Integer.parseInt(modelo2.getValueAt(fila, 0).toString());
                int canEli = Integer.parseInt(modelo2.getValueAt(fila, 1).toString());
                        PreparedStatement pst = cn.prepareStatement("UPDATE prenda SET cantidad = cantidad + ?, preciototalcom = cantidad * preciocom, "
                         + "preciototalcom = cantidad * preciocom, preciototalven = cantidad * precioven WHERE cod_p=?") ;
                pst.setInt(1, canEli);
                pst.setInt(2, idEli);
                int n1 = pst.executeUpdate();
                if(n1 > 0){
                    JOptionPane.showMessageDialog(null, "Se ha eliminado el valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                    getModel().removeRow(fila);
                    TxtTot.setText(Integer.toString(total()));
                }else{
                    JOptionPane.showMessageDialog(null, "Ha habido un problema", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                }
                  
            } catch (HeadlessException | NumberFormatException | SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona por favor una fila", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jPanel5.setBackground(new Color(29,62,83));
        jLabel13.setForeground(Color.white);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jPanel5.setBackground(new Color(119,171,183));
        jLabel13.setForeground(Color.black);
    }//GEN-LAST:event_jLabel13MouseExited

    private void TxtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            leercodigo();
        }
    }//GEN-LAST:event_TxtCodKeyPressed

    private void TxtEfeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEfeKeyReleased
        try {
            int Pago = Integer.valueOf(TxtEfe.getText());
            int Total = Integer.valueOf(TxtTot.getText());
            int devueltas = Pago - Total;
            TxtDev.setText(String.valueOf(devueltas));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa valores numéricos válidos.");
        }
    }//GEN-LAST:event_TxtEfeKeyReleased

    private void TxtCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCelKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCelKeyTyped

    private void TxtCedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCedKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a'||c>'z') && (c<'A'||c>'Z') && c != 'ñ' && (c<'á'||c>'ú') && (c<'Á'||c>'Ú') &&  c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void TxtCodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCodKeyTyped

    private void TxtEfeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEfeKeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_TxtEfeKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            TxtTot.setText(Integer.toString(total()));
        }
    }//GEN-LAST:event_jTable1KeyPressed

    @SuppressWarnings("AssignmentToForLoopParameter")
    public void leercodigo(){
        Cone con = new Cone();
        Connection cn = con.conexion();
        if (TxtCodVe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, """
                Atención:
                Por favor ingrese los valores solicitados""",  
                "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int codp = Integer.parseInt(TxtCod.getText());
            int cant = 1;
            try {
                PreparedStatement pst = cn.prepareStatement("SELECT descripción, precioven, cantidad FROM prenda WHERE Cod_p=?");
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
                        PreparedStatement updateStock = cn.prepareStatement("UPDATE prenda SET cantidad = ?, preciototalcom = cantidad*preciocom, preciototalven = cantidad*precioven WHERE Cod_p = ?");
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
            //Suma cantidades en una fila
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
            TxtTot.setText(Integer.toString(total()));
            TxtCod.setText(null);
        }
    }
    static void generarSerie(){
        Logica lg = new Logica();
        String serie = lg.Nmro_Serie();
        if (serie==null){
            TxtCodVe.setText("0000001");
        }else{
            int increment = Integer.parseInt(serie);
            increment += 1;
            TxtCodVe.setText("000000"+increment);
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
    private static boolean clienteExisteEnBD() {
        String consulta = "SELECT COUNT(*) FROM cliente WHERE Id = ?";
        Cone con = new Cone();
        Connection cn = con.conexion();
        try{
            int ced = Integer.parseInt(TxtCed.getText());
            PreparedStatement pst = cn.prepareStatement(consulta);
            pst.setInt(1, ced);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                return cantidad > 0; // Si la cantidad es mayor a cero, el cliente existe
            }
        } catch (SQLException e) {
        }
        return false; // Si ocurre algún error o no se encuentra el cliente, retornamos falso
    }
    static void print(){
        try {
             String rutaArchivoPDF = "src/Facturas/Venta/Facturadeventa.pdf";
             if (Desktop.isDesktopSupported()) {
                 Desktop desktop = Desktop.getDesktop();
                 File archivoPDF = new File(rutaArchivoPDF);
                 desktop.print(archivoPDF);
             } else {
                 System.out.println("Desktop no es compatible con esta plataforma.");
             }
        } catch (IOException e) {
            System.err.println("Error al imprimir el archivo: " + e.getMessage());     
        }
    }
    
    @SuppressWarnings("PublicInnerClass")
    public class Reporte {

        
        public static void GenerarReporteInv(Cone con, Document fact, PdfWriter writer) throws IOException{
            try {
             Connection cn = con.conexion();
             if (TxtEfe.getText().isEmpty() || TxtCed.getText().isEmpty()||TxtNombre.getText().isEmpty()
                     ||TxtCel.getText().isEmpty()||TxtCodVe.getText().isEmpty()||TxtTot.getText().isEmpty()||jDateChooser1.getDate()==null) {
                JOptionPane.showMessageDialog(null, """
                                              Atención:
                                              Por favor ingrese los valores solicitados""",  
                            "Error", JOptionPane.ERROR_MESSAGE);
            }else{
             int ced = Integer.valueOf(TxtCed.getText());
             int valort = Integer.valueOf(TxtTot.getText());
             int codv = Integer.valueOf(TxtCodVe.getText());
             String nom = TxtNombre.getText();
             long cel = Long.valueOf(TxtCel.getText());
             int totalrec = Integer.valueOf(TxtEfe.getText());
             int Devueltas = Integer.valueOf(TxtDev.getText());
             String fec = ((JTextComponent)jDateChooser1.getDateEditor().getUiComponent()).getText();
             DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                 PreparedStatement pst2 = cn.prepareStatement("INSERT INTO venta (cod_ven, preciot, fecha, cliente_id) VALUES (?,?,?,?)") ;
                 PreparedStatement ps = cn.prepareStatement ("INSERT INTO ventaprenda (Id_ven, id_pren, cantidad, prec) VALUES (?,?,?,?)");
             boolean clienteExiste = clienteExisteEnBD();
             if (!clienteExiste) {
                 PreparedStatement pstc = cn.prepareStatement("INSERT INTO cliente (Id, Nombre, Telefono) VALUES (?,?,?)") ;
                 pstc.setInt(1, ced);
                 pstc.setString(2, nom);
                 pstc.setLong(3, cel);
                 int n4 = pstc.executeUpdate();
                 if (n4>0){
                     JOptionPane.showMessageDialog(null, "Cliente agregado", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                 }
             }
             pst2.setInt(1, codv);
             pst2.setInt(2, valort);
             pst2.setString(3, fec);
             pst2.setInt(4, ced);
             ps.setInt(1, codv);
             for (int i = 0; i < modelo.getRowCount(); i++){
                 ps.setInt (2, (int) modelo.getValueAt(i, 0));
                 ps.setInt (3, (int) modelo.getValueAt(i, 1));
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
                 TxtCod.requestFocus();
                 TxtCod.setText(null);
                 TxtCed.setText(null);
                 TxtNombre.setText(null);
                 TxtCel.setText(null);
                 TxtCodVe.setText(null);
                 jDateChooser1.setDate(null);
                 TxtTot.setText(null);
                 TxtEfe.setText(null);
                 TxtDev.setText(null);
                 try{
                    fact.setMargins(0, 0, 0, 0);
                    Font font = new Font(Font.FontFamily.HELVETICA, 8);
                    Font font1 = new Font(Font.FontFamily.HELVETICA, 12);
                    fact.add(new Paragraph("\n"));
                    Image imagen = Image.getInstance("src/imagenes/Logo.png");
                    imagen.scaleToFit(70, 70); // Ajusta el tamaño de la imagen
                    float x = (fact.getPageSize().getWidth() - imagen.getScaledWidth()) / 2;
                    float y = fact.getPageSize().getHeight() - imagen.getScaledHeight();
                    imagen.setAbsolutePosition(x, y);
                    fact.add(imagen);
                    fact.add(new Paragraph("\n"));
                    fact.add(new Paragraph("\n"));
                    Paragraph encabezado = new Paragraph("OULET DEL LLANO", font);
                    Paragraph ciudad = new Paragraph("Granada Meta", font);
                    Paragraph direccion = new Paragraph("Crr 8 N 21-74 Local 101", font);
                    encabezado.setAlignment(Element.ALIGN_CENTER);
                    ciudad.setAlignment(Element.ALIGN_CENTER);
                    direccion.setAlignment(Element.ALIGN_CENTER);
                    fact.add(encabezado);
                    fact.add(ciudad);
                    fact.add(direccion);
                    fact.add(new Paragraph("\n"));
                    Paragraph factura = new Paragraph("Factura " + codv, font);
                    factura.setAlignment(Element.ALIGN_CENTER);
                    fact.add(factura);
                    fact.add(new Paragraph("\n"));
                    fact.add(new Paragraph("N° documento: "+ ced, font));
                    fact.add(new Paragraph("Nombre: "+ nom, font));
                    fact.add(new Paragraph("Fecha: " + fec, font));
                    fact.add(new Paragraph("Compra: ", font));
                    fact.add(new Paragraph("\n"));
                    PdfPTable tabla = new PdfPTable(4);
                    tabla.setWidthPercentage(98);
                    tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
                    tabla.addCell(new Phrase("Código", font));
                    tabla.addCell(new Phrase("Cantidad", font));
                    tabla.addCell(new Phrase("Descripción", font));
                    tabla.addCell(new Phrase("Total", font));
                    PreparedStatement pst1 = cn.prepareStatement("SELECT a.*, b.descripción FROM ventaprenda a JOIN prenda b ON a.id_pren = b.Cod_p WHERE a.Id_ven = ?");
                    pst1.setInt(1, codv);
                    ResultSet rs = pst1.executeQuery();
                    while (rs.next()) {
                        tabla.addCell(new Phrase(rs.getString("id_pren"), font));
                        tabla.addCell(new Phrase(rs.getString("cantidad"), font));
                        tabla.addCell(new Phrase(rs.getString("descripción"), font));
                        tabla.addCell(new Phrase(rs.getString("prec"), font));
                    }
                    fact.add(tabla);
                    Paragraph total = new Paragraph("Total: $"+ valort, font1);
                    Paragraph recibido = new Paragraph("Total Recibido: $"+ totalrec, font1);
                    Paragraph devolver = new Paragraph("Cambio: $"+ Devueltas, font1);
                    total.setAlignment(Element.ALIGN_CENTER);
                    recibido.setAlignment(Element.ALIGN_CENTER);
                    devolver.setAlignment(Element.ALIGN_CENTER);
                    fact.add(total);
                    fact.add(recibido);
                    fact.add(devolver);
                    int Cant = 1;
                    Image img;
                    Barcode39 code = new Barcode39();
                    String codi = Integer.toString(codv);
                    code.setCode(codi);
                    img =code.createImageWithBarcode(writer.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
                    img.setAlignment(Element.ALIGN_CENTER);
                    for (int i = 0; i < Cant; i++) {
                        fact.add(img);
                    }
                    fact.close();                  
                    JOptionPane.showMessageDialog(null, "Reporte creado");
                    String rutaPDF = "src/Facturas/Venta/Facturadeventa.pdf";
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        File archivoPDF = new File(rutaPDF);
                    if (archivoPDF.exists()) {      
                        desktop.print(archivoPDF);
                    } else {
                        System.err.println("El archivo no existe: " + rutaPDF);
                    }
                } 
                } catch (FileNotFoundException | DocumentException ex ) {
                    Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
                }
                // Mientras el modelo tenga alguna fila
                while (getModel().getRowCount() > 0) {
                       getModel().removeRow(0);
                }
                generarSerie();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido registrar los valores", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar : " + ex, "Ingreso", JOptionPane.ERROR_MESSAGE);
        }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField TxtCed;
    private static javax.swing.JTextField TxtCel;
    private static javax.swing.JTextField TxtCod;
    private static javax.swing.JTextField TxtCodVe;
    private static javax.swing.JTextField TxtDev;
    private static javax.swing.JTextField TxtEfe;
    private static javax.swing.JTextField TxtNombre;
    private static javax.swing.JTextField TxtTot;
    private static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private static class date extends Date {

        private static final long serialVersionUID = 1L;

        public date() {
        }
    }

    /**
     * @return the model
     */
    public static DefaultTableModel getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(DefaultTableModel model) {
        Sell.model = model;
    }
    
}
