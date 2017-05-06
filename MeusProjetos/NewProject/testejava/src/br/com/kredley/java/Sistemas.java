package br.com.kredley.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;

public class Sistemas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		
		System.out.println(p.getProperty("java.version"));
		
//		p.setProperty("xti.curso.java.version", "1.0.0");
//		
//		Set<Object> pk = p.keySet();
//		for(Object key : pk){
//			System.out.println(key + " = " + p.get(key));
//		}
		
//		Console c = System.console();
//		System.out.println("Usuario ");
//		String user = c.readLine();
//		System.out.println("Senha ");
//		char[] pass = c.readPassword();
//		System.out.println("Usuario= " + user+ "Senha= " + pass);
		
		try {
	
				Runtime.getRuntime().exec("notepad");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
