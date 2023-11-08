public class Main {


    public Main(){

        GerenciarDisciplinas gerenciarDisciplinas = new GerenciarDisciplinas();
        GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        GerenciarTurmas gerenciarTurmas = new GerenciarTurmas();

        gerenciarDisciplinas.cadastrarDisciplina("Matematica");
        gerenciarDisciplinas.cadastrarDisciplina("Portugues");
        gerenciarDisciplinas.cadastrarDisciplina("Ingles");
        gerenciarDisciplinas.exibirDisciplinas();

        gerenciarProfessores.cadastrarProfessor("Joao","1");
        gerenciarProfessores.cadastrarProfessor("Clodovil","2");
        gerenciarProfessores.consultarProfessores("1");
        gerenciarProfessores.exibirProfessores();

        gerenciarAlunos.cadastrarAluno("Jaozin","3");
        gerenciarAlunos.cadastrarAluno("Clodovil Jr.","4");
        gerenciarAlunos.consultarAlunos("3");
        gerenciarAlunos.exibirAlunos();

        gerenciarTurmas.cadastrarTurma("A1");

    }


    public static void main(String[] args) {

    new Main();


    }
}