package Conexion;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) {

        String bd ="seguros";
        Connection cb = ConexionBDS.conectarBD(bd);
        //Consulta.Insert(cb,"manolo","manolito@correo.com");
        //Consulta.Delete(cb,5);
        Consulta.Update(cb,6,"Patroclo");
        Consulta.Consultar(cb);

        ConexionBDS.desconexion(cb);
    }

}
