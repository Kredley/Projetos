public class Kredley {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Conta minhaConta, c2;
		minhaConta = new Conta();
		c2 = new Conta();

		// Criando a conta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		System.out.println("Saldo inicio: " + minhaConta.dono + " "
				+ minhaConta.saldo);

		c2.dono = "KREDLEY";
		c2.saldo = 3000.0;
		System.out.println("Saldo inicio: " + c2.dono + " " + c2.saldo);
		// saca na conta

		boolean consegui = minhaConta.saca2(0);
		if (consegui)
			System.out.println("Consegui Sacar");
		else
			System.out.println("Não Consegui Sacar");

		// deposita a conta
		minhaConta.deposita(500);

		minhaConta.transfere(c2, 200);

		System.out.println(minhaConta.saldo);
		System.out.println(c2.saldo);

		// Cliente fregues = new Cliente();
		// fregues.endereco = "Sao Paulo";
		// fregues.cpf = "2334234";
		// fregues.sobrenome = "MAGALHAES";

		// c2.titular = fregues;

		// ACESSA A CLASSE CONTA COM O OBJETO DONO E APARTIR DO TITULAR ACESSA O
		// CLIENTE
		// System.out.println("Nome: " +c2.dono +" "+ c2.titular.sobrenome);

		c2.titular.endereco = "asdad";

		System.out.println(c2.titular.endereco);
	}

}
