package listaexercicios3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 * EXERCÍCIO 5 Escreva um algoritmo em Java, que leia números inteiros via
		 * teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma
		 * de todos os números digitados, que sejam positivos. Veja o exemplo abaixo:
		 * 
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Somando Números Aleatórios");

		int numero;
		int soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		System.out.printf("A soma dos números positivos é igual a %d.", soma);

		leia.close();
	}

}
