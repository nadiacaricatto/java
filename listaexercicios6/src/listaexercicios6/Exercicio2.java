package listaexercicios6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da
		 * Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa
		 * deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro.
		 * Caso ele seja encontrado no ArrayList, exiba na tela a posição deste número
		 * na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a
		 * mensagem: "O número NN não foi encontrado".
		 */

		ArrayList<Integer> nInteiros = new ArrayList<Integer>(); // Criando ArrayList

		Scanner leia = new Scanner(System.in);

		Integer numeroInt;

		nInteiros.add(5);
		nInteiros.add(7);
		nInteiros.add(11);
		nInteiros.add(16);
		nInteiros.add(17);
		nInteiros.add(2);
		nInteiros.add(1);
		nInteiros.add(55);
		nInteiros.add(43);
		nInteiros.add(13);

		System.out.println("Esta lista contém 10 números. Você consegue adivinhar pelo menos um?\n"
				+ "O programa só para quando você acertar um número!\n");

		do {
			System.out.println("Digite um número inteiro: ");
			numeroInt = leia.nextInt();

			System.out.println("\nO número " + numeroInt + " existe na lista? " + nInteiros.contains(numeroInt));
			if (nInteiros.contains(numeroInt) == false) {
				System.out.printf("O número %d não foi encontrado!\n", numeroInt);

			} else if (nInteiros.contains(numeroInt) == true) {
				System.out.printf(
						"O número " + numeroInt + " está na lista na posição " + nInteiros.indexOf(numeroInt) + ".");
			}

		} while (nInteiros.contains(numeroInt) == false);

		leia.close();
	}

}
