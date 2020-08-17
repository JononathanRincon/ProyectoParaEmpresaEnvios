package db;

import javax.sql.rowset.CachedRowSet;

import pojo.Departamento;

public class DbDepartamento {

	public DbDepartamento() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert( Departamento departamento ) throws Exception{
		String sql = "INSERT INTO `departamentos`(`ID_DEPARTAMENTO`, `NOMBRE`, `EMPRESA_NIT`) "
				+ "VALUES ('%s','%s','%s');";
							
		sql = String.format(sql, 
				departamento.getId(),
				departamento.getNombre(),
				departamento.getIdEmpresa());
		
		ConexionBD conexionBD = new ConexionBD();
		conexionBD.ejecutar(sql);
		
	}
	
	public void update( Departamento departamento ) throws Exception{
		String sql = "UPDATE `departamentos` SET "
				+ "`NOMBRE`= '%s', "
				+ "`EMPRESA_NIT`= '%s' "
				+ "WHERE `ID_DEPARTAMENTO`= '%s';";
				
		sql = String.format(sql, 
				departamento.getNombre(),
				departamento.getIdEmpresa(),
				departamento.getId());
		
	}
	
	public CachedRowSet select() throws Exception{
		String sql = "SELECT "
				+ "`ID_DEPARTAMENTO`, "
				+ "`NOMBRE`, "
				+ "`EMPRESA_NIT` FROM `departamentos`;";
		
		return null;
	}
	
}
