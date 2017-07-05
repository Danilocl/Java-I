package db;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		new ConnectionFactory();
		Connection cn = ConnectionFactory.getConnection();
		System.out.println("Conexão Criada com Sucesso !!");
	
		try {
			
			cn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
