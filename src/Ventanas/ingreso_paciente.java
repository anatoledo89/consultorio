/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Doctor;
import Clases.Hospital;
import Clases.Patient;
import DAO.DAODoctor;
import DAO.DAOHospital;
import DAO.DAOPaciente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author pamel
 */
public class ingreso_paciente extends javax.swing.JFrame {
Patient p=null;
int status=0;
 Hospital h=null;
    /**
     * Creates new form Alta_paciente
     */
    public ingreso_paciente() throws SQLException, ClassNotFoundException {
        initComponents();
        jrb_ingreso.setSelected(true);
        loadcmbDepartament();
        loadcmbDoctor();
         this.setLocationRelativeTo(null);
         
    
    }
    
    private void loadcmbDepartament() throws SQLException, ClassNotFoundException
    {
       h=  Ingresar_paciente.h;
        DAOPaciente dAOPaciente=new DAOPaciente();
     jcmb_Departamento.setModel(new DefaultComboBoxModel(dAOPaciente.getDepartament(h.getIdhospital()).toArray()));
    }
    
    private void loadcmbDoctor() throws SQLException, ClassNotFoundException
    {
             DAOPaciente dp=new DAOPaciente();
      
         DefaultComboBoxModel mode = new DefaultComboBoxModel();
          
            mode.removeAllElements();
        
           
          
            for (Doctor d :dp.loaddoctorsbyDepartment((String)jcmb_Departamento.getSelectedItem(),h.getIdhospital()) ) {
                mode.addElement(d);
            }
            jcmbDoctor.setModel(mode);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        jcmb_Departamento = new javax.swing.JComboBox<>();
        jcmbDoctor = new javax.swing.JComboBox<>();
        jbtnAsignar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jrb_ingreso = new javax.swing.JRadioButton();
        jrb_tratamiento = new javax.swing.JRadioButton();
        jrbAlta = new javax.swing.JRadioButton();

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Número de seguridad:");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 56, 73));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pacientes");

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jcmb_Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmb_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_DepartamentoActionPerformed(evt);
            }
        });

        jcmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtnAsignar.setText("Asignar");
        jbtnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAsignarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctores:");

        buttonGroup1.add(jrb_ingreso);
        jrb_ingreso.setText("Ingreso");
        jrb_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_ingresoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb_tratamiento);
        jrb_tratamiento.setText("Tratamiento");
        jrb_tratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_tratamientoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbAlta);
        jrbAlta.setText("Listo para alta");
        jrbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(118, 118, 118)
                        .addComponent(btn_regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrb_ingreso)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(159, 159, 159)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrb_tratamiento)
                                                .addComponent(jbtnAsignar))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regresar)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jcmb_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jcmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_ingreso)
                    .addComponent(jrb_tratamiento)
                    .addComponent(jrbAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jbtnAsignar)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
                       Menu_Paciente obj = new Menu_Paciente();
        obj.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jcmb_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_DepartamentoActionPerformed
    try {
        // TODO add your handling code here:
        loadcmbDoctor();
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(ingreso_paciente.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jcmb_DepartamentoActionPerformed

    private void jbtnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAsignarActionPerformed
    try {
        // TODO add your handling code here:
        Doctor d=(Doctor)    jcmbDoctor.getModel().getSelectedItem();
       p=   Ingresar_paciente.paciente;
        if(p.setNewDoc(d.getId(),status,p.getPatientID(),p.getHospitalID(),p.getRoomID()))
        {
            JOptionPane.showMessageDialog(rootPane, "Paciente asignado");
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "No se puede asignar más pacientes a este doctor");
        }
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(ingreso_paciente.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jbtnAsignarActionPerformed

    private void jrb_tratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_tratamientoActionPerformed
        // TODO add your handling code here:
        status=1;
    }//GEN-LAST:event_jrb_tratamientoActionPerformed

    private void jrbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAltaActionPerformed
        // TODO add your handling code here:
        status=2;
    }//GEN-LAST:event_jrbAltaActionPerformed

    private void jrb_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_ingresoActionPerformed
        // TODO add your handling code here:
        status=0;
    }//GEN-LAST:event_jrb_ingresoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAsignar;
    private javax.swing.JComboBox<String> jcmbDoctor;
    private javax.swing.JComboBox<String> jcmb_Departamento;
    private javax.swing.JRadioButton jrbAlta;
    private javax.swing.JRadioButton jrb_ingreso;
    private javax.swing.JRadioButton jrb_tratamiento;
    // End of variables declaration//GEN-END:variables
}
