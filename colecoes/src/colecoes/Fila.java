package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();
		// ctrl+shift+o > importa automaticamente

		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cintia");
		fila.add("Rayssa");

		System.out.println(fila);

		// Retirar um elemento da fila - Sempre retira o primeiro elemento
		fila.remove();

		System.out.println(fila);

		fila.add("Milena");
		fila.add("Nádia");

		System.out.println(fila);

		System.out.println("O tamanho da fila é:  pessoas" + fila.size());
		
		System.out.println("A primeira pessoa da fila é: " + fila.peek());

		for (var pessoa : fila) { //var sabe, por inferência, qual é o tipo de dado da variável, 
									//não sendo necessário alterar o tipo de dado 
			System.out.println(pessoa);
		}

		
		
		
		
	}

}
