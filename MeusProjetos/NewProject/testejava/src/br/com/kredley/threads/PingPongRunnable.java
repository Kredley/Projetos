package br.com.kredley.threads;

import java.util.*;

public class PingPongRunnable implements Runnable{
	
	String palavra;
	long tempo;
	
	public PingPongRunnable(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		
		try {
			for (int i = 0; i <5; i++) {
				System.out.print(palavra + " ");

				Thread.sleep(tempo);

			}
		} catch (InterruptedException e) {
			return;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> a;
		
		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("pong", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
		System.out.println("Ver Threads");
		
		
		
	}

}
