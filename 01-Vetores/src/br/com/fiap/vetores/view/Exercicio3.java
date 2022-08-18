package br.com.fiap.vetores.view;

import java.util.Scanner;

import br.com.fiap.vetor.model.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {

		// Inserir o Scanner leitor.
		Scanner leitor = new Scanner(System.in);

		// Solicitar a quantidade de alunos.
		System.out.println("Digite a quantidade de alunos: ");
		int quantidade = leitor.nextInt();

		// Vetor de alunos com n posições.
		Aluno[] aluno = new Aluno[quantidade];

		// Laço de repetição para ler os alunos
		for (int i = 0; i < aluno.length; i++) {
			// Solicitar o nome do aluno.
			System.out.println("Digite o nome do aluno: ");
			String nome = leitor.next();
			double notas[] = new double[3];

			// Laço de repetição para ler as notas
			for (int j = 0; j < 3; j++) {
				// Solicitar as notas do aluno (1, 2 e 3).
				System.out.println("digite sua nota: ");
				notas[j] = leitor.nextDouble();
			}

			// Criar o objeto aluno com o nome eo vetor de notas
			Aluno alunos = new Aluno(nome, notas);

			// adicionar o aluno no vetor
			aluno[i] = alunos;
		}
		//DESAFIO Exibir os alunos com a maior nota(se tiver mais de um)
		// Verificar o aluno que possui a maior nota.
		
		//Variavel auxiliar do tipo aluno
		Aluno alunoComMaiorNota = aluno[0];
		//Laço de repetição para percorrer todos os alunos
		for(int i = 1; i < aluno.length; i++) {
			//Validar se o aluno possui yma nota maior do que o aluno da variavel auxiliar
			if(aluno[i].maiorNota() > alunoComMaiorNota.maiorNota())
				//se sim, troca o aluno.
				alunoComMaiorNota = aluno[i];
		}
		
		//Exibir o nome e a maior nota do aluno.
		System.out.println(alunoComMaiorNota.getNome() + " " + alunoComMaiorNota.maiorNota());
		
		leitor.close();
	}

}
