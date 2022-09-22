package br.com.fiap.banco.model;

import br.com.fiap.banco.exception.ValorNaoPermitidoException;
import br.com.fiap.banco.exception.ValorNegativoException;

public class ContaCorrente {	

	private double saldo, limite;
	
	//Construtor
	public ContaCorrente() {}
	
	//Construtor com argumentos
	public ContaCorrente(double saldo, double limite) throws ValorNegativoException{
		if( limite < 0) {
			throw new ValorNegativoException("O valor não pode ser negativo");
		}
		this.saldo = saldo;
		this.limite = limite;
	}

	//Getters and Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) throws ValorNegativoException{
		if( limite < 0) {
			throw new ValorNegativoException("O valor não pode ser negativo");
		}
		this.limite = limite;
	}
	
	
	public void sacar(double valor) throws ValorNegativoException, ValorNaoPermitidoException{
		if( valor < 0) {
			throw new ValorNegativoException("O valor não pode ser negativo");
		}
		if(valor > limite + saldo) {
			throw new ValorNaoPermitidoException("O valor não  foi permitido");
		}
		this.saldo -= valor;
	}
	
	public void depositar(double valor) throws ValorNegativoException{
		if( valor < 0) {
			throw new ValorNegativoException("O valor não pode ser negativo");
		}
		this.saldo += valor;
		
	}
	
}
