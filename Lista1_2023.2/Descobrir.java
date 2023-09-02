public class Descobrir{

    public int getAleatorio(EmpresaViagem empresaviagem){
        return (int) (Math.random() * empresaviagem.getQtdeFuncionarios());
    }

}
