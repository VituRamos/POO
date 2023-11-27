package projetopoo;

import java.util.ArrayList;
import java.util.Iterator;

public class GerenciarDisciplinas {

    //Cadastrar
    public void cadastrarDisciplina(String nomeDisciplina){

        Disciplinas disciplina = new Disciplinas(nomeDisciplina);
        Disciplinas.ListaDisciplinas.add(disciplina);
        
    }

    //Consultar
    public Disciplinas consultarDisciplinas(String nomeDisciplina){

        Disciplinas retornoDisciplinas = new Disciplinas("");
        Disciplinas nulo = new Disciplinas("");
        Boolean cont = false;

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            if (elementoDisciplinas.getNomeDisciplina().equalsIgnoreCase(nomeDisciplina)){
                retornoDisciplinas = elementoDisciplinas;
                cont = true;
            }
        }
        if (cont.equals(false)){

            System.out.println("\n🔴 A materia pesquisada nao foi encontrada no sistema, cadastre a nova materia desejada.\n");
            return nulo;

        }else {
            System.out.println("\n" + retornoDisciplinas);
            return retornoDisciplinas;
        }
    }

    //Exibir
    public ArrayList<Disciplinas> exibirDisciplinas(){

        System.out.println("----------Materias cadastradas no sistema----------\n");

        for (Disciplinas elementoDisciplinas: Disciplinas.ListaDisciplinas) {
            System.out.println(elementoDisciplinas);
        }

        System.out.println("\n---------------------------------------------------\n");

        return Disciplinas.ListaDisciplinas;
    }

    //Exibir
    public ArrayList<Disciplinas> removerDisciplinas(String nomeDisciplina){

        Iterator<Disciplinas> iterator = Disciplinas.ListaDisciplinas.iterator();
        
        while (iterator.hasNext()) {
            Disciplinas elementoDisciplina = iterator.next();

            if (elementoDisciplina.getNomeDisciplina().equalsIgnoreCase(nomeDisciplina)){
                iterator.remove();
            }
        }
        
        System.out.println("\nRemocao efetuada com sucesso ✔️\n");
        
        return Disciplinas.ListaDisciplinas;
    }


}
