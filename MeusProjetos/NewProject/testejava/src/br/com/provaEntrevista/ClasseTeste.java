package br.com.provaEntrevista;

public class ClasseTeste {
	
	public static void main(String[] args) {
		SampleClasse sampleClasse = new SampleClasse();
	}
	
	

		

}


 class SampleClasse{
	 String[] ad = new String[3];
	private int size;
	private String priority;
	
	public SampleClasse(){
		super();
		System.out.println("Using default values");
	}
	
	public SampleClasse(int size){
		this.size = size;
		System.out.println("Setting Size");
	}
	
	public SampleClasse(String priority){
		this.priority = priority;
		System.out.println("Setting Priority");
	}
	
	
	
}
