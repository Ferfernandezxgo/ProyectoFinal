/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.accesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;



public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/nutricionista18";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    
    public static Connection obtenerConexion(){
        Connection conexion=null;
        try{
            //cargamos el controlado jdbc
            Class.forName("org.mariadb.jdbc.Driver");
            conexion=DriverManager
              .getConnection( URL +"?useLegacyDatetimeCode=false&serverTimezone=UTC"+"&user="+ USUARIO +"&password="+ PASSWORD );
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la BD "+ ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error al cargar los Drivers "+ex.getMessage());
            
        }
        return conexion;
    }
    
}
