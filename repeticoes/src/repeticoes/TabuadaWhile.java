package repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int contador = 1;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
				
		/*While: um único parâmetro: condição de parada [variável. 
		 * Nesse caso o incremento deve ser definido fora, pela sintaxe do While não contemplar o contador
		 * 		 */
		
		while(contador <= 10) {
			System.out.printf("%d x %d = %d%n", numero, contador, numero * contador);
			contador ++; /*incremento foi colocado fora)*/
		}
		
		leia.close();
		
		
	}

}