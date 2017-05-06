package br.com.kredley.heranca;

public class Galinha extends Animal implements AreaCalculavel{
	
	public Galinha(){
		super(2, "Milho");
	}
	
	void fazerBarulho(){
		System.out.println("Có,có");
	}

	@Override
	public double calculaArea() {
		return 0;
	}
}
