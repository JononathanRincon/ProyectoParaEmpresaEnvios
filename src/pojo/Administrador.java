package pojo;

import java.util.Date;

public class Administrador {
	
	private String id;
	private String nombre;
	private String cedula;
	private Date fechaVencimiento;
	private String pass;
	private String telefono;
	private String idSede;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String id, String nombre, String cedula, Date fechaVencimiento, String pass, String telefono,
			String idSede) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.fechaVencimiento = fechaVencimiento;
		this.pass = pass;
		this.telefono = telefono;
		this.idSede = idSede;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIdSede() {
		return idSede;
	}

	public void setIdSede(String idSede) {
		this.idSede = idSede;
	}		
}
