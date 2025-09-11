package helloworld;

import java.util.Scanner;

public class Variaveis2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		int peso = leia.nextInt();
		//tipo da variável + identificador = valor
		
		System.out.println("Digite uma opção: ");
		char opcao = leia.next().charAt(0);
		
		System.out.println("Digite o valor: ");
		float valor = leia.nextFloat();
		//tem que colocar o f no final para não confundir com o double;
		//mesma coisa vale pra long
			
		System.out.println("O valor da variável peso é: " + peso);
		
		System.out.println("O valor da variável opção é: " + opcao);
	
		
		System.out.printf("O valor da variável valor é: %.2f \n", valor);
	
		leia.close();
	
	}
	//System.out.println("O valor da variável valor é: " + valor);
	//a mensagem exibida na tela não vai ter o 0, porque a linguagem simplifica
	//e desconsidera o 0. Para usar o 0, temos que usar printf (print format)

}
