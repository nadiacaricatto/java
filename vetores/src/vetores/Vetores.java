package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		String nome[] = { "Cintia", "Stella", "Patrícia", "Rafaela", "Letícia", "Jamila", "Priscila"};

		int numeros[] = new int[5]; //esse vetor não tem nada a ver com a String nomes!!!

		System.out.println("Listagem - Vetor de Nomes");
		
		/* Ordenar o vetor: 
		 * Arrays.sort(nome);
		 * Arrays.sort(nome, Collections.reverseOrder)); ReverseOrder não serve para primitivos, somente objetos
		 */
		
		for (int indice = 0; indice < nome.length; indice ++) {
			System.out.printf("nomes[%d] = %s%n", indice, nome[indice]);
		}	//nome length serve para que eu consiga aidiconar nomes sem estragar o código
			
			/* ou:
			 *///System.out.println("Posição 0 = " + nome[indice]);
			
		
		System.out.println("\nInput de Dados - Vetor de Numeros");
	
		for (int indice = 0; indice < numeros.length; indice ++) {
			System.out.println("Digite um número: ");
			numeros[indice] = leia.nextInt();
		}	
			
		System.out.println("\nListagem - Vetor de Numeros");
		
		for (int indice = 0; indice < numeros.length; indice ++) { 
			System.out.printf("numeros[%d] = %d%n", indice, numeros[indice]);	
		}

		leia.close();
	}
// i e indice é a mesma coisa - é a variável de controle de loop
}
