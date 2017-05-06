package br.com.kredley.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
	
		String[] cores = {"verde", "amarelo", "azul", "branco",
				"azul", "amarelo", "verde"};
		
		List<String> list = Arrays.asList(cores);
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(list);
	
		System.out.println(set);
		
		//Imprimindo cada posiçao usa Iterator
		
		Iterator<String> iterator = set.iterator();
		System.out.println("Imprimindo cada objeto do conjunto");
		System.out.println("------------------------------------");
		while(iterator.hasNext()){
			Object val = iterator.next();
			System.out.println(val.toString());
			System.out.println("------------------------------------");
		}
		

	}

}

/*
É importante ressaltar alguns itens comuns para todas as classes que implementam Set:
Para adicionar um valor utiliza-se o método add();
Para recuperar um objeto é necessário utilizar um Iterator;
Abaixo serão apresentados alguns exemplos práticos e as principais características dessas três implementações de Set.
HashSet
Não garante a ordenação dentre os objetos adicionados, portanto é a mais rápida implementação para realizar operações básicas dentre as três.
Sua implementação é apoiada por uma instância de HashMap;
Permitem valores nulos;



LinkedHashSet
Estende a classe HashSet, porém na inserção mantém a ordem com que os valores foram inseridos. Possui desempenho intermediário dentre as implementações aqui apresentadas.
É implementado utilizando um HashSet;
Permitem valores nulos;



TreeSet
Implementa também a interface SortedSet e, por isso, oferece a possibilidade de ordenação dos objetos adicionados. A ordem é definida pela implementação da interface Comparable ou Comparator.
Mantém a ordem é o mais lento dentre as implementações relacionadas.
Sua implementação é apoiada por AnvigableMap que utiliza TreeMap.
Não permite valores nulos. Emite NulPoiterException  por utilizar o metodo compareTo() para manter a ordem.
Devemos utiliza-la quando queremos manter a ordenação dos elementos após inserções ou remoções.


*/