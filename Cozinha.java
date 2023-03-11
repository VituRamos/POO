public class Cozinha {

    //variaveis de instancia
    public int tiposRefeicao; //Atributo
    public int qtdePanelas; //Atributo

    //construtor padrao(nao recebe parametros)
    public Cozinha(){

        this.tiposRefeicao=0;
        this.qtdePanelas=0;

    }

    //Metodos

    //tipos refeicao
    public int getTiposRefeicao(){
        return this.tiposRefeicao;
    }
    public void setTiposRefeicao(int tiposRefeicao){
        this.tiposRefeicao = tiposRefeicao;
    }

    //qtde Panelas
    public int getQtdePanelas(){
        return this.qtdePanelas;
    }
    public void setQtdePanelas(int qtdePanelas){
        this.qtdePanelas = qtdePanelas;
    }

}
