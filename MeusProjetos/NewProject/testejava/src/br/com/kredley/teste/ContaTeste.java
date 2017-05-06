package br.com.kredley.teste;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		
		Conta conta = new Conta("Ricardo", 10000.00);
		//conta.cliente = "Ricardo";
		//conta.saldo = 10000.00;
		conta.exibeSaldo();
		
		conta.saca(1000);
		conta.exibeSaldo();
		
		conta.deposita(6000);		
		conta.exibeSaldo();
		
		Conta destino = new Conta("Caio", 8000.00);
		//destino.cliente = "Caio";
		//destino.saldo = 8000.00;
		
		conta.transferePara(destino, 1500.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
	}

}
