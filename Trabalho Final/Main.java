package projetopoo;

public class Main {


    public Main(){
        
        GerenciarDisciplinas gerenciarDisciplinas = new GerenciarDisciplinas();
        GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        GerenciarTurmas gerenciarTurmas = new GerenciarTurmas();
        Notas notas = new Notas();
        Boletim boletim = new Boletim();

        //gerenciarDisciplinas.cadastrarDisciplina("Matematica");
        //gerenciarDisciplinas.cadastrarDisciplina("Portugues");
        //gerenciarDisciplinas.cadastrarDisciplina("Ingles");
        //gerenciarDisciplinas.exibirDisciplinas();

        //gerenciarProfessores.cadastrarProfessor("Joao","46484012806","Matematica");
        //gerenciarProfessores.cadastrarProfessor("Clodovil","46484012809","Matematica");
        //gerenciarProfessores.consultarProfessores("46484012806");
        //gerenciarProfessores.exibirProfessores();

        //gerenciarAlunos.cadastrarAluno("Jaozin","a2368080");
        //gerenciarAlunos.cadastrarAluno("Clodovil Jr.","a2368081");
        //gerenciarAlunos.consultarAlunos("a2368080");
        //gerenciarAlunos.exibirAlunos();

        //gerenciarTurmas.cadastrarTurma("A1");
        //gerenciarTurmas.removerTurma("A1");
        //gerenciarTurmas.exibirTurmas();

        //notas.cadastrarNotas("46484012806");
        //notas.cadastrarNotas("46484012806");
        //notas.cadastrarNotas("46484012809");
        //notas.consultarNotas("46484012806");

        //boletim.consultarNotas("a2368080");

    }


    public static void main(String[] args) {

    Main main = new Main();

    JFLogin login = new JFLogin();
    login.setVisible(true);
    
    

    }
}