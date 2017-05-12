/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import javax.swing.JOptionPane;
import Clases.Doctor;
import Clases.DoctorsOffice;
import Clases.Hospital;
import DAO.DAOConsultorio;
import DAO.DAODoctor;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pamel
 */
public class Alta_Medicos extends javax.swing.JFrame {
Doctor doctor;
    /**
     * Creates new form Alta_Medicos
     */
    public Alta_Medicos() throws SQLException, ClassNotFoundException {
        initComponents();
        this.setLocationRelativeTo(null);
        if (Modify_Medicos.modif==1)
        {
            loadDoctorsdata();
            crearDoctor.setText("Modificar");
            txt_ID.setEnabled(false);
        }else
        {crearDoctor.setText("Crear");
        txt_ID.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        lbl_especialidad = new javax.swing.JLabel();
        lbl_licensia = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_department = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        crearDoctor = new javax.swing.JButton();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        lbl_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_id.setText("ID de médico: ");

        lbl_especialidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_especialidad.setText("Especialidad:");

        lbl_licensia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_licensia.setText("Licencia:  ");

        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });

        txt_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_departmentActionPerformed(evt);
            }
        });

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        crearDoctor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        crearDoctor.setText("Crear");
        crearDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDoctorActionPerformed(evt);
            }
        });

        lbl_nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre: ");

        lbl_apellido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_apellido.setText("Apellido:");

        lbl_edad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_edad.setText("Edad:");

        lbl_direccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_direccion.setText("Direccion: ");

        lbl_telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_telefono.setText("Telefono");

        lbl_email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_email.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_email)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_direccion)
                            .addComponent(lbl_edad)
                            .addComponent(lbl_apellido)
                            .addComponent(lbl_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ID)
                            .addComponent(txt_email)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(txt_edad)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_telefono))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_licensia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(143, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_regresar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(crearDoctor)
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar)
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_edad)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_id)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_especialidad)
                    .addComponent(txt_department, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_licensia)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(crearDoctor)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
    Modify_Medicos.modif=0;
    Menu_Doctores obj = new Menu_Doctores();
      obj.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

        public void loadDoctorsdata() throws SQLException, ClassNotFoundException
    {
        DAODoctor doctor=new DAODoctor();
        Doctor d=null;
        d = doctor.getDoctor(Modify_Medicos.id);
        if(d!=null)
        {
        txt_nombre.setText(d.getFirstname());
        txt_apellido.setText(d.getLastname());
        txt_cedula.setText(d.getLicense());
        txt_department.setText(d.getDepartment());
        txt_edad.setText(Integer.toString(d.getAge()));
        txt_email.setText(d.getEmail());
        txt_direccion.setText(d.getAddress());
        txt_telefono.setText(d.getTelephone());
        txt_ID.setText(d.getId());
        
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "No se ha encontrado ningún registro");
             Modify_Medicos.modif=0;
   
            
          
        }
        
    }
    
    
    
    private void crearDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDoctorActionPerformed
        // TODO add your handling code here:
        if (txt_ID.getText().matches("")||txt_department.getText().matches("") || txt_cedula.getText().matches(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese todos los campos");
        }
        else 
        {
            if(Modify_Medicos.modif==0)
            {
          cargardatos();
        
            
            try {
                DAODoctor daodoc=new DAODoctor();
              if(  daodoc.alta_doctor(doctor))
              {
                  JOptionPane.showMessageDialog(rootPane, " Doctor Agregado ");
                  clearField();
              }
              else
              {
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un error, llene todos los campos ");
              }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Alta_Medicos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {       try {
            DAODoctor daod=new DAODoctor();
            cargardatos();
            if(daod.ModifyDoctor(doctor))
            {
                JOptionPane.showMessageDialog(rootPane, "Doctor modificado");
                
            }else
            {
                JOptionPane.showMessageDialog(rootPane, "ocurrió un error");
            }
                } catch (SQLException ex) {
                    Logger.getLogger(Alta_Medicos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Alta_Medicos.class.getName()).log(Level.SEVERE, null, ex);
                }
       
            
                }
        }
          
    }//GEN-LAST:event_crearDoctorActionPerformed

    private void txt_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departmentActionPerformed

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void clearField()
     {
         txt_nombre.setText(" ");
         txt_apellido.setText(" ");
         txt_edad.setText(" ");
         txt_direccion.setText(" ");
         txt_telefono.setText("");
         txt_email.setText("");
         txt_ID.setText("");
         txt_department.setText("");
         txt_cedula.setText("");
     }
    /**
     * @param args the command line arguments
     */
   private void cargardatos()
   {   doctor = new Doctor();
           
        doctor.setFirstname(txt_nombre.getText());
            doctor.setLastname(txt_apellido.getText());
            doctor.setAge(Integer.parseInt(txt_edad.getText()));
            doctor.setAddress(txt_direccion.getText());
            doctor.setTelephone(txt_telefono.getText());
            doctor.setEmail(txt_email.getText());
            doctor.setId(txt_ID.getText());
            doctor.setDepartment(txt_department.getText());
            doctor.setLicense(txt_cedula.getText());
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton crearDoctor;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_especialidad;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_licensia;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void ModifyDoctor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
