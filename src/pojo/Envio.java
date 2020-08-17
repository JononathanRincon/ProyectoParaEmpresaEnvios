package pojo;

import java.util.Date;

public class Envio {

	private String id;
	private String origen;
	private String destino;
	private Date horaDestino;
	private String descripcion;
	
	public Envio() {
		// TODO Auto-generated constructor stub
	}

	public Envio(String id, String origen, String destino, Date horaDestino, String descripcion) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.horaDestino = horaDestino;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getHoraDestino() {
		return horaDestino;
	}

	public void setHoraDestino(Date horaDestino) {
		this.horaDestino = horaDestino;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
