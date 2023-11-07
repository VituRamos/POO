import java.util.ArrayList;

public class Professores{

    //Variaveis
    private String nomeProfessor;
    private Disciplinas disciplinaProfessor;
    private String CPF;
    ArrayList<Professores> ListaProfessores = new ArrayList<>();

    public Professores(String nomeProfessor,Disciplinas disciplinaProfessor, String CPF){
        this.nomeProfessor = nomeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
        this.CPF = CPF;
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
        return "Nome: " + getNomeProfessor() + "Disciplina: " + getDisciplinaProfessor() + "CPF: " + getCPF() + "\n";
    }

}
