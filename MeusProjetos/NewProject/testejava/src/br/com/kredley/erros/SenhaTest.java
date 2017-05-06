package br.com.kredley.erros;

public class SenhaTest {

	/**
	 * @param args
	 * @throws SenhaInvalidaException 
	 */
	
	static void autenticar(String senha) throws SenhaInvalidaException{
		if("123".equals(senha)){
			//autenticado
			System.out.println("Senha Correta");
		}else{
			throw new SenhaInvalidaException("Senha Incorreta");
		}
		
	}
	
	public static void main(String[] args) {
		try {
			autenticar("1323");
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
