package br.com.kredley.teste;

public class Matematica {
	 
	public static int resultado; //variavel global
	
	public int raiz(int numero){
		
		int raiz = 0, impar = 1;
		
		while(numero >= impar){
			numero = numero - impar;
			impar = impar + 2;
			raiz++;
		}
		System.out.println(numero);
		return raiz;
	}
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	public int maior(int um, int dois){
		if(um>dois){
			return um;
		}else{
			return dois;
		}
	
	}

//	double soma(int um, int dois){
//		return um + dois;
//	}
	
	public double soma(String um, String dois){
		int um1 = Integer.valueOf(um);
		int dois1 = Integer.valueOf(dois);
		return um1 + dois1;
	}
}	
