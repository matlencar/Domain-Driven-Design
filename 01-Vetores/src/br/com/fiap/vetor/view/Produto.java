package br.com.fiap.vetor.view;

public class Produto {

	// Atributos
	private int quantidade;
	private double preco;
	private int desconto;

	// Construtor vazio.
	public Produto() {
	}

	// Construtor com argumentos.
	public Produto(int quantidade, double preco, int desconto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.desconto = desconto;
	}

	// Getters and Setters
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

}
