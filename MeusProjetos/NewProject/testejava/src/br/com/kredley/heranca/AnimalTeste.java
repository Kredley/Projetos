package br.com.kredley.heranca;

public class AnimalTeste {

	public static void barulho(Animal animal){
		animal.fazerBarulho();
	}
	
	public static void barulhoSemPolimorfismo(String animal){
		if(animal.equals("Cachorro")){
			System.out.println("Au, Au");
		}else if(animal.equals("Galinha")){
			System.out.println("Có, có");
		}
	}
	
	public static void main(String[] args) {
		Animal toto = new Cachorro();
		Animal carijo = new Galinha();
	//	Animal generico = new Animal(0,null);
	
		
		toto.comida = "carne";
		toto.dormir();
		

		carijo.dormir();
		
		System.out.println(toto instanceof Cachorro);	
		System.out.println(toto instanceof Animal);	
		System.out.println(toto instanceof Galinha);	
		
		System.out.println(toto.equals(carijo));
		System.out.println(toto.hashCode())	;
		System.out.println(toto.getClass());
		System.out.println(toto.toString());
		
		barulho(toto);
		barulho(carijo);
		//barulho(generico);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}
	


}
