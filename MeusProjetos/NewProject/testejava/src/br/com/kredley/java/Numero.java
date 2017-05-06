package br.com.kredley.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		double saldo = 123456.789;
		
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));//generico
		
		f = NumberFormat.getIntegerInstance();//inteiro
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));//percentual
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));//moeda
		
		f.setMaximumFractionDigits(1);
		System.out.println(f.format(saldo));//mudar as casas decimais da moeda
		
		//Intercionalizaçao para os EUA
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));//moeda
		
		//Intercionalizaçao para os França
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));//moeda
		
		f = NumberFormat.getCurrencyInstance();
		
		System.out.println(f.parse("R$ 1.100,25"));//moeda
		
	

	}

}
