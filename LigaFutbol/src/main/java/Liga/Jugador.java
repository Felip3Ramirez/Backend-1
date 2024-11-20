package Liga;

public class Jugador {
    //Atributos
    int idJugador, edad, numeroJugador;
    String nombreJugador,posicion;

    //metodos
    //metodo constructor
    public Jugador(int idJugador, String nombreJugador) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
    }
    public void ingresarDatosJugador(int edad,int numeroJugador,String posicion){
        this.edad=edad;
        this.numeroJugador=numeroJugador;
        this.posicion=posicion;
    }
    public String mostrarDatos(){
        return "El jugador "+nombreJugador+" tiene "+edad+ " años y porta en su camiseta " +
                "el numero "+numeroJugador+" y juega en la pocision "+posicion;

    }
    public void entrenar(){
        System.out.println("El jugador puede entrenar");
    }
    public void jugar(){
        System.out.println("El jugador puede jugar");
    }
}
