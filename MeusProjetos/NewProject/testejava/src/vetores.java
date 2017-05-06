import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class vetores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] impares = new int[5];
		
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		String[] paises = {"Brasil","Russia","India","China"};
		
		String[] paises2 = {"Japao","Argentina","EUA","Bolivia"};
		
//		paises2 = Arrays.copyOf(paises, paises.length);
//		paises2 = Arrays.copyOfRange(paises, 3, paises.length);
	
		System.out.println(paises.length);
		
		System.out.println(Arrays.toString(paises));
		System.out.println(Arrays.toString(paises2));
		
		System.out.println(Arrays.binarySearch(paises, "Russia"));
		
		
		Arrays.sort(paises, 0, paises.length);
		
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {12.45 , 2.39};
		
		System.out.println(valores[0].doubleValue());
		
		
	}

}
