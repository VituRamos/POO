package projetopoo;

import java.util.ArrayList;

public class Turmas {

    //Variaveis
    private String nomeTurma;
    private ArrayList<Professores> ListaProfessoresTurma;
    private ArrayList<Alunos> ListaAlunosTurma;
    static ArrayList<Turmas> ListaTurmas = new ArrayList<>();


    //Construtor
    public Turmas( String nomeTurma, ArrayList<Professores> ListaProfessoresTurma, ArrayList<Alunos> ListaAlunosTurma){
        this.nomeTurma = nomeTurma;
        this.ListaProfessoresTurma = ListaProfessoresTurma;
        this.ListaAlunosTurma = ListaAlunosTurma;
    }

    //Getters e Setters
    public String getNomeTurma(){
        return this.nomeTurma;
    }
    public ArrayList<Professores> getListaProfessoresTurma(){
        return this.ListaProfessoresTurma;
    }
    public ArrayList<Alunos> getListaAlunosTurma(){
        return this.ListaAlunosTurma;
    }

    public String toString(){
        return "\nNome da turma: " + getNomeTurma() +"\n\n"+
                "Professores da turma: " + getListaProfessoresTurma().toString().replace("[", "").replace("]", "").replace(",","") +"\n\n"+
                "Alunos da turma: " + getListaAlunosTurma().toString().replace("[", "").replace("]", "").replace(",","") +"\n";
    }

}
