package br.com.fiap.javadoc.view;

import java.util.Scanner;

import br.com.fiap.javadoc.model.Jogador;
import br.com.fiap.javadoc.model.Selecao;

public class View {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Instanciar dois jogadores.
		Jogador ney = new Jogador("Neymar", 10);
		Jogador rafa = new Jogador("Rafinha", 8);
		
		//Criar um vetor de jogadores e adicionar os jogadores no vetor
		//Jogador [] time = new Jogador[2];
		//time[0] = ney;
		//time[1] = rafa;
		Jogador [] time = {ney, rafa, new Jogador("Casimiro", 5)};
		
		//Instanciar uma seleção com o nome e o array de jogadores.
		Selecao brasil =  new Selecao ("Brasil", new Jogador[] {ney, rafa});
	}

}
