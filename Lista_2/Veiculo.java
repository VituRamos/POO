public class Veiculo implements IVeiculo{

    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }
    public Veiculo() {
    }

    @Override
    public void emitirPassagem() {
    }

    @Override
    public void calcularPagamento() {
    }

    @Override
    public void calcularTempoViagem() {
    }

    public String getNome(){
        return nome;
    }

}
