
package projetopoo;

import java.util.ArrayList;

public class Eventos {

    private String nomeTurma;
    private String data;
    private String horario;
    private String tipo;

    static ArrayList<Eventos> ListaEventos = new ArrayList<>();
    
    public Eventos(String nomeTurma, String data, String horario, String tipo){
        setNomeTurma(nomeTurma);
        setData(data);
        setHorario(horario);
        setTipo(tipo);
    }
    
    public Eventos(){  
    }
    
    
        public class VisitasTecnicas extends Eventos{
        
            private String Local;
            
            public VisitasTecnicas(String nomeTurma, String data, String horario, String Local, String tipo){
               super(nomeTurma,data,horario,tipo);
               setLocal(Local);
            }
            
            public VisitasTecnicas(){
            }
            
            public String getLocal() {
                return Local;
            }

            public void setLocal(String Local) {
                this.Local = Local;
            }
            
        }
    
        
        
        
        public class Palestras extends Eventos{
        
            private String Palestrante;
            
            public Palestras(String nomeTurma, String data, String horario, String Palestrante, String tipo){
               super(nomeTurma,data,horario,tipo);
               setPalestrante(Palestrante);
            }
            
            public Palestras(){
            }
            
            public String getPalestrante() {
                return Palestrante;
            }

            public void setPalestrante(String Palestrante) {
                this.Palestrante = Palestrante;
            }
        
        }
    
        
        
        
        
    public void cadastrarEvento(String nomeTurma, String data, String horario, String Palestrante, String Local, String Tipo){
        
        Eventos evento;
        
        if (Tipo.equals("Visita Tecnica")) {
            
            evento = new VisitasTecnicas(nomeTurma,data,horario,Local,Tipo);
            
        }else{
            
            evento = new Palestras(nomeTurma,data,horario,Palestrante,Tipo);
            
        }
        
        Eventos.ListaEventos.add(evento);
        
    }
    
    
    
    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
