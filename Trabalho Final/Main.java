public class Main {


    public Main(){

        GerenciarDisciplinas gerenciarDisciplinas = new GerenciarDisciplinas();
        GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();

        gerenciarDisciplinas.cadastrarDisciplina("Matematica");
        gerenciarDisciplinas.cadastrarDisciplina("Portugues");
        gerenciarDisciplinas.cadastrarDisciplina("Ingles");

        gerenciarDisciplinas.consultarDisciplina();
        
    }


    public static void main(String[] args) {

    new Main();


    }
}