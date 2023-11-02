/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.accesoADatos;


import proyectofinal.entidades.Comida;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ComidaData {
    private static final String INSERTCOMIDA=" INSERT INTO comida(nombre,detalle,cantCalorias,estado)Values(?,?,?,?) ";
    private static final String ACTUALIZARCOMIDA=" UPDATE comida set nombre=?, detalle=?, cantCalorias=? WHERE idComida=? ";
    private static final String BORRARCOMIDA=" DELETE FROM comida WHERE estado=? ";
    private static final String SELECCIONARCOMIDAXID=" SELECT * FROM comida WHERE idComida=?";
    private static final String SELECCIONARCOMIDAXCALORIAS=" SELECT * FROM comida WHERE cantCalorias < ?";

    public ComidaData() {
    }

public static void insertarComida(Comida comida){
    try(
        Connection conexion= (Connection) Conexion.obtenerConexion();
        PreparedStatement ps=conexion.prepareStatement(INSERTCOMIDA)){
        ps.setString(1, comida.getNombre());
        ps.setString(2, comida.getDetalle());
        ps.setInt(3, comida.getCantCalorias());
        ps.setBoolean(4,comida.isEstado());
        
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
        ps.executeUpdate();
    
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

public static Comida obtenerComidaPorId(int idComida){
    Comida comida =null;
    try(Connection conexion=(Connection) Conexion.obtenerConexion();
            PreparedStatement ps=conexion.prepareStatement(SELECCIONARCOMIDAXID)){
        ps.setInt(1, idComida);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
                String nombre=rs.getString("nombre");
                String detalle=rs.getString("detalle");
                int cantCalorias=rs.getInt("cantCalorias");
                
                comida= new Comida(nombre,detalle,cantCalorias,true);
            }
        
    }catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "error al sellecionar comida por id");
    }
    return comida;
}

public static List<Comida> obtenerComidasPorCalorias(int maxCalorias) {
        List<Comida> comidas = new ArrayList<>();
        try (Connection conexion = (Connection) Conexion.obtenerConexion();
             PreparedStatement preparedStatement = conexion.prepareStatement(SELECCIONARCOMIDAXCALORIAS)) {

            preparedStatement.setInt(1, maxCalorias);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idComida = resultSet.getInt("idComida");
                String nombre = resultSet.getString("nombre");
                String detalle = resultSet.getString("detalle");
                int cantCalorias = resultSet.getInt("cantCalorias");
                
                
                
                Comida comida = new Comida(nombre, detalle, cantCalorias, true);
                comidas.add(comida);

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comidas;
        //
    }




}



