
public class EnumTeste {

	public static final double PI = 3.14;
	
	
	public static void main(String[] args) {
		System.out.println(PeçasXadrez.BISPO);
		System.out.println(Medidas.M.titulo);
		
		for(Medidas m: Medidas.values()){
			System.out.println(m.titulo);
		}
		

	}

}
