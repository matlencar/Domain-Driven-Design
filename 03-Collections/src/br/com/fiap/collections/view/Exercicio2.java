package br.com.fiap.collections.view;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.collections.dao.AlunoDao;
import br.com.fiap.collections.model.Aluno;

public class Exercicio2 {

	public static void main(String[] args) {
		
		//Inserindo Scanner
		Scanner leitor = new Scanner(System.in);
		AlunoDao dao = new AlunoDao();
		
		int continuar;
		do{
		//Ler os dados do aluno: rm, nome, idade, nota1 e nota2
		System.out.println("Digite o numero do rm: ");
		int rm = leitor.nextInt();
		
		System.out.println("Digite o nome do aluno: ");
		String nome = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o idade do aluno: ");
		int idade = leitor.nextInt();
		
		System.out.println("Digite o nota 1: ");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Digite o nota 2: ");
		double nota2 = leitor.nextDouble();
		
		//Criar a lista de nota //asList: transforma o vetor em List
		List<Double> notas = Arrays.asList(new Double[] {nota1, nota2});
		
		//Instanciar um aluno com os dados
		Aluno aluno = new Aluno(rm, nome, idade, notas);
		
		//Cadastrar o aluno
		dao.cadastrar(aluno);
		
		System.out.println("Deseja cadastrar mais um aluno 0-Nã0/1-Sim");
		continuar = leitor.nextInt();
		}while(continuar == 1);
		
		//Exibir o total de alunos cadastrados
		System.out.println("Total de alunos: " + dao.listar().size());
		
		//Exibir a media geral
		System.out.println("Media geral dos alunos: " + dao.calcularMediaGeral());
		
		//Exibir a media geral
		System.out.println("Media geral de idade dos alunos: " + dao.calcularMediaIdade());
		
		//Exibir a idade do aluno mais velho
		System.out.println("Idade do aluno mais velho: " + dao.retonarMaiorIdade());
		
		//Exibir a idade do aluno mais novo
		System.out.println("Idade do aluno mais novo: " + dao.retornarMenorIdade());
		
		leitor.close();
	}

}
