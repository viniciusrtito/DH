package classes;

public class Test {

	public static void main(String[] args) {
		System.out.println("--------------Conta Poupança");
		ContaPoupanca contaP = new ContaPoupanca(1, 1, 1000, 0.1);
		System.out.println(contaP.consultarSaldo());
		contaP.deposito(100);
		System.out.println(contaP.consultarSaldo());
		System.out.println(contaP.recolherJuros());
		contaP.sacar(1300);
		System.out.println(contaP.consultarSaldo());
		
		System.out.println("--------------Conta Corrente");
		ContaCorrente contaC = new ContaCorrente(2, 2, 200, 500);
		contaC.deposito(300);
		System.out.println(contaC.consultarSaldo());
		contaC.sacar(800);
		System.out.println(contaC.consultarSaldo());
		System.out.println(contaC.getLimiteChequeEspecial());
	}

}
