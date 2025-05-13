package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.MySQLConnection;
import vista.VentaGeneral;

public class Main {
	public static void mostrarClientes(Connection conexion) {

		String query = "SELECT * FROM jugador";

		try {
			Statement comando = conexion.createStatement();

			ResultSet resultado = comando.executeQuery(query);
			System.out.println("Obteniendo jugadores...1");

			/* Se imprimen los registros que estén guardados en la base de datos */
			while (resultado.next()) {
				System.out.println("Obteniendo jugadores...2");
				System.out.println("id: " + resultado.getInt(1) + "\nNombre: " + resultado.getString(2) + "\nApellido: "
						+ resultado.getString(3) + "\nFechaNacimiento: " + resultado.getString(4) + "\npais_id: "
						+ resultado.getInt(5) +"\nequipo_id: "+resultado.getInt(6) );

				System.out.println("------------------------------------------");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MySQLConnection db = new MySQLConnection();
		Connection conexion = db.mySQLConnect();

		mostrarClientes(conexion);
		
		System.out.println("Fin - Cerramos conexión");
		
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		VentaGeneral ventana = new VentaGeneral();

	}

}
