package classes;

public class TorreDeControle {

	private Voador[] voadores;
	
	
	
	 public TorreDeControle(Voador[] voadores) {
		this.voadores = voadores;
	}



	public void voemTodos() {
		 for(Voador voador: this.voadores) {
			 voador.voar();
		 }
		
		
	 }
	 
}
