package s1t1n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{

	public Smartphone(String marca, String model) {
		super(marca, model);
	}
	
	public void alarma() {
		
		System.out.println("Est� sonant l'alarma");
	}

	public void fotografiar() {
		
		System.out.println("S'est� fent una foto");
	}
}