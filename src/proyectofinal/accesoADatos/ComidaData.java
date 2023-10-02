/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.accesoADatos;

import org.mariadb.jdbc.Connection;
import proyectofinal.entidades.Comida;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ComidaData {
    private static final String INSERTCOMIDA=" INSERT INTO comida(nombre,detalle,cantCalorias)Values(?,?,?) ";
    private static final String ACTUALIZARCOMIDA=" UPDATE comida set nombre=?, detalle=?, cantCalorias=? WHERE idComida=? ";
    private static final String BORRARCOMIDA=" DELETE FROM comida WHERE idComida=? ";
    private static final String SELECCIONARCOMIDAXID=" SELECT * FROM comida WHERE idComida=?";
    private static final String SELECCIONARCOMIDAXCALORIAS=" SELECT * FROM comida WHERE cantCalorias < ?";

public static void insertarComida(Comida comida){
    try(
        Connection conexion= (Connection) Conexion.obtenerConexion();
        PreparedStatement ps=conexion.prepareStatement(INSERTCOMIDA)){
        ps.setString(1, comida.getNombre());
        ps.setString(2, comida.getDetalle());
        ps.setInt(3, comida.getCantCalorias());
        
        ps.executeUpdate();
        
        
    
        
    }   catch (SQLException ex) {   
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla comida");
    }   
}

public static void actualizarComida(Comida comida){
    try(Connection conexion=(Connection) Conexion.obtenerConexion();
            PreparedStatement ps=conexion.prepareStatement(ACTUALIZARCOMIDA)){
        ps.setString(1, comida.getNombre());
        ps.setString(2, comida.getDetalle());
        ps.setInt(3, comida.getCantCalorias());
        ps.setInt(4,comida.getIdComida());
    
    }catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar comida");
    }
    
}

public static void eliminarComida(int idComida){
    try(Connection conexion=(Connection) Conexion.obtenerConexion();
            PreparedStatement ps=conexion.prepareStatement(BORRARCOMIDA)){
        ps.setInt(1, idComida);
        ps.executeUpdate();
}catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al eliminar comida");
        }
}
//

}
