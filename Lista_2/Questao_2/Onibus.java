import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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

/*
    public String emitirPassagem(Onibus veiculo) {
        return "Taxa = R$5,00" + "\n";
    }

    public String calcularPagamento(Float distancia) {
        return "R$" + ((50*distancia)+5) + "\n";
    }

    public Double calcularTempoViagem(Float x1,Float x2, Float y1, Float y2) {
        return (50 * sqrt(pow((x2-x1),2) + pow((y2-y1),2)));
    }
*/

    public String toString(){
        return "Nome: " + getNome() + "\n" +
                "Quantidade de passageiros: " + getQtdePassageiros() + "\n" +
                "Tipo: " + getTipo() + "\n";
    }
}
