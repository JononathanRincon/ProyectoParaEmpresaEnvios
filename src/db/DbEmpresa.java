package db;

import javax.sql.rowset.CachedRowSet;

import pojo.Empresa;

public class DbEmpresa {

	public DbEmpresa() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert( Empresa empresa ) throws Exception{
		String sql = "INSERT INTO `empresa`(`NIT`, `NOMBRE_EMPRESA`, `DIRECCION`, `TELEFONO`, `ESTADO_SOCIAL`) "
				+ " VALUES ('%s','%s','%s','%s','%s');";
		
		sql = String.format(sql, 
				empresa.getNit(),
				empresa.getNombre(),
				empresa.getDireccion(),
				empresa.getTelefono(),
				empresa.getEstado());
		
		ConexionBD conexionBD = new ConexionBD();
		conexionBD.ejecutar(sql);
		
	}
	
	public void update( Empresa empresa ) throws Exception{
		String sql = "UPDATE `empresa` SET "
				+ "`NOMBRE_EMPRESA`= '%s', "
				+ "`DIRECCION`= '%s', "
				+ "`TELEFONO`= '%s', "
				+ "`ESTADO_SOCIAL`= '%s' "
				+ "WHERE  "
				+ "`NIT` = '%s';";
		
		sql = String.format(sql, 
				empresa.getNombre(), 
				empresa.getDireccion(),
				empresa.getTelefono(),
				empresa.getEstado());
		
	}
	
	public CachedRowSet select() throws Exception{
		String sql = "SELECT "
				+ "`NIT`, "
				+ "`NOMBRE_EMPRESA`, "
				+ "`DIRECCION`, "
				+ "`TELEFONO`, "
				+ "`ESTADO_SOCIAL` "
				+ "FROM `empresa`;";
		
		return null;
	}
}
