/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karen
 */
public class Menu_Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Paciente
     */
    public Menu_Paciente() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_ingresar_paciente_m = new javax.swing.JButton();
        btn_dar_alta_paciente = new javax.swing.JButton();
        btn_datos_paciente = new javax.swing.JButton();
        btn_reporte_pacientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(192, 31, 31));

        btn_ingresar_paciente_m.setBackground(new java.awt.Color(51, 51, 51));
        btn_ingresar_paciente_m.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_ingresar_paciente_m.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar_paciente_m.setText("Ingresar paciente");
        btn_ingresar_paciente_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresar_paciente_mMouseClicked(evt);
            }
        });
        btn_ingresar_paciente_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar_paciente_mActionPerformed(evt);
            }
        });

        btn_dar_alta_paciente.setBackground(new java.awt.Color(51, 51, 51));
        btn_dar_alta_paciente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_dar_alta_paciente.setForeground(new java.awt.Color(255, 255, 255));
        btn_dar_alta_paciente.setText("Dar de alta paciente");
        btn_dar_alta_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dar_alta_pacienteMouseClicked(evt);
            }
        });

        btn_datos_paciente.setBackground(new java.awt.Color(51, 51, 51));
        btn_datos_paciente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_datos_paciente.setForeground(new java.awt.Color(255, 255, 255));
        btn_datos_paciente.setText("Información de paciente");
        btn_datos_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_datos_pacienteMouseClicked(evt);
            }
        });
        btn_datos_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datos_pacienteActionPerformed(evt);
            }
        });

        btn_reporte_pacientes.setBackground(new java.awt.Color(51, 51, 51));
        btn_reporte_pacientes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_reporte_pacientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte_pacientes.setText("Reporte de pacientes");
        btn_reporte_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reporte_pacientesMouseClicked(evt);
            }
        });
        btn_reporte_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte_pacientesActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 0, 51));

        jLabel4.setFont(new java.awt.Font("American Captain", 0, 88)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("menu paciente");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N

        btn_regresar.setBackground(new java.awt.Color(153, 153, 153));
        btn_regresar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espalda.png"))); // NOI18N
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_ingresar_paciente_m, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dar_alta_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_datos_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                        .addComponent(btn_reporte_pacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btn_dar_alta_paciente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_datos_paciente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reporte_pacientes)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ingresar_paciente_m)
                        .addGap(123, 123, 123))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresar_paciente_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar_paciente_mActionPerformed
         
    }//GEN-LAST:event_btn_ingresar_paciente_mActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
           Menu obj = new Menu();
      obj.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_ingresar_paciente_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar_paciente_mMouseClicked
        Ingresar_paciente obj = new Ingresar_paciente();
      obj.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_ingresar_paciente_mMouseClicked

    private void btn_dar_alta_pacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dar_alta_pacienteMouseClicked
        try {
            Alta_paciente obj = new Alta_paciente();
            obj.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dar_alta_pacienteMouseClicked

    private void btn_datos_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datos_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_datos_pacienteActionPerformed

    private void btn_datos_pacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datos_pacienteMouseClicked
        Info_paciente obj = new Info_paciente();
      obj.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_datos_pacienteMouseClicked

    private void btn_reporte_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_pacientesMouseClicked
       Reporte_paciente obj = new Reporte_paciente();
       obj.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_reporte_pacientesMouseClicked

    private void btn_reporte_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte_pacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reporte_pacientesActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dar_alta_paciente;
    private javax.swing.JButton btn_datos_paciente;
    private javax.swing.JButton btn_ingresar_paciente_m;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_reporte_pacientes;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
