package br.com.kredley.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import br.com.kredley.teste.Conta;

public class Serializa {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String[] nomes = {"Ricardo", "Beatriz", "Sandra"};
		
		Conta conta1 = new Conta("XTI", 3434);
		Conta conta2 = new Conta("KRE", 8564);
		
		
		//Escrita de objeto
	
		FileOutputStream fos = new FileOutputStream("C:/Games/teste.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(conta1);
		oos.writeObject(conta2);		
		oos.close();
		
		//Leitura
		
		FileInputStream fis = new FileInputStream("C:/Games/teste.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		
		ois.close();
		
		//System.out.println(Arrays.toString(nomes1));
		
		c1.exibeSaldo();
		c2.exibeSaldo();
	}

}
