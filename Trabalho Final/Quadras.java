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
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    
    private String nomeTurma;
    private String data;
    private String horario;
    private String professor;
    
     static ArrayList<Eventos> ListaEventos = new ArrayList<>();
    
    public Quadras(String nomeTurma, String data, String horario, String professor){
        setNomeTurma(nomeTurma);
        setData(data);
        setHorario(horario);
        setProfessor(professor);
    }
    
    
    
    
    
    
    
    
    
    
}
