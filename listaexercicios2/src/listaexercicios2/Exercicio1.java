package listaexercicios2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	/*Enunciado: Faça um algoritmo em Java que leia 3 valores 
	 * inteiros A, B e C e imprima na tela 
	 * se a soma de A + B é maior, menor ou igual a C.*/
	
		Scanner leia = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = leia.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = leia.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = leia.nextInt();
		
		int soma = v1 + v2;
				
		if (soma > v3) {
			System.out.printf("O resultado da soma de %d e %d é maior que %d", v1, v2, v3);
			
		}else if (soma < v3) {
			System.out.printf("O resultado da soma de %d e %d é menor que %d", v1, v2, v3);
			
		}else if (soma == v3) {
		System.out.printf("O resultado da soma de %d e %d é igual a %d", v1, v2, v3);
		
	    }		
				
		leia.close();
		
	}

}
