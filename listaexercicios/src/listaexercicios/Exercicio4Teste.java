package listaexercicios;

import java.util.Scanner;

public class Exercicio4Teste {

	public static void main(String[] args) {
		/*Enunciado: Leia 4 valores Float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre
		 * o n1 e n2 pelo produto entre o n3 e o n4.
		 * Exemplos: 
		 * n1 = 5.0 - * n2 = 6.0 - * n3 = 7.0 - * n4 = 7.0 --> Diferença = -26.0
		 * n1 = 5.0 - n2 = 6.0 - n3 = -7.0 - n4 = 8.0 --> Diferença = 86.0*/
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.print("Digite o primeiro valor: "); n1 = leia.nextFloat();
		System.out.print("Digite o segundo valor: "); n2 = leia.nextFloat();
		System.out.print("Digite o terceiro valor: "); n3 = leia.nextFloat();
		System.out.print("Digite o quarto valor: \n"); n4 = leia.nextFloat();
		
		float dif_prod = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença entre os produtos das multiplicações é igual a %.2f", dif_prod);
		
		leia.close();
		
	}

}
