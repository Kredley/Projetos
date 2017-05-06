package br.com.provaEntrevista;


import java.util.ArrayList;
import java.util.Scanner;

public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] str1 = {1,9,5,23};
		

		
				
		//PRIMEIRO ARRAY
	
		Integer aux, tam = str1.length;
		for (int i = 0; i < str1.length; i++) {
			for(int y = i+1; y< str1.length; y++){
				if(str1[i] > str1[y]){
					aux = str1[i];
					str1[i] = str1[y];
					str1[y] = aux; 					
				}
			}
		}
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
			
		}
		
		
		//SEGUNDO ARRAY FEITO POR ARRAY TAMANHO DEFINIDO
		
		Integer[] str2 = new Integer[2];
		Boolean[][] num = new Boolean[3][]; 
		
		for (int i = 0; i < 2; i++) {
			Scanner scanner = new Scanner(System.in);
			int numero = scanner.nextInt();
			str2[i] = numero;
		}
		
		for (int i = 0; i < str2.length; i++) {
			for(int y = i+1; y< str2.length; y++){
				if(str2[i] > str2[y]){
					aux = str2[i];
					str2[i] = str2[y];
					str2[y] = aux; 					
				}
			}
		}
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
			
		}
		

		//TERCEIRO ARRAY FEITO POR ARRAY TAMANHO INDEFINIDO
		ArrayList<Integer> str3 = new ArrayList<Integer>();
		String continua = null;
		do{
			System.out.println("Entre com um número");
			Scanner s1 = new Scanner(System.in);
			
			str3.add(s1.nextInt());
			
			System.out.println("Deseja Continuar? APERTE 'n' Para SAIR");
			
			Scanner s2 = new Scanner(System.in);
			continua = s2.nextLine();
			
				
			
		}while(!continua.equals("n") || !continua.equals("n"));
		
		for (int i = 0; i < str3.size(); i++) {
			for(int y = i+1; y< str3.size(); y++){
				if(str3.get(i) > str3.get(y)){
					aux = str3.get(i);
					str3.set(i, str3.get(y));
					str3.set(y, aux); 					
				}
			}
		}
		for (int i = 0; i < str3.size(); i++) {
			System.out.println(str3.get(i));
			
		}

	}

}
