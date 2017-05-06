import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Provinha {

//	public static void main(String[] args) {
//		
//		List<Integer> lista = new ArrayList<Integer>();
//		
//		Scanner scanner = new Scanner(System.in);
//		int numero = scanner.nextInt();
//		
//		for(int qtd = 0; qtd<numero; qtd++){
//			scanner = new Scanner(System.in);
//			lista.add(scanner.nextInt());
//		}
//		
//		
//		int soma = 0;
//		
//		for (Integer i : lista) {
//			
//			soma = soma + i.intValue();
//		}
//		
//		
//		System.out.println(soma);
//}

//	public static void main(String[] args) throws Exception {
//	    
//		Scanner scanner = new Scanner(System.in);
//		String string = scanner.nextLine();
//		boolean repetido = false;
//		Integer contaRep =1;
//		if(string.length() >= 1024){
//			System.out.println("String muito grande");
//		}
//		
//		
//		else{
//			
//		Character[] vetorRepeticao = new  Character[1024];
//		
//		for(int i = 0; i< string.length(); i++ ){
//			vetorRepeticao[i] = string.charAt(i);
//			//System.out.println(repeticao[i]);	
//		}
//		
//		List<String> listaResultante = new ArrayList<String>();
//		listaResultante.add(vetorRepeticao[0].toString());
//		for(int i = 1; i<vetorRepeticao.length && vetorRepeticao[i] != null; i++){
//			
//				if(vetorRepeticao[i] != vetorRepeticao[i-1]){//diferente
//					if(repetido){
//						
//						listaResultante.add(contaRep.toString());
//						repetido = false;
//					}
//					
//					listaResultante.add(vetorRepeticao[i].toString());
//					contaRep = 1;
//				}
//				
//			
//				else{//igual
//					repetido = true; 					
//					contaRep++; // conta repetidos
//
//				}
//			
//	
//		
//		}
//		
//		System.out.println(listaResultante);	
//	
//			
//		}
//	    
//	}
	
	public static void main(String[] args) {
		
//		
//		Scanner scanner = new Scanner(System.in);
//		int tamanho = scanner.nextInt();
//		Integer[] str1 = new Integer[200000];
//		List<Integer> listaResultante = new ArrayList<Integer>();
//		
//		if(tamanho < 1 &&  tamanho > 200000){
//			System.out.println("tamanho invalido");
//		}
//		
//		// Le o numero e cria um vetor
//		for(int num = 0; num< tamanho; num++ ){
//			Integer numero = scanner.nextInt();
//			if(numero >= -10000000 && numero <= 10000000){
//				
//				
//				str1[num] = numero;
//			}	
//
//		}
//			
//		Integer aux = 0; // Ordena vetores
//		for (int i = 0; i < str1.length &&  str1[i] != null; i++) {
//			for(int y = i+1; y< str1.length && str1[y] != null; y++){
//				if(str1[i] > str1[y]){
//					aux = str1[i];
//					str1[i] = str1[y];
//					str1[y] = aux; 					
//				}
//			}
//		}
//		
//		int diferenca = 0;
//		if(str1[1] == null){  //lista de tamanho unico
//			System.out.println("Sem diferença");
//		}
//		else{
//			 diferenca = Math.abs(str1[0] - str1[1]);
//
//			for (int i = 1; i < str1.length && str1[i] != null; i++) {
//				if(str1[i+1] != null && diferenca  > Math.abs(str1[0] - str1[1])){
//					// Pegar a menor diferença
//					diferenca = Math.abs(str1[0] - str1[1]);
//					
//				}
//			}
//		
//
//		}
//		
//		
//		//Apos saber a diferença percorre vetor de novo para pegar os numeros que contem essa diferença e inserir na lista
//		for (int i = 0; i < str1.length && str1[i] != null; i++) {
//			if(Math.abs(str1[0] - str1[1]) == diferenca && str1[i+1] != null){
//				listaResultante.add(str1[i]);
//				listaResultante.add(str1[i+1]);
//				
//			}
//			
//		}
//	
//		
//		System.out.println(listaResultante);
//		
		
		
		
		
		
		//TESTANDO ENTRADA
		

		
		String nome = "12 53;45;67;87";
		
			for(int i = 0; i<nome.length(); i++){
				nome.charAt(i);
			}
		
			Character c = nome.charAt(2);
			
			
			
			System.out.println(c.charValue());



	}
	
}
