package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class Funcionarios {

	private String nome;
	private String endereco;
	private String cpf;
	private String email;
	private String setor;
	private String cargo;
	private String dataAdmissao;
	private String dataDemissao;
	private String dataUltimaFerias;
	private boolean ferias;
	private double salarioBase;

	public Funcionarios(String nome, String endereco, String cpf, String email, String setor, String cargo,
			String dataAdmissao, String dataDemissao, String dataUltimaFerias, boolean ferias, double salarioBase) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.dataUltimaFerias = dataUltimaFerias;
		this.ferias = ferias;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public String getDataUltimaFerias() {
		return dataUltimaFerias;
	}

	public void setDataUltimaFerias(String dataUltimaFerias) {
		this.dataUltimaFerias = dataUltimaFerias;
	}

	public boolean isFerias() {
		return ferias;
	}

	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void demitir(Funcionarios solicitante, Funcionarios demitido) {
		boolean podeDemitir = false;

		if (solicitante.getCargo().toLowerCase().equals("gerente") || solicitante.getCargo().toLowerCase().contentEquals("supervisor")) {
			podeDemitir = true;
		}

		if (solicitante.getCargo().toLowerCase().equals("gerente") && demitido.getCargo().toLowerCase().equals("gerente")) {
			podeDemitir = false;
		} else if (solicitante.getCargo().toLowerCase().equals("supervisor")
				&& (demitido.getCargo().toLowerCase().equals("gerente")|| demitido.getCargo().toLowerCase().equals("supervisor") )) {
			podeDemitir = false;
		}

		if (podeDemitir) {
			System.out.println("Funcionário demitido");
		} else {
			System.out.println("O cargo " + solicitante.getCargo() + " não pode demitir o cargo " + demitido.getCargo());
		}

	}

	public void trabalhar() {
		if (isFerias()) {
			System.out.println("Você está de férias não pode trabalhar.");
		} else {
			System.out.println("Estou trabalhando...");
		}

	}

	public void solicitarDemissao() {
		System.out.println("Solicito a minha demissão!");
	}

	public void solicitarAumento() {
		int sorte = (int) (Math.random() * (2 - 1 + 1) + 1);

		if (sorte % 2 == 1) {
			System.out.println("Lamento, não temos verba para um aumento salarial!");
		} else {
			System.out.println("Parabéns, você receberá um aumento salarial!");
		}

	}

	public void ajustarSalario(Funcionarios gerente, Funcionarios funcionario, double valorReajuste) {

		if (gerente.getCargo().toLowerCase().equals("gerente")) {
			if (!funcionario.getCargo().toLowerCase().equals("gerente")) {
				if (valorReajuste > 0) {
					funcionario.setSalarioBase(getSalarioBase() + valorReajuste);
					System.out.println("Reajuste salarial realizado com sucesso. O salario do funcionário "
							+ funcionario.getNome() + " foi reajustado para " + funcionario.getSalarioBase() + ".");
				} else {
					System.out.println("Não é possível realizar reajuste negativo");
				}
			} else {
				System.out.println("Sem alçada para conceder aumento salarial!");
			}
		}

	}

	public void requisitarFerias(Funcionarios funcionario) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataAdmissao = LocalDate.parse(funcionario.getDataAdmissao(), formatter);
		LocalDate dataFerias = LocalDate.parse(funcionario.getDataUltimaFerias(), formatter);

		int mesesAdmissao = dataAdmissao.getMonthValue() + dataAdmissao.getYear()*12;
		int mesesFerias = dataFerias.getMonthValue() + dataFerias.getYear()*12;
		int mesesDataAtual = LocalDate.now().getMonthValue() + LocalDate.now().getYear()*12;
		
		if((mesesDataAtual - mesesAdmissao) >= 11) {
			if ((mesesDataAtual - mesesFerias) >= 4) {
			System.out.println("Férias aprovada!");
			}else {
				System.out.println("Férias reprovada! O Funcionário tirou férias a menos de 4 meses.");
			}
		}else {
			System.out.println("Férias reprovada! O Funcionário deve estar a mais de 11 meses na empresa.");
		}
		
	}
		
		
		
	

	public abstract void consultarContraCheque(Funcionarios funcionario);

}
