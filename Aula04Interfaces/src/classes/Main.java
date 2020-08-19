package classes;

public class Main {

	public static void main(String[] args) {
		
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superHomem = new SuperHomem();
		
		Voador[] voadores = {pato, aviao, superHomem};
		
		TorreDeControle torreDeControle = new TorreDeControle(voadores);

		for(int cont=0; cont <= 30; cont++) {
			System.out.println("---------------Rodada "+cont+"---------------------");
			torreDeControle.voemTodos();
		}
		
		
		
	}

}
