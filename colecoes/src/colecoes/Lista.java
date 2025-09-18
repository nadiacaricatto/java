package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//array list não restringe valores repetidos
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));
		
		System.out.println("Exibir o índice do elemento 10: " + numeros.indexOf(10));
		
		numeros.set(numeros.indexOf(10), 4);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		System.out.println(numeros);
		
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		//numeros.remove(5);
		
		//System.out.println(numeros);
		
		//o código vai dar erro pq o método remove o objeto, e não o índice
		
		//Corrigindo: 
		
		numeros.remove(numeros.indexOf(5));
		
		System.out.println(numeros);
		
		// For Each - Para Cada elemento da coleção, alguma tarefa será executada
		// não trabalha com o índice e retorna somente os valores/elementos
		// é o equivalente a: for (int indice = 0; indice < numeros.size; indice ++) {
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Tamanho da Lista: " + numeros.size());
		
		System.out.println("A lista está vazia?" + numeros.isEmpty());
		
		
		//não traz o índice, só retorna se o numero existe ou não na lista
		//se tiver mais de um valor igual, só retorna o primeiro
		System.out.println("O numero 8 está na lista? " + numeros.contains(8));
		
		//Limpar a lista - tirando todos os seus elementos
		
		numeros.clear();
		
		System.out.println("A lista está vazia?" + numeros.isEmpty());
		
		
		
		
	}

}
