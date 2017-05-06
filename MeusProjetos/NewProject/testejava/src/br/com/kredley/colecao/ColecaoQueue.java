package br.com.kredley.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//FIFO
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.offer("Beatriz"); //msm que add
		
		System.out.println(fila);
		
		
		System.out.println(fila.peek());  //descobre que é o proximo da fila
		System.out.println(fila.poll());  //remove o proximo elemento do inicio da fila
		
		System.out.println(fila.peek());
		
		
		/* outros metodos disponiveis em linkedlist */
		
		LinkedList<String> f =  (LinkedList<String>) fila;
		
		f.addFirst("Caio"); //coloco no inicio da fila
		f.addLast("Juliana"); //coloca no final da fila
		
		System.out.println(fila);
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		f.pollFirst();
		f.pollLast(); //remove ultima[
		System.out.println(fila);
		
	}

}
