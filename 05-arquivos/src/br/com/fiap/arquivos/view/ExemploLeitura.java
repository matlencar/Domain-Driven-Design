package br.com.fiap.arquivos.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {

	public static void main(String[] args) {
		try {
		//Abrir o fluxo de entrada de dados
		FileReader inputStream = new  FileReader("log.txt");
			
		//Criar o objeto que le as linhas do arquivo texto
		BufferedReader reader = new BufferedReader(inputStream);
			
		//Variavel que armazena o texto das linhas do arquivo
		String linha;
		
		//Ler as linhas do arquivo texto
		while((linha = reader.readLine()) != null) {
			//Exibir as linhas do arquivo texto
			System.out.println(linha);
		}
		
		//Fechar o arquivo
		reader.close();
		inputStream.close();
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
