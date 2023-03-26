public class Padaria {

    Cozinha cozinha = new Cozinha();

        public String nome;
        public String dono;
        public String endereco;
        public Float vendasMensais;
        public int qtdeMaxPaes;
        public int qtdeFuncionarios;

        public Padaria() {

            this.nome = " ";
            this.dono = " ";
            this.endereco = " ";
            this.vendasMensais = 0f;
            this.qtdeMaxPaes = 0;
            this.qtdeFuncionarios = 0;
            this.cozinha.tiposRefeicao = 0;
            this.cozinha.qtdePanelas = 0;
        }

        public Padaria(String nome, String dono, String endereco, Float vendasMensais, int qtdeMaxPaes, int qtdeFuncionarios, Cozinha cozinha) {

            this.nome = nome;
            this.dono = dono;
            this.endereco = endereco;
            this.vendasMensais = vendasMensais;
            this.qtdeMaxPaes = qtdeMaxPaes;
            this.qtdeFuncionarios = qtdeFuncionarios;
            this.cozinha.tiposRefeicao = cozinha.tiposRefeicao;
            this.cozinha.qtdePanelas = cozinha.qtdePanelas;
        }

        public Padaria(String nome, String dono, String endereco, Float vendasMensais, int qtdeFuncionarios) {

            this.nome = nome;
            this.dono = dono;
            this.endereco = endereco;
            this.vendasMensais = vendasMensais;
            this.qtdeFuncionarios = qtdeFuncionarios;

        }

        public String getNome() {
            return this.nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDono() {
            return this.dono;
        }
        public void setDono(String dono) {
            this.dono = dono;
        }

        public String getEndereco() {
            return this.endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Float getVendasMensais() {
            return this.vendasMensais;
        }
        public void setVendasMensais(Float vendasMensais) {
            this.vendasMensais = vendasMensais;
        }

        public int getQtdeMaxPaes() {
            return this.qtdeMaxPaes;
        }
        public void setQtdeMaxPaes(int qtdeMaxPaes) {
            this.qtdeMaxPaes = qtdeMaxPaes;
        }

        public int getQtdeFuncionarios() {
            return this.qtdeFuncionarios;
        }
        public void setQtdeFuncionarios(int qtdeFuncionarios) {
            this.qtdeFuncionarios = qtdeFuncionarios;
        }

        public int getFuncionarioSort() {
            return (int) (Math.random() * this.qtdeFuncionarios);
        }

    @Override
        public String toString() {

            return "\nNome: " + this.getNome() + "\n" +
                    "Dono: " + this.getDono() + "\n" +
                    "Endereco: " + this.getEndereco() + "\n" +
                    "Vendas Mensais: " + this.getVendasMensais() + "\n" +
                    "Qtde Maxima Paes: " + this.getQtdeMaxPaes() + "\n" +
                    "Qtde de Funcionarios: " + this.getQtdeFuncionarios() + "\n" +
                    "Tipos de Refeicao: " + this.cozinha.getTiposRefeicao() + "\n" +
                    "Qtde de Panelas: " + this.cozinha.getQtdePanelas() + "\n";

        }

}
