package br.com.kredley.heranca;

public class Cubo implements VolumeCalculavel, AreaCalculavel{//herança multipla

	double lado;
	public Cubo(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularVolume() {
		return 6 * lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado * lado;
	}
	
	

}
