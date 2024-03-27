import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase se utiliza para crear los pilotos,
 * equipos y circuitos predeterminados o personalizados
 * que se pueden utilizar en el campeonato.
 */
public class Crear {

    /**
     * Método para crear los pilotos y sus respectivos equipos
     * @return Devuelve la lista de equipos creados
     */
    public static ArrayList<Equipo> equiposF1() {
        ArrayList<Equipo> equiposF1 = new ArrayList<>();
        Piloto VER = new Piloto("Max", "Verstappen");
        Piloto PER = new Piloto("Sergio", "Perez") ;
        Equipo RB = new Equipo("Red Bull", VER, PER);
        equiposF1.add(RB);

        Piloto LEC = new Piloto("Charles", "Leclerc");
        Piloto SAI = new Piloto("Carlos", "Sainz");
        Equipo FER = new Equipo("Ferrari", LEC, SAI);
        equiposF1.add(FER);

        Piloto NOR = new Piloto("Lando", "Norris");
        Piloto PIA = new Piloto("Oscar", "Piastri");
        Equipo MCL = new Equipo("McLaren", NOR, PIA);
        equiposF1.add(MCL);

        Piloto RIC = new Piloto("Daniel", "Riccciardo");
        Piloto TSU = new Piloto("Yuki", "Tsunoda");
        Equipo AT = new Equipo("AlphaTauri", RIC, TSU);
        equiposF1.add(AT);

        Piloto HAM = new Piloto("Lewis","Hamilton");
        Piloto RUS = new Piloto("George", "Russell");
        Equipo MER = new Equipo("Mercedes", HAM, RUS);
        equiposF1.add(MER);

        Piloto MAG = new Piloto("Kevin","Magnussen");
        Piloto HUL = new Piloto("Nico","Hulkenberg");
        Equipo HAAS = new Equipo("Haas", MAG, HUL);
        equiposF1.add(HAAS);

        Piloto GAS = new Piloto("Pierre", "Gasly");
        Piloto OCO = new Piloto("Esteban", "Ocon");
        Equipo ALP = new Equipo("Alpine", GAS, OCO);
        equiposF1.add(ALP);

        Piloto ALO = new Piloto("Fernando", "Alonso");
        Piloto STR = new Piloto("Lance", "Stroll");
        Equipo AST = new Equipo("Aston Martin",ALO,STR);
        equiposF1.add(AST);

        Piloto ZHO = new Piloto("Guanyu","Zhou");
        Piloto BOT = new Piloto("Valtteri", "Bottas");
        Equipo ALF = new Equipo("Alfa Romeo", ZHO, BOT);
        equiposF1.add(ALF);

        Piloto SAR = new Piloto("Logan", "Sargeant");
        Piloto ALB = new Piloto("Alexander","Albon");
        Equipo WILL = new Equipo("Williams",SAR,ALB);
        equiposF1.add(WILL);

        return equiposF1;
    }

    /**
     * Método para crear los circuitos del campeonato
     * @return Devuelve la lista de los circuitos creados
     */
    public static ArrayList<Circuito> circuitosF1() {
        ArrayList<Circuito> listaCircuitos = new ArrayList<>();
        Circuito circuito1 = new Circuito("Circuito Internacional de Barein", "Barein", 5.412, 57);
        listaCircuitos.add(circuito1);

        Circuito circuito2 = new Circuito("Jeddah", "Arabia Saudita", 6.175, 50);
        listaCircuitos.add(circuito2);

        Circuito circuito3 = new Circuito("Albert Park", "Australia", 5.278, 58);
        listaCircuitos.add(circuito3);

        Circuito circuito4 = new Circuito("Baku City Circuit", "Azerbaiyán", 6.003, 51);
        listaCircuitos.add(circuito4);

        Circuito circuito5 = new Circuito("Autódromo Internacional de Miami", "Miami", 5.412, 57);
        listaCircuitos.add(circuito5);

        Circuito circuito6 = new Circuito("Autodromo Enzo e Dino Ferrari", "Imola", 4.909, 63);
        listaCircuitos.add(circuito6);

        Circuito circuito7 = new Circuito("Monte Carlo", "Mónaco", 3.337, 78);
        listaCircuitos.add(circuito7);

        Circuito circuito8 = new Circuito("Circuito de Barcelona-Catalunya", "España", 4.657, 66);
        listaCircuitos.add(circuito8);

        Circuito circuito9 = new Circuito("Circuito Gilles Villeneuve", "Canadá", 4.361, 70);
        listaCircuitos.add(circuito9);

        Circuito circuito10 = new Circuito("Red Bull Ring", "Austria", 4.318, 71);
        listaCircuitos.add(circuito10);

        Circuito circuito11 = new Circuito("Silverstone", "Gran Bretaña", 5.891, 52);
        listaCircuitos.add(circuito11);

        Circuito circuito12 = new Circuito("Hungaroring", "Hungría", 4.381, 70);
        listaCircuitos.add(circuito12);

        Circuito circuito13 = new Circuito("Spa-Francorchamps", "Bélgica", 7.004, 44);
        listaCircuitos.add(circuito13);

        Circuito circuito14 = new Circuito("Zandvoort", "Holanda", 4.259, 72);
        listaCircuitos.add(circuito14);

        Circuito circuito15 = new Circuito("Autodromo Nazionale di Monza", "Monza", 5.793, 53);
        listaCircuitos.add(circuito15);

        Circuito circuito16 = new Circuito("Circuito Marina Bay", "Singapur", 4.940, 62);
        listaCircuitos.add(circuito16);

        Circuito circuito17 = new Circuito("Suzuka", "Japón", 5.807, 53);
        listaCircuitos.add(circuito17);

        Circuito circuito18 = new Circuito("Lusail", "Catar", 5.380, 57);
        listaCircuitos.add(circuito18);

        Circuito circuito19 = new Circuito("Circuito de las Américas", "Austin", 5.513, 56);
        listaCircuitos.add(circuito19);

        Circuito circuito20 = new Circuito("Autódromo Hermanos Rodríguez", "México", 4.304, 71);
        listaCircuitos.add(circuito20);

        Circuito circuito21 = new Circuito("Interlagos", "Brasil", 4.309, 71);
        listaCircuitos.add(circuito21);

        Circuito circuito22 = new Circuito("Las Vegas", "Las Vegas", 6.120, 50);
        listaCircuitos.add(circuito22);

        Circuito circuito23 = new Circuito("Circuito Yas Marina", "Abu Dhabi", 5.281, 58);
        listaCircuitos.add(circuito23);

        return listaCircuitos;
    }

    /**
     * Metodo para crear a los equipos personalizados
     * @param numEquipos El número de equipos
     * @return Devuelve una lista con los equipos creados
     */

    public static ArrayList<Equipo> equiposPersonalizados(int numEquipos){
        Scanner s = new Scanner(System.in);
        ArrayList<Equipo> equiposPersonalizados = new ArrayList<>();
        for(int i = 0;  i < numEquipos; i++) {
            System.out.println("Ingrese el nombre del equipo");

            String nombre = s.nextLine();
            System.out.println("Ingrese el nombre del primer piloto");
            String nombre1 = s.nextLine();
            System.out.println("Ingrese el apellido del primer piloto");
            String apellido1 = s.nextLine();
            Piloto p1 = new Piloto(nombre1, apellido1);

            System.out.println("Ingrese el nombre del segundo piloto");
            String nombre2 = s.nextLine();
            System.out.println("Ingrese el apellido del segundo piloto");
            String apellido2 = s.nextLine();
            Piloto p2 = new Piloto(nombre2, apellido2);

            Equipo team = new Equipo(nombre, p1, p2);
            equiposPersonalizados.add(team);
        }
        return equiposPersonalizados;
    }

    /**
     * Método para crear los circuitos personalizados
     * @param numCircuitos El numero de circuitos
     * @return Devuelve la lista de los circuitos creados
     */

    public static ArrayList<Circuito> circuitosPersonalizados(int numCircuitos){
        Scanner s = new Scanner(System.in);
        ArrayList<Circuito> listaCircuitosP = new ArrayList<>();
        String temp;
        for(int i = 0 ; i < numCircuitos ; i++){
            System.out.println("Ingrese el nombre del circuito");
            String nombre = s.nextLine();

            System.out.println("Ingrese el lugar");
            String lugar = s.nextLine();

            do {
                System.out.println("Ingrese los Km de la pista");
                temp = s.nextLine();
            } while (!isNumericDouble(temp));
            double km = Double.parseDouble(temp);

            do {
                System.out.println("Ingrese el numero de vueltas");
                temp = s.nextLine();
            } while (!isNumericInt(temp));
            int vueltas = Integer.parseInt(temp);

            Circuito circuito = new Circuito(nombre, lugar, km, vueltas);
            listaCircuitosP.add(circuito);
        }
        return listaCircuitosP;
    }

    /**
     * Método para validar que el usuario ingrese un valor numérico al solicitárselo
     * @param s Dato ingresado por el usuario al pedirle un número
     * @return Devuelve verdadero si el dato es un número tipo double, de lo contrario, devuelve false
     */
    public static boolean isNumericDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método para validar que el usuario ingrese un valor numérico al solicitárselo
     * @param s Dato ingresado por el usuario al pedirle un número
     * @return Devuelve verdadero si el dato es un número entero, de no serlo, devuelve false
     */
    public static boolean isNumericInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}