
public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		
		ferrari.modelo = "ferrari enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundoszeroacem = 2.3;
		
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		
		ferrari.motor = v12; // adiciona motor ao carro

		
		Carro fusca = new Carro("Novo fusca", 220, 5.0);
		Motor v8 = new Motor("V8", 230);
		fusca.motor = v8;
		
		System.out.println(fusca.motor.potencia);
		
		Carro bugatti = new Carro("Bugatti Veron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.println(bugatti.motor.potencia);
	
	}

}
