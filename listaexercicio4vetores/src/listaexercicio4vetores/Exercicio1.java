package listaexercicio4vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Enunciado: Dado um vetor contendo 10 números inteiros não ordenados e não
		 * repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o
		 * usuário irá digitar um número e o programa deve exibir na tela a posição
		 * deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não
		 * foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
		 */

		int nInteiros[] = { 3, 18, 54, 97, 25, 42, 2, 4, 61, 79 };

		// Ordena o Vetor
		Arrays.sort(nInteiros);

		//System.out.println("\nVetor Ordenado");

		for (int i = 0; i < nInteiros.length; i++) {
			//System.out.println("Posição " + i + " " + nInteiros[i]);
		}
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		int posicao = Arrays.binarySearch(nInteiros, numero);
		
		// Se a posição for positiva = Encontrou
		if (posicao >= 0)
			System.out.println("\nO elemento foi Encontrado e está na Posição " + posicao);
		else
			System.out.println("\nElemento não encontrado!");

		leia.close();

	}

}
