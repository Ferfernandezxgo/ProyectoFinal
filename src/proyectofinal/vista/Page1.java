/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinal.vista;

import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import proyectofinal.accesoADatos.PacienteData;
import static proyectofinal.accesoADatos.PacienteData.buscarPacientePorDni;
import static proyectofinal.accesoADatos.PacienteData.eliminarPaciente;
import proyectofinal.entidades.Paciente;
import java.sql.*;

/**
 *
 * @author ferfe
 */
public class Page1 extends javax.swing.JPanel {

    private PacienteData pdata = new PacienteData();
    
    private Paciente pacienteActual = null;
    public Page1() {
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

        ImageIcon icono=new ImageIcon(getClass().getResource("/proyectofinal/vista/fondoPaciente.jpg"));
        Image miImagen=icono.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtIdPaciente = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(123, 178, 25));

        jLabel2.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel2.setText("Nombre ");

        jLabel3.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel3.setText("Domicilio");

        jLabel4.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel4.setText("Dni");

        jLabel5.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel5.setText("id");

        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel9.setText("Estado");

        jBNuevo.setText("Nuevo");
        jBNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBNuevoMouseClicked(evt);
            }
        });
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAgregarMouseClicked(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBuscarMouseClicked(evt);
            }
        });
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEliminarMouseClicked(evt);
            }
        });
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel6.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrEstado)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgregar)
                        .addGap(34, 34, 34)
                        .addComponent(jBBuscar)
                        .addGap(41, 41, 41)
                        .addComponent(jBEliminar)))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jrEstado))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBAgregar)
                    .addComponent(jBBuscar)
                    .addComponent(jBEliminar))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBuscarMouseClicked
        try {
        Integer dni = Integer.parseInt(jtDni.getText());

        System.out.println("DNI a buscar: " + dni); // Agrega esta línea para depuración

        pacienteActual = pdata.buscarPacientePorDni(dni);
        if (pacienteActual != null) {
            System.out.println("Nombre: " + pacienteActual.getNombre());
            System.out.println("Domicilio: " + pacienteActual.getDomicilio());
            System.out.println("Telefono: " + pacienteActual.getTelefono());
            System.out.println("Estado: " + pacienteActual.isEstado());
            jtDni.setText(Integer.toString(pacienteActual.getDni()));
            jtNombre.setText(pacienteActual.getNombre());
            jtDomicilio.setText(pacienteActual.getDomicilio());
            jtTelefono.setText(pacienteActual.getTelefono());
            jtIdPaciente.setText(Integer.toString(pacienteActual.getIdPaciente())); // Establece el valor del campo ID
        } else {
            System.out.println("Paciente no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El DNI no es un número válido");
    }

    }//GEN-LAST:event_jBBuscarMouseClicked

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jBEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEliminarMouseClicked
       try {
        int id = Integer.parseInt(jtIdPaciente.getText()); // Obtener el ID del campo de texto

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al paciente con ID " + id + "?");

        if (confirmacion == JOptionPane.YES_OPTION) {
            PacienteData.eliminarPaciente(id); // Elimina al paciente por su ID
            JOptionPane.showMessageDialog(this, "Paciente eliminado con éxito.");
            limpiarCampos();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.");
    }
    }//GEN-LAST:event_jBEliminarMouseClicked

    private void jBAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAgregarMouseClicked
        // TODO add your handling code here:
        // Recopila los datos de la interfaz (por ejemplo, jtNombre, jtDomicilio, jtDni, jtTelefono, jrEstado)
    
         
    String nombre = jtNombre.getText();
    String domicilio = jtDomicilio.getText();
    int dni = Integer.parseInt(jtDni.getText());
    String telefono = jtTelefono.getText();
    boolean estado = jrEstado.isSelected();
    
    Paciente nuevoPaciente=new Paciente();
    nuevoPaciente.setNombre(nombre);
    nuevoPaciente.setDomicilio(domicilio);
    nuevoPaciente.setDni(dni);
    nuevoPaciente.setTelefono(telefono);
    nuevoPaciente.setEstado(estado);

    PacienteData pData=new PacienteData();
    pData.insertarPaciente(nuevoPaciente);
    // Crea un nuevo objeto Paciente con estos datos
    

    // Puedes mostrar un mensaje de éxito o realizar otras acciones necesarias aquí
    JOptionPane.showMessageDialog(this, "Nuevo paciente agregado con éxito.");
    
    // También puedes restablecer los campos de entrada de datos 
     limpiarCampos();
    }//GEN-LAST:event_jBAgregarMouseClicked

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBNuevoMouseClicked
        // TODO add your handling code here:
        limpiarCampos();
        pacienteActual=null;
    }//GEN-LAST:event_jBNuevoMouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBEliminarActionPerformed


    public void limpiarCampos(){
    
        jtDni.setText("");
        jtNombre.setText("");
        jtDomicilio.setText("");
        jtTelefono.setText("");
        jrEstado.setSelected(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtIdPaciente;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
