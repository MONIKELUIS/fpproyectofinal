package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioControlador {

	private Connection conexion;

	public UsuarioControlador(Connection conexion) {
		super();
		this.conexion = conexion;
	}

	public ArrayList<Usuario> obtenerUsuario() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		String query = "SELECT id, username,email,fecha_registro,activo FROM usuario"; // consulta base de datos

		try (Statement comando = conexion.createStatement(); ResultSet resultado = comando.executeQuery(query)) {
			 
			while (resultado.next()) {
				usuarios.add(new Usuario(
	                    resultado.getInt("id"),
	                    resultado.getString("username"),
	                    resultado.getString("email"),
	                    resultado.getString("fecha_registro"),
	                    resultado.getBoolean("activo")
	                ));
	            }

		} catch (Exception e) {
			 e.printStackTrace();
		}
		return usuarios;
	}

}
