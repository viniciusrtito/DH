package classes;

public class Clientes {

	//--------Atributos
	private int idCliente;
	private String RgCliente;
	private String CpfCliente;
	private String nomeCliente;
	private String sobrenomeCliente;
	
	//--------Construtor
	public Clientes(int idCliente, String rgCliente, String cpfCliente, String nomeCliente, String sobrenomeCliente) {
		this.idCliente = idCliente;
		this.RgCliente = rgCliente;
		this.CpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.sobrenomeCliente = sobrenomeCliente;
	}

	//--------Getters e Setters
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRgCliente() {
		return RgCliente;
	}

	public void setRgCliente(String rgCliente) {
		RgCliente = rgCliente;
	}

	public String getCpfCliente() {
		return CpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		CpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}

	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
}
