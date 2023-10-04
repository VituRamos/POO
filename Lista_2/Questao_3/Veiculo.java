import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class Veiculo implements IVeiculo{

    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }
    public Veiculo() {
    }

    public String getNome(){
        return nome;
    }

    public abstract String emitirPassagem();
    public  abstract String calcularPagamento(Float distancia);
    public  abstract Double calcularTempoViagem(Float x1,Float x2, Float y1, Float y2);
    public abstract Float calcularCombustivel(Float distancia);
    public abstract Float calcularEmissaoCO2(Float distancia);



}
