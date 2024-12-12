package Seguros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Cliente extends Usuario {
    static Scanner sc = new Scanner(System.in);
    static Connection cb = ConexionBD.conectarBD("capitalBank_bd");
    public Cliente(String nombre, String contrasena, String email, String telefono) {
        super(nombre, contrasena, email, telefono);
    }
    public Cliente(){

    }
    public static void menuCliente(){
        int opc =0;
        while (opc != 3){
            System.out.println("1.VER PRODUCTOS\n" +
                    "2.COMPRAR PRODUCTO\n" +
                    "3.SALIR");
            opc= sc.nextInt();
            switch (opc){
                case 1:
                    verProductos(cb);
                    break;
                case 2:
                    comprarProducto(cb);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        }
    }

    public static void login(Connection con,String emailCli,String contrasenaCli){
        String sql ="SELECT * FROM cliente";
        Statement statement;
        ResultSet rs;

        try{
            statement = con.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                if (rs.getString("email").equals(emailCli)){
                    if (rs.getString("contrasena").equals(contrasenaCli)) {
                        System.out.println("BIENVENIDO");
                        menuCliente();
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
    public static void registro (Connection con,String nombre,String contrasena,String email,String telefono){
        Cliente cliente = new Cliente(nombre, contrasena, email, telefono);
        String sql ="insert into cliente(nombre,contrasena,email,telefono) values('"+nombre+"','"+contrasena+"','"+email+"','"+telefono+"')";
        Statement statement;
        int result;

        try {
            statement =con.createStatement();
            result = statement.executeUpdate(sql);
            if (result==1){
                System.out.println("Los datos fueron ingresados correctamente");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
    public static void comprarProducto(Connection con){
        String sql ="SELECT * FROM seguros";
        Statement statement;
        ResultSet rs;
        System.out.println("Ingrese el seguro que desea comprar :");
        String seguroComprado = sc.next();
        try{
            statement = con.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                if (rs.getString("tipo").equalsIgnoreCase(seguroComprado)){
                    System.out.println(
                            "Has comprado seguro de "+seguroComprado+" por un valor de "+rs.getDouble("costo")+" y fecha de vencimiento "
                    +rs.getString("fecha_fin"));
                }

            }
            System.out.println("NO SE ENCONTRO EL SEGURO");

        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void verProductos(Connection con){
        String sql ="SELECT * FROM seguros";
        Statement statement;
        ResultSet rs;
        int id;
        String tipo;
        String compania;
        int costo;
        String fecha_inicio;
        String fecha_fin;


        try{
            statement = con.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                id =rs.getInt("id");
                tipo =rs.getString("tipo");
                compania =rs.getString("compania");
                costo = rs.getInt("costo");
                fecha_inicio = rs.getString("fecha_inicio");
                fecha_fin = rs.getString("fecha_fin");

                System.out.println("Seguro de Tipo :"+tipo+" Costo :"+costo+
                        " Fecha Inicio :"+fecha_inicio+" Fecha Fin :"+fecha_fin);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
