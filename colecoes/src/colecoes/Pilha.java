package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		// Collection Dequeue + Array Dequeue: método utilizado para o sistema pilha
		// responsável pelo Last In - First Out
		//Vector - Stack é uma das primeiras collections que o java criou, e a recomendação 
		//é de não utilização, e sim Array Dequeue
		
		//Ela não oferece acesso por índice, por não implementar a interface list, 
		//e por isso sua performance é muito melhor e mais rápida que a Vector Stack
		
		//Diferenciam-se na forma de criação do objeto 
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Duna"); 
		pilha.push("Pai Rico, Pai Pobre");
		pilha.push("Maus");
		pilha.push("Crime e Castigo");
		pilha.push("Quarto de Despejo");
		
		System.out.println(pilha);
		
		/* o resultado: 
		 * [Quarto de Despejo, Crime e Castigo, Maus, Pai Rico, Pai Pobre, Duna]
		  o último elemento a entrar/ser inserido será o primeiro*/
		
		pilha.pop();
		
		System.out.println(pilha);
		
		System.out.println("O livro Guia dos Mochileiros das Galáxias está na pilha? " + pilha.contains("Guia dos Mochileiros das Galáxias"));
		
		
		
		
		
		
		
		
		
	}

}
