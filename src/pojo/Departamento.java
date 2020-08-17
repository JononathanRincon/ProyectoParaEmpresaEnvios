package pojo;

public class Departamento {
	
	private String id;
	private String nombre;
	private String idEmpresa;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Departamento(String id, String nombre, String idEmpresa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idEmpresa = idEmpresa;
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

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}	
}
