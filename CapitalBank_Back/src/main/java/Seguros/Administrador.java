package Seguros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Administrador extends Usuario {
    static Scanner sc = new Scanner(System.in);
    public Administrador(String nombre, String contrasena, String email, String telefono) {
        super(nombre, contrasena, email, telefono);
    }
    public Administrador(){
        int opc = 0;
        while (opc != 5){
            System.out.println("1.CREAR SEGURO\n" +
                    "2.VER SEGUROS\n" +
                    "3.ACTUALIZAR SEGUROS\n" +
                    "4.ELIMINAR SEGURO\n" +
                    "5.SALIR");
            opc =sc.nextInt();
            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }

    }
    public static void menuAdm(){

    }
    public static void login(Connection con, String emailAdm, String contrasenaAdm,Administrador administrador){
        String sql ="SELECT * FROM administrador";
        Statement statement;
        ResultSet rs;

        try{
            statement = con.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                if (rs.getString("email").equals(emailAdm)){
                    if (rs.getString("contrasena").equals(contrasenaAdm)) {
                        System.out.println("BIENVENIDO "+rs.getString("nombre"));

                        break;
                    }else {
                        System.out.println("Contraseña Incorrecta");
                    }
                }else {
                    System.out.println("No se Encontro el Correo");
                }

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }



    }
}
