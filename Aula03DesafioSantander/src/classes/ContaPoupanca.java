package classes;

public class ContaPoupanca extends Contas {
	
	//--------Atributos
	private double juros;

	//--------Construtor
	public ContaPoupanca(int idConta, int idCliente, double saldo, double juros) {
		super(idConta, idCliente, saldo);
		this.juros = juros;
	}

	
	//--------Getters e Setters
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	
	//--------M�todos
	public double recolherJuros() {
		return getSaldo() * this.juros;
	}
	
	
}
