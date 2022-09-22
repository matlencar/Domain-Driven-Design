package br.com.fiap.arquivos.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ExemploEscrita {
	
	/*
	 *Escrever em um arquivo texto 
	 */

	public static void main(String[] args) {
		try {
		//Abrir o fluxo de saida de dados - (Nome do arquivo, adicionar e não substituir informções)
		FileWriter outputsream = new FileWriter("log.txt", true);
		
		//Objeto que escrever texto no arquivo
		PrintWriter printer = new PrintWriter(outputsream);
		
		//Ler um valor que sera escrito no arquivo
		String texto = JOptionPane.showInputDialog("Digite o nome do seu projeto: ");
		
		//Escrever o texto no arquivo
		printer.println(texto);
		
		//Fechar o arquivo e o stream
		printer.close();
		outputsream.close();
		
		System.out.println("Gravado");
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
