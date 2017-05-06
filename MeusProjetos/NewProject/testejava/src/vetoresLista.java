import java.util.ArrayList;

public class vetoresLista {

	public static void main(String[] args){
		
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("Branco");
		cores.add("Vermelho");
		cores.add("Amarelo");
		cores.add("Azul");
		
		System.out.println(cores.toString());
		System.out.println(cores.size());
		System.out.println("Indice Amarelo = " + cores.indexOf("Amarelo"));
		
		cores.remove("Amarelo");  //REMOVE AMARELO
		System.out.println(cores.toString());
		System.out.println(cores.contains("Amarelo"));
		
	}
}
