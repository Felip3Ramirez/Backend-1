package ligaFutbol;

public class Usuario {
    //Atributos
    private int idUsuario, edad;
    private String nombre, posicion;
    //Metodos

    //M.constructor
    public Usuario(int idUsuario, int edad, String nombre, String posicion) {
        //System.out.println("Estamos ingresando los datos de un usuario");
        this.idUsuario = idUsuario;
        this.edad = edad;
        this.nombre = nombre;
        this.posicion = posicion;
    }
    public String correr (){
        return "El usuario puede correr";
    }
    public String calentar (){
        return "El usuario puede calentar";
    }



    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
