
public class Carro {
	
	String modelo;
	
	int velocidadeMaxima;
	
	double segundoszeroacem;
	
	Motor motor;
	
	public Carro(){
		
	}
	
	//construtor
	public Carro(String modelo, int velocidadeMaxima, double segundoszeroacem){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundoszeroacem = segundoszeroacem;
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundoszeroacem, Motor motor){
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundoszeroacem = segundoszeroacem;
		this.motor = motor;
		
	}

}
