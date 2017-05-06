package br.com.kredley.java;

public class StringMutavel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		System.out.println(s1.length());
		s1.capacity();//capacidade de armazenamentos de string sem ocupar mais memoria
		System.out.println(s1.capacity());
		
		System.out.println(s1);
		
//		s1.reverse();			//inverter a string
//		System.out.println(s1);
		
		s1.append(" Trabalhando ");
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos.");
		
		System.out.println(s1);
		
		
		//sao mesma coisa
		String s = "Oi" + " como " + "vai você?";
		String sb = new StringBuilder("Oi").append(" como ").append(" vai voce?").toString();
		
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		
		System.out.println(url);
		
		
	}

}
