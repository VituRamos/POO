public class EmpresaViagem extends Onibus{

    private String nome;
    private String proprietario;
    private String endereco;
    private Float vendasMensais;
    private int qtdeMaxPassagens;
    private int qtdeFuncionarios;
    private Onibus onibus;

    public EmpresaViagem(){
        this.nome = "";
        this.proprietario = "";
        this.endereco = "";
        this.vendasMensais = 0f;
        this.qtdeMaxPassagens = 0;
        this.qtdeFuncionarios = 0;
        this.onibus = onibus;
    }

    public EmpresaViagem(String nome, String proprietario, String endereco, float vendasMensais, int
                         qtdeMaxPassagens, int qtdeFuncionarios, Onibus onibus){
        this.nome = nome;
        this.proprietario = proprietario;
        this.endereco = endereco;
        this.vendasMensais = vendasMensais;
        this.qtdeMaxPassagens = qtdeMaxPassagens;
        this.qtdeFuncionarios = qtdeFuncionarios;
        this.onibus = onibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Float getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(Float vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public int getQtdeMaxPassagens() {
        return qtdeMaxPassagens;
    }

    public void setQtdeMaxPassagens(int qtdeMaxPassagens) {
        this.qtdeMaxPassagens = qtdeMaxPassagens;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public String toString(){
        return  "\nQuantidade de Passageiros: " + this.onibus.getQtdePassageiros() +
                "\nTipo de onibus: " + this.onibus.getTipo() +
                "\nNome da empresa: " + this.getNome() +
                "\nProprietario: " + this.getProprietario() +
                "\nEndereco: " + this.getEndereco() +
                "\nVendas Mensais: " + this.getVendasMensais() +
                "\nQuantidade maxima de passagens: " + this.getQtdeMaxPassagens() +
                "\nQuantidade de funcionarios: " + this.getQtdeFuncionarios() + "\n";
    }
}
