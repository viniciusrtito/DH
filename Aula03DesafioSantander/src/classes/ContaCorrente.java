package classes;

public class ContaCorrente extends Contas{
	
		//--------Atributos
		private double limiteChequeEspecial;

		//--------Construtor
		public ContaCorrente(int idConta, int idCliente, double saldo, double limiteChequeEspecial) {
			super(idConta, idCliente, saldo);
			this.limiteChequeEspecial = limiteChequeEspecial;
		}

		
		//--------Getters e Setters
		public double getLimiteChequeEspecial() {
			return limiteChequeEspecial;
		}

		public void setLimiteChequeEspecial(double limiteChequeEspecial) {
			this.limiteChequeEspecial = limiteChequeEspecial;
		}
		
		
		//--------Métodos
		public void depositarCheques(double valor, String banco, String dataPagamento  ) {
			setSaldo(getSaldo() + valor);
		}


		@Override
		public void sacar(double valor) {
			double saldoAtual = getSaldo();
			if (saldoAtual >= valor) {
				saldoAtual -= valor;
				setSaldo(saldoAtual);
			} else {
				valor -= saldoAtual;
				setSaldo(0.0);
				this.limiteChequeEspecial -= valor;
			}
		}
		

}
