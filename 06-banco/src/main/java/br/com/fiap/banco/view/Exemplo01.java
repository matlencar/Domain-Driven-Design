package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.banco.factory.ConnectionFactory;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		
		try {
			
			Connection conexao = ConnectionFactory.getConnection();
		//Conectar com o banco de dados
			//Registrar o drive do banco de dados que sera utilizado
	
		
		//Cadastrar um filme
		//Criar o objeto para executar comandos SQL no banco
		Statement stm = conexao.createStatement();
		
		int qtdLinhas = stm.executeUpdate("insert into tdss_tb_filme values (sq_tdss_tb_filme.nextval, 'Mad Max', 120, to_date('21/05/2015', 'dd/mm/yyyy'), 'Acao')");
		
		System.out.println("Linhas afetadas " + qtdLinhas);
		
		//Fechar conexao
		conexao.close();
		
		}catch(ClassNotFoundException e) {
			System.out.println("A classe (Driver) não existe");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Não foi possivel conectar no banco de dados");
			e.printStackTrace();
		}
	}
}
