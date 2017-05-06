package br.com.kredley.teste;

public class MatematicaTeste {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematica mat = new Matematica();
		int maior = mat.maior(10, 20);
	
		System.out.println(maior);
		
		Double so = mat.soma("10", "20");
		
		System.out.println(so);
		
		int raiz = mat.raiz(49);
		System.out.println(Math.sqrt(29));
		System.out.println(raiz);

	}

}
