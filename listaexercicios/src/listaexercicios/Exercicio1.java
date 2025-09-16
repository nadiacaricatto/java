package listaexercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*Enunciado: Dado o fluxograma [imagem], desenvolva o algoritmo na Linguagem Java: * Início -> Digite o Salário: -> Leia Salário -> Digite Abono -> Leia Abono
		 * Novo Salário = Salário + Abono -> Exiba NovoSalário -> Fim 
		 * Considere: Salário = 10000,.00 - Abono 1000.00 - Novo Salário: 11000.00*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\033[0;1mCalculadora Salarial\033[0m\nInsira os valores abaixo para descobrir seu novo salário\n");
		
		float salario;
		
		System.out.print("Digite o Salário: R$");
		
		salario = leia.nextFloat();
		
		float abono;
		
		System.out.print("Digite o valor do Abono Salarial: R$");
		abono = leia.nextFloat();
		
		float NovoSalario = salario + abono;
		System.out.printf("\nO valor do seu novo salário é r$%.2f", NovoSalario);
		
		leia.close();

	}

}
/* Resolução Alternativa - não define variável para NovoSalario e especifica o dado direto na formatação da linha:
		 
		 * float salario;
		 *  
		 * System.out.print("Digite o Salário: RS");
		 * salario = leia.nextFloat();
		 *
		 * float abono;
		 *
		 *	System.out.println("Digite o valor do Abono Salarial: ");
		 *	abono = leia.nextFloat();
		 *
		 *	System.out.printf("O valor do seu novo salário é r$%.2f", salario + abono);
		 */