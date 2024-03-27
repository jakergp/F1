import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Esta clase representa un campeonato, las carreras y equipos que lo conforman.
 */

public class Campeonato{
    private Hashtable<String, Carrera> carreras;
    private ArrayList<Piloto> tablaPilotos;
    private ArrayList<Equipo> tablaEquipos;
    private String nombre;
    private int numCarreras;
    private int carreraActual;
    private final static Comparator<Piloto> comparatorPilotos = (p1, p2) -> p2.getPuntos() - p1.getPuntos();
    private final static Comparator<Equipo> comparatorEquipos = (e1, e2) -> e2.getPuntos() - e1.getPuntos();

    /**
     * Constructor para la clase Campeonato
     * @param tablaEquipos Los equipos que estuvieron en el campeonato
     * @param nombre Nombre del campeonato
     * @param listaCircuitos Los circuitos en donde se hicieron las carreras
     */
    public Campeonato(ArrayList<Equipo> tablaEquipos, String nombre, ArrayList<Circuito> listaCircuitos) {
        this.numCarreras = 1;
        this.carreraActual = 1;
        this.carreras = new Hashtable<>();
        for(Circuito circuito: listaCircuitos) {
            Carrera carrera = new Carrera(circuito);
            this.addCarrera(carrera);
        }
        this.tablaEquipos = tablaEquipos;
        this.tablaPilotos = new ArrayList<>();
        for(Equipo equipo: tablaEquipos) {
            tablaPilotos.add(equipo.getP1());
            tablaPilotos.add(equipo.getP2());
        }
        this.nombre = nombre;
        Carrera.setPilotos(this.tablaPilotos);
    }

    /**
     * Getter del atributo nombre
     * @return Retorna el nombre del campeonato
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de la carrera actual
     * @return Regresa la carrera actual
     */

    public int getCarreraActual() {
        return carreraActual;
    }

    /**
     * Agregar una carrera al campeonato
     * @param carrera La carrera que se va a agregar al campeonato
     */

    public void addCarrera(Carrera carrera) {
        carreras.put("Carrera" + numCarreras, carrera);
        numCarreras++;
    }

    /**
     * La siguiente carrera
     * @return Devuelve la siguiente carrera, de no haber carrera siguiente, devuelve null
     */

    public Carrera siguienteCarrera() {
        if(this.carreras.containsKey("Carrera" + carreraActual)) {
            Carrera carrera = this.carreras.get("Carrera" + carreraActual++);
            carrera.setResultados();
            return carrera;
        }
        else {
            System.out.println("No hay más carreras");
            return null;
        }
    }

    /**
     * Resultados de la carrera anterior
     * @param num El numero de la carrera previa que se quiere ver
     */

    public void carreraAnterior(int num){
        if (num < carreraActual){
            Carrera carrera = this.carreras.get("Carrera" + num);
            carrera.printResultadosClasificacion();
            carrera.printResultadosCarrera();
        }
        else
            System.out.println("Carrera no valida");
    }

    /**
     * Imprime las carreras anteriores
     */

    public void printCarrerasAnteriores(){
        System.out.println("Carreras anteriores");
        for(int i = 1 ; i < carreraActual ; i++ ){
            Carrera carrera = this.carreras.get("Carrera" + i);
            System.out.println("\t" + "Carrera " + i + " " + carrera.getCircuito());
        }
    }

    /**
     * Imprime las carreras, con el número de carrera y su circuito correspondiente
     */

    public void printCarreras() {
        System.out.println("Carreras");
        for(int i = 1 ; i < numCarreras ; i++ ){
            Carrera carrera = this.carreras.get("Carrera" + i);
            System.out.println("\t" + "Carrera " + i + " " + carrera.getCircuito());
        }
    }

    /**
     * Imprime la tabla de pilotos, mostrando su clasificación por puntos de cada uno
     */

    public void printTablaPilotos() {
        System.out.println("\nCampeonato de pilotos " + this.nombre);
        tablaPilotos.sort(comparatorPilotos);
        int i = 1;
        for(Piloto piloto: tablaPilotos) {
            System.out.println(i + ".\t" + piloto.getPuntos() + " puntos" + "\t" + piloto);
            i++;
        }
    }

    /**
     * Imprime la tabla de equipos, mostrando su clasificación por puntos de cada uno
     */

    public void printTablaEquipos() {
        System.out.println("\nCampeonato de equipos " + this.nombre);
        tablaEquipos.sort(comparatorEquipos);
        int i = 1;
        for(Equipo equipo: tablaEquipos) {
            System.out.println(i + ".\t" + equipo.getPuntos() + " puntos" + "\t" + equipo);
            i++;
        }
    }

}