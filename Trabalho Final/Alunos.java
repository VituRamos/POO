import java.util.ArrayList;

public class Alunos {

    //Variaveis
    private String nomeAluno;
    private String RA;
    static ArrayList<Alunos> ListaAlunos = new ArrayList<>();

    //Construtor
    public Alunos(String nomeAluno, String RA){
        setNomeAluno(nomeAluno);
        setRA(RA);
    }

    //Getters e Setters
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    public String getNomeAluno(){
        return this.nomeAluno;
    }
    public void setRA(String RA){
        this.RA = RA;
    }
    public String getRA(){
        return this.RA;
    }

    public String toString(){
        return "\nNome: " + this.getNomeAluno() +"\n"+ "RA: " + this.getRA();
    }


}
