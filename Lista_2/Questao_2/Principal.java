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
        System.out.println(veiculoteste.emitirPassagem((Barco) veiculoteste));
        System.out.println(veiculoteste.calcularPagamento((Barco) veiculoteste,500f));
        System.out.println(veiculoteste.calcularTempoViagem((Barco) veiculoteste,1f,2f,1f,2f));

        System.out.println(" ");

        veiculoteste = new Onibus();
        System.out.println("Onibus");
        System.out.println(veiculoteste.emitirPassagem((Onibus) veiculoteste));
        System.out.println(veiculoteste.calcularPagamento((Onibus) veiculoteste,500f));
        System.out.println(veiculoteste.calcularTempoViagem((Onibus) veiculoteste,1f,2f,1f,2f));


    }

}
