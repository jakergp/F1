import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;

/**
 * Esta clase implementa el objeto de tipo carrera,
 * donde se determinan los resultados para el conjunto de
 * pilotos correspondiente.
 */

public class Carrera {

    private static LinkedList<Piloto> pilotos = new LinkedList<>();
    private HashSet<Resultado> resultados;
    private Circuito circuito;
    private static final int[] puntos = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};

    /**
     * Constructor de la clase Carrera
     * @param circuito El circuito de la carrera
     */

    public Carrera (Circuito circuito){
        this.circuito = circuito;
        this.resultados = new HashSet<>();
        for(Piloto piloto: pilotos) {
            Resultado resultado = new Resultado(piloto);
            resultados.add(resultado);
        }
    }

    /**
     * Getter del circuito
     * @return Devuelve el circuito de la carrera
     */

    public Circuito getCircuito() {

        return circuito;
    }

    /**
     * Setter de la lista de pilotos
     * @param tablaPilotos La lista de los pilotos de la carrera
     */

    public static void setPilotos(ArrayList<Piloto> tablaPilotos){
        pilotos.addAll(tablaPilotos);
    }

    /**
     * Setter de los resultados de los pilotos
     */
    public void setResultados() {
        for(Piloto piloto: pilotos) {
            Resultado resultado = new Resultado(piloto);
            resultados.add(resultado);
        }
    }

    /**
     * Método para establecer la clasificación de los pilotos al finalizar la carrera
     */
    public void resultadosClasificacion() {
        Collections.shuffle(pilotos);
        for (Resultado resultado : resultados) {
            Piloto piloto = resultado.getPiloto();
            resultado.setClasificacion(pilotos.indexOf(piloto) + 1);
        }
    }


    /**
     * Método para establecer los resultados de la carrera
     */
    public void resultadosCarrera() {
        Collections.shuffle(pilotos);

        for(Resultado resultado: resultados) {
            if (resultado.getPiloto().DNF()) {
                pilotos.remove(resultado.getPiloto());
                pilotos.add(resultado.getPiloto());
                resultado.setDNF(true);
            }
        }

        for(Resultado resultado: resultados){
            resultado.setCarrera(pilotos.indexOf(resultado.getPiloto()) + 1);
            if (resultado.getCarrera() <= 10) {
                resultado.getPiloto().setPuntos(resultado.getPiloto().getPuntos() + puntos[resultado.getCarrera() - 1]);
            }

        }
    }

    /**
     * Método para imprimir los resultados de la clasificación
     */
    public void printResultadosClasificacion() {
        System.out.println("\nResultados clasificacion");
        for (int i = 1; i <= pilotos.size(); i++) {
            for (Resultado resultado: resultados) {
                if(resultado.getClasificacion() == i) {
                    System.out.println(resultado.getClasificacion() + "\t" + resultado.getPiloto());
                }
            }
        }
    }

    /**
     * Método para imprimir los resultados de la carrera
     */
    public void printResultadosCarrera() {
        System.out.println("\nResultados carrera");
        for (int i = 1; i <= pilotos.size(); i++) {
            for (Resultado resultado: resultados) {
                if(resultado.getCarrera() == i) {
                    if (!resultado.getDNF())
                        System.out.println(resultado.getCarrera() + "\t" + resultado.getPiloto());
                    else
                        System.out.println("DNF" + "\t" + resultado.getPiloto());
                }
            }
        }
    }

}