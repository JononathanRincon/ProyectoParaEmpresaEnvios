package db;

import javax.sql.rowset.CachedRowSet;

import pojo.Envio;

public class DbEnvio {

	public DbEnvio() {
		// TODO Auto-generated constructor stub
	}
	
	public void insert( Envio envio ) throws Exception{
		String sql = "INSERT INTO `envios`(`IDENVIOS`, `CIUDAD_ORIGEN`, `CIUDAD_DESTINO`, `HORA_ENVIO`, `DETALLES_ENVIO`) "
				+ "VALUES ('%s','%s','%s',CURRENT_TIME,'%s');";
								
		sql = String.format(sql, 
				envio.getId(),
				envio.getOrigen(),
				envio.getDestino(),
				envio.getDescripcion());		
		
		ConexionBD conexionBD = new ConexionBD();
		conexionBD.ejecutar(sql);
	}
	
	public void update( Envio envio ) throws Exception{
		String sql = "UPDATE `envios` SET "
				+ "`CIUDAD_ORIGEN` = '%s', "
				+ "`CIUDAD_DESTINO` = '%s', "
				+ "`HORA_ENVIO` = CURRENT_TIME, "
				+ "`DETALLES_ENVIO` = '%s' "
				+ "WHERE `IDENVIOS` = '%s';";
						
		sql = String.format(sql, 
				envio.getOrigen(),
				envio.getDestino(),
				envio.getDescripcion(),
				envio.getId());
		
	}
	
	public CachedRowSet select() throws Exception{
		String sql = "SELECT "
				+ "`IDENVIOS`, "
				+ "`CIUDAD_ORIGEN`, "
				+ "`CIUDAD_DESTINO`, "
				+ "`HORA_ENVIO`, "
				+ "`DETALLES_ENVIO` "
				+ "FROM `envios`;";
		
		return null;
	}
}
