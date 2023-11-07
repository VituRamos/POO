public class Main {


    public Main(){

        GerenciarDisciplinas gerenciarDisciplinas = new GerenciarDisciplinas();
        GerenciarProfessores gerenciarProfessores = new GerenciarProfessores();

        gerenciarDisciplinas.cadastrarDisciplina("Matematica");
        gerenciarDisciplinas.cadastrarDisciplina("Portugues");
        gerenciarDisciplinas.cadastrarDisciplina("Ingles");

        Disciplinas historia = new Disciplinas("Historia");
        Disciplinas biologia = new Disciplinas("Biologia Marinha");

        gerenciarDisciplinas.exibirDisciplinas();

        gerenciarProfessores.cadastrarProfessor("Joao",historia,"45156415");
        gerenciarProfessores.consultarProfessores("45156415");

        gerenciarProfessores.cadastrarProfessor("Clodovil",biologia,"484012806");
        gerenciarProfessores.exibirProfessores();

    }


    public static void main(String[] args) {

    new Main();


    }
}