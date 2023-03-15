import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estacionamento {

    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");

    //variaveis de instancia
    public String tipoVeiculo;
    public String placa;
    public String entrada;
    public String saida;
    public Float valor;

    //construtor padrao(nao recebe prametros
    public Estacionamento() {

        this.tipoVeiculo = " ";
        this.placa = " ";
        this.entrada = " ";
        this.saida = " ";
        this.valor = 0f;

    }

    //Metodos

    //tipo Veiculo
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

    //entrada
    public String getEntrada(){
        return this.entrada;
    }
    public void setEntrada(String entrada){
        this.entrada = entrada;
    }

    //saida
    public String getSaida(){
        return this.saida;
    }
    public void setSaida(String saida){
        this.saida = saida;
    }

    //valor
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
        System.out.println("Nova entrada: " + formatar.format(newEntrada));

        Date newSaida = formatar.parse(saida);
        System.out.println("Nova saida: " + formatar.format(newSaida));

        int dif = (int) ((newSaida.getTime() - newEntrada.getTime())/60000);
        System.out.println("Diferenca: " + dif);

        if (dif>0 & dif<30){
            this.setValor(0f);

        } else if (dif>=30 & dif<60) {
            this.setValor(10f);

        } else{
            this.setValor(20f);

        }//If

        System.out.println("Valor: " + getValor());

    }//Insere

    @Override //passar por cima do comportamento padrao do metodo abaixo
    public String toString() {

        return "Tipo do veiculo: " + this.getTipoVeiculo() + "\n" +
                "Placa: " + this.getPlaca() + "\n" +
                "Horario de entrada: " + this.getEntrada() + "\n" +
                "Horario de saida: " + this.getSaida() + "\n" +
                "Valor a ser pago: " + this.getValor() + "\n";

    }//toString

}
