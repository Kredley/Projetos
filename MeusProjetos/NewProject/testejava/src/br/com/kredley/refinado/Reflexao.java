package br.com.kredley.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class Reflexao {
	
	public static void main(String[] args) throws ClassNotFoundException{
		
		String nome = "br.com.kredley.teste.Conta";
		Class classe2 = Class.forName(nome);
		System.out.println(classe2.getSimpleName());
		
		Field[] f = classe2.getFields();
		for(Field field : f){
			System.out.println(field);
		}
		
		Method[] m =classe2.getDeclaredMethods();
		for(Method method : m){
			System.out.println(method.getName());
		}
		
		Constructor[] c = classe2.getConstructors();
		for(Constructor constructor : c){
			System.out.println(constructor);			
		}
		
		
//		classe2.getMethod("deposita", double.class);
//		//Object o = classe2.newInstance();
//		Method md = classe2.getMethod("deposita", double.class);
//		Method me = classe2.getMethod("exibeSaldo");
//		md.invoke(classe2.newInstance(), 120);
	//	me.invoke();
	}

}
