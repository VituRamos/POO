import java.util.ArrayList;

public class Principal {

    public Principal(){

        IOperacoes conta = new Soma();
        System.out.println("Nome: " + conta.getNome());
        conta.setOperando1(1f);
        conta.setOperando2(2f);
        System.out.println("Resultado: " + conta.getResultado());
        System.out.println("Quantidade de instancias de soma: " + conta.getQuantidade() + "\n");

        conta = new Subtracao();
        System.out.println("Nome: " + conta.getNome());
        conta.setOperando1(1f);
        conta.setOperando2(2f);
        System.out.println("Resultado: " + conta.getResultado());
        System.out.println("Quantidade de instancias de subtracao: " + conta.getQuantidade() + "\n");

        conta = new Divisao();
        System.out.println("Nome: " + conta.getNome());
        conta.setOperando1(1f);
        conta.setOperando2(2f);
        System.out.println("Resultado: " + conta.getResultado());
        System.out.println("Quantidade de instancias de divisao: " + conta.getQuantidade() + "\n");

        conta = new Multiplicacao();
        System.out.println("Nome: " + conta.getNome());
        conta.setOperando1(1f);
        conta.setOperando2(2f);
        System.out.println("Resultado: " + conta.getResultado());
        System.out.println("Quantidade de instancias de Multiplicacao: " + conta.getQuantidade() + "\n");

        conta = new Soma();
        System.out.println("Nome: " + conta.getNome());
        conta.setOperando1(2f);
        conta.setOperando2(3f);
        System.out.println("Resultado: " + conta.getResultado());
        System.out.println("Quantidade de instancias de Soma: " + conta.getQuantidade() + "\n");


    }

    public static void main(String[] args){

        new Principal();


    }

}
