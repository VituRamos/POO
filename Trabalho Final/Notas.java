import java.util.ArrayList;

public class Notas {

    //Variaveis
    private Alunos aluno;
    private Float nota;
    private Professores professor;
    ArrayList<Notas> ListaNotas = new ArrayList<>();

    //Construtor
    public Notas(Alunos aluno, Float nota, Professores professor){
        this.aluno = aluno;
        this.nota = nota;
        this.professor = professor;
    }

    //Cadastrar
    public void cadastrarNotas(Alunos aluno, Float nota, Professores professor){

        Notas notas = new Notas(aluno, nota, professor);
        ListaNotas.add(notas);

    }

    //Consultar
    public ArrayList<Notas> consultarNotas(String RA) {

        ArrayList<Notas> ListaRetornoNotas = new ArrayList<>();

        for (Notas elementoNotas : ListaNotas) {
            if (elementoNotas.aluno.getRA().equals(RA)) {
                ListaRetornoNotas.add(elementoNotas);
            }
        }

        for (Notas elementoRetornoNotas: ListaRetornoNotas) {
            System.out.println(elementoRetornoNotas);
        }

        return ListaRetornoNotas;
    }
}
