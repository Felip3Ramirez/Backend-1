package Seguros;

public class Main {
    public static void main(String[] args) {

        Consultas consulta = new Consultas();


        Cliente cliente = new Cliente("Juan Pérez", "juan@example.com", "123456789", "POL123456");
        consulta.agregarUsuario(cliente);


        Administrador administrador = new Administrador("Ana Gómez", "ana@example.com", "987654321", "EMP001");
        consulta.agregarUsuario(administrador);


        Usuario usuarioCliente = consulta.obtenerUsuario(1); // Suponiendo que el ID del cliente es 1
        if (usuarioCliente != null) {
            System.out.println("Información del Cliente:");
            usuarioCliente.mostrarInfo();
        }


        Usuario usuarioAdmin = consulta.obtenerUsuario(2); // Suponiendo que el ID del administrador es 2
        if (usuarioAdmin != null) {
            System.out.println("\nInformación del Administrador:");
            usuarioAdmin.mostrarInfo();
        }


       /* Cliente cliente = new Cliente("Juan Pérez", "juan@example.com", "123456789", "EM1234");
        Administrador administrador = new Administrador("Ana Gómez", "ana@example.com", "987654321", "Admin001");

        System.out.println("Información del Cliente:");
        cliente.mostrarInfo();

        System.out.println("\nInformación del Administrador:");
        administrador.mostrarInfo();*/


    }

}
