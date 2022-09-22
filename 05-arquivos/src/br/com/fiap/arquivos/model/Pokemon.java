package br.com.fiap.arquivos.model;

public class Pokemon {
	
	private String nome;
	private String tipo;
	private int ataque;
	private boolean estagioInicial;
	
	//Construtores
	public Pokemon() {}
	
	public Pokemon(String nome, String tipo, int ataque, boolean estagioInicial) {
		this.nome = nome;
		this.tipo = tipo;
		this.ataque = ataque;
		this.estagioInicial = estagioInicial;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public boolean isEstagioInicial() {
		return estagioInicial;
	}
	public void setEstagioInicial(boolean estagioInicial) {
		this.estagioInicial = estagioInicial;
	}

	@Override
	public String toString() {
		return nome + ", tipo: " + tipo + ", ataque: " + ataque + ", estagioInicial: " + estagioInicial;
	}
}
