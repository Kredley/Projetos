import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jogo {

	public static void main(String[] args) {
		
		
		List<Animal> animalAgua = new ArrayList<Animal>();
		List<Animal> animalTerra = new ArrayList<Animal>();
		
		animalAgua.add(0, new Animal("" , "Tubarao"));
		animalTerra.add(0, new Animal("", "Macaco"));
	
	
	
		System.out.println("Pense em um animal");
		
		System.out.println("O Animal que você pensou vive na água?    [S/N]");
		
		Scanner s = new Scanner(System.in);
		
		String tipo = s.nextLine();
		
		while(tipo.equalsIgnoreCase("S") || tipo.equalsIgnoreCase("N")){
			

			if(tipo.equalsIgnoreCase("S")){
				
				int i = 0;
				System.out.println("O Animal que você pensou é um " + animalAgua.get(i).getNome()  +  "? [S/N]");
				
				Scanner IsAnimal = new Scanner(System.in);
				String isAnimal =  IsAnimal.nextLine(); 
				
				if(isAnimal.equalsIgnoreCase("S")){
					System.out.println("Acertei de novo");
					
				}
				
				else{
					System.out.println("Qual animal você pensou?");
					Scanner nome = new Scanner(System.in);
					
					String nomeAnimal = nome.nextLine();
					System.out.println("Complete");
					
					System.out.println("Um(a) "+ nomeAnimal + "mas um(a) " + animalAgua.get(i).getNome() +" não");
					Scanner carac = new Scanner(System.in);
					
					animalAgua.add(++i, new Animal(carac.nextLine() , nomeAnimal));
					
					
				}
				
				
			}else if(tipo.equalsIgnoreCase("N")){
				int i = 0;
				System.out.println("O Animal que você pensou é um"  + animalTerra.get(i).getNome()  +   "? [S/N]");
			}
			
			 tipo = s.nextLine();
			
		}
		
		System.out.println("SAIU");

		
	}
}
