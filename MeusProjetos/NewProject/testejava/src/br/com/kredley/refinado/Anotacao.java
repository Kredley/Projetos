package br.com.kredley.refinado;

import java.io.Serializable;

/*
 *  Instituiçao: Universidade XTI
 *  Projeto: Sitema de Avaliações 
 *  Data de Criação: 27/07/2011
 *  Criador: Kredley Neri Magalhães
 *  Revisão: 2
 *  
 */

@Cabecalho( 
	instituicao = "Universidade XTI",
	projeto = "Sitema de Avaliações",
	dataCriacao = "27/07/2011",
	criador	= "Kredley Neri Magalhães",
	revisao = 2
		)
@ErrosCorrigidos(
		erros = { "0001", "0002" }
		)


@SuppressWarnings("serial")
public class Anotacao implements Serializable{
	
	@SuppressWarnings("unused")
	private int x;
	

	@Deprecated // a pessoa nao vai mais usar
	public void anotar() {}
	
	@Override //sobrescrevi um metodo da classe pai
	public String toString(){
		return null;
	}
	
	
	
	
	

}
