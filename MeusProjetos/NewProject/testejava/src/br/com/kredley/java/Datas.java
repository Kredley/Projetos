package br.com.kredley.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {
	
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date();
		
		System.out.println(agora);
		
		Date data = new Date(1317572402646L);
		
		System.out.println(data);
		
		
		//Metodos

		data.getTime();
		data.setTime(1317572402646L);
		data.compareTo(agora); //-1,0,1
		System.out.println(data.compareTo(agora));
		
		Calendar c = Calendar.getInstance(); // mesma coisa retorna o
//		System.out.println(c.getTime()); //transforma em Date
//		System.out.println(c.get(Calendar.YEAR));
		new GregorianCalendar(); //calendario gregoriano
		
		c.set(1980, Calendar.FEBRUARY, 12);
		
		System.out.println(c.getTime()); //transforma em Date
		
		System.out.println(c.get(Calendar.YEAR)); //ano
		System.out.println(c.get(Calendar.MONTH)); //mes 0-11
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //dia do mes 
		
		
		c.set(Calendar.YEAR, 1972); //altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH); //altera o mes
		c.set(Calendar.DAY_OF_MONTH, 25); //altera o dia
		
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE); //limpar minuto e segundo
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
		
		
		c.add(Calendar.DAY_OF_MONTH, 1);  //adiciona ou diminui mais 1 no dia
		c.add(Calendar.YEAR, -1); //adiciona mais 1 no ano
		System.out.println(c.getTime());
		
		
		c.roll(Calendar.DAY_OF_MONTH, 20); //ele acrescenta o dia mas nao muda o mes caso supere o ultimo dia
		System.out.println(c.getTime()); // diferente do add que troca o tempo superior
		
		
		// Saudaçao PARA O USUARIO DO SISTEMA
		
		//BOM DIA, BOA TARDE, BOA NOITE
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		if(hora <= 12) {
			System.out.println("Bom dia");
		}else if(hora > 12 && hora < 18 ){
			System.out.println("Boa Tarde");
		}else{
			System.out.println("Bom Noite");
		}
	
	
	
		
	}

}
