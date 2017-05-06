package br.com.kredley.teste;

import java.io.Serializable;

public class Conta implements Serializable{
	
	public String cliente;
	public double saldo;
	
	public Conta(String cliente , double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibeSaldo(){
		System.out.println("Cliente " + cliente + " o seu saldo é " + saldo);
	}
	
	 void saca(double valor){
		saldo = saldo - valor;
	}
	
	void deposita(double valor){
		saldo = saldo + valor;
	}
	
	void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
