public class Empresa extends EmpresaViagem{

    private String nomeEmpresa;
    private String CNPJ;

    public Empresa(String nomeEmpresa, String CNPJ){
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
    }

    public Empresa(String nome, String proprietario, String endereco, Float vendasMensais,int qtdeMaxPassagens,
                   int qtdeFuncionarios, Onibus onibus, String nomeEmpresa, String CNPJ){
        super(nome,proprietario,endereco,vendasMensais,qtdeMaxPassagens,qtdeFuncionarios,onibus);
        this.nomeEmpresa = nomeEmpresa;
        this.CNPJ = CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getProprietario() {
        return super.getProprietario();
    }

    public void setProprietario(String proprietario) {
        super.setProprietario(proprietario);
    }

    public String getEndereco() {
        return super.getEndereco();
    }

    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    public Float getVendasMensais() {
        return super.getVendasMensais();
    }

    public void setVendasMensais(Float vendasMensais) {
        super.setVendasMensais(vendasMensais);
    }

    public int getQtdeMaxPassagens() {
        return super.getQtdeMaxPassagens();
    }

    public void setQtdeMaxPassagens(int qtdeMaxPassagens) {
        super.setQtdeMaxPassagens(qtdeMaxPassagens);
    }

    public int getQtdeFuncionarios() {
        return super.getQtdeFuncionarios();
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        super.setQtdeFuncionarios(qtdeFuncionarios);
    }

    public void setOnibus(Onibus onibus) {
        super.setOnibus(onibus);
    }

    public Onibus getOnibus() {
        return super.getOnibus();
    }


    public String toString(){
        return  "\nQuantidade de Passageiros: " + this.getOnibus().getQtdePassageiros() +
                "\nTipo de onibus: " + this.getOnibus().getTipo() + "\n" +
                "\nNome da empresa: " + this.getNome() +
                "\nProprietario: " + this.getProprietario() +
                "\nEndereco: " + this.getEndereco() +
                "\nVendas Mensais: " + this.getVendasMensais() +
                "\nQuantidade maxima de passagens: " + this.getQtdeMaxPassagens() +
                "\nQuantidade de funcionarios: " + this.getQtdeFuncionarios() +
                "\nEmpresa: " + this.getNomeEmpresa() +
                "\nCNPJ: " + this.getCNPJ() +"\n";
    }


}
