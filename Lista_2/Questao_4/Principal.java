import java.util.ArrayList;

public class Principal {

    public Principal(){
        EmpresaViagem empresa = new EmpresaViagem();
    }


    public static void main(String[] args){

        new Principal();

        //////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<Veiculo> lista = new ArrayList<>();

        Veiculo veiculo = new Barco("Titanic",50,10);
        lista.add(veiculo);

        veiculo = new Onibus("Titanic 2",25,"Sanfona");
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

        /////////////////////////////////////////////////////////////////////////////////////////////

    }

}
