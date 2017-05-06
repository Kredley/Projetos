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
		
		//Imprimindo cada posi�ao usa Iterator
		
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
� importante ressaltar alguns itens comuns para todas as classes que implementam Set:
Para adicionar um valor utiliza-se o m�todo add();
Para recuperar um objeto � necess�rio utilizar um Iterator;
Abaixo ser�o apresentados alguns exemplos pr�ticos e as principais caracter�sticas dessas tr�s implementa��es de Set.
HashSet
N�o garante a ordena��o dentre os objetos adicionados, portanto � a mais r�pida implementa��o para realizar opera��es b�sicas dentre as tr�s.
Sua implementa��o � apoiada por uma inst�ncia de HashMap;
Permitem valores nulos;



LinkedHashSet
Estende a classe HashSet, por�m na inser��o mant�m a ordem com que os valores foram inseridos. Possui desempenho intermedi�rio dentre as implementa��es aqui apresentadas.
� implementado utilizando um HashSet;
Permitem valores nulos;



TreeSet
Implementa tamb�m a interface SortedSet e, por isso, oferece a possibilidade de ordena��o dos objetos adicionados. A ordem � definida pela implementa��o da interface Comparable ou Comparator.
Mant�m a ordem � o mais lento dentre as implementa��es relacionadas.
Sua implementa��o � apoiada por AnvigableMap que utiliza TreeMap.
N�o permite valores nulos. Emite NulPoiterException  por utilizar o metodo compareTo() para manter a ordem.
Devemos utiliza-la quando queremos manter a ordena��o dos elementos ap�s inser��es ou remo��es.


*/