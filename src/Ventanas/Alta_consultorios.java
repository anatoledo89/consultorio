/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Doctor;
import Clases.DoctorsOffice;
import Clases.Hospital;
import DAO.DAOConsultorio;
import DAO.DAODoctor;
import DAO.DAOHospital;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author pamel
 */
public class Alta_consultorios extends javax.swing.JFrame {
  DoctorsOffice doffice;
    /**
     * Creates new form Alta_consultorios
     */
    public Alta_consultorios() throws SQLException, ClassNotFoundException {
        initComponents();
         this.setLocationRelativeTo(null);
         if(Baja_consultorio.modif==1)
         {
               loadcmbHospital();
         loadcmbDoctores();
             loadDoctorsOfficedata();
             jButton1.setText("Guardar cambios");
             
         }else
         {
             jButton1.setText("Crear");
         loadcmbHospital();
         loadcmbDoctores();
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

        jPanel1 = new javax.swing.JPanel();
        jcmbHospital = new javax.swing.JComboBox<String>();
        jcmDoctor = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFloor = new javax.swing.JTextField();
        txtMRent = new javax.swing.JTextField();
        txtPago = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jcmbHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbHospitalActionPerformed(evt);
            }
        });

        jcmDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmDoctorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Número de piso: ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Renta mensual:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Último pago:");
        jLabel4.setEnabled(false);

        txtFloor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFloorKeyTyped(evt);
            }
        });

        txtMRent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMRentKeyTyped(evt);
            }
        });

        txtPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcmbHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcmDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFloor)
                                        .addComponent(txtMRent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8)))
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar)
                .addGap(43, 43, 43)
                .addComponent(jcmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jcmDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMRent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
       Baja_consultorio.modif=0;
        Menu_Clinica obj = new Menu_Clinica();
      obj.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtFloor.getText().matches("") || txtMRent.getText().matches("") )
        {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese todos los campos");
        }else
        {
           if(Baja_consultorio.modif==0)
           {
            DoctorsOffice doctorsOffice=new DoctorsOffice();
            
            Hospital h=new Hospital();
            Doctor d=new Doctor();
            h=(Hospital)jcmbHospital.getSelectedItem();
            d=(Doctor)jcmDoctor.getSelectedItem();
            doctorsOffice.setFloor(Integer.parseInt(txtFloor.getText()));
            doctorsOffice.setMonthlyRent(Float.parseFloat(txtMRent.getText()));
            doctorsOffice.setIdhospital(h.getIdhospital());
            doctorsOffice.setDoctorID(d.getId());
            
            try {
                DAOConsultorio daoconsultorio=new DAOConsultorio();
              if(  daoconsultorio.saveConsultorio(doctorsOffice))
              {
                  JOptionPane.showMessageDialog(rootPane, "Consultorio agregado");
              }
              else
              {
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un error");
              }
            } catch (SQLException ex) {
                Logger.getLogger(Alta_consultorios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Alta_consultorios.class.getName()).log(Level.SEVERE, null, ex);
            }
           }else
           {
               try {
                   cargardatos();
                   DAOConsultorio daoconsultorio=new DAOConsultorio();
                   if(daoconsultorio.UpdateDoctorsOffice(doffice))
                   {
                       JOptionPane.showMessageDialog(rootPane, "Consultorio modificado");
                       loadDoctorsOfficedata();
                   }else
                   {
                        JOptionPane.showMessageDialog(rootPane, "Ocurrió un error");
                   }
                   
               } catch (SQLException ex) {
                   Logger.getLogger(Alta_consultorios.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(Alta_consultorios.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               
           }
            
            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcmDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmDoctorActionPerformed

    private void jcmbHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbHospitalActionPerformed
      try {
          // TODO add your handling code here:
          loadcmbDoctores();
      } catch (SQLException ex) {
          Logger.getLogger(Alta_consultorios.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Alta_consultorios.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jcmbHospitalActionPerformed

    private void txtFloorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFloorKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
     {evt.consume();}
    }//GEN-LAST:event_txtFloorKeyTyped

    private void txtMRentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMRentKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
     {evt.consume();}
    }//GEN-LAST:event_txtMRentKeyTyped

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar()))
     {evt.consume();}
    }//GEN-LAST:event_txtPagoKeyTyped

   public void cargardatos()
   {
        Hospital h=new Hospital();
            Doctor d=new Doctor();
            h=(Hospital)jcmbHospital.getSelectedItem();
            d=(Doctor)jcmDoctor.getSelectedItem();
            doffice.setFloor(Integer.parseInt(txtFloor.getText()));
            doffice.setMonthlyRent(Float.parseFloat(txtMRent.getText()));
            doffice.setIdhospital(h.getIdhospital());
            doffice.setDoctorID(d.getId());
            doffice.setLastPayment(Float.parseFloat(txtPago.getText()));
   }
    public void loadDoctorsOfficedata() throws SQLException, ClassNotFoundException
    {
        DAOConsultorio daoconsultorio=new DAOConsultorio();
      
     doffice=daoconsultorio.getDoctorsOffice( Baja_consultorio.idconsultorio);
        jcmbHospital.getModel().setSelectedItem(Baja_consultorio.hospital);
        jcmDoctor.getModel().setSelectedItem(daoconsultorio.getDoctorById(doffice.getDoctorID()));
        txtFloor.setText(doffice.getFloor().toString());
        txtMRent.setText(doffice.getMonthlyRent().toString());
        txtPago.setEnabled(true);
        jLabel4.setEnabled(true);
        txtPago.setText(doffice.getLastPayment().toString());
        
    }
    
    public void loadcmbDoctores() throws SQLException, ClassNotFoundException
    {
        DAODoctor daodoctor=new DAODoctor();
        Doctor d=new Doctor();
        Hospital h=(Hospital)jcmbHospital.getSelectedItem();
        DefaultComboBoxModel mode = new DefaultComboBoxModel();
          
            mode.removeAllElements();
           
           
            for(Doctor doctor:daodoctor.loaddoctors(h.getIdhospital()))
            {
                mode.addElement(doctor);
            }
            jcmDoctor.setModel(mode);
   
        
    }
    public void loadcmbHospital() throws SQLException, ClassNotFoundException
    {
        DAOHospital dAOHospital=new DAOHospital();
        Hospital h=new Hospital();
         DefaultComboBoxModel mode = new DefaultComboBoxModel();
          
            mode.removeAllElements();
       
            for (Hospital hospital : dAOHospital.loadhospital()) {
                mode.addElement(hospital);
            }
            jcmbHospital.setModel(mode);
           
        
        
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcmDoctor;
    private javax.swing.JComboBox<String> jcmbHospital;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JTextField txtMRent;
    private javax.swing.JFormattedTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
