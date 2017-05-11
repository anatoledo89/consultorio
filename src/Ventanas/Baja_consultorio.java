/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.DoctorsOffice;
import Clases.Hospital;
import DAO.DAOConsultorio;
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
public class Baja_consultorio extends javax.swing.JFrame {
public static int modif=0;
public static int idconsultorio=0;
    /**
     * Creates new form Baja_consultorio
     */
    public Baja_consultorio() throws SQLException, ClassNotFoundException {
        initComponents();
         this.setLocationRelativeTo(null);
       
            loadcmbHospital();
       
      
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
        jcmHospital = new javax.swing.JComboBox<>();
        jcmbConsultorio = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jcmHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmHospitalActionPerformed(evt);
            }
        });

        jcmbConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un cosultorio" }));

        jButton1.setText("Baja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 315, Short.MAX_VALUE)
                .addComponent(btn_regresar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcmbConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_regresar)
                .addGap(18, 18, 18)
                .addComponent(jcmHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcmbConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
         Menu_Clinica obj = new Menu_Clinica();
      obj.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
       int result = JOptionPane.showConfirmDialog(null, 
   "¿Desea eliminar el consultorio?",null, JOptionPane.YES_NO_OPTION);
if(result == JOptionPane.YES_OPTION) {
    

        DoctorsOffice doffice=new DoctorsOffice();
       doffice=(DoctorsOffice)jcmbConsultorio.getSelectedItem();
        try {
           DAOConsultorio daoc=new DAOConsultorio();
          if( daoc.deleteDoctorsOffice(doffice.getId()))
          {
              JOptionPane.showMessageDialog(rootPane, "Consultorio borrado");
          }else
          {
              JOptionPane.showMessageDialog(rootPane, "Ocurrió un error");
          }
        } catch (SQLException ex) {
            Logger.getLogger(Baja_consultorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Baja_consultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcmHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmHospitalActionPerformed
        // TODO add your handling code here:

        Hospital h=new Hospital();

        h=(Hospital)jcmHospital.getSelectedItem();
        try {
            loadcmbConsultorio(h.getIdhospital());
        } catch (SQLException ex) {
            Logger.getLogger(Baja_consultorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Baja_consultorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcmHospitalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        modif=1;
       DoctorsOffice doffice=new DoctorsOffice();
       doffice=(DoctorsOffice)jcmbConsultorio.getSelectedItem();
       idconsultorio=doffice.getId();
        
         try {
            Alta_consultorios obj = new Alta_consultorios();
            obj.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Clinica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu_Clinica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
     public void loadcmbHospital() throws SQLException, ClassNotFoundException
    {
        DAOHospital dAOHospital=new DAOHospital();
        Hospital h=new Hospital();
         DefaultComboBoxModel mode = new DefaultComboBoxModel();
          
            mode.removeAllElements();
         h.setIdhospital(0);
          h.setName("Seleccione un hospital");
           
            mode.addElement(h);
            for (Hospital hospital : dAOHospital.loadhospital()) {
                mode.addElement(hospital);
            }
            jcmHospital.setModel(mode);
           
        
        
    }
     
     
      public void loadcmbConsultorio(int idhospital) throws SQLException, ClassNotFoundException
    {
        
       DAOConsultorio daoconsultorio=new DAOConsultorio();
     
          DefaultComboBoxModel mode = new DefaultComboBoxModel();
          
            mode.removeAllElements();
             
            
             for(DoctorsOffice doctorsoffice: daoconsultorio.loadDoctorsOfficebyHospital(idhospital))
             {
                 mode.addElement(doctorsoffice);
             }
             jcmbConsultorio.setModel(mode);
           
        
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jcmHospital;
    private javax.swing.JComboBox<String> jcmbConsultorio;
    // End of variables declaration//GEN-END:variables
}
