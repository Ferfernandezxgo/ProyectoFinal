/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.vista;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import proyectofinal.accesoADatos.ComidaData;
import proyectofinal.entidades.Paciente;


public class MenuView extends javax.swing.JFrame {

   
    public MenuView() {
        ComidaData comidaData=new ComidaData();
        Paciente paciente=new Paciente();
        initComponents();
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        
        Page1 p1=new Page1();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/proyectofinal/vista/comidamadera.jpeg"));
        Image miImagen=icono.getImage();
        escritorio1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g ){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jbPaciente = new javax.swing.JButton();
        jbDietas = new javax.swing.JButton();
        jbComidas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio1.setBackground(new java.awt.Color(0, 0, 0));

        jbPaciente.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 18)); // NOI18N
        jbPaciente.setText("PACIENTE");
        jbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPacienteActionPerformed(evt);
            }
        });

        jbDietas.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 18)); // NOI18N
        jbDietas.setText("DIETA");
        jbDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDietasActionPerformed(evt);
            }
        });

        jbComidas.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 18)); // NOI18N
        jbComidas.setText("COMIDAS");
        jbComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComidasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUTRICION DE LA PUNTA");

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMaximumSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        fecha.setBackground(new java.awt.Color(102, 51, 0));
        fecha.setFont(new java.awt.Font("Roboto Serif 20pt", 3, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Hoy es Jueves 12 de Octubre de 2023");

        escritorio1.setLayer(jbPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jbDietas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jbComidas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(content, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio1.setLayer(fecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorio1Layout = new javax.swing.GroupLayout(escritorio1);
        escritorio1.setLayout(escritorio1Layout);
        escritorio1Layout.setHorizontalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jbPaciente)
                .addGap(109, 109, 109)
                .addComponent(jbComidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jbDietas)
                .addGap(81, 81, 81))
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorio1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fecha))
            .addGroup(escritorio1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorio1Layout.setVerticalGroup(
            escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(escritorio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPaciente)
                    .addComponent(jbComidas)
                    .addComponent(jbDietas))
                .addGap(18, 18, 18)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPacienteActionPerformed
        // TODO add your handling code here:
        
        Page1 p1= new Page1();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
    }//GEN-LAST:event_jbPacienteActionPerformed

    private void jbComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComidasActionPerformed
        Page22 p2=new Page22();
        p2.setSize(750, 430);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jbComidasActionPerformed

    private void jbDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDietasActionPerformed
        Page3 p3=new Page3();
        p3.setSize(750, 430);
        p3.setLocation(0,0);
        
        content.removeAll();
        content.add(p3, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_jbDietasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JDesktopPane escritorio1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbComidas;
    private javax.swing.JButton jbDietas;
    private javax.swing.JButton jbPaciente;
    // End of variables declaration//GEN-END:variables
}
