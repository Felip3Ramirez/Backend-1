package ligaFutbol;

import ligaFutbol.Usuario;

public class Jugador extends Usuario {
    //Atributos
    private int numeroJugador;
    private String equipo;

    public Jugador(int idUsuario, int edad, String nombre, String posicion, int numeroJugador, String equipo) {
        super(idUsuario, edad, nombre, posicion);
        this.numeroJugador = numeroJugador;
        this.equipo = equipo;
    }

    public String correr(){
        return "El jugador "+getNombre()+" puede correr";
    }
    public String calentar(){
        return "El jugador "+getNombre()+" puede calentar";
    }
    public String entrenar(){
        return "El jugador "+getNombre()+" puede entrenar";
    }
    public String goles(){
        return "El jugador "+getNombre()+" puede meter goles";
    }
    public String asistencia(){
        return "El jugador "+getNombre()+" puede hacer asistencias";
    }

    public String getEquipo(){
        return equipo;
    }
    public void setEquipo(){
        this.equipo = equipo;
    }
    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }
}
