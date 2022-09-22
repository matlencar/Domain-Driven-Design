package br.com.fiap.arquivos.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.arquivos.model.Pokemon;

/**
 * Gravar/Ler as informações de pokemon em um arquivo
 * @author matheus alencar silva
 
 */
public class PokemonDao {
	
	public List<Pokemon> listar() throws IOException{
		FileReader inputStream = new FileReader("pokedex.csv");
		
		BufferedReader reader = new BufferedReader(inputStream);
		
		//Criar a lista de pokemon
		List<Pokemon> lista = new ArrayList<Pokemon>();
		
		//Ler as linhas do arquivo
		String linha;
		while ((linha = reader.readLine()) != null) {
			//Separa as informações do pokemon
			String[] vetor = linha.split(",");
			//Instanciar pokemon
			Pokemon pokemon = new Pokemon(vetor[0],vetor[1], Integer.parseInt(vetor[2]), Boolean.parseBoolean(vetor[3]));
			
			//Adicionar o okemon na lista
			lista.add(pokemon);
		}
		return lista;
	}
	
	public void cadastrar(Pokemon pokemon ) throws IOException {
		//Abrir o outputStream para o arquivo "pokemon.csv"
		FileWriter outputStream = new FileWriter("pokedex.csv",true);
		
		//Instanciar o objeto para escrever em um arquivo
		PrintWriter printer = new PrintWriter(outputStream);
		
		//Escrever os atributos do pokemon no arquivo separados por ","
		//Exemplo: pikachu, eletrico, 22, true
		printer.print(pokemon.getNome() + "," + pokemon.getTipo() + ","
				+ pokemon.getAtaque() + "," + pokemon.isEstagioInicial());
		
		
		//Fechar as paradas
		outputStream.close();
		printer.close();
	}
}
