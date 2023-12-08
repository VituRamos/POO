package projetopoo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GerenciarTurmas {


    Scanner scanner = new Scanner(System.in);
    GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();
    GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();


    public void cadastrarTurma(String nomeTurma,ArrayList<Professores> ListaProfessoresTurma, ArrayList<Alunos> ListaAlunosTurma){
        
        for (Turmas elementoTurma: Turmas.ListaTurmas) {
            if (elementoTurma.getNomeTurma().equals(nomeTurma)){
                JOptionPane.showMessageDialog(null, "A turma ja esta cadastrada no sistema.", "Cadastro de Login", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Turmas turma = new Turmas(nomeTurma,ListaProfessoresTurma,ListaAlunosTurma);
        Turmas.ListaTurmas.add(turma);
        JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso no sistema!.", "Cadastro de Login", JOptionPane.INFORMATION_MESSAGE);
    }

    public ArrayList<Professores> cadastraListaProfessoresTurma(){

        ArrayList<Professores> retornoProfessoresTurma = new ArrayList<>();
        String auxiliar_professor = "";

        //Fazer loop para adicionar varios professores na lista

        do {
            System.out.println("\n--------------Cadastro de Turmas (Professores)--------------");

            System.out.print("Digite o cpf do professor que sera cadastrado em turma: ");
            String cpfProfessor = scanner.nextLine();

            Professores professorTurma = gerenciarProfessores.consultarProfessores(cpfProfessor);

            if(professorTurma.getCPF().equalsIgnoreCase("")) {
                System.out.println("-------------------------------------------------\n");

            }else {

                retornoProfessoresTurma.add(professorTurma);

                System.out.println("-------------------------------------------------\n");
                System.out.println("\nProfessor inserido com sucesso ✔️\n");

            }

            System.out.print("Deseja inserir outro professor na turma (s/n): ");
            auxiliar_professor = scanner.nextLine();

        }while (!auxiliar_professor.equalsIgnoreCase("n"));

        return retornoProfessoresTurma;
    }

    public ArrayList<Alunos> cadastraListaAlunosTurma(){

        ArrayList<Alunos> retornoAlunosTurma = new ArrayList<>();
        String auxiliar_alunos = "";

        do {

        //Fazer loop para adicionar varios Alunos na lista
        System.out.println("\n--------------Cadastro de Turmas (Alunos)--------------");

        System.out.print("Digite o RA do aluno que sera cadastrado em turma: ");
        String RAAluno = scanner.nextLine();

        Alunos alunosTurma = gerenciarAlunos.consultarAlunos(RAAluno);

        if(alunosTurma.getRA().equalsIgnoreCase("")) {
            System.out.println("-------------------------------------------------\n");

        }else {

            retornoAlunosTurma.add(alunosTurma);

            System.out.println("-------------------------------------------------\n");
            System.out.println("\nAluno inserido com sucesso ✔️\n");

        }

            System.out.print("Deseja inserir outro aluno na turma (s/n): ");
            auxiliar_alunos = scanner.nextLine();

        }while (!auxiliar_alunos.equalsIgnoreCase("n"));

        return retornoAlunosTurma;
    }

    //Exibir
    public ArrayList<Turmas> exibirTurmas(){

        System.out.println("\n----------Turmas cadastradas no sistema----------");

        for (Turmas elementoTurmas: Turmas.ListaTurmas) {
            System.out.println(elementoTurmas);
        }

        System.out.println("\n--------------------------------------------------\n");

        return Turmas.ListaTurmas;
    }

    //Remover -> Adicionar Iterator
    public ArrayList<Turmas> removerTurma(String nomeTurma){

        ArrayList<Turmas> turmaRemover = new ArrayList<>();

        for (Turmas elementoTurma: Turmas.ListaTurmas) {
            if (elementoTurma.getNomeTurma().equalsIgnoreCase(nomeTurma)){
                turmaRemover.add(elementoTurma);
            }
        }

        Turmas.ListaTurmas.removeAll(turmaRemover);

        System.out.println("\nRemocao efetuada com sucesso ✔️\n");

        return Turmas.ListaTurmas;
    }






}
