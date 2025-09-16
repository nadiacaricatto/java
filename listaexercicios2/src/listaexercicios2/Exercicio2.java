package listaexercicios2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		/*Enunciado: Escreva um algoritmo em Java, que leia um número inteiro via teclado
		 * e mostre na tela uma mensagem indicando se este número é par ou ímpar
		 * e se o número é positivo ou negativo*/
	
		Scanner leia = new Scanner(System.in);
	
		float valor;
	
		System.out.print("Digite um valor: ");
		valor = leia.nextFloat();
	
		if (valor == 0) {
		    System.out.printf("O valor %.0f é neutro", valor);
	
		}else if (valor%2 == 1 && valor >= 1) {
			System.out.printf("O valor %.2f é um número ímpar positivo.", valor);
						
		}else if (valor%2 == 0 && valor >= 1) {
			System.out.printf("O valor %.2f é um número par positivo.", valor);
						
		}else if (valor%2 == -1) {
			System.out.printf("O valor %.2f é um número ímpar negativo.", valor);
						
		}else if (-valor%2 == 0) {
			System.out.printf("O valor %.2f é um número par negativo", valor);
			}
				
		leia.close();
	
	}

}
