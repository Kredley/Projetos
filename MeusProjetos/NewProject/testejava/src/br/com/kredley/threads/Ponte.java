package br.com.kredley.threads;

public interface Ponte {

	public void set(int valor) throws InterruptedException;
	
	public int get() throws InterruptedException;
	
	
}
