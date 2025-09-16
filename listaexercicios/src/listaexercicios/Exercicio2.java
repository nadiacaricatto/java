package listaexercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*Enunciado: Elabore um algoritmo em Java que leia 4 notas de um participante,
		 * em variáveis do tipo float, e exiba na tela a média final do participante. 
		 * Considere: n1 = 10.0 - n2 = 8.0 - n3 = 7.0 n4 = 7.5 - Média Final = 8.1*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Calculadora de Média\nDescubra se sua nota final está dentro da média!\n\033[0;1m"
				+ "Atenção: se sua média tiver casas decimais, digite utilizando a vírgula!\033[0m\n");
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
				
		System.out.printf("Sua Média Final é \033[0;1m%.1f\033[0m. Parabéns!", media);

		leia.close();
		
	}

}
