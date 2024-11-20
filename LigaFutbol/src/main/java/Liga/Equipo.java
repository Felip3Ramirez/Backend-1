package Liga;

public class Equipo {
    int codEquipo,titulos;
    String nombreEquipo,ciudad,mascota,estadio,nomina,entrenador;

    public Equipo(int codEquipo, String nombreEquipo) {
        this.codEquipo = codEquipo;
        this.nombreEquipo = nombreEquipo;
    }
    public void ingresarEquipo(int titulos,String ciudad,String mascota){
        this.titulos=titulos;
        this.ciudad=ciudad;
        this.mascota=mascota;
    }

    public String mostrarEquipo(){
        return "El equipo "+nombreEquipo+" es local en la ciudad de "+ciudad+" tiene "+titulos+" titulos en sus vitrinas y su mascota es "+mascota;
    }
    public void contratarJugadores (){
        System.out.println("El equipo "+nombreEquipo+" contrata jugadores");
    }
    public void generarEntrenamientos(){
        System.out.println("el equipo genera entrenamientos");
    }
    public void jugarTorneos(){
        System.out.println("El equipo participa en torneos");
    }
}
