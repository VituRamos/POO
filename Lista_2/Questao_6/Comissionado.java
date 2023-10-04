public final class Comissionado extends Empregado{

    private Float taxaComissao;

    public Comissionado(String nome, String sobrenome, Float salarioBase, Float taxaComissao) {
        super(nome, sobrenome, salarioBase);
        this.taxaComissao = taxaComissao;
    }


    public Float ganhos() {
        return getSalarioBase() + taxaComissao;
    }

    public String imprimir() {
        return "Nome: " + getNome() + "\n" +
                "Sobrenome: " + getSobrenome() + "\n" +
                "Salario Base: " + getSalarioBase() + "\n" +
                "Taxa Comissao: " + this.taxaComissao;
    }
}
