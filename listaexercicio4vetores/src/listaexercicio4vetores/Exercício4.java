package listaexercicio4vetores;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float matriz[][] = new int[2][4];
		
		float media[] = new Float[2];
		
		float soma = 0.0f;
		
		//Input das notas:		
		for(int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++)
				System.out.printf("Matriz[%d][%d] = ", linha, coluna);
					matriz[linha][coluna] = leia.nextFloat();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
	}

}
