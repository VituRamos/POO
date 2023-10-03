public class Onibus extends Veiculo{

    private int qtdePassageiros;
    private String tipo;

    public Onibus(String nome, int qtdePassageiros, String tipo){
        super(nome);
        this.setQtdePassageiros(qtdePassageiros);
        this.setTipo(tipo);
    }

    public Onibus(){
        super();
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Quantidade de passageiros: " + getQtdePassageiros() + "\n" +
                "Tipo: " + getTipo() + "\n";
    }
}
