public final class Bonificado extends Assalariado{

    private Float bonificacao;

    public Bonificado(String nome, String sobrenome, Float salarioBase, Float salarioSemanal, Float bonificacao){
        super(nome,sobrenome,salarioBase,salarioSemanal);
        this.bonificacao = bonificacao;
    }

    public Float ganhos() {
        return getSalarioBase() + getSalarioSemanal() + bonificacao;
    }

    public String imprimir() {
        return "Nome: " + getNome() + "\n" +
                "Sobrenome: " + getSobrenome() + "\n" +
                "Salario Base: " + getSalarioBase() + "\n" +
                "Salario Salario Semanal: " + getSalarioSemanal() + "\n" +
                "Bonificacao: " + this.bonificacao;
    }

}
