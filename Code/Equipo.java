/**
 * Esta clase representa a un equipo
 * conformado por dos pilotos.
 */

public class Equipo{
    private String nombre;
    private Piloto p1;
    private Piloto p2;

    /**
     * Constructor para la clase Equipo
     * @param nombre Nombre del equipo
     * @param p1 Primer piloto del equipo
     * @param p2 Segundo piloto del equipo
     */

    public Equipo(String nombre, Piloto p1, Piloto p2){
        this.nombre = nombre;
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Getter del primer piloto del equipo
     * @return Devuelve el primer piloto del equipo
     */

    public Piloto getP1() {
        return p1;
    }

    /**
     * Getter del segundo piloto del equipo
     * @return Devuelve el segundo piloto del equipo
     */

    public Piloto getP2() {
        return p2;
    }

    /**
     * Getter del atributo puntos
     * @return Devuelve los puntos del equipo
     */

    public int getPuntos() {
        return p1.getPuntos() + p2.getPuntos();
    }

    /**
     * Representación en cadena del nombre del equipo
     * @return Devuelve el nombre del equipo
     */
    public String toString(){
        return nombre;
    }

}