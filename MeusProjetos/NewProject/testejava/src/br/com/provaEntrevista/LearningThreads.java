package br.com.provaEntrevista;

import java.util.Arrays;
import java.util.Scanner;

public class LearningThreads {
	
	int contador = 0;
	
	public LearningThreads(){
		TempoParaPopularDados obj= new TempoParaPopularDados();
		obj.start();
		leituraDados();
		obj.interrupt();
	}
	


	public static void main(String[] args) {
		new LearningThreads();
		
		

	}

	

	private static void leituraDados() {
		Scanner entrada = new Scanner(System.in);
		
		Integer[] vetor = new Integer[5];
		for (int i = 0; i < 5; i++) {
			vetor[i] = entrada.nextInt();
		}
		
		Arrays.stream(vetor).forEach(item->System.out.println(item));
		
	}
	
	public class TempoParaPopularDados extends Thread {
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(1000);
					contador++;
					System.out.print(contador);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
	}

}
