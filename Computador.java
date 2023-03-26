import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Computador {

    Data d = new Data();

    public String nome;
    public String marca;

    public Computador setNome(String nome){
        this.nome = nome;
        return this;
    }
    public String getNome(){
        return nome;
    }

    public Computador setMarca(String marca){
        this.marca = marca;
        return this;
    }
    public String getMarca(){
        return marca;
    }

    public Computador setData(int dia, int mes, int ano) {
        this.d.dia = dia;
        this.d.mes = mes;
        this.d.ano = ano;
        return this;
    }

    @Override
    public String toString() {

        return "\nNome do computador: " + this.getNome() + "\n" +
                "Marca do computador: " + this.getMarca() + "\n" +
                "Data: " + this.d.getDia() + "/" + this.d.getMes() + "/" + this.d.getAno() + "\n";

    }

}
