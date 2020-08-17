package db;

import javax.sql.rowset.CachedRowSet;

import pojo.Administrador;

public class DbAdministrador {

	public DbAdministrador() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert( Administrador administrador ) throws Exception{
		String sql = "INSERT INTO `administrador`(`ID_ADMINISTRADOR`, `NOMBRE_COMPLETO`, `CEDULA`, `FECHA_DE_NACIMIENTO`, `CONTRASEÑA`, `TELEFONO`, `SEDES_IDSEDES`) "
				+ "VALUES ('%s','%s','%s',CURRENT_DATE,'%s','%s','%s')";
					
		sql = String.format(sql, 
				administrador.getId(),
				administrador.getNombre(),
				administrador.getCedula(),
				administrador.getPass(),
				administrador.getTelefono(),
				administrador.getIdSede()
				);
		
		ConexionBD conexionBD = new ConexionBD();
		conexionBD.ejecutar(sql);
		
	}
	
	public void update( Administrador administrador ) throws Exception{
		String sql = "UPDATE `administrador` SET "
				+ "`NOMBRE_COMPLETO`= '%s',"
				+ "`CEDULA`= '%s',"
				+ "`FECHA_DE_NACIMIENTO`= CURRENT_DATE,"
				+ "`CONTRASEÑA`= '%s',"
				+ "`TELEFONO`= '%s',"
				+ "`SEDES_IDSEDES`= '%s' "
				+ "WHERE `ID_ADMINISTRADOR`= '%s';";
				
		sql = String.format(sql,  
				administrador.getNombre(),
				administrador.getCedula(),
				administrador.getCedula(),
				administrador.getPass(),
				administrador.getTelefono(),
				administrador.getIdSede(),
				administrador.getId()				
				);
		
	}
	
	public CachedRowSet select() throws Exception{
		String sql = "SELECT "
				+ "`ID_ADMINISTRADOR`, "
				+ "`NOMBRE_COMPLETO`, "
				+ "`CEDULA`, "
				+ "`FECHA_DE_NACIMIENTO`, "
				+ "`CONTRASEÑA`, "
				+ "`TELEFONO`, "
				+ "`SEDES_IDSEDES` "
				+ "FROM `administrador`;";
		
		return null;
	}
	
}
