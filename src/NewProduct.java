import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Jose Eliud Bernal
 */
public class NewProduct extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Subpanel1
     */
    public NewProduct() {
        initComponents();
        Logica lg = new Logica();
        generarproducto();
        lg.cargarcombo(jComboBox1);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 171, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel1.setText("Código");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel2.setText("Insertar productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jTextField1.setEditable(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 175, -1));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel4.setText("Prenda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 175, -1));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 180, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel6.setText("Descripción");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 500, 109));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel7.setText("valor Compra Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel8.setText("Valor Venta Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jTextField3.setEditable(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 180, -1));

        jTextField4.setEditable(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 180, -1));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 180, -1));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 180, -1));

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel9.setText("valor de Compra");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel10.setText("valor de Venta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(119, 171, 183));
        jPanel2.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel11.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Guardar");
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
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 190, -1));

        jPanel3.setBackground(new java.awt.Color(119, 171, 183));
        jPanel3.setPreferredSize(new java.awt.Dimension(97, 30));

        jLabel12.setFont(new java.awt.Font("Perpetua Titling MT", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Atrás");
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
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 366, 190, -1));

        jLabel14.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        jLabel14.setText("FECHA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 180, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jPanel2.setBackground(new Color(29,62,83));
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jPanel3.setBackground(new Color(29,62,83));
        jLabel12.setForeground(Color.white);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jPanel2.setBackground(new Color(119,171,183));
        jLabel11.setForeground(Color.black);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jPanel3.setBackground(new Color(119,171,183));
        jLabel12.setForeground(Color.black);
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        MainInventario Pn1 = new MainInventario();
        Pn1.setSize(410, 440);
        Pn1.setLocation(0, 0);
        
        Home.Prin.removeAll();
        Home.Prin.add(Pn1);
        Home.Prin.revalidate();
        Home.Prin.repaint();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        try {
             Con con = new Con();
             Connection cn = con.conexion();
             if (jTextField1.getText().isEmpty()|jTextField2.getText().isEmpty()|jTextField3.getText().isEmpty()|
                     jTextField4.getText().isEmpty()|jTextField5.getText().isEmpty()|jTextField6.getText().isEmpty()
                     |jDateChooser1.getDate()==null|jTextArea1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, """
                                              Atención:
                                              Por favor ingrese los valores solicitados""",  
                            "Error", JOptionPane.ERROR_MESSAGE);
            }else{
             int cod = Integer.valueOf(jTextField1.getText());
             int pren = jComboBox1.getSelectedIndex();
             int cant = Integer.valueOf(jTextField2.getText());
             String desc = jTextArea1.getText();
             int comp = Integer.valueOf(jTextField5.getText());
             int vent = Integer.valueOf(jTextField6.getText());
             int compt = Integer.valueOf(jTextField3.getText());
             int ventt = Integer.valueOf(jTextField4.getText());
             String fec = ((JTextComponent)jDateChooser1.getDateEditor().getUiComponent()).getText();
                 PreparedStatement pst = cn.prepareStatement("INSERT INTO prenda (cod_p, TipoPrend, cantidad, descripción, "
                     + "preciocom, precioven, preciototalcom, preciototalven, Fecha)"
                + "VALUES (?,?,?,?,?,?,?,?,?)") ;
             pst.setInt(1, cod);
             pst.setInt(2, pren);
             pst.setInt(3, cant);
             pst.setString(4, desc);
             pst.setInt(5, comp);
             pst.setInt(6, vent);
             pst.setInt(7, compt);
             pst.setInt(8, ventt);
             pst.setString(9, fec);
             int n = pst.executeUpdate();
             if(n>0){
                 JOptionPane.showMessageDialog(null, "Se ha registrado los valores", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
                 jTextField2.setText(null);
                 jTextField1.requestFocus();
                 jTextField1.setText(null);
                 jTextField3.setText(null);
                 jTextField4.setText(null);
                 jTextField5.setText(null);
                 jTextField6.setText(null);
                 jComboBox1.setSelectedItem(null);
                 jTextArea1.setText(null);
                 jDateChooser1.setDate(null);
                 generarproducto();
             }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar" +ex, "Ingreso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        if (jTextField2.getText().isEmpty() || jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digita por favor la cantidad y el precio de compra para realizar el proceso de manera correcta");
        }else{
            try {
                int can = Integer.valueOf(jTextField2.getText());
                int com = Integer.valueOf(jTextField5.getText()); 
                int vent1 = Integer.valueOf(jTextField6.getText());
                int comt = com * can;
                int ventt1 = vent1 * can;
                String num= String.valueOf(comt);
                String num2= String.valueOf(ventt1);
                jTextField3.setText(num);
                jTextField4.setText(num2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa valores numéricos válidos.");
            }
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (c<'0'||c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char c = evt.getKeyChar();
        if (c<'0'|c>'9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    void generarproducto(){
        Logica lg = new Logica();
        String serie = lg.Nmro_producto();
        if (serie==null){
            jTextField1.setText("1150");
        }else{
            int increment = Integer.parseInt(serie);
            increment += 1;
            jTextField1.setText("0"+increment);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private static class date extends Date {

        private static final long serialVersionUID = 1L;

        public date() {
        }
    }

    
}
