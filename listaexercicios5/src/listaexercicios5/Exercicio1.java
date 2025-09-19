package listaexercicios5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		/* Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string,
		 * para organizar uma fila por ordem de chegada dos Clientes de um Banco. 
		 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:		 
			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
			2: Listar todos os Clientes na fila
			3: Chamar (retirar) uma pessoa da fila 
			0: O programa deve ser finalizado. 
			Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.*/

		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Marcos");
		fila.add("Carina");
		fila.add("Lucinda");
		
				
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		String nomeCliente;
		
		System.out.println("Bem-vinde ao Banco Marmota! Insira seu nome e aguarde ser chamado: ");
		nomeCliente = leia.nextLine();
	
		fila.add(nomeCliente);
		
	do {
		
		int posicao = ((LinkedList<String>) fila).indexOf(nomeCliente) + 1;
		
		System.out.printf("Obrigado, %s! Sua posição na fila é %d%n", nomeCliente, posicao);
				
		System.out.println("Continue sua experiência conosco escolhendo uma opção:  %n");
		System.out.println("1 - Exiba o tamanho da fila de espera.");
		System.out.println("2 - Remova alguém da fila e avança sua posição na espera sem que a pessoa removida saiba");
		System.out.println("3 - Finalize seu atendimento");
		opcao = leia.nextInt();
		
		if(opcao == 1) {
			System.out.println("A fila de espera é de " + fila.size() + " pessoas");
		
		}else if(opcao == 2) {
			System.out.println("Cliente " + fila.poll() + " removide. ");
			int novaPosicao = ((LinkedList<String>) fila).indexOf(nomeCliente) + 1;
			System.out.println("Sua nova posição é: " + novaPosicao);
			System.out.println("A fila de espera agora é de " + fila.size() + " pessoas");
		}else if(opcao == 3) {
			System.out.println("Atendimento finalizado.");
		}
	} while (opcao != 3);
	
		
	
		
		leia.close();
		
		
		
		
	}

}
