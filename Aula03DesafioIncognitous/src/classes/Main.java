package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) throws Exception {

		PessoaFisica pessoaFisica0 = new PessoaFisica("PF0", "Rua 01", "12312312387", "pf1@teste.com", "vendedas", "Gerente", "01/03/2019", "18/08/2020", "01/12/2019", true, 3000.00, "123456789");
		PessoaFisica pessoaFisica1 = new PessoaFisica("PF1", "Rua 01", "12312312387", "pf1@teste.com", "vendedas", "Supervisor", "01/03/2019", "18/08/2020", "01/06/2020", false, 3000.00, "123456789");
		PessoaFisica pessoaFisica2 = new PessoaFisica("PF2", "Rua 01", "12312312387", "pf1@teste.com", "vendedas", "Vendedor", "01/07/2020", "18/08/2020", "01/01/0001", true, 3000.00, "123456789");
		PessoaFisica pessoaFisica3 = new PessoaFisica("PF3", "Rua 01", "12312312387", "pf1@teste.com", "vendedas", "Gerente", "01/07/2020", "18/08/2020", "01/01/0001", true, 3000.00, "123456789");
		PessoaFisica pessoaFisica4 = new PessoaFisica("PF4", "Rua 01", "12312312387", "pf1@teste.com", "vendedas", "Supervisor", "01/07/2020", "18/08/2020", "01/01/0001", true, 3000.00, "123456789");
		PessoaJuridica pessoaJuridica0 = new PessoaJuridica("PJ0", "Rua 01", "12312312387", "pf1@teste.com", "vendedas", "Vendedor", "01/07/2020", "18/08/2020", "01/01/0001", true, 3000.00, "123456789");
		
//		//teste contra-cheque
//		pessoaFisica0.consultarContraCheque(pessoaFisica0);
//		pessoaFisica1.consultarContraCheque(pessoaFisica1);
//		pessoaFisica2.consultarContraCheque(pessoaFisica2);
//		
//		//teste férias
//		pessoaFisica0.requisitarFerias(pessoaFisica0);
//		pessoaFisica1.requisitarFerias(pessoaFisica1);
//		pessoaFisica2.requisitarFerias(pessoaFisica2);
//		
//		//teste Demissão
//		//gerente - gerente
//		pessoaFisica0.demitir(pessoaFisica0, pessoaFisica3);
//		//gerente - supervisor
//		pessoaFisica0.demitir(pessoaFisica0, pessoaFisica1);
//		//gerente - vendedor
//		pessoaFisica0.demitir(pessoaFisica0, pessoaFisica2);
//		//supervisor - gerente
//		pessoaFisica1.demitir(pessoaFisica1, pessoaFisica0);
//		//supervisor - supervisor
//		pessoaFisica1.demitir(pessoaFisica1, pessoaFisica4);
//		//supervisor - vendedor
//		pessoaFisica1.demitir(pessoaFisica1, pessoaFisica2);
//		//vendedor - vendedor
//		pessoaFisica2.demitir(pessoaFisica2, pessoaJuridica0);
		
//		//teste reajuste salarial
//		//salario positivo
//		pessoaFisica0.ajustarSalario(pessoaFisica0, pessoaJuridica0, 300.00);
//		//salario negativo
//		pessoaFisica0.ajustarSalario(pessoaFisica0, pessoaJuridica0, -300.00);
//		//gerente ajustar salario de gerente
//		pessoaFisica0.ajustarSalario(pessoaFisica0, pessoaFisica3, 300.00);
		
//		//funcionario trabalhar
		pessoaFisica2.trabalhar();
//		pessoaFisica2.requisitarFerias(pessoaFisica2);
//		pessoaFisica2.solicitarAumento();
		
		pessoaFisica1.trabalhar();
	}

}
