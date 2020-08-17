package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConexionBD {
	
	public  String usuario = "root"; 
	public  String clave = ""; 
	public  String ip = "localhost"; 
	public  String puerto = "3306";
	public  String basedatos = "sis";
	public  Connection connection;	

	
	public Connection conectar() throws ClassNotFoundException, SQLException{			
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection conn =  DriverManager.getConnection("jdbc:mysql://"+ip+":"+puerto+"/"+basedatos+"", usuario,clave);				
		return conn;		
	}
							
	public void ejecutar(String sql) throws Exception {		
		connection = conectar();		
		PreparedStatement pstm = connection.prepareStatement(sql);		
		pstm.executeUpdate();
		pstm.close();
		connection.close();
	}	
}
