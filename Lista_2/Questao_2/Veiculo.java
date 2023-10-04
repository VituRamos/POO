import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Veiculo implements IVeiculo{

    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }
    public Veiculo() {
    }

    public String getNome(){
        return nome;
    }

    public String emitirPassagem(Barco veiculo) {
        return "Taxa = R$2000,00";
    }

    public String calcularPagamento(Barco veiculo,Float distancia) {
        return "R$" + ((200f*distancia)+2000f);
    }

    public Double calcularTempoViagem(Barco veiculo,Float x1,Float x2, Float y1, Float y2) {
        return (20 * sqrt(pow((x2-x1),2) + pow((y2-y1),2)));
    }

    public String emitirPassagem(Onibus veiculo) {
        return "Taxa = R$5,00";
    }

    public String calcularPagamento(Onibus veiculo,Float distancia) {
        return "R$" + ((50f*distancia)+5f);
    }

    public Double calcularTempoViagem(Onibus veiculo, Float x1,Float x2, Float y1, Float y2) {
        return (50 * sqrt(pow((x2-x1),2) + pow((y2-y1),2)));
    }

    @Override
    public String emitirPassagem() {
        return null;
    }

    @Override
    public String calcularPagamento() {
        return null;
    }

    @Override
    public Double calcularTempoViagem() {
        return null;
    }
}
