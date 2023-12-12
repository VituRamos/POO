/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopoo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Quadras {
    private String nomeTurma;
    private String data;
    private String horario;
    
    
    static ArrayList<Quadras> ListaQuadras = new ArrayList<>();
    
    public Quadras(String nomeTurma, String data, String horario){
        setNomeTurma(nomeTurma);
        setData(data);
        setHorario(horario);
        
    }
    public Quadras(){
        
    }
    
    public void cadastrarQuadras(String nomeTurma, String data,String horario){
        
        Quadras quadra= new Quadras(nomeTurma,data,horario);
        
        
        Quadras.ListaQuadras.add(quadra);
        
    }
    
    public ArrayList<Quadras> removerQuadras(String nomeTurma){

        ArrayList<Quadras> QuadrasRemover = new ArrayList<>();

        for (Quadras elementoTurma: Quadras.ListaQuadras) {
            if (elementoTurma.getNomeTurma().equalsIgnoreCase(nomeTurma)){
                QuadrasRemover.add(elementoTurma);
            }
        }

        Quadras.ListaQuadras.removeAll(QuadrasRemover);

        System.out.println("\nRemocao efetuada com sucesso ✔️\n");

        return Quadras.ListaQuadras;
    }
    
    
    /**
     * @return the nomeTurma
     */
    public String getNomeTurma() {
        return nomeTurma;
    }

    /**
     * @param nomeTurma the nomeTurma to set
     */
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the professor
     */
   
    
   
    
    
    
    
    
    
    
    
    
    
}
