package br.com.fiap.collections.model;

import java.util.List;

public class Aluno {

	private int rm;
	private String nome;
	private int idade;
	private List<Double> notas;

	// Construtor com argumentos
	public Aluno(int rm, String nome, int idade, List<Double> notas) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}

	// Construtor vazio
	public Aluno() {}
	
	//criar metodo que retorna a media do aluno
	public double retornarMedia() {
		double soma = 0;
		//Percorre todas as notas e realiza a soma das notas
		for (double nota : notas) {
			soma = soma + nota;
		}
		double media = soma / notas.size();
		return media;
	}

	// Getters and Setters
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}

}
