import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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


    public String emitirPassagem() {
        return "Taxa = R$2000,00";
    }

    public String calcularPagamento(Float distancia) {
        return "R$" + ((200*distancia)+2000);
    }

    public Double calcularTempoViagem(Float x1,Float x2, Float y1, Float y2) {
        return (20 * sqrt(pow((x2-x1),2) + pow((y2-y1),2)));
    }

    public Float calcularCombustivel(Float distancia) {
        return  (distancia/50f)*12.5f;
    }

    public Float calcularEmissaoCO2(Float distancia) {
        return 2.68f * (distancia/15f)*6f;
    }


    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Quantidade de cadeiras: " + getQtdeCadeiras() + "\n" +
                "Quantidade de mesas: " + getQtdeMesas() + "\n";
    }

}
