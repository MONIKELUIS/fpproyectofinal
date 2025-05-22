package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.EquipoControlador;
import controlador.EquipoUsuarioControlador;
import controlador.JugadorControlador;
import controlador.UsuarioControlador;
import modelo.Jugador;
import util.MySQLConnection;
import vista.VentanaEquiposUsuarios;
import vista.VentanaPrincipal;


public class Main {
	


	public static void main(String[] args) {
		MySQLConnection db = new MySQLConnection();
		Connection conexion = db.mySQLConnect();
		
		/*
		 * Ventana principal con busqueda
		EquipoControlador controlador = new EquipoControlador(conexion);
		JugadorControlador jugadores = new JugadorControlador(conexion);
		VentanaPrincipal venta = new VentanaPrincipal(controlador,jugadores);
		*/
		
		UsuarioControlador usuarioControlador = new UsuarioControlador(conexion);
		EquipoUsuarioControlador EquipoUsuarioControlador = new EquipoUsuarioControlador(conexion);
		VentanaEquiposUsuarios VentanaEquiposUsuarios = new VentanaEquiposUsuarios(usuarioControlador, EquipoUsuarioControlador);
		
		
	}

}
