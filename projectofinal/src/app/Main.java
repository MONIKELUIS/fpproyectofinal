package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.MySQLConnection;
import vista.VentaGeneral;

public class Main {
	public static void mostrarJugadores(Connection conexion) {

		String query = "SELECT * FROM jugador";

		try {
			Statement comando = conexion.createStatement();

			ResultSet resultado = comando.executeQuery(query);
			//contador para que se vaya sumando y printee que numero es ese jugador, que no se quede 
			int numresul=1;
			System.out.println("Obteniendo informacion...");

			/* Se imprimen los registros que estén guardados en la base de datos */
			while (resultado.next()) {
				System.out.println("Obteniendo jugadores..."+numresul);
				System.out.println("id: " + resultado.getInt(1) + "\nNombre: " + resultado.getString(2) + "\nApellido: "
						+ resultado.getString(3) + "\nFechaNacimiento: " + resultado.getString(4) + "\npais_id: "
						+ resultado.getInt(5) +"\nequipo_id: "+resultado.getInt(6) );

				System.out.println("------------------------------------------");
				numresul++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void mostrarEquipos(Connection conexion) {
		String query = "SELECT * FROM Equiporeal";

		try {
			Statement comando = conexion.createStatement();

			ResultSet resultado = comando.executeQuery(query);
			//contador para que se vaya sumando y printee que numero es ese equipo, que no se quede 
			int numresul=1;
			System.out.println("Obteniendo informacion...");

			/* Se imprimen los registros que estén guardados en la base de datos */
			while (resultado.next()) {
				
				System.out.println("Obteniendo equipos..."+numresul);
				System.out.println("id: " + resultado.getInt(1) + "\nNombre: " + resultado.getString(2) + "\nfundacion: "
						+ resultado.getString(3) + "\npais_id: " + resultado.getInt(4) );
				if(resultado.getInt(5)==0) {
					System.out.println("estadio_id: "+ "este equipo no tiene un estadio asignado");
				}else {
				System.out.println("estadio_id: "+ resultado.getInt(5));
				}

				System.out.println("------------------------------------------");
				numresul++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void mostrarEstadios(Connection conexion) {
		String query = "SELECT * FROM Estadio";

		try {
			Statement comando = conexion.createStatement();

			ResultSet resultado = comando.executeQuery(query);
			//contador para que se vaya sumando y printee que numero es ese equipo, que no se quede 
			int numresul=1;
			System.out.println("Obteniendo informacion...");

			/* Se imprimen los registros que estén guardados en la base de datos */
			while (resultado.next()) {
				
				System.out.println("Obteniendo Estadios..."+numresul);
				System.out.println("id: " + resultado.getInt(1) + "\nNombre: " + resultado.getString(2) + "\nfundacion: "
						+ resultado.getInt(3) + "\npais_id: " + resultado.getInt(4) );
				if(resultado.getInt(5)==0) {
					System.out.println("estadio_id: "+ "este equipo no tiene un estadio asignado");
				}else {
				System.out.println("estadio_id: "+ resultado.getInt(5));
				}

				System.out.println("------------------------------------------");
				numresul++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		MySQLConnection db = new MySQLConnection();
		Connection conexion = db.mySQLConnect();

		mostrarEquipos(conexion);
		
		System.out.println("Fin - Cerramos conexión");
		
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("prueba2");
		// VentaGeneral ventana = new VentaGeneral();

	}

}
