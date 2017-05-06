
public class Conta {

	/**
	 * @param args
	 */
	
		
		int numero;
		String dono;
		double saldo;
		double limite;
		Cliente titular = new Cliente();
		
		
		void saca(double quantidade)
		{
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			
		}
		
		void deposita(double quantidade)
		{
			this.saldo = this.saldo + quantidade;
			
		}
		
		boolean saca2(double valor)
		{
			if (this.saldo<valor)
			{
			return false;
			}
			else 
			{
			this.saldo= this.saldo-valor;
			return true;
			}
		}
	
	 boolean transfere(Conta Destino,double valor)	
	 {
		 boolean retirou = this.saca2(valor);
		 if(retirou == false)
		 {// nao deu para sacar
			 return false;
		 }
		 
		 else
		 { //sacar
			 Destino.deposita(valor);
			 return true;
		 }
		 
		 
	 }

}
