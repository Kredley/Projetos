package br.com.kredley.heranca;

public abstract class Animal {
	
	//Classe final ela nao pode ser herdada
	//metodo final, o metodo nao pode ser sobrescrito nas sobreclasses.
	//classe abstract ela nao pode ter corpo dos metodos nessas classes, apenas nas subclasses.
	
	private int serial;
	
	String comida;
	
	double peso;
	
	
	
	public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir(){
		System.out.println("Dormiu");
	}
	
	private void teste1(){
		
	}
	
	
	public void teste2(){
		
	}
	
	abstract void fazerBarulho();
	
}
