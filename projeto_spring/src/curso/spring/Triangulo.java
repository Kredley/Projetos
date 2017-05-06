package curso.spring;

public class Triangulo {
	
	private Ponto pontoA;
	private Ponto pontoB;
	private Ponto pontoC;
	
	public void desenhar(){
		System.out.println("Ponto A: (" + pontoA.getX() + "," + pontoA.getY() + ")");
		System.out.println("Ponto B: (" + pontoB.getX() + "," + pontoB.getY() + ")");
		System.out.println("Ponto C: (" + pontoC.getX() + "," + pontoC.getY() + ")");
	}

	public Ponto getPontoA() {
		return pontoA;
	}

	public void setPontoA(Ponto pontoA) {
		this.pontoA = pontoA;
	}

	public Ponto getPontoB() {
		return pontoB;
	}

	public void setPontoB(Ponto pontoB) {
		this.pontoB = pontoB;
	}

	public Ponto getPontoC() {
		return pontoC;
	}

	public void setPontoC(Ponto pontoC) {
		this.pontoC = pontoC;
	}
	
	
	
	//EXERCICIO2
	
	/*private String tipo;
	private int altura;
	
	public Triangulo(String tipo) {
		this.tipo = tipo;
	}

	
	public Triangulo(String tipo, int altura) {
		this.tipo = tipo;
		this.altura = altura;
	}
	
	public Triangulo(int altura) {
		this.altura = altura;
	}


	public void desenhar(){
		System.out.println("Desenhando um triangulo do tipo " + tipo + " com altura " + altura);
	}*/

//	public String getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
	
	
}
