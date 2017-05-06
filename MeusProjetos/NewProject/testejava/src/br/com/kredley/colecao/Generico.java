package br.com.kredley.colecao;

import java.util.ArrayList;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	
	public E getElemento(){
		return elemento;
	}
	
	public double soma(ArrayList<? extends Number> lista){
		double total = 0;
		for(Number number : lista){
			total = total + number.doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		Generico<String> g = new Generico<String>();
		g.setElemento("Lago Paranoá");
		//g.setElemento(123456);
		g.getElemento().toUpperCase();
		
		
		//Nao precisa fazer cast para Generico
//		String e = (String) g.getElemento();
//		e.toUpperCase(); //
		
	}

}
