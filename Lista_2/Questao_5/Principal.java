import java.util.ArrayList;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Principal {

    public interface IVeiculo {

        public  String emitirPassagem();
        public  String calcularPagamento(Float distancia);
        public  Double calcularTempoViagem(Float x1,Float x2, Float y1, Float y2);

    }

    //////////////////////////////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////////////////////////////

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


        public String emitirPassagem() {
            return "Taxa = R$5,00";
        }

        public String calcularPagamento(Float distancia) {
            return "R$" + ((50*distancia)+5);
        }

        public Double calcularTempoViagem(Float x1,Float x2, Float y1, Float y2) {
            return (50 * sqrt(pow((x2-x1),2) + pow((y2-y1),2)));
        }

        public Float calcularCombustivel(Float distancia) {
            return (distancia/15f)*6f;
        }

        public Float calcularEmissaoCO2(Float distancia) {
            return 2.31f * (distancia/15f)*6f;
        }


        public String toString(){
            return "Nome: " + getNome() + "\n" +
                    "Quantidade de passageiros: " + getQtdePassageiros() + "\n" +
                    "Tipo: " + getTipo() + "\n";
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public class EmpresaViagem {

        private String nome;
        private String proprietario;
        private String endereco;
        private Float vendasMensais;
        private int qtdeMaxPassagens;
        private Onibus onibus;
        private Barco barco;

        public EmpresaViagem(String nome, String proprietario, String endereco, Float vendasMensais,
                             int qtdeMaxPassagens){
            this.setNome(nome);
            this.setProprietario(proprietario);
            this.setEndereco(endereco);
            this.setVendasMensais(vendasMensais);
            this.setQtdeMaxPassagens(qtdeMaxPassagens);

            Onibus onibus = new Onibus();
            Barco barco = new Barco();

        }

        public EmpresaViagem(){
            Onibus onibus = new Onibus();
            Barco barco = new Barco();
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getProprietario() {
            return proprietario;
        }

        public void setProprietario(String proprietario) {
            this.proprietario = proprietario;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Float getVendasMensais() {
            return vendasMensais;
        }

        public void setVendasMensais(Float vendasMensais) {
            this.vendasMensais = vendasMensais;
        }

        public int getQtdeMaxPassagens() {
            return qtdeMaxPassagens;
        }

        public void setQtdeMaxPassagens(int qtdeMaxPassagens) {
            this.qtdeMaxPassagens = qtdeMaxPassagens;
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public interface IMoeda {

        public Float formaPagamento(Float pagamento);

    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public class BitCoin implements IMoeda{

        public Float formaPagamento(Float pagamento) {
            return pagamento*141552.67f;
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public class Euro implements IMoeda{

        public Float formaPagamento(Float pagamento) {
            return pagamento*5.40f;
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public class Real implements IMoeda{

        public Float formaPagamento(Float pagamento) {
            return pagamento;
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public Principal(){

        EmpresaViagem empresa = new EmpresaViagem();

        //////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Veiculo> lista = new ArrayList<>();

        Veiculo veiculo = new Barco("Titanic",50,10);
        lista.add(veiculo);

        veiculo = new Onibus("Titanic 2", 25, "Sanfona");
        lista.add(veiculo);

        for (Veiculo elemento :lista) {
            System.out.println(elemento.toString());
        }

        //////////////////////////////////////////////////////////////////////////////////////////

        Veiculo veiculoteste =  new Barco();
        System.out.println("Barco");
        System.out.println(veiculoteste.emitirPassagem());
        System.out.println(veiculoteste.calcularPagamento(500f));
        System.out.println(veiculoteste.calcularTempoViagem(1f,2f,1f,2f));
        System.out.println(veiculoteste.calcularCombustivel(500f));
        System.out.println(veiculoteste.calcularEmissaoCO2(500f));

        System.out.println(" ");

        veiculoteste = new Onibus();
        System.out.println("Onibus");
        System.out.println(veiculoteste.emitirPassagem());
        System.out.println(veiculoteste.calcularPagamento(500f));
        System.out.println(veiculoteste.calcularTempoViagem(1f,2f,1f,2f));
        System.out.println(veiculoteste.calcularCombustivel(500f));
        System.out.println(veiculoteste.calcularEmissaoCO2(500f));

        //////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<IMoeda> listaPagamentos = new ArrayList<>();

        IMoeda pagamento = new BitCoin();
        listaPagamentos.add(pagamento);

        pagamento = new Euro();
        listaPagamentos.add(pagamento);

        pagamento = new Real();
        listaPagamentos.add(pagamento);

        System.out.println(" ");
        System.out.println("Pagamentos");

        for (IMoeda elementoPagamento :listaPagamentos) {
            System.out.println(elementoPagamento.formaPagamento(1f));
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args){

        new Principal();

    }

}
