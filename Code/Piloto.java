/**
 * Esta clase representa a un piloto.
 */

public class Piloto{
    private String nombre;
    private String apellido;
    private int puntos;

    /**
     * Constructor de la clase Piloto
     * @param nombre Nombre del piloto
     * @param apellido Apellido del piloto
     */

    public Piloto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puntos = 0;
    }

    //Getters y setters

    /**
     * Getter del atributo puntos
     * @return Devuelve los puntos del piloto
     */

    public int getPuntos() {
        return puntos;
    }

    /**
     * Setter de los puntos
     * @param puntos Puntos del piloto
     */

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * Método aleatorio para definir si el piloto no finalizó la carrera
     * @return Devuelve verdadero si el piloto no finalizó la carrera, de lo contrario, devuelve falso
     */

    public boolean DNF (){
        return Math.random() < 0.05;
    }

    /**
     * Método para imprimir los atributos del piloto
     * @return Devuelve una cadena con los valores de los atributos del piloto
     */

    public String toString(){
        return nombre + " " + apellido;
    }

}