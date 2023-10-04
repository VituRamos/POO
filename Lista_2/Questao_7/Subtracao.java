public final class Subtracao implements IOperacoes{

    private Float operando1;
    private Float operando2;
    private static int instancias;


    public Subtracao(){
        instancias++;
    }

    public void setOperando1(Float operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(Float operando2) {
        this.operando2 = operando2;
    }

    public Float getResultado(){
        return operando1-operando2;
    }

    public String getNome(){
        return Subtracao.class.getSimpleName();
    }

    public int getQuantidade(){
        return instancias;
    }

}
