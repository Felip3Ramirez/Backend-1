package Liga;

public class Arbitro {
    int id,edad,aniosExperiencia,salario;
    String nombre,posicion;

    public Arbitro(int id, String nombre, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
    }
    public void pitar(){
        System.out.println("El arbitro pita partido");
    }
    public void informes(){
        System.out.println("El arbitro genera informes de los partidos");
    }
    public void sancionar(){
        System.out.println("El arbitro puede sancionar jugadores y equipos");
    }
}
