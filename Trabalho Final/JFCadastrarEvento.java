/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetopoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class JFCadastrarEvento extends javax.swing.JFrame {

    String Usuario;
    Eventos evento = new Eventos();
    JFGerenciarEventos jfgerenciareventos;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
    
    public JFCadastrarEvento() {
        initComponents();
    }
    
    public JFCadastrarEvento(String Usuario) {
        initComponents();
        this.Usuario = Usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jCTurma = new javax.swing.JComboBox<>();
        jCBPalestra = new javax.swing.JCheckBox();
        jCBVisitaTecnica = new javax.swing.JCheckBox();
        jLTurma = new javax.swing.JLabel();
        jLEvento = new javax.swing.JLabel();
        jFTData = new javax.swing.JFormattedTextField();
        jFTHorario = new javax.swing.JFormattedTextField();
        jLDataHorario = new javax.swing.JLabel();
        jLObs = new javax.swing.JLabel();
        jTObs = new javax.swing.JTextField();
        jBConfirmar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonGroup.add(jCBPalestra);
        jCBPalestra.setText("Palestra");

        buttonGroup.add(jCBVisitaTecnica);
        jCBVisitaTecnica.setText("Visita Tecnica");

        jLTurma.setText("Turma");

        jLEvento.setText("Evento");

        try {
            jFTData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTDataActionPerformed(evt);
            }
        });

        try {
            jFTHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTHorarioActionPerformed(evt);
            }
        });

        jLDataHorario.setText("Data e Horario");

        jLObs.setText("Palestrante ou Local");

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jBConfirmar)
                        .addGap(99, 99, 99)
                        .addComponent(jBVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLObs)
                            .addComponent(jLDataHorario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTObs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFTData, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBPalestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBVisitaTecnica)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTurma)
                    .addComponent(jCTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEvento)
                    .addComponent(jCBPalestra)
                    .addComponent(jCBVisitaTecnica))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataHorario)
                    .addComponent(jFTHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLObs)
                    .addComponent(jTObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmar)
                    .addComponent(jBVoltar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFTDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTDataActionPerformed

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
   
        String nomeTurma = jCTurma.getSelectedItem().toString();
        String horario = jFTHorario.getValue().toString();
        String obs = jTObs.getText();
        String data = jFTData.getValue().toString();
        String tipo;
        
        System.out.println(data);
        System.out.println(horario);
        
        if (jCBVisitaTecnica.isSelected()) {
            tipo = "Visita Tecnica";
        }else{
            tipo = "Palestra";
        }
        
        evento.cadastrarEvento(nomeTurma, data, horario, obs, obs, tipo);
        JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso no sistema!", "Cadastro de Eventos", JOptionPane.INFORMATION_MESSAGE);
        
        buttonGroup.clearSelection();
        jFTHorario.setValue("");
        jFTData.setValue("");
        jTObs.setText("");
        
        
    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        this.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        jfgerenciareventos = new JFGerenciarEventos(Usuario);
        dispose();
        jfgerenciareventos.setVisible(true);
        
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.setLocationRelativeTo(null);
        
        for (Turmas elementoTurmas: Turmas.ListaTurmas) {
            jCTurma.addItem(elementoTurmas.getNomeTurma());
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void jFTHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastrarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JCheckBox jCBPalestra;
    private javax.swing.JCheckBox jCBVisitaTecnica;
    private javax.swing.JComboBox<String> jCTurma;
    private javax.swing.JFormattedTextField jFTData;
    private javax.swing.JFormattedTextField jFTHorario;
    private javax.swing.JLabel jLDataHorario;
    private javax.swing.JLabel jLEvento;
    private javax.swing.JLabel jLObs;
    private javax.swing.JLabel jLTurma;
    private javax.swing.JTextField jTObs;
    // End of variables declaration//GEN-END:variables
}
