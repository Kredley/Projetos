package br.com.kredley.refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Cabecalho {
	

	String instituicao();	
	String projeto();	
	String dataCriacao();
	String criador();
	int revisao() default 1;
	

}
