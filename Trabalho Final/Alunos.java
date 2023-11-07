public class Alunos {

    private String nomeAluno;
    private String RA;

    public Alunos(String nomeAluno, String RA){
        setNomeAluno(nomeAluno);
        setRA(RA);
    }

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
}
