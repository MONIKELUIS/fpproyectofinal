package modelo;

import java.net.PasswordAuthentication;

public class Usuario {
	
	private int id_usuario;
	private String nombre_usuario;
	private String email;
	private PasswordAuthentication password;
	private String fecha_registro;
	private boolean estado_usuario;
	
	public Usuario(int id_usuario, String nombre_usuario, String email,
			String fecha_registro, boolean estado_usuario) {
		super();
		this.id_usuario = id_usuario;
		this.nombre_usuario = nombre_usuario;
		this.email = email;
		this.fecha_registro = fecha_registro;
		this.estado_usuario = estado_usuario;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PasswordAuthentication getPassword() {
		return password;
	}

	public void setPassword(PasswordAuthentication password) {
		this.password = password;
	}

	public String getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public boolean isEstado_usuario() {
		return estado_usuario;
	}

	public void setEstado_usuario(boolean estado_usuario) {
		this.estado_usuario = estado_usuario;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", email=" + email
				+  ", fecha_registro=" + fecha_registro + ", estado_usuario=" + estado_usuario
				+ "]";
	}
	
	
	

}
