public class EmpresaViagem {

    private String nome;
    private String proprietario;
    private String endereco;
    private Float vendasMensais;
    private int qtdeMaxPassagens;
    private Onibus onibus;
    private Barco barco;

    public EmpresaViagem(String nome, String proprietario, String endereco, Float vendasMensais,
                         int qtdeMaxPassagens){
        this.setNome(nome);
        this.setProprietario(proprietario);
        this.setEndereco(endereco);
        this.setVendasMensais(vendasMensais);
        this.setQtdeMaxPassagens(qtdeMaxPassagens);

        Onibus onibus = new Onibus();
        Barco barco = new Barco();

    }

    public EmpresaViagem(){
        Onibus onibus = new Onibus();
        Barco barco = new Barco();
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
}
