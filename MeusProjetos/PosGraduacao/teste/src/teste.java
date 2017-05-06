import java.util.Scanner;


public abstract class teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	int a=0,b=1,c = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	int numero = scanner.nextInt();
	
	
	if(numero == 0){
		c=0;
	}
	
	else if(numero == 1){
		c=1;
	}
	
	else{
		for(int i=2; i < numero; i++){
			c=a+b;
			
			a=b;
			
			b=c;
		}
		
	}
	
	//  0 1 1 2 3 5 8 13 21 34
	System.out.println(c);
//		//Instanciando um objeto Fatorial
//		Fatorial numero = new Fatorial();

	}
}