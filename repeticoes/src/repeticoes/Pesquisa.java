package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, esporte, totalRespostas = 0, futebol = 0, voleiM18 = 0, basqueteM18 = 0;

		String continua = "S";

		long somaIdade = 0;

		double mediaIdades = 0;

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Esporte Favorito");

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("1 - Futebol");
			System.out.println("2 - Voleibol");
			System.out.println("3 - Basquetebol");

			System.out.println("Digite seu esporte favorito: ");
			esporte = leia.nextInt();

			// Total de pessoas que gostam de futebol
			if (esporte == 1) {
				futebol++;
			}

			// Total de pessoas que gostam de voleibol e são maiores de 18 anos
			if (esporte == 2 && idade >= 18) {
				voleiM18++;
			}

			// Total de pessoas que gostam de basquetebol e são menores de 18 anos
			if (esporte == 3 && idade <= 18) {
				basqueteM18++;
			}
		
		
			somaIdade += idade;

			totalRespostas++;

		System.out.println("Deseja continuar (S/N)? ");
		leia.skip("\\R"); /*
							 * cancela a leitura do \n e posiciona o cursor no início da linha isso acontece
							 * pq quando apertamos enter para enviar nossa resposta, é como se tivéssemos
							 * inserindo um \n no código. O Skip serve para ignorar esse "\n" e coloca o
							 * cursor no início para conseguirmos continuar digitando as opções
							 */

		continua = leia.nextLine().toUpperCase();
		
}
		mediaIdades = (double) somaIdade / totalRespostas;

		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetebol e são menores de 18 anos: %d%n", basqueteM18);
		System.out.printf("Média das idades: %.2f%n", mediaIdades);

		leia.close();
	}
}