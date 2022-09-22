package br.com.fiap.exception.model;

import br.com.fiap.exceptions.exception.XpNegativoException;

public class Pokemon {

	private String nome;
	private int level;
	private int xp;
	private int ataque;
	private String tipo;
	
	public Pokemon(String nome) {
		this.nome = nome;
	}
	
	public void ganharXp(int xp) throws Exception {
		//Não é permitido xp negativo
		if(xp < 0) {
			//Lançar uma exception
			throw new XpNegativoException("O xp não pode ser negativo");
		}
		
		//Não é permitido xp maior do que 50
		if (xp > 50) {
			//
			throw new Exception("O xp não pode ser negativo");
		}
		//Somar o xp no pokemon
		this.xp += xp;
		//Se xp passar de 25, aumentar o level em 1
		if (this.xp > 25) {
			level++;
			this.xp = this.xp - 25;
		}
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

}
