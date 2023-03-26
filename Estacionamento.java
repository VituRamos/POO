import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estacionamento {

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");

    public String tipoVeiculo;
    public String placa;
    public String entrada;
    public String saida;
    public Float valor;

    public Estacionamento() {

        this.tipoVeiculo = " ";
        this.placa = " ";
        this.entrada = " ";
        this.saida = " ";
        this.valor = 0f;

    }

    public String getTipoVeiculo(){
        return this.tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo){
        this.tipoVeiculo = tipoVeiculo;
    }

    //placa
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getEntrada(){
        return this.entrada;
    }
    public void setEntrada(String entrada){
        this.entrada = entrada;
    }

    public String getSaida(){
        return this.saida;
    }
    public void setSaida(String saida){
        this.saida = saida;
    }

    public Float getValor(){
        return this.valor;
    }
    public void setValor(Float valor){
        this.valor = valor;
    }

    public void insere() throws ParseException {

        System.out.print("Digite o tipo do veiculo: ");
        setTipoVeiculo(scanner.nextLine());

        System.out.print("Digite a placa veiculo: ");
        setPlaca(scanner.nextLine());

        System.out.print("Digite o horario de entrada do veiculo: ");
        setEntrada(scanner.nextLine());

        System.out.print("Digite o horario de saida do veiculo: ");
        setSaida(scanner.nextLine());

        Date newEntrada = formatar.parse(entrada);

        Date newSaida = formatar.parse(saida);

        int dif = (int) ((newSaida.getTime() - newEntrada.getTime())/60000);

        if (dif>0 && dif<30){
            this.setValor(0f);

        }else if (dif>=30 && dif<60) {
            this.setValor(10f);

        }else {
            this.setValor(20f);

        }

    }

    @Override
    public String toString() {

        return "\nTipo do veiculo: " + this.getTipoVeiculo() + "\n" +
                "Placa: " + this.getPlaca() + "\n" +
                "Horario de entrada: " + this.getEntrada() + "\n" +
                "Horario de saida: " + this.getSaida() + "\n" +
                "Valor a ser pago: R$" + this.getValor() + "\n";

    }

}
