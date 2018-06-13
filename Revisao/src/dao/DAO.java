package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import db.ConnectDB;

public class DAO {
	
	protected ConnectDB db;
	protected Connection connection;
	
	public DAO(){
		db = new ConnectDB();
		
	}
	
	public void desconectar() throws Exception {
		if(connection != null)
			connection.close();
	}


}
