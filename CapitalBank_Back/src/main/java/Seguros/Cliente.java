package Seguros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente extends Usuario {
    public Cliente(String nombre, String contrasena, String email, String telefono) {
        super(nombre, contrasena, email, telefono);
    }

    public static void comprarProducto(Connection con){

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

                System.out.println("ID :"+id+" Tipo :"+tipo+" Compañia :"+compania+" Costo :"+costo+
                        " Fecha Inicio :"+fecha_inicio+" Fecha Fin :"+fecha_fin);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
