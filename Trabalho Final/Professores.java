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
    public String getDisciplinaProfessor(){
        return disciplinaProfessor.getNomeDisciplina();
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCPF(){
        return CPF;
    }

}
