import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstacionamentoClientes {

    public String tipoVeiculo;
    public String placa;
    public String horarioEntrada;
    public String horarioSaida;
    public int horarioTotal;
    public int preco;


    public EstacionamentoClientes(){
        this.tipoVeiculo = " ";
        this.placa = " ";
        this.horarioEntrada = "";
        this.horarioSaida = "";
        this.preco = 0;
    }


    public String getTipoVeiculo(){
        return this.tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo){
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getHorarioEntrada(){
        return this.horarioEntrada;
    }
    public void setHorarioEntrada(String horarioEntrada){
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida(){
        return this.horarioEntrada;
    }
    public void setHorarioSaida(String horarioSaida){
        this.horarioSaida = horarioSaida;
    }

    public void setHorarioTotal(int horarioTotal){
        this.horarioTotal = horarioTotal;
    }

    public void Calcula() throws ParseException {

        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
        Date newEntrada = formatar.parse(horarioEntrada);
        Date newSaida = formatar.parse(horarioSaida);

        int horarioTotal = (int) ((newSaida.getTime() - newEntrada.getTime())/60000);

        if (horarioTotal <= 30) {
            this.preco = 0;

        } else if (horarioTotal > 30 && horarioTotal <= 60) {
            this.preco = 10;

        } else {
            this.preco = 20;
        }

        System.out.println("O preco a ser pago na saida sera: " + this.preco);

    }


}



