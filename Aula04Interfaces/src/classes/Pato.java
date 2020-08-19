package classes;

public class Pato implements Voador {

	private int energia = 100;

	@Override
	public void voar() {
		if (this.energia >= 5) {
			this.energia -= 5;
			System.out.println("Estou voando como um pato. Tenho " + energia+" de energia.");
		} else {
			System.out.println("Não tenho energia suficiente para voar");
		}
	}

}
