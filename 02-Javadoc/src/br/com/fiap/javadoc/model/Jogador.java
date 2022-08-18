package br.com.fiap.javadoc.model;

/**
 * Classe que reoresenta um jogador de futebol
 * @author Matheus Alencar Silva
 * @version 1.0
 */

public class Jogador {
	
	//Variaveis
	
	/**
	 * Armazena o nome do jogador
	 */
	private String nome;
	
	/**
	 * Armazena o numero da camisa do jogador
	 */
	private int numero;
	
	/**
	 * Construtor padrão
	 */
	//public Jogador() {}
	
	/**
	 * 
	 * @param nome Nome do jogador.
	 * @param numero Numero da camiseta do jogador.
	 */
	public Jogador(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	/**
	 * @return nome do jogador.
	 * Retorna o nome do jogador.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome Nome do jogador.
	 * Altera o nome do jogador.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return numero da camiseta do jogador.
	 * Retorna o numero da camiseta do jogador.
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * @param numero Numero da camiseta do jogador.
	 * Altera o numero da camiseta do jogador.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
