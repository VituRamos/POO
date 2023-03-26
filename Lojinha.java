public class Lojinha extends Padaria{

    private int qtdeprodutosVendidos;
    private int tiposProdutos;

    public Lojinha(){
        super();
        this.qtdeprodutosVendidos = 0;
        this.tiposProdutos = 0;
    }

   public Lojinha(String nome, String dono, String endereco, Float vendasMensais, int qtdeFuncionarios, int produtosVendidos, int tiposProdutos){
       super(nome,dono,endereco,vendasMensais,qtdeFuncionarios);
       this.qtdeprodutosVendidos = produtosVendidos;
       this.tiposProdutos = tiposProdutos;
   }

   public int getQtdeprodutosVendidos(){
        return qtdeprodutosVendidos;
   }
   public void setQtdeprodutosVendidos(int qtdeprodutosVendidos){
        this.qtdeprodutosVendidos = qtdeprodutosVendidos;
    }

    public int getTiposProdutos(){
        return tiposProdutos;
    }
    public void setTiposProdutos(int tiposProdutos){
        this.tiposProdutos = tiposProdutos;
    }


    @Override
    public String toString() {

        return "\nNome: " + this.getNome() + "\n" +
                "Dono: " + this.getDono() + "\n" +
                "Endereco: " + this.getEndereco() + "\n" +
                "Vendas Mensais: " + this.getVendasMensais() + "\n" +
                "Qtde de Funcionarios: " + this.getQtdeFuncionarios() + "\n" +
                "Qtde de Produtos vendidos: " + this.getQtdeprodutosVendidos() + "\n" +
                "Tipos de Produtos: " + this.getTiposProdutos() + "\n";

    }

}
