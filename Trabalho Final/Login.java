/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Login {

    
    private String Usuario;
    private String Senha;
    GerenciarProfessores gerenciarprofessores = new GerenciarProfessores();
    GerenciarAlunos gerenciaralunos = new GerenciarAlunos();
    
    static ArrayList<Login> LoginProfessores = new ArrayList<>();
    static ArrayList<Login> LoginAlunos = new ArrayList<>();
    
    public Login(String Usuario, String Senha){
        setUsuario(Usuario);
        setSenha(Senha);
    }
    
        public Login(){
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public Boolean cadastrarLogin(String Usuario,String Senha){
        
        Login novologin = new Login();
        
        Boolean confSistema = false;
        Boolean confLogin = false;
        
        for (Login elementoLogin : LoginProfessores) {
            if (elementoLogin.getUsuario().equals(Usuario)) {
                JOptionPane.showMessageDialog(null, "CPF ou RA ja cadastrado no sistema de login", "Cadastro de Login", JOptionPane.INFORMATION_MESSAGE);
                confLogin = true;
            }
        }
        
        for (Login elementoLogin : LoginAlunos) {
            if (elementoLogin.getUsuario().equals(Usuario)) {
                JOptionPane.showMessageDialog(null, "CPF ou RA ja cadastrado no sistema de login", "Cadastro de Login", JOptionPane.INFORMATION_MESSAGE);
                confLogin = true;
            }
        }
        
        
        for (Professores elementoProfessor: Professores.ListaProfessores) {
            
            if (Usuario.equals(elementoProfessor.getCPF()) && !confLogin) {
                
                novologin = new Login(Usuario,Senha);
                Login.LoginProfessores.add(novologin);
                confSistema = true;
            }
        }
        
        for (Alunos elementoAluno: Alunos.ListaAlunos) {
            
            if (Usuario.equals(elementoAluno.getRA()) && !confLogin) {
                
                novologin = new Login(Usuario,Senha);
                Login.LoginAlunos.add(novologin);
                confSistema = true;
            }
        }
        
        if (!confSistema && !confLogin) {
            JOptionPane.showMessageDialog(null, "CPF ou RA nao encontrado no sistema", "Cadastro de Login", JOptionPane.INFORMATION_MESSAGE);
        }
   

        
        return confSistema;
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
