package br.com.provaEntrevista;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.kredley.heranca.Animal;

public  abstract class certificacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long p = 47;
		double aas = 23.2;
		Double primeSquareRoot = Math.sqrt(p);
		System.out.println(primeSquareRoot.longValue());
		boolean isPrime = true;
		for(int j = 2; j<= primeSquareRoot.intValue(); j++){
			if(p % j == 0){
				System.out.println(j + "x" + p/j);
				isPrime = false;
			}
		}
		System.out.println("Prime number: " + isPrime);
		
		List<Animal> teste0 = new ArrayList<Animal>();
		
		ComparableAnimal cc = new ComparableAnimal();
		 Collections.sort(teste0, cc);
		
		Set<String> set = new TreeSet<String>();
		
		List<String> teste2 = (List<String>) set;
		
		List<ArrayList<Animal>> teste3 = new ArrayList<ArrayList<Animal>>();
		
		
		

		
	String carro = new String("fusca");
	char c = '\u0356';
	
	int a = 2;
	long b = 4;
	
	List<String> lista = new ArrayList<>();
	
	String[] vet = new String[10];
	
	
	
	int[] valor = {5, 9 , 3, 4 , 2 , 0 , 1}; 
	
	for (int i = 0 ; i < valor.length ; i++){
		for(int j = i; j < valor.length ; j++){
			if(valor[j] < valor[i]){
				int aux = valor[j];
				valor[j] =  valor[i];
				valor[i] = aux;
			}
		}
	}
	
	
	int[][] square = new int[3][3];
	for(int i =0;i<3;i++){
		square[i][i] = 5;
		
	}
	
	int sum = 0;
	for(int i =0; i<3;i++){
		for(int j=0;j<3;j++){
			sum = sum + square[i][j]; 
		}
	}
	
	System.out.println(sum);
	
	double[][] vetor = {{1,2,3},
						{7,8,9},
						{4,5,6},
						{3,4,5}
						
						};
	
	System.out.println("VALOR " + vetor[2][1]);
	
	System.out.println(Arrays.toString(valor));
	

	Double i = (double) 100;
	byte f = (byte) 200;
	
	System.out.println(i + f);

	StringBuffer carrobuffer = new StringBuffer("fusca");

//	carrobuffer.append("as");
//	carrobuffer.append("kredley");
//	
//	System.out.println(carrobuffer.toString());
	
	int teste = 2;
	
	switch(teste){
	
	case 0:
		System.out.println("Entrou no 0");
		break;
	case 1:	
		System.out.println("Entrou no 1");
		break;
	case 2:	
		System.out.println("Entrou no 2");
		
	default :
		System.out.println("entrou no default ");
		
	
	}
			
	
	StringBuilder carrobuilder = new StringBuilder("fusca");
	
	System.out.println(carrobuffer);
	System.out.println(carrobuilder);
	System.out.println(carrobuilder.equals(carrobuffer));
	System.out.println(carrobuilder.toString().equals(carrobuffer.toString()));
	
	//int investment = 1_000_0000;
	//System.out.println(investment);
	
	int ar = 48/2*(9+3);
	System.out.println(ar);
	}
	
	
	public abstract void teste();

}
