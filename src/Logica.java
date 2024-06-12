/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import config.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHAPARRO
 */
public class Logica {
    
    public DefaultTableModel mostrarsalidas()
    {
        String []  nombresColumnas = {"número","descripción","Precio","fecha"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM salida";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("número");  
                registros[1] = rs.getString("descripción"); 
                registros[2] = rs.getString("Precio");
                registros[3] = rs.getString("fecha");
                modelo.addRow(registros);
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel buscarsalidas(String buscar)
    {
        int contador = 1;
        String []  nombresColumnas = {"número","descripción","Precio","fecha"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM salida WHERE número LIKE '%"+buscar+"%' OR descripción LIKE '%"+buscar+"%'";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("número");  
                registros[1] = rs.getString("descripción"); 
                registros[2] = rs.getString("Precio");
                registros[3] = rs.getString("fecha");
                modelo.addRow(registros);
                contador++;
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel mostrarApartado()
    {
        String []  nombresColumnas = {"Prenda", "Descripción", "Cantidad","Precio"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT a.CodPrenda, a.Cantidad, a.Precio, p.descripción FROM apartadoprenda a JOIN prenda p ON a.CodPrenda = p.Cod_p";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            { 
                registros[0] = rs.getString("CodPrenda"); 
                registros[1] = rs.getString("Cantidad");
                registros[2] = rs.getString("descripción");
                registros[3] = rs.getString("Precio");
                modelo.addRow(registros);
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel buscarapartado(String buscar)
    {
        int contador = 1;
        String []  nombresColumnas = {"Prenda","Cantidad","Descripcion","Precio"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT a.*, p.descripción FROM apartadoprenda a JOIN prenda p ON a.CodPrenda = p.Cod_p WHERE a.CodApartado  LIKE '%"+buscar+"%'";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("CodPrenda"); 
                registros[1] = rs.getString("Cantidad");
                registros[2] = rs.getString("descripción");
                registros[3] = rs.getString("Precio");
                modelo.addRow(registros);
                contador++;
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public void cargarcombo(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        c.setModel(combo);
        Prenda2 p2 = new Prenda2();
        try {
            Con con = new Con();
            Connection cn = con.conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Prenda Prenda FROM tipoprend");
            while (rs.next()){
                Prenda pr = new Prenda();
                pr.setNom_pre(rs.getString(1));
                p2.Agregarprendas(pr);
                combo.addElement(pr.getNom_pre());
            }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Error, no se puede mostrar combo"+e);
        }
        
    }
    public DefaultTableModel mostrarprendas()
    {
        String []  nombresColumnas = {"Cod_p", "TipoPrend", "cantidad", "descripción","preciocom", "precioven", "preciototalcom", "preciototalven"};
        String [] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM prenda";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("Cod_p");  
                registros[1] = rs.getString("TipoPrend"); 
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("descripción");
                registros[4] = rs.getString("preciocom");  
                registros[5] = rs.getString("precioven"); 
                registros[6] = rs.getString("preciototalcom");
                registros[7] = rs.getString("preciototalven");
                modelo.addRow(registros);
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel buscarprendas(String buscar)
    {
        int contador = 1;
        String [] nombresColumnas = {"Cod_p", "TipoPrend", "cantidad", "descripción","preciocom", "precioven", "preciototalcom", "preciototalven", "Fecha"};
        String [] registros = new String[9];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM prenda WHERE Cod_p LIKE '%"+buscar+"%'";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("Cod_p");  
                registros[1] = rs.getString("TipoPrend"); 
                registros[2] = rs.getString("cantidad");
                registros[3] = rs.getString("descripción");
                registros[4] = rs.getString("preciocom");  
                registros[5] = rs.getString("precioven"); 
                registros[6] = rs.getString("preciototalcom");
                registros[7] = rs.getString("preciototalven");
                registros[7] = rs.getString("Fecha");
                modelo.addRow(registros);
                contador++;
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel mostrarAbono()
    {
        String []  nombresColumnas = {"Abono","Fecha"};
        String [] registros = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM historial";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            { 
                registros[0] = rs.getString("Actual"); 
                registros[1] = rs.getString("fecha");
                modelo.addRow(registros);
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel buscarAbono(String buscar)
    {
        int contador = 1;
        String []  nombresColumnas = {"Abono","Fecha"};
        String [] registros = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM historial WHERE cod_a  LIKE '%"+buscar+"%'";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("Actual"); 
                registros[1] = rs.getString("fecha");
                modelo.addRow(registros);
                contador++;
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
         return modelo;
    }
    public DefaultTableModel mostrarVentas (){
        int contador = 1;
        String [] nombreColumnas = {"Código", "Cantidad", "Descripción", "Precio"};
        String [] Registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        String sql = "SELECT a.*, b.descripción FROM ventaprenda a JOIN prenda b ON a.id_pren = b.Cod_p";
        PreparedStatement pst = null;
        ResultSet Rs = null;
        try {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);
            Rs = pst.executeQuery();
            while (Rs.next()) {
                Registros[0] = Rs.getString("id_pren");
                Registros[1] = Rs.getString("cantidad");
                Registros[2] = Rs.getString("descripción");
                Registros[3] = Rs.getString("prec");
                modelo.addRow(Registros);
                contador++;
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a base de datos"+e, "Notificación", JOptionPane.ERROR_MESSAGE);
        }
        return modelo;
    }
    public DefaultTableModel buscarVentas (String buscar){
        int contador = 1;
        String [] nombresColumnas = {"Código", "Cantidad", "Descripción", "Precio"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel (null, nombresColumnas);
        String sql = "SELECT a.*, b.descripción FROM ventaprenda a JOIN prenda b ON a.id_pren = b.Cod_p WHERE a.Id_ven LIKE '%"+buscar+"%'";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try
        {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("id_pren"); 
                registros[1] = rs.getString("cantidad");
                registros[2] = rs.getString("descripción");
                registros[3] = rs.getString("prec");
                modelo.addRow(registros);
                contador++;
            }
            return modelo;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
        return modelo;
    }
    public String Nmro_Serie(){
        ResultSet rs;
        PreparedStatement pst;
        String serie="";
        String sql= "Select max(cod_ven) from venta";
        try {
            Con con = new Con();
            Connection cn = (Connection) con.conexion();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (SQLException e){
            
        }
        return serie;
    }
    public String Nmro_salida(){
         ResultSet rs;
         PreparedStatement pst;
         String serie="";
         String sql= "Select max(número) from salida";
         try {
             Con con = new Con();
             Connection cn = (Connection) con.conexion();
             pst = cn.prepareStatement(sql);
             rs = pst.executeQuery();
             while (rs.next()) {
                 serie = rs.getString(1);
             }
         } catch (SQLException e){
            
         }
         return serie;
    }   
    public String Nmro_producto(){
         ResultSet rs;
         PreparedStatement pst;
         String serie="";
         String sql= "Select max(cod_p) from prenda";
         try {
             Con con = new Con();
             Connection cn = (Connection) con.conexion();
             pst = cn.prepareStatement(sql);
             rs = pst.executeQuery();
             while (rs.next()) {
                 serie = rs.getString(1);
             }
         } catch (SQLException e){
            
         }
         return serie;
    } 
    public String Nmro_apartado(){
        ResultSet rs;
         PreparedStatement pst;
         String serie="";
         String sql= "Select max(cod_a) from apartado";
         try {
             Con con = new Con();
             Connection cn = (Connection) con.conexion();
             pst = cn.prepareStatement(sql);
             rs = pst.executeQuery();
             while (rs.next()) {
                 serie = rs.getString(1);
             }
         } catch (SQLException e){
            
         }
         return serie;
    }
}
