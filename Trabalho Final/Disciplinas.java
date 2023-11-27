package projetopoo;

import java.util.ArrayList;

public class Disciplinas {

    //Variaveis
    private String nomeDisciplina;
    static ArrayList<Disciplinas> ListaDisciplinas = new ArrayList<>();


    //Construtor
    public Disciplinas(String nomeDisciplina){
        setNomeDisciplina(nomeDisciplina);
    }

    //Getters e Setters
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


}
