package classes;

public class PessoaJuridica extends Funcionarios{

	private String cnpj;

	
	
	public PessoaJuridica(String nome, String endereco, String cpf, String email, String setor, String cargo,
			String dataAdmissao, String dataDemissao, String dataUltimaFerias, boolean ferias, double salarioBase, String cnpj) throws Exception {
		super(nome, endereco, cpf, email, setor, cargo, dataAdmissao, dataDemissao, dataUltimaFerias, ferias, salarioBase);
		this.cnpj = cnpj;
		
		if(getCargo().toLowerCase() == "supervisor" || getCargo().toLowerCase() == "gerente") {
			throw new Exception("Gerente e Superviisores devem ser criados como Pessoa Física");
		}
	}



	@Override
	public void consultarContraCheque(Funcionarios funcionario) {
		System.out.println(funcionario.getSalarioBase());
	}


}
