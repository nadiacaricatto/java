package listaexercicios3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*EXERCÍCIO 1
		 * Enunciado: Escreva um algoritmo em Java, que leia 2 números inteiros via
		 * teclado, onde o primeiro número deve ser menor do que o segundo número. Caso
		 * contrário, deve ser exibida uma mensagem na tela informando que o intervalo é
		 * inválido e sair do programa. No intervalo informado, mostre na tela todos os
		 * números que são múltiplos de 3 e 5. Na construção do Algoritmo, utilize os
		 * seguintes conteúdos: Entrada e Saída de dados, Laços Condicionais, Laço de
		 * Repetição FOR
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite dois números e descubra os múltiplos de 3 e 5 contidos"
				+ "no intervalo escolhido");
	
		int n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		if (n1 >= n2) {
			System.out.println("Intervalo Inválido");
			leia.close();
			return;
		}	
		
		System.out.printf("Múltiplos de 3 e 5 contidos no intervalo entre %d e %d:%n", n1, n2);
		
		for (int i = n1; i <= n2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("%d%n", i);
			}		
		}
		
		
		
		
		
		
		
		
		
		
		leia.close();
	}

}
