public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private Float salarioBase;

    public Empregado(String nome, String sobrenome, Float salarioBase){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioBase = salarioBase;
    }


    public  abstract Float ganhos();
    public  abstract String imprimir();


    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public Float getSalarioBase() {
        return salarioBase;
    }

}
