public class GerenciarProfessores{


    //Cadastrar
    public void cadastrarProfessor(String nomeProfessor, Disciplinas disciplinaProfessor, String CPF ){     //Fazer metodo que retorne as Disciplinas cadastradas para
        Professores Professor = new Professores(nomeProfessor,disciplinaProfessor,CPF);                     //que uma seja selecionada ao cadastrar Professor
        Professor.ListaProfessores.add(Professor);
    }

    //Consultar
    public String consultarProfessores(Professores Professor){

        Professores retornoProfessor = new Professores("",null,"");

        for (Professores elementoDisciplinas: Professor.ListaProfessores) {
            if (elementoDisciplinas.equals(Professor)){
                retornoProfessor = elementoDisciplinas;
            }
        }
        return retornoProfessor.toString();
    }

}
