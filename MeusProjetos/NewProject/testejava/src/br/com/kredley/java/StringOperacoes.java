package br.com.kredley.java;

public class StringOperacoes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//Operaçoes
		
		int tamanho = s1.length();
		char letra = s1.charAt(0);//Retorna o caracter
		String texto = s1.toString();
		
		//Localizacao
		
		int posicao = s3.indexOf("Virtual"); //Retorna a posicao onde começa a palavra
		System.out.println(posicao);
		int ultima = s3.lastIndexOf("a");
		System.out.println(ultima);
		
		boolean vazia = s3.isEmpty();
		
		//Comparaçao
		
		String xti  = "XTI";
		//boolean x = xti.equals("xti");
		boolean x = xti.equalsIgnoreCase("xtI");
		
		System.out.println(x);
		
		boolean y = xti.startsWith("XT");		
		
		System.out.println(y);
		
		int c = "amor".compareTo("bola"); // -1  a antes de c
		
		System.out.println(c); //verifica se a string é menor ou maior ou seja vem antes ou depois
		
		String so = "Olhe olhe!";
		
		boolean o = so.regionMatches(true, 6, "Olhe", 0, 4);//verifica se encontra a palavra depois de uma certa regiao
		
		System.out.println(o);
		
		String l = "O Brasil é Lindo";
		
		String S1 = l.substring(11);//pega a partir da 11 posicao
		
		System.out.println(S1);
		
		String S11 = l.substring(2, 8);
		
		System.out.println(S11);
		
		s1 = l.concat(" que Maravilha");
		System.out.println(s1);
		s1 = l.replace('s', 'z');
		System.out.println(s1);
		
		s1 = l.replaceFirst(" ", "X");
		System.out.println(s1);
		
		s1 = l.replaceAll(" ", "X");
		System.out.println(s1);
		
		s1 = l.toUpperCase(); // deixa tudo maiusculo
		System.out.println(s1);
		
		s1 = l.toLowerCase();// deixa tudo minusculo
		System.out.println(s1);
		
		System.out.println("   espaços    ".trim());//remove espaços antes e depois
		
		
		
	}

}
