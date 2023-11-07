import java.util.ArrayList;

public class GerenciarProfessores{


    //Cadastrar
    public void cadastrarProfessor(String nomeProfessor, Disciplinas disciplinaProfessor, String CPF ){     //Fazer metodo que retorne as Disciplinas cadastradas para
        Professores Professor = new Professores(nomeProfessor,disciplinaProfessor,CPF);                     //que uma seja selecionada ao cadastrar Professor
        Professores.ListaProfessores.add(Professor);
    }

    //Consultar
    public ArrayList<Professores> consultarProfessores(String CPF){

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            if (elementoProfessor.getCPF().equals(CPF)){
                System.out.println(elementoProfessor);
            }
        }
        return Professores.ListaProfessores;
    }

    //Exibir
    public ArrayList<Professores> exibirProfessores(){

        for (Professores elementoProfessor: Professores.ListaProfessores) {
            System.out.println(elementoProfessor);
        }
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
