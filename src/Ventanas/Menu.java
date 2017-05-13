/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Karen
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        jLabel2 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        lbl_pacientes = new javax.swing.JLabel();
        btn_clinica = new javax.swing.JButton();
        lbl_doctores = new javax.swing.JLabel();
        lbl_clinica = new javax.swing.JLabel();
        btn_doctores = new javax.swing.JButton();
        btn_pacientes = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_pacientes1 = new javax.swing.JLabel();
        lbl_pacientes2 = new javax.swing.JLabel();
        lbl_pacientes3 = new javax.swing.JLabel();
        btn_exit_menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intro.png"))); // NOI18N

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_pacientes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_pacientes.setText("Pacientes");

        btn_clinica.setBackground(new java.awt.Color(204, 204, 204));
        btn_clinica.setForeground(new java.awt.Color(0, 204, 204));
        btn_clinica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hospi2.png"))); // NOI18N
        btn_clinica.setBorderPainted(false);
        btn_clinica.setContentAreaFilled(false);
        btn_clinica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_clinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clinicaMouseClicked(evt);
            }
        });
        btn_clinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clinicaActionPerformed(evt);
            }
        });

        lbl_doctores.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_doctores.setForeground(new java.awt.Color(255, 255, 255));
        lbl_doctores.setText("Doctores");

        lbl_clinica.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_clinica.setForeground(new java.awt.Color(255, 255, 255));
        lbl_clinica.setText("Clínica");

        btn_doctores.setBackground(new java.awt.Color(204, 204, 204));
        btn_doctores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estetoscopio.png"))); // NOI18N
        btn_doctores.setBorderPainted(false);
        btn_doctores.setContentAreaFilled(false);
        btn_doctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_doctoresMouseClicked(evt);
            }
        });
        btn_doctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctoresActionPerformed(evt);
            }
        });

        btn_pacientes.setBackground(new java.awt.Color(204, 204, 204));
        btn_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        btn_pacientes.setBorderPainted(false);
        btn_pacientes.setContentAreaFilled(false);
        btn_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pacientesMouseClicked(evt);
            }
        });
        btn_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacientesActionPerformed(evt);
            }
        });

        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/la-historia-clinica.png"))); // NOI18N
        btn_reportes.setContentAreaFilled(false);
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reportes");

        lbl_pacientes1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_pacientes1.setText("Medicos");

        lbl_pacientes2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_pacientes2.setText("Consultorios");

        lbl_pacientes3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_pacientes3.setText("Reportes");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btn_pacientes)
                        .addGap(18, 18, 18)
                        .addComponent(btn_doctores, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clinica)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reportes))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(547, 547, 547)
                            .addComponent(lbl_doctores)
                            .addGap(188, 188, 188)
                            .addComponent(lbl_clinica)
                            .addGap(179, 179, 179)
                            .addComponent(jLabel1))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(lbl_pacientes)
                            .addGap(208, 208, 208)
                            .addComponent(lbl_pacientes1)
                            .addGap(183, 183, 183)
                            .addComponent(lbl_pacientes2)
                            .addGap(167, 167, 167)
                            .addComponent(lbl_pacientes3))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_doctores)
                    .addComponent(lbl_clinica)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pacientes)
                    .addComponent(lbl_pacientes1)
                    .addComponent(lbl_pacientes2)
                    .addComponent(lbl_pacientes3))
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_pacientes)
                    .addComponent(btn_doctores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clinica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_exit_menu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_exit_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        btn_exit_menu.setBorderPainted(false);
        btn_exit_menu.setContentAreaFilled(false);
        btn_exit_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit_menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_exit_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(451, 451, 451))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_exit_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_doctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctoresActionPerformed

    }//GEN-LAST:event_btn_doctoresActionPerformed

    private void btn_doctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_doctoresMouseClicked
        Menu_Doctores obj = new Menu_Doctores();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_doctoresMouseClicked

    private void btn_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacientesActionPerformed

    }//GEN-LAST:event_btn_pacientesActionPerformed

    private void btn_pacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacientesMouseClicked
        Menu_Paciente obj = new Menu_Paciente();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_pacientesMouseClicked

    private void btn_exit_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit_menuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exit_menuActionPerformed

    private void btn_clinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clinicaActionPerformed

    }//GEN-LAST:event_btn_clinicaActionPerformed

    private void btn_clinicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clinicaMouseClicked
        Menu_Clinica obj = new Menu_Clinica();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_clinicaMouseClicked

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        // TODO add your handling code here:
         Menu_reportes obj = new Menu_reportes();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reportesActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clinica;
    private javax.swing.JButton btn_doctores;
    private javax.swing.JButton btn_exit_menu;
    private javax.swing.JButton btn_pacientes;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_clinica;
    private javax.swing.JLabel lbl_doctores;
    private javax.swing.JLabel lbl_pacientes;
    private javax.swing.JLabel lbl_pacientes1;
    private javax.swing.JLabel lbl_pacientes2;
    private javax.swing.JLabel lbl_pacientes3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
