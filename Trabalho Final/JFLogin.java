/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetopoo;

/**
 *
 * @author victo
 */
public class JFLogin extends javax.swing.JFrame {

    Diretor diretor = new Diretor("diretor","senha");
    Alunos alunos = new Alunos();
    Professores professores = new Professores();
    
    JFDiretor jfDiretor;
    JFProfessor jfprofessor;
    JFAluno jfaluno;
    
    private String inputUsuario;
    private String inputSenha;
    
    /**
     * Creates new form JFLogin
     */
    public JFLogin() {
        initComponents();
    }

    public String getInputUsuario(){
        return inputUsuario;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jPSenha = new javax.swing.JPasswordField();
        jLCadastrarSenha = new javax.swing.JLabel();
        jBLogin = new javax.swing.JButton();
        jLBemvindo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLIcone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLUsuario.setText("Usuario");

        jLSenha.setText("Senha");

        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });

        jLCadastrarSenha.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLCadastrarSenha.setText("Cadastrar senha");

        jBLogin.setText("Login");
        jBLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLoginMouseClicked(evt);
            }
        });
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jLBemvindo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLBemvindo.setText("Bem vindo");

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLIcone.setText("ICONE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLIcone)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jBLogin))
                    .addComponent(jLBemvindo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLUsuario)
                            .addGap(179, 179, 179))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLCadastrarSenha))
                            .addComponent(jPSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLBemvindo)
                .addGap(31, 31, 31)
                .addComponent(jLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jLCadastrarSenha))
                .addGap(2, 2, 2)
                .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jBLogin)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        
        inputUsuario = jTUsuario.getText();
        inputSenha = new String(jPSenha.getPassword());
        
        System.out.println("Usuario: " + inputUsuario);
        System.out.println("Senha: " + inputSenha);
        
        if (inputUsuario.equals(diretor.getLogin()) && inputSenha.equals(diretor.getSenha())){
            dispose();
            JFDiretor jfdiretor = new JFDiretor(inputUsuario);
            jfdiretor.setVisible(true);
        }
        
        for (Alunos elementoAlunos: Alunos.ListaAlunos){
            if(elementoAlunos.getRA().equals(inputUsuario)){
                JFAluno jfaluno = new JFAluno(inputUsuario);
                dispose();
                jfaluno.setVisible(true);
            }
        }
        
        for (Professores elementoProfessores: Professores.ListaProfessores){
            if(elementoProfessores.getCPF().equals(inputUsuario)){
                JFProfessor jfprofessor = new JFProfessor(inputUsuario);
                dispose();
                jfprofessor.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jBLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLoginMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLBemvindo;
    private javax.swing.JLabel jLCadastrarSenha;
    private javax.swing.JLabel jLIcone;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}