public class Cozinha {

    public int tiposRefeicao; //Atributo
    public int qtdePanelas; //Atributo

    public Cozinha(){

        this.tiposRefeicao = 0;
        this.qtdePanelas = 0;

    }

    public Cozinha(int tiposRefeicao, int qtdePanelas){

        this.tiposRefeicao = tiposRefeicao;
        this.qtdePanelas = qtdePanelas;

    }

    public int getTiposRefeicao(){
        return this.tiposRefeicao;
    }
    public void setTiposRefeicao(int tiposRefeicao){
        this.tiposRefeicao = tiposRefeicao;
    }

    public int getQtdePanelas(){
        return this.qtdePanelas;
    }
    public void setQtdePanelas(int qtdePanelas){
        this.qtdePanelas = qtdePanelas;
    }

}
