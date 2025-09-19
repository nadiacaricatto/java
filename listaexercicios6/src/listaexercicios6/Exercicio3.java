package listaexercicios6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		/* Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
		 * O programa deverá solicitar ao usuário que ele digite via teclado 10 valores inteiros não repetidos
		 * e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
			Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.*/
		
		Scanner leia = new Scanner(System.in);
		
		Integer numeroInteiro;
		
		System.out.println("Digite 10 Números Inteiros, não repetidos, para criar uma lista.");
		
		Set<Integer> setListaNumeros = new HashSet<Integer>();
		
		for (int i = 1; i <=10; i++) {
			System.out.printf("Número %d: ", i);
			numeroInteiro = leia.nextInt();
			setListaNumeros.add(numeroInteiro);
			
		}
		
		/*System.out.println("Número 1: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 2: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 3: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 4: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 5: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 6: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 7: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 8: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 9: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);
		System.out.println("Número 10: ");
		numeroInteiro = leia.nextInt();
		setListaNumeros.add(numeroInteiro);*/
		
		
		System.out.println("Exibindo a Lista de Números criada: ");
		Iterator<Integer> isetListaNumeros = setListaNumeros.iterator();
		
		while (isetListaNumeros.hasNext()) {
			System.out.println(isetListaNumeros.next());
		}	
	
		leia.close();
		

		}
		

	}


