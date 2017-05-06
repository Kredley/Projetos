  
	import java.util.ArrayList;  
	  
	/** Classe destinada a armazenar dados em uma estrutura em Arvore. */  
	public class Arvore  
	{   private int nivel;  
	    private Arvore anterior;  
	    private ArrayList<Arvore> proximos;  
	    private int posLetra;  
	    private char letra;  
	      
	    public Arvore()  
	    {  
	    }  
	      
	    public Arvore(int nivel, Arvore anterior, int posLetra, char letra)  
	    {   this.nivel = nivel;  
	        this.anterior = anterior;  
	        this.proximos = new ArrayList<Arvore>();  
	        this.posLetra = posLetra;  
	        this.letra = letra;  
	    }  
	      
	    public int getNivel()  
	    {   return nivel;  
	    }  
	      
	    public Arvore getAnterior()  
	    {   return anterior;  
	    }  
	      
	    public ArrayList<Arvore> getProximos()  
	    {   return proximos;  
	    }  
	      
	    public int getPosLetra()  
	    {   return posLetra;  
	    }  
	      
	    public char getLetra()  
	    {   return letra;  
	    }  
	      
	    /** Adiciona uma arvore na lista do nodo anterior. */  
	    public void setProximos(Arvore arvore)  
	    {   this.proximos.add(arvore);  
	    }  
	      
	    /** verifica se os niveis anteriores possuem o valor passado. */  
	    public boolean verificaAnteriores (Arvore superior, int valor)  
	    {   Arvore parcial = superior;      //Armazena parcialmente a raiz superior que é passada.  
	        boolean resultado = false;      /*Resultado é instanciado com falso para indicar que o 
	                                        * valor passado não é igual aos anteriores*/  
	          
	        while(parcial.getAnterior() != null)  
	        {   if(valor == parcial.getPosLetra())  
	            {   resultado = true;       //Indica que o valor já existe.  
	            }  
	            //Parcial recebe um nodo superior.  
	            parcial = parcial.getAnterior();  
	        }  
	          
	        return resultado;  
	    }  
	      
	    /** Verificia se na lista de proximos de um nodo contem o valor especificado */  
	    public boolean verificaListaProx(Arvore superior, int valor)  
	    {   ArrayList<Arvore> lista  = superior.getProximos();  
	        Arvore parcial;                                 //Armazena parcialmente nodo de uma arvore.  
	        boolean resultado = false;                      /*Resultado é instanciado com falso para indicar que o 
	                                                        * valor passado não é igual aos proximos */  
	          
	        //Verifica se, houver proximos, a existencia do valor passado.  
	        if(!lista.isEmpty())  
	        {   parcial = lista.remove(0);                  //Remove sempre o primeiro item da lista.  
	            if(parcial.getPosLetra() == valor)  
	            {   resultado = true;                       //Indica que o valor já existe.  
	            }  
	        }  
	          
	        return resultado;  
	    }  
	      
	    /** Adiciona uma arvore na lista do nodo anterior. */  
	    public Arvore criaRaiz(int nivel, Arvore superior, String palavra)  
	    {   Arvore resultado;               //Armazena o resultado dessa operação.  
	        int i,j = 0;                    //Variaveis temporarias, para realizar as operações.  
	        int k = palavra.length() - 1;   //Variavel para armazenar a posição da ultima letra da palavra.  
	          
	        //Estrutura de repetição para verificar se o numero é identico aos anteriores   
	        //ou a lista de proximos do nodo superior.  
	        for(i = 0; i < palavra.length(); i++)  
	        {   if(verificaAnteriores(superior,i) || verificaListaProx(superior,i))  
	            {   j++;  
	            }  
	            else  
	            {   //Caso o valor seja o menor até agora, este será armazenado.  
	                if(j < k)  
	                {   k = j;  
	                }  
	            }  
	        }  
	          
	        resultado = new Arvore(nivel, superior, k, palavra.charAt(k));  
	        System.out.println("Criada raiz: " + palavra.charAt(k) + " nivel: " + nivel);  
	          
	        for(i = nivel + 1; i < palavra.length(); i++)  
	        {   resultado.setProximos(criaRaiz(nivel + 1, resultado, palavra));  
	        }  
	          
	        return resultado;  
	    }  
	      
	    /** metodo para criar uma arvore */  
	    public void criaArvores(String palavra)  
	    {   int i , j;  
	          
	        for(i = 0; i < palavra.length(); i++)  
	        {   Arvore raiz = new Arvore(0, new Arvore(), i, palavra.charAt(i));  
	            System.out.println("Criada arvore: " + palavra.charAt(i));  
	              
	            for(j = 1; j < palavra.length(); j++)  
	            {   raiz.setProximos(criaRaiz(1,raiz,palavra));  
	            }  
	        }  
	    }  
	      
	

}
