package listaexercicio4vetores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Enunciado: Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros 
		 * em seguida, mostre na tela: 
		 * Todos os elementos da Diagonal Principal, todos os elementos da Diagonal Secundária,
		 * A Soma de todos os elementos da Diagonal Principal
		 * A Soma de todos os elementos da Diagonal Secundária*/

		Scanner leia = new Scanner(System.in);
		
		
		//criando a matriz de inteiros: 
		int matriz[][] = new int[3][3]; //tamanho da Matriz
		
		String diagonalPrincipal = "", diagonalSecundaria = ""; /*
		variável que vai guardar todos os elementos da diagonal principal e da secundária;
		As aspas vazias indicam um valor vazio*/
		
		int somaPrincipal = 0, somaSecundaria = 0;
		
		//inserindo valores dentro da matriz
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("Matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		//Diagonal Principal:
		for (int i = 0; i < matriz.length; i++) {
			diagonalPrincipal += matriz[i][i] + " "; 
			somaPrincipal += matriz[i][i];
		}
		
		//Diagonal Secundária:
		//Ajustar os índices para conseguir chegar no valores - os valores são "iguais" mas
		//as posições mudam -> 0,2 e 2,0
		for (int i = 0; i < matriz.length; i++) {
			diagonalSecundaria += matriz[i][matriz.length - 1 - i] + " ";
		//aqui nós pegamos o tamanho total, subtraímos 1. Do resultado, subtraímos o índice atual
			somaSecundaria += matriz[i][matriz.length - 1 - i];
		}
		
		System.out.println("Diagonal Principal: " + diagonalPrincipal);
		System.out.println("Diagonal Secundária: " + diagonalSecundaria);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
		
		leia.close();
		
	}

}
