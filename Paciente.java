package hdt8;

/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea
 * @version 19.10.16
 */
public class Paciente implements Comparable<Paciente>{

    private String nombre;
    private String caso;
    private String prioridad;

    public Paciente(String nombre, String caso, String prioridad) {
        this.nombre = nombre;
        this.caso = caso;
        this.prioridad = prioridad;
    }
    
    @Override
    //Este metodo identifica el metodo de comparacion de los pacientes, donde se establece que el parametro de comparacion es la prioridad (A-E) que tiene un paciente como atributo.
    public int compareTo(Paciente o) {
        return prioridad.compareTo(o.prioridad);
    }

    @Override
    public String toString() {
        return nombre + ", " + caso + ", " + prioridad;
    }
    
}