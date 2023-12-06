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
    
    public String getListaAlunosTurmaString(){
        StringBuilder result = new StringBuilder();
        this.ListaAlunosTurma.forEach((t) -> {
            result.append(t.getNomeAluno())
                  .append(" ")
                  .append(t.getRA())
                  .append("\n"); // Adiciona uma quebra de linha entre os itens, se desejado
        });
        return result.toString();
    }
    
    public String getListaProfessoresTurmaString(){
        StringBuilder result = new StringBuilder();
        this.ListaProfessoresTurma.forEach((t) -> {
            result.append(t.getNomeProfessor())
                  .append(" ")
                  .append(t.getCPF())
                  .append(" ")
                  .append(t.getDisciplinaProfessor())
                  .append("\n"); // Adiciona uma quebra de linha entre os itens, se desejado
        });
        return result.toString();
    }
    
    public ArrayList<Professores> getListaProfessores(){
        return this.ListaProfessoresTurma;
    }
    
    public ArrayList<Alunos> getListaAlunos(){
        return this.ListaAlunosTurma;
    }
    



}
