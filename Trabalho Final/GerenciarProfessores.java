import java.util.ArrayList;
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

        Disciplinas disciplinaProfessor = gerenciarDisciplinas.consultarDisciplinas(nomeMateria);
        
        if(disciplinaProfessor.getNomeDisciplina().equalsIgnoreCase("")) {
        	System.out.println("-------------------------------------------------\n");
        	
        }else {

            Professores Professor = new Professores(nomeProfessor, disciplinaProfessor,CPF);
            Professores.ListaProfessores.add(Professor);

            System.out.println("-------------------------------------------------\n");
            System.out.println("\nCadastro efetuado com sucesso ✔️\n");

        }

    }

    //Consultar
    public Professores consultarProfessores(String CPF){

        Professores retornoProfessores = new Professores("",null,"");
        Professores nulo = new Professores("",null,"");
        Boolean cont = false;

        for (Professores elementoProfessores: Professores.ListaProfessores) {
            if (elementoProfessores.getCPF().equalsIgnoreCase(CPF)){
                retornoProfessores = elementoProfessores;
                cont = true;
            }
        }
        if (cont.equals(false)){

            System.out.println("\n🔴 O professor pesquisado nao foi encontrado no sistema, cadastre o novo professor desejado.\n");
            return nulo;

        }else {
            System.out.println(retornoProfessores);
            return retornoProfessores;
        }
    }

    //Exibir
    public ArrayList<Professores> exibirProfessores(){

        System.out.println("\n----------Professores cadastrados no sistema----------");

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            System.out.println(elementoProfessor);
        }

        System.out.println("\n------------------------------------------------------\n");

        return Professores.ListaProfessores;
    }

    //Remover
    public ArrayList<Professores> removerProfessor(String CPF){

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            if (elementoProfessor.getCPF().equalsIgnoreCase(CPF)){
                Professores.ListaProfessores.remove(elementoProfessor);
            }
        }
        return Professores.ListaProfessores;
    }

}
