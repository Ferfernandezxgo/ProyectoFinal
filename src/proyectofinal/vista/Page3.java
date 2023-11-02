/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyectofinal.vista;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinal.accesoADatos.DietaData;
import proyectofinal.entidades.Dieta;

/**
 *
 * @author ferfe
 */
public class Page3 extends javax.swing.JPanel {

    /**
     * Creates new form Page3
     */
    private DietaData dData= new DietaData();
    private Dieta dietaActual=null;
    
    public Page3() {
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

        ImageIcon icono=new ImageIcon(getClass().getResource("/proyectofinal/vista/dieta.jpg"));
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
        jtNombre = new javax.swing.JTextField();
        jdFechaInicial = new com.toedter.calendar.JDateChooser();
        jdFechaFinal = new com.toedter.calendar.JDateChooser();
        jtIdDieta = new javax.swing.JTextField();
        jbIngresar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel2.setText("Tipo de dieta");

        jLabel3.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel3.setText("IdDieta");

        jLabel4.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel4.setText("Inicio de la Dieta");

        jLabel5.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 14)); // NOI18N
        jLabel5.setText("Fin de la Dieta");

        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbIngresar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel3)))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jdFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(jdFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtIdDieta))
                    .addComponent(jbEliminar))
                .addGap(20, 370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtIdDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jdFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIngresar)
                    .addComponent(jbEliminar))
                .addGap(26, 26, 26))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        // TODO add your handling code here:
        try {
            Integer idDieta = Integer.parseInt(jtIdDieta.getText());
            String nombre = jtNombre.getText();
            java.util.Date fI = jdFechaInicial.getDate();
            LocalDate FechaInicial = fI.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            java.util.Date fF = jdFechaFinal.getDate();
            LocalDate FechaFinal = fF.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            if (dietaActual==null){
               
                dietaActual=new Dieta(idDieta,nombre,FechaInicial,FechaFinal);
                dData.insertarDieta(dietaActual);
            }else{
                dietaActual.setIdDieta(idDieta);
                dietaActual.setNombre(nombre);
                dietaActual.setFechaInicial(FechaInicial);
                dietaActual.setFechaFinal(FechaFinal);
                dData.ActualizarDieta(dietaActual);
            
            }
            
        } catch (NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(this, "No se pudo ingresar dieta");
        }
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
       if (dietaActual==null){
        
            dData.eliminarDieta(dietaActual.getIdDieta());
            dietaActual=null;
            limpiarCampos();
                    
        }
     

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void limpiarCampos(){
       
        jtIdDieta.setText("");
        jtNombre.setText("");
        jdFechaInicial.setDate(new Date());
        jdFechaFinal.setDate(new Date());
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbIngresar;
    private com.toedter.calendar.JDateChooser jdFechaFinal;
    private com.toedter.calendar.JDateChooser jdFechaInicial;
    private javax.swing.JTextField jtIdDieta;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
