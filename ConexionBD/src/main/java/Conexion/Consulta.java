package Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta {
    public static void Consultar(Connection con){
        String sql ="SELECT * FROM usuarios";
        Statement statement;
        ResultSet rs;
        int id;
        String nombre;
        String telefono;
        String email;
        String tipo;
        int idEmpleado;
        int idAdministrador;


        try{
            statement = con.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()){
            id =rs.getInt("id");
            nombre =rs.getString("nombre");
            telefono =rs.getString("telefono");
            email =rs.getString("email");
            tipo =rs.getString("tipo");
                System.out.println("ID :"+id+" Name :"+nombre+" telefono :"+telefono+" Eamil :"+email+" Tipo :"+tipo);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void Insert(Connection con,String nombre,String email){
        String sql ="insert into usuarios(nombre,email) values('"+nombre+"','"+email+"')";
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
    public static void Delete(Connection con, int id){
        String sql = "delete from usuarios where id ='"+id+"'";
        Statement statement;
        int result;
        try {
            statement=con.createStatement();
            result=statement.executeUpdate(sql);
            if (result==1){
                System.out.println("Se borro el usuario con id :"+id);
            }else{
                System.out.println("No se encuentra el usuario "+id);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void Update(Connection con, int id,String nombre){
        String sql = "update usuarios set nombre ='"+nombre+"' where id = '"+id+"'";
        Statement statement ;
        int result;

        try {
            statement = con.createStatement();
            result =statement.executeUpdate(sql);
            if (result==1){
                System.out.println("Se actualizaron los datos de usuario con id :"+id);
            }else{
                System.out.println("No se encuentra el usuario "+id);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }


}
