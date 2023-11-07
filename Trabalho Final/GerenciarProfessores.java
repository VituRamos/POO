package src;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GerenciarProfessores{

    Scanner scanner = new Scanner(System.in);
    GerenciarDisciplinas gerenciarDisciplinas = new GerenciarDisciplinas();

    //Cadastrar
    public void cadastrarProfessor(String nomeProfessor, String CPF){

        System.out.println("\n--------------Cadastro de Professores--------------");

        System.out.println("\nNome do Professor que sera cadastrado: " + nomeProfessor);
        System.out.println("CPF do Professor que sera cadastrado: " + CPF);

        System.out.print("Digite o nome da materia que será cadastrada para o Professor: ");
        String nomeMateria = scanner.nextLine();
        
        
        Disciplinas retorno = gerenciarDisciplinas.consultarDisciplinas(nomeMateria);
        
        if(retorno.getNomeDisciplina().equalsIgnoreCase("Vazio")) {
        	System.out.println("-------------------------------------------------\n");
        	return;
        	
        }else {
        	
        	Disciplinas novaDisciplinaProfessor = gerenciarDisciplinas.consultarDisciplinas(nomeMateria);
            Professores Professor = new Professores(nomeProfessor,novaDisciplinaProfessor,CPF);
            Professores.ListaProfessores.add(Professor);

            System.out.println("-------------------------------------------------\n");
            System.out.println("\n{{{{{Cadastro efetuado com sucesso}}}}}\n");
        	
        }

    }

    //Consultar
    public ArrayList<Professores> consultarProfessores(String CPF){

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            if (elementoProfessor.getCPF().equalsIgnoreCase(CPF)){
                System.out.println(elementoProfessor);
            }
        }
        return Professores.ListaProfessores;
    }

    //Exibir
    public ArrayList<Professores> exibirProfessores(){

        System.out.println("\n----------Professores cadastrados no sistema----------");

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            System.out.println(elementoProfessor);
        }

        System.out.println("------------------------------------------------------\n");

        return Professores.ListaProfessores;
    }

    //Remover
    public ArrayList<Professores> removerProfessor(String CPF){

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            if (elementoProfessor.getCPF().equals(CPF)){
                Professores.ListaProfessores.remove(elementoProfessor);
            }
        }
        return Professores.ListaProfessores;
    }

}
