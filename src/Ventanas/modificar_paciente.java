/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Doctor;
import Clases.Patient;
import DAO.DAOPaciente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author A
 */
public class modificar_paciente extends javax.swing.JFrame {
Patient p=null;
private int status=0;
    /**
     * Creates new form modificar_paciente
     */
    public modificar_paciente() throws SQLException, ClassNotFoundException {
        initComponents();
          jcmbDoctor.setEnabled(false);
          jcmbDoctor.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_busqueda = new javax.swing.JTextField();
        cmbBusqueda = new javax.swing.JComboBox();
        btn_buscarpaciente = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcmb_Departamento = new javax.swing.JComboBox<>();
        jcmbDoctor = new javax.swing.JComboBox<>();
        txtpeso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txthabitacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtenfermedad = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtnIngreso = new javax.swing.JRadioButton();
        jbtnTratamiento = new javax.swing.JRadioButton();
        jbtnAlta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 56, 73));

        txt_busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busquedaActionPerformed(evt);
            }
        });

        cmbBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Por nombre", "Por ID", "Por número de seguro" }));

        btn_buscarpaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscarpaciente.setText("Buscar");
        btn_buscarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarpacienteActionPerformed(evt);
            }
        });

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctores:");

        jcmb_Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmb_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_DepartamentoActionPerformed(evt);
            }
        });

        jcmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtpeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Peso: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Altura: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ID habitación: ");

        txthabitacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txthabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthabitacionActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Enfermedad: ");

        txtenfermedad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtenfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenfermedadActionPerformed(evt);
            }
        });

        txtaltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalturaActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtnIngreso.setText("Ingreso");
        jbtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresoActionPerformed(evt);
            }
        });

        jbtnTratamiento.setText("Tratamiento");
        jbtnTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTratamientoActionPerformed(evt);
            }
        });

        jbtnAlta.setText("Alta");
        jbtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtaltura)
                            .addComponent(txthabitacion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btn_buscarpaciente)
                            .addGap(190, 190, 190))
                        .addComponent(jcmb_Departamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcmbDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnIngreso)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jbtnTratamiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnAlta)))))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLabel11)
                    .addGap(18, 18, 18)
                    .addComponent(txtenfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_regresar)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btn_buscarpaciente)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txthabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcmb_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnIngreso)
                    .addComponent(jbtnTratamiento)
                    .addComponent(jbtnAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtenfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(459, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busquedaActionPerformed

    private void btn_buscarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarpacienteActionPerformed
   
        try {
            // TODO add your handling code here:
            buscar();
            loadcmbDepartament();
            jcmbDoctor.setEnabled(true);
          jcmbDoctor.setEnabled(true);
        loadcmbDoctor();
        } catch (SQLException ex) {
            Logger.getLogger(modificar_paciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(modificar_paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_buscarpacienteActionPerformed
  private void buscar() throws SQLException, ClassNotFoundException
   {
       DAOPaciente daopaciente=new DAOPaciente();
       
       p=null;
      
       switch(cmbBusqueda.getSelectedIndex())
       {
           case 0:
               p=daopaciente.patienteSearchbyName(txt_busqueda.getText());
             
               break;
           case 1:
               p=daopaciente.patienteSearchbyID(Integer.parseInt(txt_busqueda.getText()));
               
               break;
           case 2:
               p=daopaciente.patienteSearchbyNumberSec(txt_busqueda.getText());
              
               break;
       }
       
       Doctor d=daopaciente.getDoctorPatientid(p.getSecurityNumber());
       txtenfermedad.setText(p.getDisease());
       txthabitacion.setText(p.getRoomID().toString());
       txtpeso.setText(p.getWeight().toString());
       txtaltura.setText(p.getSize().toString());
   //    jcmbDoctor.setSelectedItem(d);
   //    jcmb_Departamento.setSelectedItem(d.getDepartment());
       
       
       
   }
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        Menu_Paciente obj = new Menu_Paciente();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void txthabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthabitacionActionPerformed

    private void txtenfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenfermedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenfermedadActionPerformed

    private void txtalturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalturaActionPerformed

    private void jcmb_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_DepartamentoActionPerformed
        try {
            // TODO add your handling code here:
            loadcmbDoctor();
        } catch (SQLException ex) {
            Logger.getLogger(ingreso_paciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ingreso_paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcmb_DepartamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
       
        // TODO add your handling code here:
        DAOPaciente dp=new DAOPaciente();
        p.setRoomID(Integer.parseInt(txthabitacion.getText()));
        p.setSize(Float.parseFloat(txtaltura.getText()));
        p.setWeight(Float.parseFloat(txtpeso.getText()));
        p.setDisease(txtenfermedad.getText());
        p.setStatus(status);
       Doctor d= (Doctor) jcmbDoctor.getModel().getSelectedItem();
     if(   dp.updatePatient(p, d.getId()))
     {
         JOptionPane.showMessageDialog(rootPane, "El paciente ha sido modificado");
     }
    } catch (SQLException ex) {
        Logger.getLogger(modificar_paciente.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(modificar_paciente.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int result = JOptionPane.showConfirmDialog(null, 
   "¿Desea eliminar al paciente?",null, JOptionPane.YES_NO_OPTION);
if(result == JOptionPane.YES_OPTION) {
    
    
         try {
             // TODO add your handling code here:
             DAOPaciente dAOPaciente=new DAOPaciente();
             if(     dAOPaciente.deletePatient(p.getSecurityNumber()))
             {
                 JOptionPane.showMessageDialog(rootPane, "Paciente borrado");
                 //borrar tambien en tabla pacientedoctor
             }else
             {
                 JOptionPane.showMessageDialog(rootPane, "Ocurrió un error");
             }     } catch (SQLException ex) {
             Logger.getLogger(modificar_paciente.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(modificar_paciente.class.getName()).log(Level.SEVERE, null, ex);
         }
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTratamientoActionPerformed
        // TODO add your handling code here:
        status=1;
    }//GEN-LAST:event_jbtnTratamientoActionPerformed

    private void jbtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresoActionPerformed
        // TODO add your handling code here:
        status=0;
    }//GEN-LAST:event_jbtnIngresoActionPerformed

    private void jbtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAltaActionPerformed
        // TODO add your handling code here:
        status=2;
    }//GEN-LAST:event_jbtnAltaActionPerformed

    private void loadcmbDepartament() throws SQLException, ClassNotFoundException
    {
        DAOPaciente dAOPaciente=new DAOPaciente();
     jcmb_Departamento.setModel(new DefaultComboBoxModel(dAOPaciente.getDepartament(p.getHospitalID()).toArray()));
    }
    
    private void loadcmbDoctor() throws SQLException, ClassNotFoundException
    {
             DAOPaciente dp=new DAOPaciente();
      
         DefaultComboBoxModel mode = new DefaultComboBoxModel();
          
            mode.removeAllElements();
        
           
          
            for (Doctor d :dp.loaddoctorsbyDepartment((String)jcmb_Departamento.getSelectedItem(),p.getHospitalID()) ) {
                mode.addElement(d);
            }
            jcmbDoctor.setModel(mode);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarpaciente;
    private javax.swing.JButton btn_regresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jbtnAlta;
    private javax.swing.JRadioButton jbtnIngreso;
    private javax.swing.JRadioButton jbtnTratamiento;
    private javax.swing.JComboBox<String> jcmbDoctor;
    private javax.swing.JComboBox<String> jcmb_Departamento;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtenfermedad;
    private javax.swing.JTextField txthabitacion;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
