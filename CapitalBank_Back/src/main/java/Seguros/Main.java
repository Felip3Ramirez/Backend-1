package Seguros;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
   static Connection cb = ConexionBD.conectarBD("capitalBank_bd");
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    menu();

    }
    public static void menu(){
        int opc = 0;
        while (opc != 4){
            System.out.println("MENU PRINCIPAL");
            System.out.println("======================");
            System.out.println("1.LOGIN CLIENTE\n" +
                    "2.LOGIN ADMINISTRADOR\n" +
                    "3.REGISTRO\n" +
                    "4.SALIR");

            opc = sc.nextInt();
            switch (opc){
                case 1:
                    Cliente.verProductos(cb);
                    ConexionBD.desconexion(cb);


                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("REGISTRO DE CLIENTES\n" +
                            "========================================");
                    System.out.println("Ingrese Nombre");
                    String nombre = sc.next();
                    System.out.println("Ingrese Contraseña");
                    String contrasena = sc.next();
                    System.out.println("Ingrese Email");
                    String email = sc.next();
                    System.out.println("Ingrese Telefono");
                    String telefono = sc.next();
                    Cliente.registro(cb,nombre,contrasena,email,telefono);

                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }

        }
    }

}
