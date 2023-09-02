import javax.sound.midi.SysexMessage;
import java.text.ParseException;
import java.util.Scanner;

public class Principal {

    private EmpresaViagem empresaViagem;

    public static void main(String[] args) throws ParseException {

        Onibus onibus = new Onibus(123,"Leito");
        EmpresaViagem empresa = new EmpresaViagem();

        EstacionamentoClientes estacionamento = new EstacionamentoClientes();

        Scanner scanner = new Scanner(System.in);
        Descobrir descobrir = new Descobrir();

        Computador c = new Computador( );
        c.setNome("comp1").setMarca("Intel").setData(1,1,2001);

        Empresa empresaCNPJ = new Empresa("Empresa","Proprietario","Rua",561f,4456,1213,onibus,"Empresa","a165165");
        System.out.println(empresaCNPJ.toString());
        System.out.println(onibus.toString());

        int escolha;


        do {
            System.out.println("\n\n------------------------------- Menu -------------------------------");
            System.out.println("-------------------- 1. Instanciar novo objeto ---------------------");
            System.out.println("-------------------- 2. Exibir variaveis do objeto -----------------");
            System.out.println("-------------------- 3. Cadastrar estacionamento -------------------");
            System.out.println("-------------------- 4. Premiar funcionario do mes -------------------");
            System.out.println("-------------------- 5. Sair do programa ---------------------------\n");

            System.out.print("Escolha uma das opcoes: ");

            escolha = scanner.nextInt();

            switch (escolha){

                case 1:
                    System.out.print("\nDigite o tipo do onibus: ");
                    onibus.setTipo(scanner.next());

                    System.out.print("Digite a quantidade de passageiros do onibus: ");
                    onibus.setQtdePassageiros(scanner.nextInt());

                    System.out.print("Digite o nome da empresa de viagem: ");
                    empresa.setNome(scanner.next());

                    System.out.print("Digite o proprietario da empresa de viagem: ");
                    empresa.setProprietario(scanner.next());

                    System.out.print("Digite o endereco empresa de viagem: ");
                    empresa.setEndereco(scanner.next());

                    System.out.print("Digite as vendas mensais da empresa de viagem: ");
                    empresa.setVendasMensais(scanner.nextFloat());

                    System.out.print("Digite a quantidade maxima de passagens da empresa de viagem: ");
                    empresa.setQtdeMaxPassagens(scanner.nextInt());

                    System.out.print("Digite a quantidade de funcionarios da empresa de viagem: ");
                    empresa.setQtdeFuncionarios(scanner.nextInt());

                    empresa.setOnibus(onibus);
                break;

                case 2:
                    System.out.print(empresa.toString());
                break;

                case 3:
                    System.out.print("\nDigite o tipo do veiculo: ");
                    estacionamento.setTipoVeiculo(scanner.next());

                    System.out.print("Digite a placa do veiculo: ");
                    estacionamento.setPlaca(scanner.next());

                    System.out.print("Digite o horario de entrada do veiculo: ");
                    estacionamento.setHorarioEntrada(scanner.next());

                    System.out.print("Digite o horario de saida veiculo: ");
                    estacionamento.setHorarioSaida(scanner.next());

                    estacionamento.Calcula();
                break;

                case 4:
                    System.out.print("Funcionario sorteado: " + descobrir.getAleatorio(empresa)) ;
                break;

                case 5:
                    System.out.print("\nSaindo do programa...");
                break;


                default:
                    System.out.print("\nOpcao invalida. Digite novamente a opcao escolhida. ");
            }

        } while (escolha !=5);

    scanner.close();

    }
}
