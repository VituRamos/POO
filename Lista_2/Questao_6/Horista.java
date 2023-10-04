public final class Horista extends Empregado{

    private int horas;

    public Horista(String nome, String sobrenome, Float salarioBase, int horas) {
        super(nome, sobrenome, salarioBase);
        this.horas = horas;
    }

    public Float ganhos() {
        return getSalarioBase() + horas*50f;
    }

    public String imprimir() {
        return "Nome: " + getNome() + "\n" +
                "Sobrenome: " + getSobrenome() + "\n" +
                "Salario Base: " + getSalarioBase() + "\n" +
                "Taxa Comissao: " + this.horas;
    }
}
