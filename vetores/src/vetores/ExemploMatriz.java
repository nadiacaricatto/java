package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		int numeros[][] = { //dois colchetes para indicar que se trata de uma matriz
				{1, 2, 3},
				{4, 5, 6},
				{7, 9, 9}
		};
	
		float numerosReais[][] = new float[3][2]; //3 linhas x 2 colunas = matriz irregular
		
		//laços de repetição: laço externo seleciona linhas; laços internos selecionam colunas
				
		
		
		
		//Percorre as linhas
		for(int linha = 0; linha < numerosReais.length; linha++) {
			
			//Percorre as colunas
		for(int coluna = 0; coluna <numerosReais.length; coluna++) {
		
			
			
		System.out.println("Lista os dados - Matriz Numeros Reais");
				
			for(int coluna = 0; coluna < numerosReais[linha].length; coluna++) {
				System.out.println("Digite um número: ");
				numerosReais[linha][coluna] = leia.nextFloat();
				
			}
		}
	
	//Sempre que trabalharmos com matrizes, usaremos um for dentro do outro
		
		
	leia.close();
	
	
	
	}

}
