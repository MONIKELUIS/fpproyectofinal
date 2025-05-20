package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Equipo;
import modelo.Jugador;

public class JugadorControlador {

	private Connection conexion;

	public JugadorControlador(Connection conexion) {
		this.conexion = conexion;
	}

	public List<Jugador> obtenerJugadores(int equipo_id) {
		
		
		List<Jugador> jugadores = new ArrayList<>();
		String query = "SELECT id, nombre,apellido,nacimiento,pais_id,equipo_id,valor_mercado FROM jugador WHERE equipo_id ="+ equipo_id;

		try (Statement comando = conexion.createStatement(); ResultSet resultado = comando.executeQuery(query)) {

			while (resultado.next()) {
				jugadores.add(new Jugador(resultado.getInt("id"), resultado.getString("nombre"),
						resultado.getString("apellido"), resultado.getString("nacimiento"), resultado.getInt("pais_id"),
						resultado.getInt("equipo_id"), resultado.getInt("valor_mercado")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return jugadores;
	}

}
