package REBU;

public class Viagem {
	private Passageiro passageiro;
	private Motorista motorista;
	private String origem;
	private String destino;
	private double precoCorrida;

	public Viagem(Passageiro passageiro, Motorista motorista, String origem, String destino, double precoCorrida) {
		this.passageiro = passageiro;
		this.motorista = motorista;
		this.origem = origem;
		this.destino = destino;
		this.precoCorrida = precoCorrida;
		
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPrecoCorrida() {
		return precoCorrida;
	}

	public void setPrecoCorrida(double precoCorrida) {
		this.precoCorrida = precoCorrida;
	}

	public String imprimeInformacoesCorrida() {
		return "Viagem [passageiro:" + ", nome=" + passageiro.getNome() + ", cpf=" + passageiro.getCpf() + ", telefone=" + passageiro.getTelefone() + ", endereco=" + passageiro.getEndereco()
				+ "\n[motorista:" + ", nome=" + motorista.getNome() + ", cpf=" + motorista.getCpf() + ", placaCarro=" + motorista.getPlacaCarro() + ", anoValidadeHabilitacao="
				+ motorista.getAnoValidadeHabilitacao() + ", endereco=" + motorista.getEndereco() + "]\n" + "[origem=" + origem + ", destino="
				+ destino + ", precoCorrida=" + precoCorrida + "]";
	}

}
