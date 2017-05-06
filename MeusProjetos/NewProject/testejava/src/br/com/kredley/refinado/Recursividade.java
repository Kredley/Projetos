package br.com.kredley.refinado;


public class Recursividade {

	
	public static int soma(int x){
		
		if(x == 0){
			return 0;
		} else {
			return x + soma(x -1);
		}
		
	}
	
	public static  int potencia(int x, int e){
		if(e == 1){
			return x;
		}else{
			return x * potencia(x , e-1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Recursividade r = new Recursividade();
		System.out.println(soma(10));
		System.out.println(potencia(2,5));
	
		
	}

}
