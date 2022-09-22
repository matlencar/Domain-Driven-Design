package br.com.fiap.arquivos.view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.arquivos.dao.PokemonDao;
import br.com.fiap.arquivos.model.Pokemon;

public class ExemploPokemon {

	public static void main(String[] args) throws IOException {
		// Cadastrar e listar os pokemons

		// Ler os dados do pokemon(nome, tipo, ataque, estagioInicial)
		Scanner sc = new Scanner(System.in);

		PokemonDao dao = new PokemonDao();
		int opcao;
		do {
			System.out.println("Escolha: 1 - Cadastrar/ 2 - Listar/ 0 - Sair ");
			opcao = sc.nextInt();
			switch (opcao) {
			
			case 1:

				inclusao(sc, dao);
				break;
			case 2:
				exibir(dao);
				break;
			}
		} while (opcao != 0);
		sc.close();
	}

	private static void exibir(PokemonDao dao) {
		try {
			// List<Pokemon> listar = dao.listar();
			for (Pokemon p : dao.listar()) {
				System.out.println(p);
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void inclusao(Scanner sc, PokemonDao dao) {
		System.out.println("Digite o nome do pokemon: ");
		String nome = sc.next() + sc.nextLine();
		System.out.println("Dite o tipo do pokemon: ");
		String tipo = sc.next() + sc.nextLine();
		System.out.println("Valor do ataque: ");
		int ataque = sc.nextInt();
		System.out.println("Estagio inicial? True/False: ");
		boolean estagioInicial = sc.nextBoolean();

		// Instanciar o pokemon com os dados
		Pokemon pokemon = new Pokemon(nome, tipo, ataque, estagioInicial);

		// Gravar as informações do pokemon no arquivo

		try {
			dao.cadastrar(pokemon);
			System.out.println("Pokemon cadastrado");
		} catch (IOException e) {
			System.err.println("Erro.. não foi possivel cadastrar o pokemon ");
		}
	}

}
