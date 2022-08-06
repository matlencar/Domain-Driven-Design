package br.com.fiap.vetor.view;

import java.util.Locale;
import java.util.Scanner;
import br.com.fiap.vetor.model.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		// Declarar o leitor de teclado Scanner.
		Scanner sc = new Scanner(System.in);

		// Ler a quantidade de produto.
		System.out.println("Digite a quantidade de produtos ");
		int quantidade = sc.nextInt();

		// Declarar um vetor de produto com a quantidade informada.
		Produto [] produtos = new Produto[quantidade];
		
		// Laço de repetição para ler o preço, quantidade e desconto.
		for(int i = 0; i < produtos.length; i++) {
			//Ler o preço, quantidade e desconto.
			System.out.println("Digite o preço do produto " + (i + 1));
			double preco = sc.nextDouble();
			
			System.out.println("Digite o quantidade do produto " + (i + 1));
			int qtds = sc.nextInt();
			
			System.out.println("Digite o desconto (%) do preduto " + (i + 1));
			int desconto = sc.nextInt();
			
			// Instanciando um produto com os valores lidos.
			Produto produto = new Produto(quantidade, preco, desconto);

			// Inserir o produto no vetor de produtos.
			produtos[i] = produto;
			
		}
		
		//Declarar uma variavel para armazenar o preço total
		double valorTotal = 0;
				
		//Calcular o valor total a ser pago.
		for (int i = 0; i < produtos.length; i++) {
			//Calcular preço do produto com o desconto
			double precoComDesconto = produtos[i].getPreco() - (produtos[i].getPreco() * produtos[i].getDesconto() / 100);
			
			//Calcular o preço final do produto: preço com desconto * quantidade
			double precoProdutoFinal = precoComDesconto * produtos[i].getQuantidade();
			
			//Adicionar o preço final do produto na variavel do preço total da compra
			valorTotal += precoProdutoFinal;
			
		}
		//Exibir o preço total a ser pago
		System.out.println("O valor total da compra é " + valorTotal);
		
		//Fechamento do leior.
		sc.close();
	}

}