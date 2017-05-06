package br.com.provaEntrevista;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args){
		List<String> lista = new ArrayList<String>();
		lista.add("Teste1");
		lista.add("Teste2");
		lista.add("Teste3");

		//JEITO 1
		for(int i = 0; i < lista.size(); i++){
			System.out.println(lista.get(i));
		}
		//JEITO 2
		for(String itemLista : lista){
			System.out.println(itemLista);
		}
		
		//JEITO 3
		lista.forEach(action->System.out.println(action));
	}
}
