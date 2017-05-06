
public class Motor {
	String tipo;
	int potencia;

	
	public Motor(){}
	
	public Motor(String tipo, int potencia){
		this.tipo = tipo;
		this.potencia = potencia;
	}
	
	public Motor(String tipo, int potencia, Motor motor){
		this.tipo = tipo;
		this.potencia = potencia;
	
	}
	
	
}
