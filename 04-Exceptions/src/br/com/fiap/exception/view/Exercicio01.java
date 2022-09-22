package br.com.fiap.exception.view;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

	public static void main(String[] args) {
		//Lista de notas de checkpoint (3)
		List<Double> notas = new ArrayList<>();
		
		//Tratar a exception
		//try -> bloco de código que pode gerar a exception
		try {
			//Imprimir a primeira nota da lista
			System.out.println(notas.get(0));
			System.out.println("OK");
		//catch -> captura da exceção e o tratamento	
		} catch(IndexOutOfBoundsException | NullPointerException e ) {
			System.out.println("Nao foi possivel acessar a primeira nota");
		} catch(Exception e) {
			System.out.println("Erro genérico");
		//finally -> bloco que sempre será excecutado	
		} finally {
			System.out.println("Fechar os recursos utilizados");
		}
		System.out.println("Finalizando o programa");
	}	

}
