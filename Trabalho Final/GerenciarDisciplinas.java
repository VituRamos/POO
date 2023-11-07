import java.util.ArrayList;

public class GerenciarDisciplinas {

    //Cadastrar
    public void cadastrarDisciplina(String nomeDisciplina){

        Disciplinas disciplina = new Disciplinas(nomeDisciplina);
        Disciplinas.ListaDisciplinas.add(disciplina);

    }

    //Consultar
    public ArrayList<Disciplinas> consultarDisciplina(){

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            System.out.println(elementoDisciplinas);
        }
        return Disciplinas.ListaDisciplinas;
    }

}
