
public class Animal {
	
	private String nome;
	
	private String caracteristica;
	
	Animal(String caracteristica, String nome){
		this.caracteristica = caracteristica;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	


}
