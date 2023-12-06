
package projetopoo;

import java.util.ArrayList;
import java.util.Date;


public class Eventos {



    
    private String nomeTurma;
    private Date data;
    private String horario;

    
    private static ArrayList<Eventos> ListaEventos = new ArrayList<>();
    
    public Eventos(String nomeTurma, Date data, String horario){
        setNomeTurma(nomeTurma);
        setData(data);
        setHorario(horario);
    }
    
    public Eventos(){  
    }
    
    
        public class VisitasTecnicas extends Eventos{
        
            private String Local;
            private String Tipo;
            
            public VisitasTecnicas(String nomeTurma, Date data, String horario, String Local, String Tipo){
               super(nomeTurma,data,horario);
               setLocal(Local);
               setTipo(Tipo);
            }
            
            public VisitasTecnicas(){
            }
            
            public String getLocal() {
                return Local;
            }

            public void setLocal(String Local) {
                this.Local = Local;
            }
            
            public String getTipo(){
                return Tipo;
            }
            
            public void setTipo(String Tipo){
                this.Tipo = Tipo;
            }
        }
    
        
        
        
        public class Palestras extends Eventos{
        
            private String Palestrante;
            private String Tipo;
            
            public Palestras(String nomeTurma, Date data, String horario, String Palestrante, String Tipo){
               super(nomeTurma,data,horario);
               setPalestrante(Palestrante);
               setTipo(Tipo);
            }
            
            public Palestras(){
            }
            
            public String getPalestrante() {
                return Palestrante;
            }

            public void setPalestrante(String Palestrante) {
                this.Palestrante = Palestrante;
            }
            
            public String getTipo(){
                return Tipo;
            }
            
            public void setTipo(String Tipo){
                this.Tipo = Tipo;
            }
        
        }
    
        
        
        
        
    public void cadastrarEvento(String nomeTurma, Date data, String horario, String Palestrante, String Local, String Tipo){
        
        Eventos evento = new Eventos();
        
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
