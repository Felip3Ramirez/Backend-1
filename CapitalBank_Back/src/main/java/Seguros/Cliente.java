package Seguros;

public class Cliente extends Usuario {
    private String idEmpleado;

    public Cliente(String nombre, String email, String telefono, String idEmpleado) {
        super(nombre, email, telefono);
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Empleado: " + idEmpleado);
    }
}
