package br.com.fiap.vetor.view;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		// Instanciar um Scanner.
		Scanner sc = new Scanner(System.in);

		// Ler a quantidade de produto.

		// Declarar um vetor de produto com a quantidade informada.
		int produtos[] = new int[5];

		// Laço de repetição para ler o preço, quantidade e desconto.
		for (int j = 0; j < produtos.length; j++) {
			System.out.println(produtos[j]);

		}

		// Instanciando o produto com os valores lidos.
		Produto produto = new Produto();

		// Inserir o produto no vettor de produtos.

	}

}