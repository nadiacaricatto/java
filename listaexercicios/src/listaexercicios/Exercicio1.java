package listaexercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*Enunciado: */
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\033[0;1mCalculadora Salarial\033[0m\nInsira os valores abaixo para descobrir seu novo salário\n");
		
		float salario;
		
		System.out.print("Digite o Salário: RS");
		salario = leia.nextFloat();
		
		float abono;
		
		System.out.println("Digite o valor do Abono Salarial: ");
		abono = leia.nextFloat();
		
		System.out.printf("O valor do seu novo salário é r$%.2f", salario + abono);
		
		leia.close();

	}

}
