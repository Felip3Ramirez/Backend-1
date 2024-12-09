package Seguros;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {
    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email, telefono, tipo, id_empleado, id_administrador) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = ConexionBD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getEmail());
            statement.setString(3, usuario.getTelefono());
            if (usuario instanceof Cliente) {
                statement.setString(4, "cliente");
                statement.setString(5, ((Cliente) usuario).getIdEmpleado());
                statement.setString(6, null);
            } else if (usuario instanceof Administrador) {
                statement.setString(4, "administrador");
                statement.setString(5, null);
                statement.setString(6, ((Administrador) usuario).getidAdministrador());
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario obtenerUsuario(int id) {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        Usuario usuario = null;
        try (Connection connection = ConexionBD.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("telefono");
                String tipo = resultSet.getString("tipo");
                if ("cliente".equals(tipo)) {
                    String idEmpleado = resultSet.getString("numero_poliza");
                    usuario = new Cliente(nombre, email, telefono, idEmpleado);
                } else if ("administrador".equals(tipo)) {
                    String idAdministrador = resultSet.getString("id_empleado");
                    usuario = new Administrador(nombre, email, telefono, idAdministrador);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}
