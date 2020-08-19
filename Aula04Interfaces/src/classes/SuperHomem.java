package classes;

public class SuperHomem implements Voador{

	private int experiencia = 0;
	
	@Override
	public void voar() {
		this.experiencia +=3;
		System.out.println("Estou voando como um campeão. Tenho " + this.experiencia + " de experiência.");
	}

}
