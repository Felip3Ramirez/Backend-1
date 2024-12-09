package Seguros;

public class Administrador extends Usuario {
    private String idAdministrador;

    public Administrador(String nombre, String email, String telefono, String idAdministrador) {
        super(nombre, email, telefono);
        this.idAdministrador = idAdministrador;
    }

    // Getters y Setters
    public String getidAdministrador() {
        return idAdministrador;
    }

    public void setidAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("ID Administrador: " + idAdministrador);
    }
}
