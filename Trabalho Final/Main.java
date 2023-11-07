public class Main {


    public Main(){

        GerenciarDisciplinas gerenciarDisciplinas = new GerenciarDisciplinas();
        GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();

        gerenciarDisciplinas.cadastrarDisciplina("Matematica");
        gerenciarDisciplinas.cadastrarDisciplina("Portugues");
        gerenciarDisciplinas.cadastrarDisciplina("Ingles");

        gerenciarDisciplinas.exibirDisciplinas();

        gerenciarProfessores.cadastrarProfessor("Joao","45156415");
        gerenciarProfessores.cadastrarProfessor("Clodovil","484012806");
        gerenciarProfessores.exibirProfessores();

    }


    public static void main(String[] args) {

    new Main();


    }
}