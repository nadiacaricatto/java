package listaexercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*Enunciado: */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Calculadora de Salário Líquido\nInsira os valores solicitados abaixo para saber o seu salário líquido.\n");
		
		float salariobruto;
		
		System.out.print("Digite o valor do Salário Bruto: r$");
		salariobruto = leia.nextFloat();
		
		float adicionalnoturno;
		
		System.out.print("Digite o valor do Adicional Noturno (se não houver, digite 0): r$");
		adicionalnoturno = leia.nextFloat();
		
		float horasextras;
		
		System.out.print("Digite o valor das Horas Extras: r$");
		horasextras = leia.nextFloat();
		
		float descontos;
		
		System.out.print("Digite o valor total dos Descontos: r$");
		descontos = leia.nextFloat();
		
		var salariofinal = (salariobruto + adicionalnoturno + (horasextras * 5)) - descontos;
		
		System.out.printf("\nO valor do Salário Líquido é R$%.2f.", salariofinal);
		
		leia.close();

	}

}
