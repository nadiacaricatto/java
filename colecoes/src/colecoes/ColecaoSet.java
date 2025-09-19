package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> frutas = new HashSet <String>();
		
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		
		System.out.println(frutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());
			
		}
			//o cálculo do hash code é feito a partir d euma função própria 
			//do hash code. A ordenação é feita a partir dos valores de código 
			//gerados.
			//parte da função é pegar o código "ask" de cada letra - é por isso
			// que não aceita repetição de elementos
			
			//não tem índice, então o único laço de repetição que funciona
			//é o for it 
		
		frutas.remove("Abacate"); 
		
		System.out.println(frutas);

		System.out.println("A fruta amora está presente no set?" + frutas.contains("Amora"));
			
		System.out.println("o set está vazio? " + frutas.isEmpty());
		
		Iterator<String> itFrutas = frutas.iterator();
		
		/* Se tentarmos adicionar frutas.add("Kiwi"), devemos criá-la depois de adicionar
		 * os elementos, e antes do iterador. O Iterador "tira uma foto" do set, por isso, 
		 * se tentandmo fazer uma adição posterior, não vamos vai funcionar.
		 */
		
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
		}
		
	//Cria o Array List
	ArrayList<String> frutasList = new ArrayList<String>();
	
	//Adiciona todos os elementos da Coleção Set no ArrayList
	frutasList.addAll(frutas); 
	
	// Ordenação dos dados em Ordem Crescente - Esse é o padrão (null) 
	frutasList.sort(null);
	
	//Lista os dados do ArrayList
	System.out.println(frutasList);
	
	// Ordenação dos dados em Ordem Decrescente
	frutasList.sort(Comparator.reverseOrder());
	
	System.out.println(frutasList);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}


