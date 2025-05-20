package modelo;

import java.time.format.DateTimeFormatter;

public class Jugador {
	private int id_jugador;
	private String nombre_jugador;
	private String apellido_jugador;
	private String  fecha_nacimiento;
	private int pais_id;
	private int equipo_id;
	private double valor_mercado;
	


	public Jugador(int id_jugador, String nombre_jugador, String apellido_jugador, String fecha_nacimiento, int pais_id,
			int equipo_id, double valor_mercado) {
		super();
		this.id_jugador = id_jugador;
		this.nombre_jugador = nombre_jugador;
		this.apellido_jugador = apellido_jugador;
		this.fecha_nacimiento = fecha_nacimiento;
		this.pais_id = pais_id;
		this.equipo_id = equipo_id;
		this.valor_mercado = valor_mercado;
	}

	public int getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}

	public String getNombre_jugador() {
		return nombre_jugador;
	}

	public void setNombre_jugador(String nombre_jugador) {
		this.nombre_jugador = nombre_jugador;
	}

	public String getApellido_jugador() {
		return apellido_jugador;
	}

	public void setApellido_jugador(String apellido_jugador) {
		this.apellido_jugador = apellido_jugador;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getPais_id() {
		return pais_id;
	}

	public void setPais_id(int pais_id) {
		this.pais_id = pais_id;
	}

	public int getEquipo_id() {
		return equipo_id;
	}

	public void setEquipo_id(int equipo_id) {
		this.equipo_id = equipo_id;
	}
	

	public double getValor_mercado() {
		return valor_mercado;
	}

	public void setValor_mercado(double valor_mercado) {
		this.valor_mercado = valor_mercado;
	}

	@Override
	public String toString() {
		return "ID: " + id_jugador + ", Nombres: " + nombre_jugador + ", Apellidos: "
				+ apellido_jugador + "\nFecha de Nacimiento: " + fecha_nacimiento + ", Pais id: " + pais_id + ", Equipo id: "
				+ equipo_id ;
		
	}
	
	
	
	
	
}
