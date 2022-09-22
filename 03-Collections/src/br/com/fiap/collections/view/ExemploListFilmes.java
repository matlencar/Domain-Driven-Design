package br.com.fiap.collections.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.collections.model.Filme;

public class ExemploListFilmes {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Criar uma lista de filmes.
		List<Filme> filmes = new ArrayList<>();
		
		
		//Adicionar 2 filmes na lista.
		//Filme filme1 = new Filme("Watchmen", 210, "Ação") <--- Primeira forma de fazer.
		//filmes.add(filme1);
		
		//Filme filme1 = new Filme("Watchmen",210,"Ação");
		//filmes.add(filme1);
		
		//Adicionar os filmes inseridos pelo usuario.
		
		boolean continuar;
		do{
	
			//Ler o filme
			System.out.println("Digite o nome do filme: ");
			String nome = leitor.next() + leitor.nextLine();
			
			System.out.println("Digite a duração do filme: ");
			int duracao = leitor.nextInt();
			
			System.out.println("Digite o genero do filme: ");
			String genero = leitor.next() + leitor.nextLine();
			
			filmes.add(new Filme(nome, duracao, genero));
			
			System.out.println("Deseja adicionar mais um filme? s ou n ");
			//Le a informação do usuario e compara com "S", sem considerar maiusculas e minusculas.
			continuar = leitor.next().equalsIgnoreCase("s");
		}while(continuar);
		
		//Exibir os dados do filme da lista.
		for (Filme movie: filmes) {
			System.out.println(movie);
		}
		
		leitor.close();
	}

}
