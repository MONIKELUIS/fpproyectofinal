package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.EquipoControlador;
import controlador.JugadorControlador;
import modelo.Jugador;
import util.MySQLConnection;
import vista.VentanaPrincipal;


public class Main {
	


	public static void main(String[] args) {
		MySQLConnection db = new MySQLConnection();
		Connection conexion = db.mySQLConnect();

		EquipoControlador controlador = new EquipoControlador(conexion);
		JugadorControlador jugadores = new JugadorControlador(conexion);
		
		
		VentanaPrincipal venta = new VentanaPrincipal(controlador,jugadores);
		
		
	}

}
