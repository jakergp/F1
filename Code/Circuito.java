/**
 * Esta clase representa a un circuito, donde
 * se puede realizar una carrera.
 */

public class Circuito {
    private String nombre;
    private String lugar;
    private double km;
    private int vueltas;

    /**
     * Constructor para la clase Circuito
     * @param nombre Nombre del circuito
     * @param lugar Nombre del lugar donde se encuentra el circuito
     * @param km Kilómetros que tiene el circuito
     * @param vueltas Vueltas que se dan en el circuito
     */

    public Circuito(String nombre, String lugar, double km, int vueltas) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.km = km;
        this.vueltas = vueltas;
    }

    /**
     * Getter del atributo nombre
     * @return Devuelve el nombre del circuito
     */

    public String getNombre() {
        return nombre;

    }

    /**
     * Getter del atributo lugar
     * @return Regresa el lugar del circuito
     */

    public String getLugar() {
        return lugar;
    }

    /**
     * Getter del atributo km
     * @return Regresa los kilómetros del circuito
     */

    public double getKm() {
        return km;
    }

    /**
     * Getter del atributo vueltas
     * @return Devuelve las vueltas del circuito
     */

    public int getVueltas() {
        return vueltas;
    }

    /**
     * Representación en cadena
     * @return Devuelve una cadena con el nombre del lugar del circuito
     */

    public String toString(){
        return this.lugar;
    }
}