package Liga;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(10,"Cuadrado");
        Equipo equipo1 = new Equipo(100,"Deportivo Tapitas");

        jugador1.ingresarDatosJugador(39,7,"Delantero");
        System.out.println(jugador1.mostrarDatos());
        equipo1.ingresarEquipo(2,"Tachira","Rayo");
        System.out.println(equipo1.mostrarEquipo());
        jugador1.mostrarDatos();
        equipo1.mostrarEquipo();
        equipo1.contratarJugadores();

    }
}
