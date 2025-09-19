package listaexercicios5;

import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string,
		 * para organizar a retirada de livros de uma pilha. O programa deverá ter um
		 * Menu que aceitará as opções 0, 1, 2 e 3: 1: Adicionar um novo livro na pilha.
		 * Deve solicitar o nome do livro. 2: Listar todos os livros da Pilha 3: Retirar
		 * um livro da pilha 0: O programa deve ser finalizado. Caso a pilha esteja
		 * vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a
		 * pilha está vazia.
		 */

		Stack<String> pilha = new Stack<String>();

		pilha.push("Galinha Pintadinha");
		pilha.push("Labaxurias");
		pilha.push("Turma da Mônica");
		pilha.push("Cacau");
		pilha.push("O Auto da Compadecida");

		Scanner leia = new Scanner(System.in);

		int opcao;
		
		String nomeLivro;
		
		do {
			System.out.println("Bem-vinde à Biblioteca de Hogwarts! Informe a opção desejada: ");

			System.out.println("1 - Inserir o nome de um livro para adicioná-lo à pilha de leitura: ");

			System.out.println("2 - Exibir todos os livros da pilha");

			System.out.println("3 - Remover um livro da pilha");

			System.out.println("4 - Finalize o atendimento");

			opcao = leia.nextInt();
			
			
			
			if (opcao == 1) {
				leia.nextLine();
				System.out.printf("Insira o nome do livro: ");
				nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);	
				System.out.println(nomeLivro + " foi adicionado à pilha!");
								
			} else if (opcao == 2) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia! Digite 1 para começar uma nova pilha.");
				} else {
				System.out.println(pilha);
				}
			} else if (opcao == 3) {
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia! Digite 1 para começar uma nova pilha.");	
				} else {
				System.out.println("O livro " + pilha.pop() + " foi removido da lista");	
				
				}
				
			} else if (opcao == 4) {
				System.out.println("Atendimento finalizado. Gratidão!");
			}
			
		} while (opcao != 4);
		
		leia.close();
		
	}
}

	
	
	
	