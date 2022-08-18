package br.com.fiap.collections.view;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		
		//Criar um conjunto de String (Nomes de series)
		
		Set<String> conjunto = new HashSet<>();

		//Adicionar 2 series
		conjunto.add("Watchmen");
		conjunto.add("Black Mirror");
		conjunto.add("Sandman");
		
		//Exibir a quantidade de series na lista.
		System.out.println("Quantidade de series: " + conjunto.size());
		
		//Remover a pior serie do conjunto na sua opiniao.
		conjunto.remove("Watchmen");
		
		//Verificar se a serie The Boys esta no conjunto.
		 System.out.println("Esta no conjunto: " + conjunto.contains("The Boys")); ;
		
		//Exibir as series
		for (String series: conjunto) {
			System.out.println(series);
		}
	}

}
