import java.util.ArrayList;

public class Principal {

    public Principal(){
        EmpresaViagem empresa = new EmpresaViagem();
    }


    public static void main(String[] args){

        new Principal();

        ArrayList<Veiculo> lista = new ArrayList<>();

        Veiculo veiculo = new Barco("Titanic",50,10);
        lista.add(veiculo);

        veiculo = new Onibus("Titanic 2",25,"Sanfona");
        lista.add(veiculo);

        for (Veiculo elemento :lista) {
            System.out.println(elemento.toString());
        }

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


    }

}
