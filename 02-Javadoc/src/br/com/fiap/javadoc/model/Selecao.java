package br.com.fiap.javadoc.model;

/**
 * Representa uma sele��o da copa do mundo da fifa 2022
 * @author Matheus Alencar Silva
 * @version 1.0
 *
 */

public class Selecao {
	
	/**
	 * Armazena o nome do da sele��o.
	 */
	private String nome;
	
	/**
	 * Vetor que armazena os dados dos jogadores.
	 */
	private Jogador [] jogadores;
	
	/**
	 * Construtor Padr�o.
	 */
	public Selecao () {}
	
	
	/**
	 * Construtor que recebe o nome e os jogadores da sele��o
	 * @param nome Nome da sele��o.
	 * @param Jogadores Array de jogaor.
	 */
	public Selecao(String nome, Jogador[] jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}
	
	/**
	 * @return Nome do pais da sele��o.
	 * Retorna o nome da sele��o.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome Nome da sele��o
	 * Altera o nome do pais da sele��o
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return Array de jogadores
	 * Retorna os jogadores da sele��o
	 */
	public Jogador[] getJogadores() {
		return jogadores;
	}
	
	/**
	 * Altera os jogadores da sele��o
	 * @param jogadores Array de jogadores
	 */
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
}
