package projetopoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

    //Variaveis
    private Alunos aluno;
    private Float nota;
    private Professores professor;
    static ArrayList<Notas> ListaNotas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();
    GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

    //Construtor
    public Notas(){}
    public Notas(Alunos aluno, Float nota, Professores professor){
        this.aluno = aluno;
        this.nota = nota;
        this.professor = professor;
    }


    //Getters e Setters
    public String getProfessorNome(){
        return this.professor.getNomeProfessor();
    }
    public String getProfessorDisciplina(){
       return this.professor.getDisciplinaProfessor();
    }


    public Float getNota(){
        return this.nota;
    }
    public Alunos getAluno(){
        return this.aluno;
    }
    public String getAlunoNome(){
        return this.aluno.getNomeAluno();
    }
    public String getAlunoRA(){
        return this.aluno.getRA();
    }


    //Cadastrar
    public void cadastrarNotas(String CPF, String RA, Float Nota){

        //System.out.println("-------------------Cadastro de Notas-------------------\n");

        //String raAluno = "";
        //Float nota = null;

        //System.out.print("Digite o RA do aluno: ");
        //raAluno = scanner.next();

        //System.out.print("Digite a nota do aluno: ");
        //nota = Float.valueOf(scanner.next());

        Alunos retornoAluno = gerenciarAlunos.consultarAlunos(RA);
        Professores retornoProfessor = gerenciarProfessores.consultarProfessores(CPF);

        if(retornoAluno.getRA().equalsIgnoreCase("")) {
            System.out.println("-------------------------------------------------\n");

        }else{
            Notas notas = new Notas(retornoAluno, Nota, retornoProfessor);
            ListaNotas.add(notas);

            System.out.println("-------------------------------------------------\n");
            System.out.println("\nNota inserida com sucesso ✔️\n");
        }


    }


    //Consultar
    public ArrayList<Notas> consultarNotas(String CPF) {

        ArrayList<Notas> ListaRetornoNotas = new ArrayList<>();
        String retornoDisciplina="";

        for (Notas elementoNotas : ListaNotas) {
            if (elementoNotas.professor.getCPF().equals(CPF)) {
                ListaRetornoNotas.add(elementoNotas);
                retornoDisciplina = elementoNotas.getProfessorDisciplina();
            }
        }

        System.out.println(retornoDisciplina);

        for (Notas elementoRetornoNotas: ListaRetornoNotas) {
            System.out.println(elementoRetornoNotas.getNota());
        }

        return ListaRetornoNotas;
    }





}
