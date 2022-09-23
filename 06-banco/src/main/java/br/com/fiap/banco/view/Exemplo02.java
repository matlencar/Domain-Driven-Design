package br.com.fiap.banco.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.fiap.banco.factory.ConnectionFactory;

public class Exemplo02 {
	
	//Consultar os filmes
	public static void main(String[] args) {
		
		
		//Conectar com o banco de dados
		try {
			Connection conexao = ConnectionFactory.getConnection();
			
			Statement stm = conexao.createStatement();
			
			//Pesquisar por todos os filmes
			ResultSet resultSet = stm.executeQuery("select * from tdss_tb_filme");
			
			//Percorrer os registros encontrados
			
			while(resultSet.next()) {
				//Pega o valor da coluna
				Integer id = resultSet.getInt("cd_filme");
				String nome = resultSet.getString("nm_filme");
				double minutos = resultSet.getDouble("nr_minutos");
				String data = resultSet.getString("dt_lancamento");
				String genero = resultSet.getString("ds_genero");
				
				System.out.println(id + " " + nome + " " + minutos + " " + data + " " + genero);
			}
			
			//exibir os valoes dos registros
			
			conexao.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
