package br.com.fiap.collections.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {

	public static void main(String[] args) {
		
		//Criar um mapa (chave, valor)
		//Salgado, preco
		Map<String, Double> mapa = new HashMap<String, Double>();
		
		//Adicionar alguns salgados com o preço no mapa
		mapa.put("coxinha", 7.0);
		mapa.put("pao de queijo", 5.0);
		mapa.put("esfiha", 7.0);
		mapa.put("esfiha", 7.5);// substitui o valor da chave "esfiha"
		
		//System.out.println(mapa.get("coxinha"));
		
		//Exibir o preço da coxinha
		//System.out.println(mapa);
		
		//Exibir a quantidade de salgados da cantina
		System.out.println("Salgados da cantina: " + mapa.size());
		
		//Remove a coxinha da cantina.
		mapa.remove("coxinha");
		
		//Exibir todos os salgados e o seu preço
		//Recuperar ttodas as chaves do mapa
		Set<String> salgados = mapa.keySet();
		
		//Percorrer o conjunto e exibir o nome do salgado e o preço.
		for (String comida: salgados) {
			System.out.println(comida + " " + mapa.get(comida));
		}
	}

}
