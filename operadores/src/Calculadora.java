import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		/*Definir as variáveis que receberão os valores que serão usados nas 
		 * operações matemáticas*/
		/*Instanciar um objeto da Classe Scanner 
		 * O Scanner em Java é uma classe da biblioteca java.util, usada para ler dados de entrada.
		 * Na prática, ele serve para capturar informações que o usuário digita no console (teclado),
		 * mas também pode ler de arquivos ou strings.*/ 
		Scanner leia = new Scanner(System.in);
		//System.in é a entrada (input) da informação
		double numero1, numero2;
		//Entrada de Dados - Criar as intruções para que o ususário digite os valores necessários
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		//Efetuar os cálculos
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2, numero1 + numero2);
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, numero1 - numero2);
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, numero1 * numero2);
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, numero1 / numero2);
		//%n e \n são comandos para pular linha
		//Operações matemáticas com a Classe Math
		System.out.printf("%.2f ^ %.2f = %.2f%n", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("Raiz Quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));
	
	
	
	
	
	
	
	}	

}
