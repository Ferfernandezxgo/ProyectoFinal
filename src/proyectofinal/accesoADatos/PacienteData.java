/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.accesoADatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectofinal.entidades.Paciente;
public class PacienteData {
    
    private static final String INSERT_PACIENTE = "INSERT INTO paciente(nombre, dni, domicilio, telefono, estado) VALUES ( ?, ?, ?, ?, ? )";
    private static final String SELECCIONAR_PACIENTES = "SELECT idPaciente, nombre, dni, domicilio, telefono, estado FROM paciente WHERE estado = 1";
    private static final String ACTUALIZAR_PACIENTE="UPDATE paciente SET nombre = ?, dni = ?, domicilio=?,telefono= ?, estado= ? WHERE idPaciente = ?";
    private static final String BUSCAR_PACIENTE = "SELECT idPaciente, nombre, dni, domicilio, telefono FROM paciente WHERE dni = ? AND estado = 1";    
    private static final String ELIMINAR_PACIENTE="UPDATE paciente set estado = 0 where idPaciente = ? ";
    
    public static void insertarPaciente(Paciente paciente) {
    try (Connection conexion = Conexion.obtenerConexion();
         PreparedStatement ps = conexion.prepareStatement(INSERT_PACIENTE, Statement.RETURN_GENERATED_KEYS)) {

        // ... (configuración de los valores para la inserción)

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas == 1) {
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                paciente.setIdPaciente(generatedKeys.getInt(1)); // Asignar el ID generado al objeto Paciente
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al insertar paciente");
    }
}

    public static void eliminarPaciente(int idPaciente) {
        try (Connection conexion = Conexion.obtenerConexion();
         PreparedStatement ps = conexion.prepareStatement(ELIMINAR_PACIENTE)) {
        ps.setInt(1, idPaciente);
        ps.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al eliminar paciente");
    }
    }


    public static List<Paciente> obtenerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(SELECCIONAR_PACIENTES);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int idPaciente = rs.getInt("idPaciente");
                String nombre = rs.getString("nombre");
                int dni = rs.getInt("dni");
                String domicilio = rs.getString("domicilio");
                
                String telefono = rs.getString("telefono");
                boolean estado=rs.getBoolean("estado");
                pacientes.add(new Paciente(idPaciente, nombre, dni, domicilio, telefono,estado));
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pacientes;
    }
    
    public static void ActualizarPaciente(Paciente paciente){
        try (Connection conexion = Conexion.obtenerConexion();
         PreparedStatement ps = conexion.prepareStatement(ACTUALIZAR_PACIENTE)) {

        ps.setString(1, paciente.getNombre());
        ps.setInt(2, paciente.getDni());
        ps.setString(3, paciente.getDomicilio());
        ps.setString(4, paciente.getTelefono());
        ps.setBoolean(5, true);
        ps.setInt(6, paciente.getIdPaciente());

        ps.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al actualizar paciente");
    }
    }
    
    public static Paciente buscarPacientePorDni(int dni) {
        Paciente paciente = null;
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(BUSCAR_PACIENTE)) {

            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paciente = new Paciente();
                paciente.setDni(dni);
                
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                
                System.out.println("Paciente encontrado: " );
            } else {
                System.out.println("Paciente no encontrado.");
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar paciente");
        }
        return paciente;
    }
}
    
