package projetopoo;

import java.util.ArrayList;

public class Professores{

    //Variaveis
    private String nomeProfessor;
    private Disciplinas disciplinaProfessor;
    private String CPF;
    static ArrayList<Professores> ListaProfessores = new ArrayList<>();

    public Professores(String nomeProfessor,Disciplinas disciplinaProfessor, String CPF){
        setNomeProfessor(nomeProfessor);
        setDisciplinaProfessor(disciplinaProfessor);
        setCPF(CPF);
    }
    
    public Professores(){

    }

    //Getters e Setters
    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }
    public String getNomeProfessor(){
        return nomeProfessor;
    }
    public void setDisciplinaProfessor(Disciplinas disciplinaProfessor){
        this.disciplinaProfessor = disciplinaProfessor;
    }
    public Disciplinas getDisciplinaProfessor(){
        return disciplinaProfessor;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCPF(){
        return CPF;
    }

    public String toString(){
        return "\nNome: " + this.getNomeProfessor() +"\n"+ this.getDisciplinaProfessor()  +"\n"+ "CPF: " + this.getCPF();
    }
    
    public String toStringNome(){
        return "Nome: " + this.getNomeProfessor();
    }
        
    public String toStringDisciplina(){
        return ""+this.getDisciplinaProfessor();
    }
            
    public String toStringCPF(){
        return "CPF: " + this.getCPF();
    }

}
