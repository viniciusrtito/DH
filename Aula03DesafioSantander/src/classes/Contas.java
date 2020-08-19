package classes;

public class Contas {

	//--------Atributos
	private int idConta;
	private int idCliente;
	private double saldo;
	
	//--------Construtor
	public Contas(int idConta, int idCliente, double saldo) {
		this.idConta = idConta;
		this.idCliente = idCliente;
		this.saldo = saldo;
	}
	
	//--------Getters e Setters
	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//--------Métodos
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente para efetuar essa operação!");
		}
	}
	
	public double consultarSaldo() {
		return saldo;
	}


	
	
	
}
