import java.util.ArrayList;

public class GerenciarDisciplinas {

    //Cadastrar
    public void cadastrarDisciplina(String nomeDisciplina){

        Disciplinas disciplina = new Disciplinas(nomeDisciplina);
        Disciplinas.ListaDisciplinas.add(disciplina);

    }

    //Consultar
    public Disciplinas consultarDisciplinas(String nomeDisciplina){

        Disciplinas retornoDisciplinas = new Disciplinas("");
        Disciplinas nulo = new Disciplinas("Vazio");
        Boolean cont = false;

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            if (elementoDisciplinas.getNomeDisciplina().equals(nomeDisciplina)){
                System.out.println(elementoDisciplinas);
                retornoDisciplinas = elementoDisciplinas;
                cont = true;
            }
        }
        if (cont.equals(false)){

            System.out.println("Materia ainda nao cadastrada no sistema, cadastre a nova materia desejada\n");
            return nulo;

        }else {
            return retornoDisciplinas;
        }
    }

    //Exibir
    public ArrayList<Disciplinas> exibirDisciplinas(){

        System.out.println("----------Materias cadastradas no sistema----------\n");

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            System.out.println(elementoDisciplinas);
        }

        System.out.println("\n---------------------------------------------------");

        return Disciplinas.ListaDisciplinas;
    }

    //Exibir
    public ArrayList<Disciplinas> removerDisciplinas(String nomeDisciplina){

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            if (elementoDisciplinas.getNomeDisciplina().equalsIgnoreCase(nomeDisciplina)){
                Disciplinas.ListaDisciplinas.remove(elementoDisciplinas);
            }
        }
        return Disciplinas.ListaDisciplinas;
    }


}
