package classes;

public class PessoaFisica extends Funcionarios{

	private String nit;
	
	private final double bonusGerente = 0.12;
	private final double bonusSupervisor = 0.08;

	public PessoaFisica(String nome, String endereco, String cpf, String email, String setor, String cargo,
			String dataAdmissao, String dataDemissao, String dataUltimaFerias, boolean ferias, double salarioBase, String nit) {
		super(nome, endereco, cpf, email, setor, cargo, dataAdmissao, dataDemissao, dataUltimaFerias, ferias, salarioBase);
		this.nit = nit;
	}

	@Override
	public void consultarContraCheque(Funcionarios funcionario) {
		double salarioFinal = funcionario.getSalarioBase();
		
		if(funcionario.getCargo().toLowerCase().equals("gerente")) {
			salarioFinal += salarioFinal* bonusGerente;
		} else if(funcionario.getCargo().toLowerCase().equals("supervisor")){
			salarioFinal += salarioFinal* bonusSupervisor;
		}
		
		System.out.println("Seu salário é " + salarioFinal);
	}
	
}
