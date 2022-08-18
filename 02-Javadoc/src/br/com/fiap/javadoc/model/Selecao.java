package br.com.fiap.javadoc.model;

/**
 * Representa uma seleção da copa do mundo da fifa 2022
 * @author Matheus Alencar Silva
 * @version 1.0
 *
 */

public class Selecao {
	
	/**
	 * Armazena o nome do da seleção.
	 */
	private String nome;
	
	/**
	 * Vetor que armazena os dados dos jogadores.
	 */
	private Jogador [] jogadores;
	
	/**
	 * Construtor Padrão.
	 */
	public Selecao () {}
	
	
	/**
	 * Construtor que recebe o nome e os jogadores da seleção
	 * @param nome Nome da seleção.
	 * @param Jogadores Array de jogaor.
	 */
	public Selecao(String nome, Jogador[] jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}
	
	/**
	 * @return Nome do pais da seleção.
	 * Retorna o nome da seleção.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome Nome da seleção
	 * Altera o nome do pais da seleção
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return Array de jogadores
	 * Retorna os jogadores da seleção
	 */
	public Jogador[] getJogadores() {
		return jogadores;
	}
	
	/**
	 * Altera os jogadores da seleção
	 * @param jogadores Array de jogadores
	 */
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
}
