/**
 * Esta clase representa los resultados de un piloto.
 */

public class Resultado {
    private int carrera;
    private int clasificacion;
    private Piloto piloto;
    private boolean DNF;

    /**
     * Constructor para la clase Resultado
     * @param piloto El piloto del que se quiere saber el resultado
     */

    public Resultado(Piloto piloto) {
        this.piloto = piloto;
        this.DNF = false;
    }

    /**
     * Getter del atributo carrera
     * @return Devuelve el número de la carrera
     */

    public int getCarrera(){

        return carrera;
    }

    /**
     * Setter del atributo carrera
     * @param carrera El numero de la carrera
     */

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    /**
     * Getter del atributo clasificación
     * @return Devuelve la clasificación del piloto
     */

    public int getClasificacion(){

        return clasificacion;
    }

    /**
     * Setter del atributo clasificación
     * @param clasificacion Clasificación del piloto
     */

    public void setClasificacion(int clasificacion) {

        this.clasificacion = clasificacion;
    }

    /**
     * Getter del piloto
     * @return Devuelve el piloto del que se quiere saber el resultado
     */

    public Piloto getPiloto() {
        return piloto;
    }

    /**
     * Getter para el DNF
     * @return Devuelve el resultado del atributo DNF del piloto
     */
    public boolean getDNF() {
        return DNF;
    }

    /**
     * Setter para el atributo DNF
     * @param DNF Indica si el piloto terminó o no la carrera
     */

    public void setDNF(boolean DNF) {

        this.DNF = DNF;
    }
}