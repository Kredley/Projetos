package br.com.kredley.erros;

import br.com.kredley.heranca.Animal;
import br.com.kredley.heranca.Cachorro;
import br.com.kredley.heranca.Galinha;

public class ExcecoesComuns {

	/**
	 * @param args
	 */
	
	static int[] arrayNull = new int[0];
	
	public static void main(String[] args) {
	
//		System.out.print(arrayNull.length);
//		
//		int x = 5/0;
		
//		System.out.print(arrayNull[1]);
		
		
		//ClassCastException
		Animal a = new Galinha();
		Cachorro c = (Cachorro) a;
		
		//NumberFormatException
		int i = Integer.parseInt("x");
		
		
	}

}
