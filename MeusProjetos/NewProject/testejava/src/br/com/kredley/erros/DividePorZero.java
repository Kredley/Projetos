package br.com.kredley.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	
	public static void dividir(Scanner s)
		throws InputMismatchException, ArithmeticException{
		
		System.out.print("Numero ");
		int a = s.nextInt();
		System.out.print("Divisor ");
		int b = s.nextInt();
		
		System.out.println(a/b);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		boolean continua = true;
		
		do {
			try {
				dividir(s);
				System.out.print("Numero ");
				int a = s.nextInt();
				System.out.print("Divisor ");
				int b = s.nextInt();
				
				System.out.println(a/b);
				continua = false;
				
			} catch (InputMismatchException	 e1) {
				System.err.println("Numeros devem ser Inteiros");
				e1.printStackTrace();
				s.nextLine();// descarta a entrada errada e libera novamente pelo usuario
			} catch (ArithmeticException e2) {
				System.err.println("Divisor deve ser diferente de zero");
				e2.printStackTrace();
			} 
			finally{
				System.out.println("Finally Executado");
			}
			
		} while (continua);
		
		
		//InputMistmatchException  letra
		//ArithmeticException  divisao por zero
		
		
	}
}
