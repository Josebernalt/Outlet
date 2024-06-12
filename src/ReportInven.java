
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Jose Eliud Bernal
 */
public class ReportInven extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Control
     */
    public ReportInven() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRepMen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(406, 405));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(119, 171, 183));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel1.setText("reporte de inventario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Se indica acontinuación que el siguiente reporte ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 300, 100));

        jPanel2.setBackground(new java.awt.Color(119, 171, 183));

        btnRepMen.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        btnRepMen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRepMen.setText("Generar reporte");
        btnRepMen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRepMenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRepMenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRepMenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRepMen, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRepMen, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 260, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepMenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepMenMouseEntered
        jPanel2.setBackground(new Color(29,62,83));
        btnRepMen.setForeground(Color.white);
    }//GEN-LAST:event_btnRepMenMouseEntered

    private void btnRepMenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepMenMouseExited
        jPanel2.setBackground(new Color(119,171,183));
        btnRepMen.setForeground(Color.black);
    }//GEN-LAST:event_btnRepMenMouseExited
    @SuppressWarnings("PublicInnerClass")
    public class Reporte {
        public static void GenerarReporteInv(Con con, Document repInv) throws IOException{
            try {
                repInv.setMargins(72, 72, 72, 72);
                Connection cn = con.conexion();
                Font priFue = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
                Font segFue = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
                Font terFue = new Font(Font.FontFamily.TIMES_ROMAN, 12);
                Paragraph titulo = new Paragraph("Reporte de inventario", priFue);
                titulo.setAlignment(Element.ALIGN_CENTER);
                repInv.add(titulo);
                repInv.add(new Paragraph("\n"));
                Paragraph resGen = new Paragraph("Resumen General ", segFue);   
                resGen.setAlignment(Element.ALIGN_LEFT);
                repInv.add(resGen);
                //consultar la cantidad de productos existentes
                PreparedStatement canProExi = cn.prepareStatement("SELECT SUM(cantidad) AS TotalDePrendas FROM prenda");
                ResultSet rs = canProExi.executeQuery();
                int canProTotAño = rs.next() ? rs.getInt("TotalDePrendas") : null;
                Paragraph canPreTotAño = new Paragraph("Cantidad de prendas existentes en "
                        + "inventario: " + canProTotAño, terFue);
                repInv.add(canPreTotAño);
                //Consultar cantidad de productos que ha enxistido
                PreparedStatement canTotAnt = cn.prepareStatement("SELECT SUM(cantidad) AS TotDePren FROM ventaprenda");
                ResultSet rs1 = canTotAnt.executeQuery();
                int canTot1 = rs1.next() ? rs1.getInt("TotDePren") : null;
                int totPrenSie = canProTotAño + canTot1;
                Paragraph canPreTotSie = new Paragraph("Cantidad de prendas invertidas: " + totPrenSie, terFue);
                repInv.add(canPreTotSie);
                // Consultar Totales de precios Inventario
                PreparedStatement totPre= cn.prepareStatement("SELECT SUM(preciototalcom) AS totalcompra, "
                        + "SUM(preciototalven) AS totalventa FROM prenda ");
                ResultSet rs2 = totPre.executeQuery();
                PdfPTable tabTotPre = new PdfPTable(2);
                tabTotPre.addCell(new Phrase ("Total de compras", segFue));
                tabTotPre.addCell(new Phrase ("Total de ventas", segFue));
                while (rs2.next()){
                    tabTotPre.addCell(new Phrase(rs2.getString("totalcompra"), terFue));
                    tabTotPre.addCell(new Phrase(rs2.getString("totalventa"), terFue));
                }
                repInv.add(new Paragraph("Total de precios en productos: ", terFue));
                repInv.add(new Paragraph("\n"));
                repInv.add(tabTotPre);
                //Consultar prendas que ya no hay 
                PreparedStatement preIne = cn.prepareStatement("SELECT cod_p, cantidad, descripción "
                        + "FROM prenda WHERE cantidad = 0 ");
                ResultSet rs3 = preIne.executeQuery();
                PdfPTable tabInn = new PdfPTable(3);
                tabInn.addCell(new Phrase ("Código Prenda", segFue));
                tabInn.addCell(new Phrase ("Cantidad", segFue));
                tabInn.addCell(new Phrase ("Descripción", segFue));
                while (rs3.next()){
                    tabInn.addCell(new Phrase(rs3.getString("cod_p"), terFue));
                    tabInn.addCell(new Phrase(rs3.getString("cantidad"), terFue));
                    tabInn.addCell(new Phrase(rs3.getString("descripción"), terFue));
                }
                repInv.add(new Paragraph("Productos descontinuados: ", terFue));
                repInv.add(new Paragraph("\n"));
                repInv.add(tabInn);
                //Consultar cuantas prendas hay 
                repInv.add(new Paragraph("\n"));
                PdfPTable tabla = new PdfPTable(3);
                tabla.addCell(new Phrase ("Codigo", segFue));
                tabla.addCell(new Phrase ("Cantidad", segFue));
                tabla.addCell(new Phrase ("Descripción", segFue));
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM prenda WHERE cantidad");
                ResultSet rs6 = pst.executeQuery();
                while (rs6.next()) {
                    tabla.addCell(new Phrase(rs6.getString("cod_p"), terFue));
                    tabla.addCell(new Phrase(rs6.getString("cantidad"), terFue));
                    tabla.addCell(new Phrase(rs6.getString("descripción"),terFue));
                }
                repInv.add(new Paragraph("Productos activos en invetario: ", terFue));
                repInv.add(new Paragraph("\n"));
                repInv.add(tabla);
                repInv.close();
                JOptionPane.showMessageDialog(null, "Reporte creado");
                String rutaPDF = "C:/Users/Jose Eliud Bernal/Desktop"
                    + "/Inventario/Reporte de Inventario.pdf";
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    File archivoPDF = new File(rutaPDF);
                    if (archivoPDF.exists()) {      
                        desktop.open(archivoPDF);
                    } else {
                        System.err.println("El archivo no existe: " + rutaPDF);
                    }
                }
            } catch (DocumentException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar reporte");
            }
        }
    }
    
    private void btnRepMenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRepMenMouseClicked
        Document repInv = new Document();
        try {
            PdfWriter.getInstance(repInv, new FileOutputStream("C:/Users/Jose Eliud Bernal/Desktop"
                    + "/Inventario/Reporte de Inventario.pdf"));
            repInv.open();
            Con con = new Con();
            Reporte.GenerarReporteInv(con, repInv);
            repInv.close();
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al crear documento");
        } catch (IOException ex) {
            Logger.getLogger(ReportInven.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRepMenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRepMen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    Object getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
