package br.com.kredley.erros;

import java.util.Scanner;

public class Assertions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Numero de 0 a 10");
		
		int numero = s.nextInt();
		
		assert (numero >=0 && numero <= 10) : "Numero invalido " + numero;
		System.out.println("Voce entrou " + numero);
		
		//ir no run cofiguration e ativar o assertion

	}

}
