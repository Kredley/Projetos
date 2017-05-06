
public class Fibonnaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anterior = 0, proximo = 1;
		System.out.println(anterior);
		
		
	//rotulo	
		um: 
		while(proximo < 50){
			System.out.println(proximo);
			proximo = proximo + anterior;
			anterior = proximo - anterior;
			break um;
		}
	}

}
