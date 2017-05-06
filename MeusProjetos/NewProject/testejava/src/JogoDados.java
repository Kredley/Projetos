import java.util.Random;
import java.util.Scanner;


public class JogoDados {
	
	public static void main(String[] args) {
		
		System.out.println("Escolha o numero do Dado");
		Scanner scanner = new Scanner(System.in);
			
		int escolha = scanner.nextInt();
		
		Random r = new Random();
		
		int dado = r.nextInt(6)+1;
		
		System.out.println(dado);
		
		if(escolha == dado){
			System.out.println("Parabens vc acertou!!!!!!!!!!!!!!!");
		}else{
			System.out.println("Errou");
		}
	}

}
