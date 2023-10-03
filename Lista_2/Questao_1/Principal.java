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

    }

}
