package db;

import javax.sql.rowset.CachedRowSet;

import pojo.Sede;

public class DbSede {

	public DbSede() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert( Sede sede ) throws Exception{
		String sql = "INSERT INTO `sedes`(`ID_SEDES`, `NOMBRE`, `DIRECCION`, `TELEFONO`, `DEPARTAMENTO_ID_DEPARTAMENTO`) "
				+ "VALUES ('%s','%s','%s','%s','%s');";	
				
		sql = String.format(sql, 
				sede.getId(),
				sede.getNombre(),
				sede.getDireccion(),
				sede.getTelefono(),
				sede.getIdDepartamento());
		
		ConexionBD conexionBD = new ConexionBD();
		conexionBD.ejecutar(sql);
	}
	
	public void update( Sede sede ) throws Exception{
		String sql = "UPDATE `sedes` SET "
				+ " `NOMBRE`= '%s', "
				+ "`DIRECCION`='%s', "
				+ "`TELEFONO`='%s', "
				+ "`DEPARTAMENTO_ID_DEPARTAMENTO`='%s' "
				+ "WHERE `ID_SEDES`='%s';";
				
		sql = String.format(sql, 
				sede.getNombre(),
				sede.getDireccion(),
				sede.getTelefono(),
				sede.getIdDepartamento());		
	}
	
	public CachedRowSet select() throws Exception{
		String sql = "SELECT "
				+ "`ID_SEDES`, "
				+ "`NOMBRE`, "
				+ "`DIRECCION`, "
				+ "`TELEFONO`, "
				+ "`DEPARTAMENTO_ID_DEPARTAMENTO` "
				+ "FROM `sedes`;";
		
		return null;
	}
	
}
