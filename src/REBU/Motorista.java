package REBU;

public class Motorista {
	private String nome;
	private String cpf;
	private String placaCarro;
	private int anoValidadeHabilitacao;
	private String endereco;

	public Motorista(String nome, String cpf, String placaCarro, int anoValidadeHabilitacao, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.placaCarro = placaCarro;
		this.anoValidadeHabilitacao = anoValidadeHabilitacao;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public int getAnoValidadeHabilitacao() {
		return anoValidadeHabilitacao;
	}

	public void setAnoValidadeHabilitacao(int anoValidadeHabilitacao) {
		this.anoValidadeHabilitacao = anoValidadeHabilitacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String imprimeInformacoesMotorista() {
		return "Motorista [nome=" + nome + ", cpf=" + cpf + ", placaCarro=" + placaCarro + ", anoValidadeHabilitacao="
				+ anoValidadeHabilitacao + ", endereco=" + endereco + "]";
	}

}
