import java.util.ArrayList;

public class Boletim {

    Notas notas = new Notas();

    //Consultar
    public ArrayList<Notas> consultarNotas(String RA) {

        System.out.println("\n--------------Boletim (Aluno: "+RA+")--------------");

        for (Notas elementoNotas : Notas.ListaNotas) {
            if (elementoNotas.getAluno().getRA().equals(RA)) {
                System.out.println(elementoNotas.getProfessorDisciplina());
                System.out.println("Nota: " + elementoNotas.getNota()+"\n");
            }
        }
        System.out.println("-------------------------------------------------\n");

        return Notas.ListaNotas;
    }



}
