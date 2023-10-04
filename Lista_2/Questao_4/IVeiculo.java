public interface IVeiculo {

    public  String emitirPassagem();
    public  String calcularPagamento(Float distancia);
    public  Double calcularTempoViagem(Float x1,Float x2, Float y1, Float y2);

}
