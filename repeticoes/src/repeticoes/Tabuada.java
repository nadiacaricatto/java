package repeticoes;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
				
		/*Iteração do Contador -> ++ adiciona sempre +1 a cada repetição do laço - Pós Incremento
		 * 3 parâmetros: valor - condição - contador ou iteração do contador */
		for(int contador = 1; contador  <= 10; contador ++) {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
		}
		
		
		
		
		
		
		leia.close();
		
		
	}

}