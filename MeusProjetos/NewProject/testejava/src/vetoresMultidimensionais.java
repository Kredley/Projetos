import java.util.Random;

	
	public class vetoresMultidimensionais {
		
		public static void main(String[] args){
			
			String[][] duas = {{"Ricardo","M","DF"}, {"Sandra","F","MG"}};
			
			
			String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
			
			Random r = new Random();
			
			//Sorteia uma carta do baralho 
			String face =  faces[r.nextInt(faces.length)];		
			String nipe =  nipes[r.nextInt(nipes.length)];
			
			String carta = face + " " + nipe;
			
			System.out.println(carta);
		}
		
	}
