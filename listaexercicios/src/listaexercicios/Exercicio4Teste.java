package listaexercicios;

import java.util.Scanner;

public class Exercicio4Teste {

	public static void main(String[] args) {
		/*Fiz dessa outra forma só pra testar e explorar um pouco 
		 * (acho que não é a melhor forma, mas é só pra estudo)*/
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.print("Digite o primeiro valor: "); n1 = leia.nextFloat();
		System.out.print("Digite o segundo valor: "); n2 = leia.nextFloat();
		System.out.print("Digite o terceiro valor: "); n3 = leia.nextFloat();
		System.out.print("Digite o quarto valor: "); n4 = leia.nextFloat();
		
		float dif_prod = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nA diferença entre os produtos das multiplicações é igual a %.2f", dif_prod);
		
		leia.close();
		
	}

}
