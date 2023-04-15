package s1t1n2exercici1;

public class Telefon {
	
	private String marca;
	private String model;
	
	public void trucar(String num_tel) {
		
		System.out.println("S'està trucant al " + num_tel);
	}
	
	//Afegim un constructor per fer servir els atributs
	public Telefon(String marca, String model) {
		
		this.marca = marca;
		this.model = model;		
	}
}