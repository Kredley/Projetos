package br.com.kredley.java;

public class StringToken {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s= "XHTLM; CSS; JavaScript; jQuery; Java";
		
		String[] tokens = s.split(";");// Pode ser espaço
		
		for(String token : tokens){
			System.out.println(token);
		}
		
		System.out.println(tokens.length);

	}

}
