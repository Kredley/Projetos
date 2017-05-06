package br.com.kredley.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("1Guarana");
		list.add("2Uva");
		list.add("3Manga");
		list.add("6Coco");
		list.add("5Açai");
		list.add("4Banana");
		
		System.out.println(list.toString());
		
		Collections.sort(list); //Ordem Alfabetica
		
		System.out.println(list);
		
		Collections.reverse(list); //Contraria
		
		System.out.println(list);
		
		Collections.shuffle(list); // Ordem Aleatoria
		
		System.out.println(list);
		
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja"); //pode add mais
		
		
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja")); // qtd que repete
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		
		boolean d = Collections.disjoint(list, list2);
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guarana");
		
		System.out.println(list);
		System.out.println(indice);
		
		Collections.fill(list, "Açai"); //todas as posiçoes torna a variavel
		System.out.println(list);
		
		
		//coleçao nao modificavel
		
		Collection<String> constante =  Collections.unmodifiableCollection(list);
		
	}

}
