package br.com.fiap.vetor.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vetores {

	public static void main(String[] args) {

		// Scanner
		Scanner leitor = new Scanner(System.in);
		// Declarar um vetor de 5 nomes.

		String nomes[] = new String[5];

		/// Adicionar os nomes do vetor:
		// Criar um la�o de repeti��o e exibir os nomes do vetor.
		for (int j = 0; j < nomes.length; j++) {
			nomes[j] = JOptionPane.showInputDialog("Digite o nome " + (j + 1));

		}

		// Lembrete: usar length pois n�o ira alterar o tamanho do for.
		// Lembrete: n�o usar o <= ou >= pode dar erro Exception.
		System.out.println("FOR");
		for (int i = 0; i < nomes.length; i++) {

			System.out.println(nomes[i]);
		}

		// Criar um la�o de repeti��o e exibir os nomes do vetor
		System.out.println("FORACH");
		for (String n : nomes) {
			System.out.println(n);
		}

	}

}
