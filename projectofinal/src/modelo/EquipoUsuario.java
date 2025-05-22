package modelo;

public class EquipoUsuario {

	private int id_equipo_usuario;
	private int usuario_id;
	private int liga_id;
	private String nombre_equipo;
	private double presupuesto;
	
	public EquipoUsuario(int id_equipo_usuario, int usuario_id, int liga_id, String nombre_equipo, double presupuesto) {
		super();
		this.id_equipo_usuario = id_equipo_usuario;
		this.usuario_id = usuario_id;
		this.liga_id = liga_id;
		this.nombre_equipo = nombre_equipo;
		this.presupuesto = presupuesto;
	}
	
	

	public int getId_equipo_usuario() {
		return id_equipo_usuario;
	}



	public void setId_equipo_usuario(int id_equipo_usuario) {
		this.id_equipo_usuario = id_equipo_usuario;
	}



	public int getUsuario_id() {
		return usuario_id;
	}



	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}



	public int getLiga_id() {
		return liga_id;
	}



	public void setLiga_id(int liga_id) {
		this.liga_id = liga_id;
	}



	public String getNombre_equipo() {
		return nombre_equipo;
	}



	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}



	public double getPresupuesto() {
		return presupuesto;
	}



	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}



	@Override
	public String toString() {
		return "EquipoUsuario [id_equipo_usuario=" + id_equipo_usuario + ", usuario_id=" + usuario_id + ", liga_id="
				+ liga_id + ", nombre_equipo=" + nombre_equipo + ", presupuesto=" + presupuesto + "]";
	}
	
	
	

}
