package br.com.fiap.arquivos.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploFile {

	public static void main(String[] args) {

		// Criar u objeto que representa um arquivo
		File arquivo = new File("pokedex.csv");

		// Trabalhar cm o arquivo...
		// Verificar se o arquivo exite e se é um arquivo
		if (arquivo.exists() && arquivo.isFile()) {
			// Exibir o caminho completo(path completo)
			System.out.println(arquivo.getAbsolutePath());

			// Exibir o tamanho do arquivo
			System.out.println(arquivo.length() + " bytes");

			// Apagar arquivo
			arquivo.delete();
			System.out.println("Arquivo removido");
		} else {
			// Criar arquivo
			try {
				arquivo.createNewFile();
				System.out.println(arquivo.getName() + "criado");
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

		try {

			// Escrever no arquivo
			FileWriter outputStream = new FileWriter(arquivo);

			// Ler o arquivo
			FileReader inputStream = new FileReader(arquivo);

			outputStream.close();
			inputStream.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
