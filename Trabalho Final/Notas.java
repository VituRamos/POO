package projetopoo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
    public void setNota(Float nota){
        this.nota = nota;
    }
    public Alunos getAluno(){
        return aluno;
    }
    public String getAlunoNome(){
        return aluno.getNomeAluno();
    }
    public String getAlunoRA(){
        return aluno.getRA();
    }
    public String getProfessorCPF(){
        return professor.getCPF();
    }


    //Cadastrar
    public void cadastrarNotas(String CPF, String RA, Float Nota){

        for (Notas elementosNota : ListaNotas) {
            
            if (elementosNota.getAlunoRA().equals(RA) && elementosNota.getProfessorCPF().equals(CPF)) {
                JOptionPane.showMessageDialog(null, "Nota ja cadastrada para este aluno.", "Cadastro de Notas", JOptionPane.ERROR_MESSAGE);
                return;
            } 
        }
        
        
        Alunos retornoAluno = gerenciarAlunos.consultarAlunos(RA);
        Professores retornoProfessor = gerenciarProfessores.consultarProfessores(CPF);

        if(retornoAluno.getRA().equalsIgnoreCase("")) {
            System.out.println("-------------------------------------------------\n");

        }else{
            Notas notas = new Notas(retornoAluno, Nota, retornoProfessor);
            ListaNotas.add(notas);
            JOptionPane.showMessageDialog(null, "Nota cadastrada com sucesso!.", "Cadastro de Notas", JOptionPane.INFORMATION_MESSAGE);
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


    public void alterarNotas(String RA, float nota){
        
        for (Notas elementoNotas : ListaNotas) {
            if (elementoNotas.aluno.getRA().equals(RA)) {
                elementoNotas.setNota(nota);
            }
        }
        
    }



}
