package br.com.fiap.banco.view;

import java.util.InputMismatchException;

import br.com.fiap.banco.exception.ValorNaoPermitidoException;
import br.com.fiap.banco.exception.ValorNegativoException;
import br.com.fiap.banco.model.ContaCorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {
		try {
			//Instanciar a conta corrente
			ContaCorrente cc = new ContaCorrente(100, 100);
			//Setar limites
			cc.setLimite(-1000);
			
			//Chamar os metodos sacar
			cc.sacar(100);
			System.out.println("Saque efetuado, novo saldo: " + cc.getSaldo());
			
			//Chamar metodo depositar
			cc.depositar(100);
			System.out.println("Deposito realizado, novo saldo: " + cc.getSaldo());
			
		} catch(ValorNegativoException | ValorNaoPermitidoException e) {
			System.err.println(e.getMessage());
		}
	}
}
