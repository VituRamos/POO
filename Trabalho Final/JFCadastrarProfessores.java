/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetopoo;

import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class JFCadastrarProfessores extends javax.swing.JFrame {

    String Usuario;
    GerenciarDisciplinas gerenciardisciplinas = new GerenciarDisciplinas();
    GerenciarProfessores gerenciarprofessores = new GerenciarProfessores();
    Professores professores = new Professores();
    
    public JFCadastrarProfessores() {
        initComponents();
    }
    
    public JFCadastrarProfessores(String Usuario) {
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

        jLNomeProfessor = new javax.swing.JLabel();
        jLCPFProfessor = new javax.swing.JLabel();
        jLDisciplina = new javax.swing.JLabel();
        jBCadastrarProfessor = new javax.swing.JButton();
        jTNomeProfessor = new javax.swing.JTextField();
        jTCPFProfessor = new javax.swing.JTextField();
        jCDisciplina = new javax.swing.JComboBox<>();
        jBVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Professores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLNomeProfessor.setText("Nome");

        jLCPFProfessor.setText("CPF");

        jLDisciplina.setText("Disciplina");

        jBCadastrarProfessor.setText("Cadastrar");
        jBCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarProfessorActionPerformed(evt);
            }
        });

        jCDisciplina.setToolTipText("");

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
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCadastrarProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCDisciplina, 0, 156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNomeProfessor)
                            .addComponent(jLCPFProfessor))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCPFProfessor)
                            .addComponent(jTNomeProfessor))))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeProfessor)
                    .addComponent(jTNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPFProfessor)
                    .addComponent(jTCPFProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDisciplina)
                    .addComponent(jCDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrarProfessor)
                    .addComponent(jBVoltar))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        JFGerenciarProfessores jfgerenciarprofessores = new JFGerenciarProfessores(Usuario);
        dispose();
        jfgerenciarprofessores.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        this.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_formWindowActivated

    private void jBCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarProfessorActionPerformed
         
        if(jCDisciplina.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "         A disciplina não foi escolhida.\nCaso não haja alguma disciplina, cadastre no sistema. ", "Cadastro de Professor", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String NomeProfessor = jTNomeProfessor.getText();
        String CPFProfessor = jTCPFProfessor.getText();
        String DisciplinaProfessor = jCDisciplina.getSelectedItem().toString();
        
        Professores professor = gerenciarprofessores.consultarProfessores(CPFProfessor);
        
        if (professor.getCPF().equals("")){
            
            gerenciarprofessores.cadastrarProfessor(NomeProfessor,CPFProfessor,DisciplinaProfessor);
            professor = gerenciarprofessores.consultarProfessores(CPFProfessor);
                    
                if(professor.getCPF().equals(CPFProfessor)){
                    JOptionPane.showMessageDialog(null, "O professor foi cadastrado com sucesso.", "Cadastro de Professor", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao cadastrar o professor.", "Cadastro de Professor", JOptionPane.ERROR_MESSAGE);
                }
        }else{
            JOptionPane.showMessageDialog(null, "O professor ja esta cadastrado", "Cadastro de Professor", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_jBCadastrarProfessorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setLocationRelativeTo(null);
        
        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            jCDisciplina.addItem(elementoDisciplinas.getNomeDisciplina());
        }
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JFCadastrarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastrarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastrarProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrarProfessor;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCDisciplina;
    private javax.swing.JLabel jLCPFProfessor;
    private javax.swing.JLabel jLDisciplina;
    private javax.swing.JLabel jLNomeProfessor;
    private javax.swing.JTextField jTCPFProfessor;
    private javax.swing.JTextField jTNomeProfessor;
    // End of variables declaration//GEN-END:variables
}
