/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetopoo;

/**
 *
 * @author victo
 */
public class JFProfessor extends javax.swing.JFrame {
    
    String Usuario;
    JFNotas jfnotas;
    JFLogin jflogin = new JFLogin();
    JFQuadras jfquadras;
    
    public JFProfessor(String Usuario) {
        initComponents();
        this.Usuario = Usuario;
    }
    
    public JFProfessor() {
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

        jFrame1 = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jBNotas = new javax.swing.JButton();
        jBQuadra = new javax.swing.JButton();
        jBNotasSimulados = new javax.swing.JButton();
        jPanelProfessor = new javax.swing.JPanel();
        jLabelIconeProfessor = new javax.swing.JLabel();
        jLUsuarioProfessor = new javax.swing.JLabel();
        jLBemVindo = new javax.swing.JLabel();
        jLNomeProfessor = new javax.swing.JLabel();
        jLDisciplinaProfessor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Gerenciar Professores");

        jButton3.setText("Gerenciar Alunos");

        jButton4.setText("Gerenciar Disciplinas");

        jButton5.setText("Palestras");

        jButton6.setText("Visitas Técnicas");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton3))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton2)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton5))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton6)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(38, 38, 38)
                .addComponent(jButton5)
                .addGap(34, 34, 34)
                .addComponent(jButton6)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Professor");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetopoo/Icones/exame.png"))); // NOI18N
        jBNotas.setText("Notas");
        jBNotas.setFocusPainted(false);
        jBNotas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNotas.setIconTextGap(25);
        jBNotas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNotasActionPerformed(evt);
            }
        });

        jBQuadra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetopoo/Icones/campo-de-futebol.png"))); // NOI18N
        jBQuadra.setText("Quadra");
        jBQuadra.setFocusPainted(false);
        jBQuadra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBQuadra.setIconTextGap(25);
        jBQuadra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuadraActionPerformed(evt);
            }
        });

        jBNotasSimulados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetopoo/Icones/lista-de-controle (1).png"))); // NOI18N
        jBNotasSimulados.setText("Notas Simulados");
        jBNotasSimulados.setFocusPainted(false);
        jBNotasSimulados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNotasSimulados.setIconTextGap(25);
        jBNotasSimulados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNotasSimulados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNotasSimuladosActionPerformed(evt);
            }
        });

        jPanelProfessor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabelIconeProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconeProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetopoo/Icones/professor.png"))); // NOI18N
        jLabelIconeProfessor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelIconeProfessor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLBemVindo.setText("Bem vindo,");

        jLNomeProfessor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setText("Usuario:");

        jLabel2.setText("Disciplina:");

        javax.swing.GroupLayout jPanelProfessorLayout = new javax.swing.GroupLayout(jPanelProfessor);
        jPanelProfessor.setLayout(jPanelProfessorLayout);
        jPanelProfessorLayout.setHorizontalGroup(
            jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfessorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelIconeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBemVindo)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLUsuarioProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLNomeProfessor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLDisciplinaProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelProfessorLayout.setVerticalGroup(
            jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessorLayout.createSequentialGroup()
                .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLNomeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLUsuarioProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProfessorLayout.createSequentialGroup()
                                .addComponent(jLDisciplinaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfessorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))))
                    .addGroup(jPanelProfessorLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelIconeProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetopoo/Icones/seta-para-a-esquerda.png"))); // NOI18N
        jBSair.setFocusPainted(false);
        jBSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSair.setMaximumSize(new java.awt.Dimension(16, 16));
        jBSair.setMinimumSize(new java.awt.Dimension(16, 16));
        jBSair.setPreferredSize(new java.awt.Dimension(22, 22));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jBNotasSimulados, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jBNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBNotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBQuadra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBNotasSimulados, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNotasActionPerformed
        jfnotas = new JFNotas(Usuario);
        dispose();
        jfnotas.setVisible(true);
    }//GEN-LAST:event_jBNotasActionPerformed

    private void jBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuadraActionPerformed
        jfquadras= new JFQuadras(Usuario);
        dispose();
        jfquadras.setVisible(true);
    }//GEN-LAST:event_jBQuadraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        this.setLocationRelativeTo(null);
        for (Professores elementoProfessores: Professores.ListaProfessores){
            if(elementoProfessores.getCPF().equals(Usuario)){
                jLNomeProfessor.setText(elementoProfessores.getNomeProfessor());
                jLUsuarioProfessor.setText(elementoProfessores.getCPF());
                jLDisciplinaProfessor.setText(elementoProfessores.getDisciplinaProfessor().toString());
            }
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.setLocationRelativeTo(null);
        for (Professores elementoProfessores: Professores.ListaProfessores){
            if(elementoProfessores.getCPF().equals(Usuario)){
                jLNomeProfessor.setText(elementoProfessores.getNomeProfessor());
                jLUsuarioProfessor.setText(elementoProfessores.getCPF());
                jLDisciplinaProfessor.setText(elementoProfessores.getDisciplinaProfessor().toString());
            }
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
        jflogin.setVisible(true);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBNotasSimuladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNotasSimuladosActionPerformed
        JFSimulados jfsimulados= new JFSimulados(Usuario);
        dispose();
        jfsimulados.setVisible(true);
    }//GEN-LAST:event_jBNotasSimuladosActionPerformed

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
            java.util.logging.Logger.getLogger(JFProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBNotas;
    private javax.swing.JButton jBNotasSimulados;
    private javax.swing.JButton jBQuadra;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLBemVindo;
    private javax.swing.JLabel jLDisciplinaProfessor;
    private javax.swing.JLabel jLNomeProfessor;
    private javax.swing.JLabel jLUsuarioProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIconeProfessor;
    private javax.swing.JPanel jPanelProfessor;
    // End of variables declaration//GEN-END:variables
}
