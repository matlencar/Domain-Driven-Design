package br.com.fiap.banco.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Fabrica de conexões
 * @author Matheus Alencar
 */
public class ConnectionFactory {
	
	
	/**
	 * Obtem uma conexao com o banco de dados
	 * @return Connection coxexão com o banco de dados
	 * @throws ClassNotFoundException, SQLException 
	 */
	//Conectar com o banco de dados
	//Registrar com o banco de dados
	// static -> nao precisa do objeto para ser utilizado
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Obter a connexao com banco de dados
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
				"rm94642","280894");
		
		return conexao;
	}
}
