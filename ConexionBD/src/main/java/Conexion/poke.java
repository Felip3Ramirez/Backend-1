package Conexion;


import java.sql.*;

import java.util.ArrayList;
import java.util.Scanner;

public class poke {
    public static void main(String[] args) {

        Connection cb = ConexionBDS.conectarBD("pokemon_db");
        ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
        pokemones = Consulta(cb,pokemones);
        for (Pokemon pokemon : pokemones) {
            System.out.println(pokemon);
        }
        // Variable para buscar un Pokémon
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del Pokémon que deseas buscar: ");
        String nombreBuscado = scanner.nextLine();

        // Validar si el Pokémon existe en la lista
        boolean encontrado = false;
        for (Pokemon pokemon : pokemones) {
            if (pokemon.pokeName.equalsIgnoreCase(nombreBuscado)) { // Comparar ignorando mayúsculas/minúsculas
                System.out.println("¡Coincide el Pokémon: " + pokemon + "!");
                encontrado = true;
                break;

            }
            if (!encontrado) {
                System.out.println("No se encontró el Pokémon con el nombre: " + nombreBuscado);
                break;
            }
        }

        ConexionBDS.desconexion(cb);
    }
    public static ArrayList<Pokemon> Consulta(Connection con, ArrayList<Pokemon> pokemones)  {
        String sql ="Select * from pokemon";
        Statement stmt;
        ResultSet rs;

        try {
            stmt =con.createStatement();
            rs =stmt.executeQuery(sql);
            while (rs.next()){
                pokemones.add(new Pokemon(rs.getInt("idPokemon"),rs.getString("pokeName"),
                        rs.getInt("ataque"),rs.getInt("defensa")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return pokemones;


    }

}
class Pokemon{
    int idPokemon;
    String pokeName;
    int ataque;
    int defensa;

    public Pokemon(int idPokemon, String pokemane, int ataque, int defensa) {
        this.idPokemon = idPokemon;
        this.pokeName = pokemane;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "idPokemon=" + idPokemon +
                ", pokeName='" + pokeName + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }
}
