import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarTurmas {


    Scanner scanner = new Scanner(System.in);
    GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();
    GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();


    public void cadastrarTurma(String nomeTurma){

        System.out.println("\n--------------------Cadastro de Turmas--------------------");

        ArrayList<Professores> professoresTurma = cadastraListaProfessoresTurma();
        ArrayList<Alunos> alunosTurma = cadastraListaAlunosTurma();

        Turmas turma = new Turmas(nomeTurma,professoresTurma,alunosTurma);
        Turmas.ListaTurmas.add(turma);

        System.out.println("\n---------------------Turma Cadastrada---------------------");

        for (Turmas elementoTurmas : Turmas.ListaTurmas) {
            System.out.print(elementoTurmas);
        }

        System.out.println("----------------------------------------------------------\n");
        System.out.println("\nCadastro efetuado com sucesso ✔️\n");

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

            System.out.print("Deseja inserir outro professor na turma (s/n): ");
            auxiliar_alunos = scanner.nextLine();

        }while (!auxiliar_alunos.equalsIgnoreCase("n"));

        return retornoAlunosTurma;
    }









}
