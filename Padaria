import java.util.Scanner;

public class Padaria {

    Cozinha cozinha = new Cozinha();

        //variaveis de instancia
        public String nome; //Atributo
        public String dono; //Atributo
        public String endereco; //Atributo
        public Float vendasMensais; //Atributo
        public int qtdeMaxPaes; //Atributo
        public int qtdeFuncionarios; //Atributo

        //construtor padrao(nao recebe prametros
        public Padaria() {

            this.nome = " ";
            this.dono = " ";
            this.endereco = " ";
            this.vendasMensais = 0f;
            this.qtdeMaxPaes = 0;
            this.qtdeFuncionarios = 0;

        }

        //metodos

        //nome
        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        //dono
        public String getDono() {
            return this.dono;
        }

        public void setDono(String dono) {
            this.dono = dono;
        }

        //endereco
        public String getEndereco() {
            return this.endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        //vendasMensais
        public Float getVendasMensais() {
            return this.vendasMensais;
        }

        public void setVendasMensais(Float vendasMensais) {
            this.vendasMensais = vendasMensais;
        }

        //qtdeMaxPaes
        public int getQtdeMaxPaes() {
            return this.qtdeMaxPaes;
        }

        public void setQtdeMaxPaes(int qtdeMaxPaes) {
            this.qtdeMaxPaes = qtdeMaxPaes;
        }

        //qtdeFuncionarios
        public int getQtdeFuncionarios() {
            return this.qtdeFuncionarios;
        }

        public void setQtdeFuncionarios(int qtdeFuncionarios) {
            this.qtdeFuncionarios = qtdeFuncionarios;
        }


        @Override //passar por cima do comportamento padrao do metodo abaixo
        public String toString() {

            return "Nome: " + this.getNome() + "\n" +
                    "Dono: " + this.getDono() + "\n" +
                    "Endereco: " + this.getEndereco() + "\n" +
                    "Vendas Mensais: " + this.getVendasMensais() + "\n" +
                    "Qtde Maxima Paes: " + this.getQtdeMaxPaes() + "\n" +
                    "Qtde de Funcionarios: " + this.getQtdeFuncionarios() + "\n" +
                    "Tipos de Refeicao: " + this.cozinha.getTiposRefeicao() + "\n" +
                    "Qtde de Panelas: " + this.cozinha.getQtdePanelas() + "\n";

        }//toString

}
