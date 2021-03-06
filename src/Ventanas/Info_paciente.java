/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.DoctorsOffice;
import Clases.Patient;
import DAO.DAOPaciente;
import DAO.DAOReportes;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pamel
 */
public class Info_paciente extends javax.swing.JFrame {

    DefaultTableModel model;
   String[] titles={"Nombre","Apellido","Edad","Direccion","Telefono","Email",
   "Seguro Social","Peso","Altura","Enfermedad","Numero de cuarto","ID Doctor","ID Doctor",
   "ID Doctor","ID Doctor","ID Doctor","Status"};
   String[] registros=new String[18];
  
    /**
     * Creates new form Info_paciente
     */
    public Info_paciente() throws SQLException, ClassNotFoundException {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el ID:");

        jButton1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 0, 51));

        jLabel10.setFont(new java.awt.Font("American Captain", 0, 88)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("informacion paciente");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicina.png"))); // NOI18N

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/espalda.png"))); // NOI18N
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_regresar)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel11)
                .addGap(43, 43, 43)
                .addComponent(jLabel10)
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addGap(0, 313, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(176, 176, 176))
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
                         Menu_Paciente obj = new Menu_Paciente();
        obj.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

     private void load() throws SQLException, ClassNotFoundException
   {
      
       
      model = new DefaultTableModel(null,titles); 
      DAOPaciente pac = new DAOPaciente();
           
            Patient pat;
            pat = pac.patienteSearchbyID(Integer.parseInt(txt_id.getText()));
      
            
      {
          
          registros[0]=pat.getFirstname();
          registros[1]=pat.getLastname();
           registros[2]=Integer.toString(pat.getAge());
          registros[3]=pat.getAddress();
          registros[4]=pat.getTelephone();
          registros[5]=pat.getEmail();
          registros[6]=pat.getSecurityNumber();
          registros[7]=Float.toString(pat.getWeight());
          registros[8]=Float.toString(pat.getSize());
          registros[9]=pat.getDisease();
          registros[10]=Integer.toString(pat.getRoomID());
      
          String[] doctors=new String[5];
          doctors=pat.getDoctorID();
          int num = 0;
          for (int i = 11; i<15;i++)
          {
             
              
              registros[i]=doctors[num];
              num++;
          }
          registros[16]=Integer.toString(pat.getStatus());      
          model.addRow(registros);
         
      }
      
      
      jTable1.setModel(model);
      jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
       jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(7).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(10).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(11).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(12).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(13).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(14).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(15).setPreferredWidth(100);
         jTable1.getColumnModel().getColumn(16).setPreferredWidth(100);
        
         
         
      
   }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            load();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Info_paciente.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
