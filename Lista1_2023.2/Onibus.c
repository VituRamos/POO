public class Onibus {

    private int qtdePassageiros;
    private String tipo;

    public Onibus(){
        this.qtdePassageiros = 0;
        this.tipo = "";
    }

    public Onibus(int qtdePassageiros, String tipo){
        this.qtdePassageiros = qtdePassageiros;
        this.tipo = tipo;
    }

    public int getQtdePassageiros(){
        return qtdePassageiros;
    }
    public void setQtdePassageiros(int qtdePassageiros){
        this.qtdePassageiros = qtdePassageiros;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return "Quantidade de passageiros: " + this.getQtdePassageiros() +
                "\nTipo de onibus: " + this.getTipo() + "\n";
    }

}
