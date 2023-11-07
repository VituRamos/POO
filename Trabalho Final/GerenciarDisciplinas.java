import java.util.ArrayList;

public class GerenciarDisciplinas {

    //Cadastrar
    public void cadastrarDisciplina(String nomeDisciplina){

        Disciplinas disciplina = new Disciplinas(nomeDisciplina);
        Disciplinas.ListaDisciplinas.add(disciplina);

    }

    //Consultar
    public ArrayList<Disciplinas> consultarDisciplinas(String nomeDisciplina){

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            if (elementoDisciplinas.getNomeDisciplina().equals(nomeDisciplina)){
                System.out.println(elementoDisciplinas);
            }
        }
        return Disciplinas.ListaDisciplinas;
    }

    //Exibir
    public ArrayList<Disciplinas> exibirDisciplinas(){

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            System.out.println(elementoDisciplinas);
        }
        return Disciplinas.ListaDisciplinas;
    }

    //Exibir
    public ArrayList<Disciplinas> removerDisciplinas(String nomeDisciplina){

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            if (elementoDisciplinas.getNomeDisciplina().equals(nomeDisciplina)){
                Disciplinas.ListaDisciplinas.remove(elementoDisciplinas);
            }
        }
        return Disciplinas.ListaDisciplinas;
    }


}
