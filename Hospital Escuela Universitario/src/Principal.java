
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Complejo = new javax.swing.JFrame();
        tf_nombreHopsitalario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_DireccionHospita = new javax.swing.JTextArea();
        cb_RankingHospitalario = new javax.swing.JComboBox<>();
        tf_CapacidadParamedicos = new javax.swing.JTextField();
        tf_CapacidadAmbulancias = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jp_Paramedico = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombreParamedico = new javax.swing.JTextField();
        tf_IdParamedico = new javax.swing.JTextField();
        tf_edadParamedico = new javax.swing.JTextField();
        cb_RankingPAramedico = new javax.swing.JComboBox<>();
        cb_AsignaraParamedico = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jp_Ambulancia = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cb_AsignaraAmbulkance = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        tf_VelociMaxi = new javax.swing.JTextField();
        tf_AnoAmbulancia = new javax.swing.JTextField();
        tf_PlacaAmbulance = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        tf_nombreHopsitalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreHopsitalarioActionPerformed(evt);
            }
        });

        ta_DireccionHospita.setColumns(20);
        ta_DireccionHospita.setRows(5);
        jScrollPane1.setViewportView(ta_DireccionHospita);

        cb_RankingHospitalario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jLabel1.setText("Nombre");

        jLabel2.setText("Direccion");

        jLabel3.setText("Ranking de Emergencias");

        jLabel4.setText("Capacidad de Ambulancias");

        jLabel5.setText("Capacidad de Paramedicos");

        jButton4.setText("Agregar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nuevo Complejo Hospitalario");

        javax.swing.GroupLayout jp_ComplejoLayout = new javax.swing.GroupLayout(jp_Complejo.getContentPane());
        jp_Complejo.getContentPane().setLayout(jp_ComplejoLayout);
        jp_ComplejoLayout.setHorizontalGroup(
            jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_ComplejoLayout.createSequentialGroup()
                .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ComplejoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jp_ComplejoLayout.createSequentialGroup()
                                .addComponent(tf_nombreHopsitalario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_CapacidadParamedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(jp_ComplejoLayout.createSequentialGroup()
                                .addComponent(cb_RankingHospitalario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_CapacidadAmbulancias, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_ComplejoLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton4)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jp_ComplejoLayout.setVerticalGroup(
            jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ComplejoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nombreHopsitalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_CapacidadParamedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addComponent(jLabel1))
                    .addGroup(jp_ComplejoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_CapacidadAmbulancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_RankingHospitalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(35, 35, 35)
                .addGroup(jp_ComplejoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jLabel7.setText("Nombre");

        jLabel8.setText("Edad");

        jLabel9.setText("Ranking");

        jLabel10.setText("Asignar a:");

        jLabel11.setText("ID");

        cb_RankingPAramedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jButton5.setText("Agregar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Agregar Paramedico");

        javax.swing.GroupLayout jp_ParamedicoLayout = new javax.swing.GroupLayout(jp_Paramedico.getContentPane());
        jp_Paramedico.getContentPane().setLayout(jp_ParamedicoLayout);
        jp_ParamedicoLayout.setHorizontalGroup(
            jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ParamedicoLayout.createSequentialGroup()
                .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ParamedicoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ParamedicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombreParamedico)
                    .addGroup(jp_ParamedicoLayout.createSequentialGroup()
                        .addComponent(tf_IdParamedico, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_edadParamedico))
                    .addGroup(jp_ParamedicoLayout.createSequentialGroup()
                        .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addGroup(jp_ParamedicoLayout.createSequentialGroup()
                                .addComponent(cb_RankingPAramedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_AsignaraParamedico, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_ParamedicoLayout.setVerticalGroup(
            jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ParamedicoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel12)
                .addGap(27, 27, 27)
                .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombreParamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_IdParamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_edadParamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_ParamedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_RankingPAramedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(cb_AsignaraParamedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButton5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Nueva Ambulancia");

        jLabel14.setText("Año");

        jLabel15.setText("Placa");

        jLabel16.setText("Velocidad Maxima");

        jLabel17.setText("Asignar al Complejo: ");

        jButton6.setText("Aceptar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_AmbulanciaLayout = new javax.swing.GroupLayout(jp_Ambulancia.getContentPane());
        jp_Ambulancia.getContentPane().setLayout(jp_AmbulanciaLayout);
        jp_AmbulanciaLayout.setHorizontalGroup(
            jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AmbulanciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_PlacaAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_AsignaraAmbulkance, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_AnoAmbulancia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(tf_VelociMaxi, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(65, 65, 65))
            .addGroup(jp_AmbulanciaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_AmbulanciaLayout.setVerticalGroup(
            jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AmbulanciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(32, 32, 32)
                .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_PlacaAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_AsignaraAmbulkance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_VelociMaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_AmbulanciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tf_AnoAmbulancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(17, 17, 17))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear Complejo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Paramedico");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Agregar ambulancia");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_nombreHopsitalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreHopsitalarioActionPerformed

    }//GEN-LAST:event_tf_nombreHopsitalarioActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.limpiarComplejosH();
        this.jp_Complejo.pack();
        this.jp_Complejo.setLocationRelativeTo(this);
        this.jp_Complejo.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String nombre, direccion, rankinDeEmergencias;
        int capaAmbulancias, capaParamedicos;
        try {
            nombre = this.tf_nombreHopsitalario.getText();
            direccion = this.ta_DireccionHospita.getText();
            rankinDeEmergencias = this.cb_RankingHospitalario.getSelectedItem().toString();
            capaAmbulancias = Integer.parseInt(this.tf_CapacidadAmbulancias.getText());
            capaParamedicos = Integer.parseInt(this.tf_CapacidadParamedicos.getText());
            ComplejosH nuevocomplejo = new ComplejosH(nombre, direccion, rankinDeEmergencias, capaAmbulancias, capaParamedicos);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.jp_Complejo, "Algo Salio Mal, Verifique sus Datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        limpiarParamedicos();
        this.jp_Paramedico.pack();
        this.jp_Paramedico.setLocationRelativeTo(this);
        this.jp_Paramedico.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String nombre, ranking;
        int ID, edad;
        ComplejosH asignado;
        try {
            nombre = this.tf_nombreParamedico.getText();
            edad = Integer.parseInt(this.tf_edadParamedico.getText());
            ranking = this.cb_RankingPAramedico.getSelectedItem().toString();
            ID = Integer.parseInt(this.tf_IdParamedico.getText());
            asignado = (ComplejosH) this.cb_AsignaraParamedico.getSelectedItem();
            Paramedico nuevoParamedico = new Paramedico(nombre, ranking, ID, edad, asignado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.jp_Paramedico, "Algo Salio Mal, Verifique sus Datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.limpiarAmbulacias();
        this.jp_Ambulancia.pack();
        this.jp_Ambulancia.setLocationRelativeTo(this);
        this.jp_Ambulancia.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        int placa, year, VelociMaxima;
        ComplejosH complejohAsignado;
        try {
            placa = Integer.parseInt(this.tf_PlacaAmbulance.getText());
            year = Integer.parseInt(this.tf_AnoAmbulancia.getText());
            VelociMaxima = Integer.parseInt(this.tf_VelociMaxi.getText());
            complejohAsignado = (ComplejosH) this.cb_AsignaraAmbulkance.getSelectedItem();
            Ambulancia nuevaAmbulancia = new Ambulancia(placa, year, VelociMaxima, complejohAsignado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.jp_Ambulancia, "Algo Salio Mal, Verifique sus Datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton6MouseClicked
    public void limpiarComplejosH() {
        this.tf_nombreHopsitalario.setText("");
        this.tf_CapacidadAmbulancias.setText("");
        this.tf_CapacidadParamedicos.setText("");
        this.cb_RankingHospitalario.setSelectedIndex(-1);
        this.ta_DireccionHospita.setText("");
    }

    public void limpiarParamedicos() {
        this.tf_nombreParamedico.setText("");
        this.tf_IdParamedico.setText("");
        this.tf_edadParamedico.setText("");
        this.cb_AsignaraParamedico.setSelectedIndex(-1);
        this.cb_RankingPAramedico.setSelectedIndex(-1);
    }

    public void limpiarAmbulacias() {
        this.tf_AnoAmbulancia.setText("");
        this.tf_VelociMaxi.setText("");
        this.tf_PlacaAmbulance.setText("");
        this.cb_AsignaraAmbulkance.setSelectedIndex(-1);
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_AsignaraAmbulkance;
    private javax.swing.JComboBox<String> cb_AsignaraParamedico;
    private javax.swing.JComboBox<String> cb_RankingHospitalario;
    private javax.swing.JComboBox<String> cb_RankingPAramedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JFrame jp_Ambulancia;
    private javax.swing.JFrame jp_Complejo;
    private javax.swing.JFrame jp_Paramedico;
    private javax.swing.JTextArea ta_DireccionHospita;
    private javax.swing.JTextField tf_AnoAmbulancia;
    private javax.swing.JTextField tf_CapacidadAmbulancias;
    private javax.swing.JTextField tf_CapacidadParamedicos;
    private javax.swing.JTextField tf_IdParamedico;
    private javax.swing.JTextField tf_PlacaAmbulance;
    private javax.swing.JTextField tf_VelociMaxi;
    private javax.swing.JTextField tf_edadParamedico;
    private javax.swing.JTextField tf_nombreHopsitalario;
    private javax.swing.JTextField tf_nombreParamedico;
    // End of variables declaration//GEN-END:variables
}