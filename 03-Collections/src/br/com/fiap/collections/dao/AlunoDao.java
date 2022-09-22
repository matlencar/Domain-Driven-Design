package br.com.fiap.collections.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.collections.model.Aluno;

/***
 * Classe responsável por cadastrar, listar um Aluno
 * @author Matheus alencar silva
 */
public class AlunoDao {

	//A colecao que armazena os alunos da aplicacao
	private List<Aluno> lista = new ArrayList<>();
	
	public void cadastrar(Aluno aluno) {
		lista.add(aluno);
	}
	
	/***
	 * Retorna a lista de alunos com m�dia maior do que 6
	 * @return
	 */
	public List<Aluno> buscarListaAprovados() {
		//Criar uma lista para armazenar os alunos aprovados
		List<Aluno> aprovados = new ArrayList<Aluno>();
		//Percorrer a lista de alunos e adicionar somente os alunos aprovados
		for (Aluno aluno : lista) {
			if (aluno.retornarMedia() >= 6)
				aprovados.add(aluno);
		}
		//Retorna a lista de alunos aprovados
		return aprovados;
	}
	
	/**
	 * Retorna a lista de alunos com idade maior do que 30
	 * @return
	 */
	public List<Aluno> buscarIdadeMaiorDoQue30(){
		//Criar uma lista para armazenar os alunos que possuem mais de 30 anos
		List<Aluno> alunos = new ArrayList<Aluno>();
		//Percorrer a lista de alunos e adicionar somente os alunos maiores de 30
		for (int i=0; i < lista.size(); i++) {
			if (lista.get(i).getIdade() >= 30) {
				alunos.add(lista.get(i));
			}
		}
		return alunos;
	}
	
	/**
	 * Apaga os alunos da lista com m�dia menor do que 3
	 */
	public void removerMediaBaixa() {
		//Percorrer a lista e remover os alunos com média menor do que 3
		for (int i=0; i<lista.size(); i++) {
			if (lista.get(i).retornarMedia() < 3) {
				
			}
		}
	}
	
	public List<Aluno> listar(){
		return lista;
	}
	
	/**
	 * M�todo que retorna a maior idade
	 */
	public int retonarMaiorIdade() {
		//Vari�vel que armazena a maior idade
		int maiorIdade = lista.get(0).getIdade(); 
		//Percorre os alunos e verifica se ele possui uma idade maior do que a vari�vel auxiliar
		for (int i = 1; i < lista.size(); i ++) {
			if (lista.get(i).getIdade() > maiorIdade)
				maiorIdade = lista.get(i).getIdade();
		}
		//Retorna a maior idade
		return maiorIdade;
	}
	
	/**
	 * M�todo que retorna a menor idade
	 */
	public int retornarMenorIdade() {
		//Verificar se a lista possui algum elemento
		if (lista.isEmpty()) {
			return -1;
		}
		int menorIdade = lista.get(0).getIdade();
		for (int i = 1; i < lista.size() ; i++) {
			if (lista.get(i).getIdade() < menorIdade) {
				menorIdade = lista.get(i).getIdade();
			}//if
		}//for
		return menorIdade;
	}
	
	/**
	 * Retorna a m�dia geral de idade dos alunos
	 */
	public int calcularMediaIdade() {
		//Vari�vel para armazenar a soma das idades
		int somaIdades = 0;
		//Percorrer os alunos e somar as idades
		for (Aluno aluno : lista) {
			somaIdades += aluno.getIdade();
		}
		//Calcular a m�dia das idades
		int mediaIdade = somaIdades / lista.size();
		//Retornar a m�dia das idades
		return mediaIdade;
	}
	
	/**
	 * M�todo que retorna a m�dia geral de todos os alunos
	 */
	public double calcularMediaGeral() {
		//Vari�vel para armazenar a soma das m�dias de todos os alunos
		double soma = 0;
		//Percorrer a lista de alunos e somar as m�dias
		for (Aluno aluno : lista) {
			soma += aluno.retornarMedia();
		}
		//Calcular a m�dia geral
		double media = soma / lista.size();
		//Retornar a m�dia geral
		return media;
	}
	
}