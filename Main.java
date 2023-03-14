import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Padaria padaria_A = new Padaria();
        Padaria padaria_B = new Padaria();
        Estacionamento estacionamento = new Estacionamento();

        /*
        //set padaria A
        padaria_A.setNome("Cacetinho Morninho");
        padaria_A.setDono("Claudio");
        padaria_A.setEndereco("Rua Das Massas");
        padaria_A.setVendasMensais(1000.5f);
        padaria_A.setQtdeMaxPaes(150);
        padaria_A.setQtdeFuncionarios(25);
        padaria_A.cozinha.setTiposRefeicao(5);
        padaria_A.cozinha.setQtdePanelas(25);
        System.out.println(padaria_A);

        //set padaria B
        padaria_B.setNome("Cacetinho Quentinho");
        padaria_B.setDono("Roberval");
        padaria_B.setEndereco("Rua Das Massas");
        padaria_B.setVendasMensais(1200.5f);
        padaria_B.setQtdeMaxPaes(175);
        padaria_B.setQtdeFuncionarios(30);
        padaria_B.cozinha.setTiposRefeicao(7);
        padaria_B.cozinha.setQtdePanelas(30);
        System.out.println(padaria_B);
        */

        //set padaria A
        System.out.print("Digite o nome da padaria: ");
        padaria_A.setNome(scanner.next());

        System.out.print("Digite o nome da dono: ");
        padaria_A.setDono(scanner.next());

        System.out.print("Digite o endereco: ");
        padaria_A.setEndereco(scanner.next());

        System.out.print("Digite as vendas mensais: ");
        padaria_A.setVendasMensais(scanner.nextFloat());

        System.out.print("Digite a quantidade maxima de paes: ");
        padaria_A.setQtdeMaxPaes(scanner.nextInt());

        System.out.print("Digite a quantidade de funcionarios: ");
        padaria_A.setQtdeFuncionarios(scanner.nextInt());

        System.out.print("Digite a quantidade de tipos de refeicoes: ");
        padaria_A.cozinha.setTiposRefeicao(scanner.nextInt());

        System.out.print("Digite a quantidade de panelas: ");
        padaria_A.cozinha.setQtdePanelas(scanner.nextInt());

        System.out.print("\n");
        System.out.println(padaria_A);


        //set padaria B
        System.out.print("Digite o nome da padaria: ");
        padaria_B.setNome(scanner.next());

        System.out.print("Digite o nome da dono: ");
        padaria_B.setDono(scanner.next());

        System.out.print("Digite o endereco: ");
        padaria_B.setEndereco(scanner.next());

        System.out.print("Digite as vendas mensais: ");
        padaria_B.setVendasMensais(scanner.nextFloat());

        System.out.print("Digite a quantidade maxima de paes: ");
        padaria_B.setQtdeMaxPaes(scanner.nextInt());

        System.out.print("Digite a quantidade de funcionarios: ");
        padaria_B.setQtdeFuncionarios(scanner.nextInt());

        System.out.print("Digite a quantidade de tipos de refeicoes: ");
        padaria_B.cozinha.setTiposRefeicao(scanner.nextInt());

        System.out.print("Digite a quantidade de panelas: ");
        padaria_B.cozinha.setQtdePanelas(scanner.nextInt());

        System.out.print("\n");
        System.out.println(padaria_B);

        estacionamento.insere();

    }
}
