package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.EquipoUsuario;


public class EquipoUsuarioControlador {

	private Connection conexion;

	public EquipoUsuarioControlador(Connection conexion) {
		super();
		this.conexion = conexion;
	}

	public ArrayList<EquipoUsuario> obtenerEquiposUsuario() {
		ArrayList<EquipoUsuario> equiposUsurios = new ArrayList<EquipoUsuario>();

		String query = "SELECT id, usuario_id,liga_id,nombre_equipo,presupuesto FROM equipousuario"; // consulta base de datos

		try (Statement comando = conexion.createStatement(); ResultSet resultado = comando.executeQuery(query)) {
			 
			while (resultado.next()) {
				equiposUsurios.add(new EquipoUsuario(
	                    resultado.getInt("id"),
	                    resultado.getInt("usuario_id"),
	                    resultado.getInt("liga_id"),
	                    resultado.getString("nombre_equipo"),
	                    resultado.getDouble("presupuesto")
	                ));
	            }

		} catch (Exception e) {
			 e.printStackTrace();
		}
		return equiposUsurios;
	}
}
