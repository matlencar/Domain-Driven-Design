package br.com.fiap.arquivos.view;

import java.io.File;
import java.io.IOException;

public class ExemploDiretorio {

	public static void main(String[] args) {
		//Criar um objeto que representa um diretorio (pasta) chamado pokedex
		File diretorio = new File("Pokedex");
		
		//Validar se o objeto existe e é um diretorio
		if(diretorio.isDirectory()) {
			//Exibir o caminho completo do diretorio
			System.out.println(diretorio.getAbsolutePath());
			
			//Recuperar arquivos e diretorios
			File[] files = diretorio.listFiles();
			
			//Exibir a quantidade de arquivos no diretorio
			
			//Exibir a quantidade de diretorios no diretorio
			
			//Exibir a quantidade de arquivos no diretorio
			System.out.println(diretorio.length() + " arquivos");
			
			//Criar um arquivo dentro do diretorio
			File arquivo = new File(diretorio, "pikachu.txt");
			try {
			arquivo.createNewFile();
			System.out.println("Arquivo criado");
			}catch (IOException e) {
				System.err.println(e.getMessage());
			}
		} else {
			diretorio.mkdir();
			System.out.println("diretorio criado com sucesso");
		}
		
		//Se nao existir, vamos criar o diretorio
		

	}

}
