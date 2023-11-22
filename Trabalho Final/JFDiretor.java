/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetopoo;
/**
 *
 * @author victo
 */
public class JFDiretor extends javax.swing.JFrame {

    Alunos alunos = new Alunos();
    Professores professores = new Professores();
    JFGerenciarProfessores jfgerenciarProfessores;
    
    String Usuario;
   
    /**
     * Creates new form JFDiretor
     */
    public JFDiretor(String Usuario) {
        initComponents();
        this.Usuario = Usuario;
    }
    
    public JFDiretor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGerenciarProfessores = new javax.swing.JButton();
        jBGerenciarAlunos = new javax.swing.JButton();
        jBGerenciarDisciplinas = new javax.swing.JButton();
        jBPalestras = new javax.swing.JButton();
        jBVisitasTecnicas = new javax.swing.JButton();
        jPanelDiretor = new javax.swing.JPanel();
        jLIconeDiretor = new javax.swing.JLabel();
        jLNomeUsuarioDiretor = new javax.swing.JLabel();
        jLBemVindo = new javax.swing.JLabel();
        jBGerenciarTurmas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Diretor");
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBGerenciarProfessores.setText("Gerenciar Professores");
        jBGerenciarProfessores.setToolTipText("");
        jBGerenciarProfessores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBGerenciarProfessores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGerenciarProfessores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGerenciarProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerenciarProfessoresActionPerformed(evt);
            }
        });

        jBGerenciarAlunos.setText("Gerenciar Alunos");
        jBGerenciarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerenciarAlunosActionPerformed(evt);
            }
        });

        jBGerenciarDisciplinas.setText("Gerenciar Disciplinas");
        jBGerenciarDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerenciarDisciplinasActionPerformed(evt);
            }
        });

        jBPalestras.setText("Palestras");

        jBVisitasTecnicas.setText("Visitas Técnicas");
        jBVisitasTecnicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisitasTecnicasActionPerformed(evt);
            }
        });

        jPanelDiretor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));

        jLIconeDiretor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIconeDiretor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetopoo/Icones/Diretor64px.png"))); // NOI18N
        jLIconeDiretor.setText("ICONE TOP");
        jLIconeDiretor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLIconeDiretor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLBemVindo.setText("Bem vindo,");

        javax.swing.GroupLayout jPanelDiretorLayout = new javax.swing.GroupLayout(jPanelDiretor);
        jPanelDiretor.setLayout(jPanelDiretorLayout);
        jPanelDiretorLayout.setHorizontalGroup(
            jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiretorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLIconeDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNomeUsuarioDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanelDiretorLayout.setVerticalGroup(
            jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiretorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLIconeDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(jPanelDiretorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelDiretorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLNomeUsuarioDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBemVindo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBGerenciarTurmas.setText("Gerenciar Turmas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addComponent(jPanelDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBPalestras, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jBVisitasTecnicas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGerenciarProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jBGerenciarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGerenciarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGerenciarTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanelDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBGerenciarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGerenciarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jBGerenciarTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBGerenciarProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBPalestras, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBVisitasTecnicas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGerenciarDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerenciarDisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGerenciarDisciplinasActionPerformed

    private void jBVisitasTecnicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisitasTecnicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVisitasTecnicasActionPerformed

    private void jBGerenciarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerenciarAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGerenciarAlunosActionPerformed

    private void jBGerenciarProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerenciarProfessoresActionPerformed
        
        jfgerenciarProfessores = new JFGerenciarProfessores(Usuario);
        dispose();
        jfgerenciarProfessores.setVisible(true);
        
    }//GEN-LAST:event_jBGerenciarProfessoresActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        jLNomeUsuarioDiretor.setText(Usuario);
        System.out.print(Usuario);
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setLocationRelativeTo(null);
        jLNomeUsuarioDiretor.setText(Usuario);
        System.out.print(Usuario);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(JFDiretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDiretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDiretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDiretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDiretor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerenciarAlunos;
    private javax.swing.JButton jBGerenciarDisciplinas;
    private javax.swing.JButton jBGerenciarProfessores;
    private javax.swing.JButton jBGerenciarTurmas;
    private javax.swing.JButton jBPalestras;
    private javax.swing.JButton jBVisitasTecnicas;
    private javax.swing.JLabel jLBemVindo;
    private javax.swing.JLabel jLIconeDiretor;
    private javax.swing.JLabel jLNomeUsuarioDiretor;
    private javax.swing.JPanel jPanelDiretor;
    // End of variables declaration//GEN-END:variables
}
