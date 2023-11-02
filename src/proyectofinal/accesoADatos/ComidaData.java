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
    private static final String BORRARCOMIDA=" DELETE FROM comida WHERE idComida=? ";
    private static final String SELECCIONARCOMIDAXID=" SELECT * FROM comida WHERE idComida=?";
    private static final String SELECCIONARCOMIDAXNOMBRE=" SELECT * FROM comida WHERE nombre=?";
    private static final String SELECCIONARCOMIDAXCALORIAS=" SELECT * FROM comida WHERE cantCalorias <= ?";

    public ComidaData() {
    }

public static void insertarComida(Comida comida){
    try(
        Connection conexion= (Connection) Conexion.obtenerConexion();
        PreparedStatement ps=conexion.prepareStatement(INSERTCOMIDA)){
        ps.setString(1, comida.getNombre());
        ps.setString(2, comida.getDetalle());
        ps.setInt(3, comida.getCantCalorias());
        ps.setBoolean(4,comida.isEstado()); //el metodo .is es como un get para booleanos
        
        ps.executeUpdate();    
        
    }   catch (SQLException ex) {   
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al crear una nueva comida ");
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

public static void eliminarComida(int idComida){ //CUIDADO el metodo no hace eliminacion logica.
                                                 //Hace DELETE en la base de datos
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
//              int idComida = rs.getInt("idComida"); //Variable ya definida
                String nombre=rs.getString("nombre");
                String detalle=rs.getString("detalle");
                int cantCalorias=rs.getInt("cantCalorias");
                
              comida= new Comida(idComida, nombre, detalle, cantCalorias,true); // Esto deberia ir el boton page22        
            }
        
    }catch(SQLException ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al seleccionar comida por Id");
    }
    return comida;
}

public static List<Comida> obtenerComidasPorCalorias(int maxCalorias) {
        List<Comida> listacomidas = new ArrayList<>();
        try (Connection conexion = (Connection) Conexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(SELECCIONARCOMIDAXCALORIAS)) {

            ps.setInt(1, maxCalorias);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idComida = rs.getInt("idComida");
                String nombre = rs.getString("nombre");
                String detalle = rs.getString("detalle");
                int cantCalorias = rs.getInt("cantCalorias");        
            
   //   Cargamos la consulta en la variable comida y se la agregamos a listacomida
              Comida comida = new Comida(idComida, nombre, detalle, cantCalorias, true); 
              listacomidas.add(comida);
              
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en consultar comida por calorias");
        }
        return listacomidas;        
    }

public static List<Comida> obtenerComidasPorNombre(String nombre) {
    List<Comida> listacomidas = new ArrayList<>();

    try (Connection conexion = (Connection) Conexion.obtenerConexion();
         PreparedStatement ps = conexion.prepareStatement(SELECCIONARCOMIDAXNOMBRE)) {

        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            int idComida = rs.getInt("idComida");
//          String nombre = resultSet.getString("nombre");  //Variable ya definida
            String detalle = rs.getString("detalle");
            int cantCalorias = rs.getInt("cantCalorias");
        
            Comida comida = new Comida(idComida, nombre, detalle, cantCalorias, true); // Esto debo arreglar
            listacomidas.add(comida);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error en consultar comida por nombre");
    }
    return listacomidas;
}


}



