package hdt8;

import java.io.IOException;

/**
 * @author Carlo David Sanchinelli, Juan Pablo Zea
 * @version 19.10.16
 */
public class HDT8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Lector lector = new Lector();
        VectorHeap priorityQueue = new VectorHeap();
        String[] lista_pacientes = lector.getText();
        
        //Este ciclo separa el String del paciente en nombre, caso y prioridad y lo vuelve un objeto tipo Paciente, el cual se ingresa a la PriorityQueue.
        for (int i = 0; i < lista_pacientes.length; i++){
            String[] datos_paciente = lista_pacientes[i].split(", ");
            Paciente nuevo_paciente = new Paciente(datos_paciente[0],datos_paciente[1],datos_paciente[2]);
            priorityQueue.add(nuevo_paciente);
        }
        //Este ciclo retira cada Paciente de la priorityQueue y lo imprime en pantalla segun el nuevo orden.
        for (int i = 0; i < lista_pacientes.length; i++){
            Paciente paciente_ordenado = (Paciente) priorityQueue.poll();
            System.out.println(paciente_ordenado.toString());
        }
    }
}
