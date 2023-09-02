public class Computador {

    Data data = new Data();

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
       this.data.setDia(dia);
        this.data.setMes(mes);
        this.data.setAno(ano);
        return this;
    }






}
