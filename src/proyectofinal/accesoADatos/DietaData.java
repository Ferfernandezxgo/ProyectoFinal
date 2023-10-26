/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyectofinal.entidades.Dieta;



/**
 *
 * @author Maive
 */
public class DietaData {
    
    private PacienteData pd= new PacienteData();
    
     private static final String INSERTDIETA=" INSERT INTO dieta(nombre,idPaciente,fechaInicial,fechaFinal,pesoInicial,pesoFinal,estado)Values(?,?,?,?,?,?,?) ";
     private static final String ELIMINARDIETA=" DELETE FROM dieta WHERE estado=? ";
     private static final String BUSCARDIETA=" SELECT nombre,idPaciente,fechaInicial,fechaFinal,pesoInicial,pesoFinal FROM dieta WHERE idDieta=? AND estado=1"; 
     private static final String ACTUALIZARDIETA="UPDATE dieta SET nombre=?,idPaciente=?,fechaInicial=?,fechaFinal=?,pesoInicial=?,pesoFinal=?,estado=? WHERE idDieta=?";
     
     public static void insertarDieta(Dieta dieta) {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(INSERTDIETA)) {

            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, true);

            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar dieta");
        }
    }
     
      public static void eliminarDieta(int idDieta) {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(ELIMINARDIETA)) {

            ps.setInt(1, idDieta);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar dieta");
        }
    }
     
    public static Dieta buscarDietaPorID(int idDieta){
    Dieta dieta =null;
    try(Connection conexion=(Connection) Conexion.obtenerConexion();
            PreparedStatement ps=conexion.prepareStatement(BUSCARDIETA)){
        ps.setInt(1, idDieta);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
               
                
                dieta= new Dieta();
                dieta.setIdDieta(idDieta);
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPesoInicial(rs.getDouble("peso inicial"));
                dieta.setPesoFinal(rs.getDouble("peso final"));
                dieta.setFechaInicial(rs.getDate("fecha inicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fecha final").toLocalDate());
                dieta.setEstado(true);
               
            } 
                
        ps.close();
    }catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "dieta no encontrado");
    }
    return dieta;
}  
    
    public static void ActualizarDieta(Dieta dieta){
        try (Connection conexion = Conexion.obtenerConexion();
         PreparedStatement ps = conexion.prepareStatement(ACTUALIZARDIETA)) {

            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, true);


        ps.executeUpdate();
        ps.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar dieta");
    }
    }
    
    
    
}
