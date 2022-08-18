package br.com.fiap.collections.model;

public class Filme {
	
	private String nome;
	private int duracao;
	private String genero;
	
	
	//Construtor vazio
	public Filme() {}
	
	//Construtor com argumentos
	public Filme(String noome, int duracao, String genero) {
		this.nome = noome;
		this.duracao = duracao;
		this.genero = genero;
	}
	//Getters and Setters
	public String getNoome() {
		return nome;
	}
	public void setNoome(String noome) {
		this.nome = noome;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
