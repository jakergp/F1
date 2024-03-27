import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Esta es la clase principal del programa,
 * donde el usuario puede interactuar.
 * @author Javier Arias, Carina Mireles, Camila Salas, Leslie Jaramillo
 * @version Septiembre-2023
 */

public class Main {
    /**
     * Método principal.
     * Permite al usuario interactúa con el programa y selecciona
     * las distintas opciones disponibles. En este se puede crear un
     * campeonato.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Circuito> listaCircuitos;
        listaCircuitos = Crear.circuitosF1();
        String op;
        Campeonato campeonato = null;

        //crear campeonato
        do {
            System.out.println("Menú Crear campeonato");
            System.out.println("Seleccione");
            System.out.println("\t1)Campeonato predeterminado F1 2023");
            System.out.println("\t2)Campeonato personalizado");

            op = s.nextLine();

            switch (op) {
                case "1": //campeonato predeterminado F1 2023
                    ArrayList<Equipo> equiposF1;
                    equiposF1 = Crear.equiposF1();
                    campeonato = new Campeonato(equiposF1, "F1 2023", listaCircuitos);
                    break;

                case "2": //campeonato personalizado
                    String temp;
                    do {
                        System.out.println("Ingrese el numero de carreras del campeonato.");
                        temp = s.nextLine();
                    } while (!Crear.isNumericInt(temp));
                    int numCarreras = Integer.parseInt(temp);

                    ArrayList<Circuito> listaCircuitosP = new ArrayList<>();

                    String op2;
                    do {
                        System.out.println("Seleccione");
                        System.out.println(("1)Crear circuitos 2)Seleccionar circuitos aleatorios"));
                        op2 = s.nextLine();
                        if (op2.equals("1")) {
                            listaCircuitosP = Crear.circuitosPersonalizados(numCarreras);
                        } else if (op2.equals("2")) {
                            if(numCarreras > 23) {
                                numCarreras = 23;
                                System.out.println("Máximo 23 carreras.");
                            }
                            Random random = new Random();
                            for(int i = 0; i < numCarreras; i++) {
                                int n = random.nextInt(23 - i);
                                listaCircuitosP.add(listaCircuitos.get(n));
                                listaCircuitos.remove(n);
                            }
                        } else
                            System.out.println("Opción invalida");
                    }while (!op2.equals("1") && !op2.equals("2"));

                    do {
                        System.out.println("Ingrese el numero equipos");
                        temp = s.nextLine();
                    } while (!Crear.isNumericInt(temp));
                    int numEquipos = Integer.parseInt(temp);

                    System.out.println("Ingrese el nombre del campeonato");
                    String nombreCampeonato = s.nextLine();

                    campeonato = new Campeonato(Crear.equiposPersonalizados(numEquipos), nombreCampeonato, listaCircuitosP);

                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }
        } while(campeonato == null);

        do {
            System.out.println("\nMenú " + campeonato.getNombre());
            System.out.println("Seleccione");
            System.out.println("\t1)Siguiente carrera");
            System.out.println("\t2)Ver calendario");
            System.out.println("\t3)Posiciones del campeonato de pilotos");
            System.out.println("\t4)Posiciones del campeonato de equipos");
            System.out.println("\t5)Ver resultados de carrera anterior");
            System.out.println("\t6)Finalizar campeonato");
            op = s.nextLine();
            
            switch(op){
                case "1": //Siguiente carrera
                    Carrera carrera = campeonato.siguienteCarrera();
                    if (carrera != null) {
                        System.out.println("Carrera " + (campeonato.getCarreraActual() - 1));
                        Circuito circuito = carrera.getCircuito();
                        System.out.println(circuito.getNombre() + ", " + circuito.getLugar());
                        System.out.println(circuito.getKm()+ " Km " + circuito.getVueltas() + " vueltas");
                        System.out.println("Presione enter para continuar.");
                        s.nextLine();
                        carrera.resultadosClasificacion();
                        carrera.printResultadosClasificacion();
                        System.out.println("Presione enter para continuar.");
                        s.nextLine();
                        carrera.resultadosCarrera();
                        carrera.printResultadosCarrera();
                    }
                    break;

                case "2": //Ver calendario
                    campeonato.printCarreras();
                    break;

                case "3": //Posiciones campeonato pilotos
                    campeonato.printTablaPilotos();
                    break;

                case "4": //Posiciones campeonato equipos
                    campeonato.printTablaEquipos();
                    break;

                case "5": //Resultados carrera anterior
                    String temp;
                    campeonato.printCarrerasAnteriores();
                    do {
                        System.out.println("Seleccione el numero de la carrera que quiere ver");
                        temp = s.nextLine();
                    } while (!Crear.isNumericInt(temp));
                    int num = Integer.parseInt(temp);
                    campeonato.carreraAnterior(num);
                    break;

                case "6": //Finalizar campeonato
                    System.out.println("Resultados finales");
                    campeonato.printTablaEquipos();
                    campeonato.printTablaPilotos();
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }

        } while (!op.equals("6"));
    }
}