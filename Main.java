import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        Padaria padaria_A = new Padaria();
        Padaria padaria_B = new Padaria();
        Estacionamento estacionamento = new Estacionamento();
        Computador c = new Computador();
        Lojinha lojinha = new Lojinha();


        System.out.print("Digite o nome da padaria: ");
        padaria_A.setNome(scanner.next());

        System.out.print("Digite o nome do dono: ");
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

        System.out.println(padaria_A.toString());


        System.out.print("Digite o nome da padaria: ");
        padaria_B.setNome(scanner.next());

        System.out.print("Digite o nome do dono: ");
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

        System.out.println(padaria_B.toString());


        estacionamento.insere();
        System.out.print(estacionamento.toString());


        c.setNome("comp1").setMarca("Intel").setData(1,1,2001);
        System.out.println(c.toString());


        System.out.print("Digite o nome da lojinha: ");
        lojinha.setNome(scanner.next());

        System.out.print("Digite o nome do dono: ");
        lojinha.setDono(scanner.next());

        System.out.print("Digite o endereco: ");
        lojinha.setEndereco(scanner.next());

        System.out.print("Digite as vendas mensais: ");
        lojinha.setVendasMensais(scanner.nextFloat());

        System.out.print("Digite a quantidade de funcionarios: ");
        lojinha.setQtdeFuncionarios(scanner.nextInt());

        System.out.print("Digite a quantidade de produtos vendidos: ");
        lojinha.setQtdeprodutosVendidos(scanner.nextInt());

        System.out.print("Digite a quantidade dos diferentes produtos: ");
        lojinha.setTiposProdutos(scanner.nextInt());

        System.out.print(lojinha.toString());

    }
}
