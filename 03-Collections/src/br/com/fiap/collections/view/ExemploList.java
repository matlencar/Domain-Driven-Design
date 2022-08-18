package br.com.fiap.collections.view;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		//Adicionar um elemento na lista.
		lista.add(10);
		lista.add(8);
		lista.add(10);
		
		//Adicionar um elemento na segunda posição.
			//index, elemento.
		lista.add(1, 9);
		
		//Remover um elemento da  lista.
		lista.remove(0);
		
		//Substitui o elemento da posição na lista.
		lista.set(0, 5);
		
		//Exibir a quantidade de elementos na lista.
		System.out.println("Quantidade de elementos: " + lista.size());
		
		//Recuperar o elemento da posição 1.
		System.out.println("elemento da primeira posição: " + lista.get(0));
		
		//Exibir os elementos da lista.
			//Com for normal
		for (int i=0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
		}
		
			//Com for each
		for (Integer numero: lista) {
			System.out.println(numero);
		}
		
		//Verificar se existe elementos na lista.
		System.out.println("Lista está vazia? " + lista.isEmpty());
	}
}
