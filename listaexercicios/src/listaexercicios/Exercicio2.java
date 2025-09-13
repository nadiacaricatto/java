package listaexercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*Enunciado: */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Calculadora de Média\nDescubra se sua nota final está dentro da média!\n\033[0;1mAtenção: se sua média tiver casas decimais, digite utilizando a vírgula!\033[0m\n");
		
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
