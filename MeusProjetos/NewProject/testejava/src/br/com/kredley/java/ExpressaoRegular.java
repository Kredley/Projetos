package br.com.kredley.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.print("1 ");
		String padrao = "Java";
		String texto = "java";
		boolean b = texto.matches(padrao); //verifica se ta no padrao
		
		System.out.println(b);
		
		/*Modificadors
		 * (?i), Ignora maiuscula e minuscula
		 * (?x), Comentarios
		 * (?m), Multilinhas
		 * (?s), Dottal
		 */
		
		System.out.print("2 ");
		b = "Java".matches("(?im)java");
		System.out.println(b);
		
		/*Metacaracteres
		 * .qualquer caracter
		 * \d dígitos [0-9]
		 * \D nao é digíto [^0-9]
		 * \s espaços [\t\n\x0B\f\r]
		 * \S não é espaço [^\s]
		 * \w letra [a-zA-Z_0-9]
		 * \W não é letra
		 */
		//Apenas 1 caracteres  tem que repetir mais digito \\d\\d = 25
		System.out.print("3 ");
		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "r".matches("\\w");
		b = "".matches("\\s");
		System.out.println(b);
		
		//validar cep
		System.out.print("4 ");
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "01033-010".matches(cep);
		System.out.println(b);
		
		/*Quantificadores
		 * X{n}  	X, exatamente n vezes
		 * X{n,} 	X, pelo menos n vezes
		 * X{n, m}  X, pelo menos n mais não mais do que m vezes
		 * X?     	X, 0 ou 1 vez
		 * X*     	X, 0 ou + vezes
		 * X+		X, 1 ou + vezes  
		 */
		System.out.print("5 ");
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "12345".matches("\\d{2,5}");
		b = "aa".matches(".?");   //0 ou 1
		b = "ab".matches(".*"); //0 ou +
		b = "".matches(".+"); //1 ou + falso
		
		b = "01033-010".matches("\\d{5}-\\d{3}"); 
		System.out.println(b);
		
		System.out.print("6 ");
		b = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}"); 
		System.out.println(b);
		
		/*METACARACTER DE FRONTEIRA
		 * ^ 	inicia
		 * $ 	finaliza
		 * |    ou
		 */
		
		System.out.print("7 ");
		b = "Pier21".matches("^Pier.*");//começa com Pier
		b = "Pier21".matches(".*21$");  //termina com 21
		b = "tem java aqui".matches(".*java.*"); 
		b = "tem java aqui".matches("^tem.*aqui$"); //pode ser qualquer coisa no meio
		b = "sim".matches(".*sim|nao*");
				
		System.out.println(b);
		
		/*Agrupadores
		 * [...] 			Agrupamento
		 * [a-z] 			Alcance
		 * [a-e][i-u]     	Uniao
		 * [a-z&&[aeiou]]	Interseção
		 * [^abc]			Exceção
		 * [a-z&&[^m-p]]	Subtração
		 * \x				FugaLiteral
		 */
		
		System.out.print("8 ");
		b = "x".matches("[a-z]");	//positivo
		b = "2".matches("[0-9]");
		b = "True".matches("[tT]rue|[yY]es"); //true True yes Yes
		b = "Beatriz".matches("[A-Z][a-z]*"); //Primeira letra pode ser maius e minuscula
		b = "olho".matches("[^abc]lho"); // alho é falso
		b = "crau".matches("cr[ae]u"); //crau e creu
		
		b = "kdynm1988@hotmail.com".matches("\\w+@\\w+\\.\\w{2,3}");
		System.out.println(b);
		
		System.out.print("9 ");
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		
		
		/*Substituições
		 */
		System.out.print("10 ");
		String r=  doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		
		System.out.print("11 ");
		String url = "www.xti.com.br/clientes-2011.html";
					 //http://www.xti.com.br/2011/clientes.jsp  //Objetivo	
		
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		
		System.out.println(b);
		
		 re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		 r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		 System.out.println(r);  //atual
		System.out.println(url); //antes
	}

}
