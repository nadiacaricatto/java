package repeticoes;

import java.util.Scanner;

public class Pesquisa2 {

	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int idade, esporte, totalRespostas = 0, futebol = 0, voleiM18 = 0, basqueteM18 = 0;
	        String continua = "S";
	        long somaIdades = 0;
	        double mediaIdades = 0;

	        while (continua.equalsIgnoreCase("S")) {

	            System.out.println("Esporte Favorito");

	            System.out.print("Digite sua idade: ");
	            idade = leia.nextInt();

	            System.out.println("1 - Futebol");
	            System.out.println("2 - Voleibol");
	            System.out.println("3 - Basquetebol");

	            System.out.print("Digite seu esporte favorito: ");
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
	            if (esporte == 3 && idade < 18) {
	                basqueteM18++;
	            }

	            somaIdades += idade;
	            totalRespostas++;

	            System.out.print("Deseja continuar (S/N)? ");
	            leia.skip("\\R");
	            continua = leia.nextLine().toUpperCase();
	        }

	        mediaIdades = (double) somaIdades / totalRespostas;

	        System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
	        System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
	        System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d%n", basqueteM18);
	        System.out.printf("Média das idades: %.2f%n", mediaIdades);

	        leia.close();
	    }
	}







