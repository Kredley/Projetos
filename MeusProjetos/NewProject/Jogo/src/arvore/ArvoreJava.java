package arvore;


public class ArvoreJava {    
	   public static No raiz; // o �nico campo de dado em Arvore    
	     
	  
	   public ArvoreJava() { // construtor    
	     raiz = null;  //nenhum n� na arvore    
	   }   
	public static No insere(String palavra, No no) {  //metodo insere  
	          
	        if(no == null){  
	            no = new No(palavra);  //se nao existir n� cria um novo  
	        }  
	          
	        else if((compare(palavra, no.palavra)) < 0){ // faz compara��o, se palavra  
	            no.filhoEsquerda = ArvoreJava.insere( palavra , no.filhoEsquerda);// menor que n�, insere na esquerda  
	        }  
	        else if((compare(palavra, no.palavra)) > 0){//se palavra maior que n�, insere na direita  
	           no.filhoDireita = ArvoreJava.insere(no.palavra, no.filhoDireita);  
	        }  
	        else{// sen�o, palavra j� contem  
	            System.out.println("ERRO: valor j� existe na �rvore.");  
	            return null;  
	        }  
	          
	        return no;  
	  
	} 
	
	public static int compare(String palavra, String no){ // compara strings e retorna um inteiro  
	     return palavra.toString().compareTo(no.toString());//-1 menor, 1 maior, 0 iguais  
	} 
}