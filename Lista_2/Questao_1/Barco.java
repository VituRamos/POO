public class Barco extends Veiculo{

    private int qtdeCadeiras;
    private int qtdeMesas;

    public Barco(String nome, int qtdeCadeiras, int qtdeMesas){
        super(nome);
        this.setQtdeCadeiras(qtdeCadeiras);
        this.setQtdeMesas(qtdeMesas);
    }
    public Barco(){
        super();
    }

    public int getQtdeCadeiras() {
        return qtdeCadeiras;
    }

    public void setQtdeCadeiras(int qtdeCadeiras) {
        this.qtdeCadeiras = qtdeCadeiras;
    }

    public int getQtdeMesas() {
        return qtdeMesas;
    }

    public void setQtdeMesas(int qtdeMesas) {
        this.qtdeMesas = qtdeMesas;
    }

    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Quantidade de cadeiras: " + getQtdeCadeiras() + "\n" +
                "Quantidade de mesas: " + getQtdeMesas() + "\n";
    }

}
