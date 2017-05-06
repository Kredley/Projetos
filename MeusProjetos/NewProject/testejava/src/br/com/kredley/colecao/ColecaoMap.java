package br.com.kredley.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {
	
	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<String, String>();
		pais.put("BR", "Brasil");
		pais.put("RU", "Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR")); //CHAVE
		
		System.out.println(pais.containsValue("BR")); //VALOR
		
		System.out.println(pais.get("CN"));
		
		pais.remove("RU");
		
		System.out.println(pais);
		
		Set<String> keys = pais.keySet();
		
		for(String key : keys){
			System.out.println(key + ":" + pais.get(key));
		}
		
		
		
		
	}

}
