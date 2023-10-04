import java.util.ArrayList;

public class Principal {

    public Principal(){

        Bonificado b1 = new Bonificado("Joao","Silva", 1300f, 250f, 325f);
        Comissionado c1 = new Comissionado("Maria","Soares", 1300f, 325f);
        Horista h1 = new Horista("Jomar","Silva Soares", 1300f, 25);

    }

    public static void main(String[] args){

        new Principal();

        ArrayList<Empregado> lista = new ArrayList<>();

        Empregado funcionario = new Bonificado("Joao","Silva", 1300f, 250f, 325f);
        lista.add(funcionario);

        funcionario = new Comissionado("Maria","Soares", 1300f, 325f);
        lista.add(funcionario);

        funcionario = new Horista("Jomar","Silva Soares", 1300f, 25);
        lista.add(funcionario);

        for (Empregado emp: lista) {
            System.out.println(emp.imprimir());
            System.out.println("Ganhos: " + emp.ganhos() + "\n");
        }

    }

}
