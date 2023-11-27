package projetopoo;

import java.util.ArrayList;
import java.util.Iterator;

public class GerenciarAlunos {



    public void cadastrarAluno(String nomeAluno, String RA){

        System.out.println("\n---------------Cadastro de Alunos---------------");

        Alunos aluno = new Alunos(nomeAluno,RA);
        Alunos.ListaAlunos.add(aluno);

        System.out.println("\nNome do Aluno que sera cadastrado: " + nomeAluno);
        System.out.println("RA do Aluno que sera cadastrado: " + RA);

        System.out.println("-------------------------------------------------\n");
        System.out.println("\nCadastro efetuado com sucesso ✔️\n");

    }

    //Consultar
    public Alunos consultarAlunos(String RA){

        Alunos retornoAlunos = new Alunos("","");
        Alunos nulo = new Alunos("","");
        Boolean cont = false;

        for (Alunos elementoAlunos: Alunos.ListaAlunos) {
            if (elementoAlunos.getRA().equalsIgnoreCase(RA)){
                retornoAlunos = elementoAlunos;
                cont = true;
            }
        }
        if (cont.equals(false)){

            System.out.println("\n🔴 O aluno pesquisado nao foi encontrado no sistema, cadastre o novo aluno desejada.\n");
            return nulo;

        }else {
            System.out.println(retornoAlunos);
            return retornoAlunos;
        }
    }

    //Exibir
    public ArrayList<Alunos> exibirAlunos(){

        System.out.println("\n----------Alunos cadastrados no sistema----------");

        for (Alunos elementoAluno: Alunos.ListaAlunos) {
            System.out.println(elementoAluno);
        }

        System.out.println("\n--------------------------------------------------\n");

        return Alunos.ListaAlunos;
    }

    //Remover
    public ArrayList<Alunos> removerAluno(String RA){

        Iterator<Alunos> iterator = Alunos.ListaAlunos.iterator();
        
        while (iterator.hasNext()) {
            Alunos elementoAluno = iterator.next();

            if (elementoAluno.getRA().equalsIgnoreCase(RA)) {
                iterator.remove();
            }
        }

        System.out.println("\nRemocao efetuada com sucesso ✔️\n");

        return Alunos.ListaAlunos;
    }


}
