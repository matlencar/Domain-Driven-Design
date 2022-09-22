package br.com.fiap.exception.view;

import java.util.Scanner;

import br.com.fiap.exception.model.Pokemon;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ler o nome do pokemon
		System.out.println("Digite o nome do pokemon");
		String nome = sc.next() + sc.nextLine();
		
		//Instanciar o pokemon
		Pokemon poke = new Pokemon(nome);
		//Variável auxiliar
		String continuar;
		
		do {
			
			try {
		
			//Ler o numero de xp que o pokemon vai ganhar
			System.out.println("Digite o xp do " + poke.getNome());
			int xp = sc.nextInt();
			
			//Aumentar o xp do pokemon
			poke.ganharXp(xp);
			
			//Exibir o xp e o level do pokemon 
			System.out.println(poke.getNome() + " " 
					+ poke.getXp() + " xp" + " Level: " + poke.getLevel());
			
			//Verificar se deseja ganhar mais xp
			}catch(Exception e) {
				System.out.println("Insira um valor inteiro");
				
			}
			System.out.println("Deseja ganhar mais xp? S/N");
			continuar = sc.next() + sc.nextLine();
			
		} while(continuar.equalsIgnoreCase("S"));
		sc.close();
	}

}
