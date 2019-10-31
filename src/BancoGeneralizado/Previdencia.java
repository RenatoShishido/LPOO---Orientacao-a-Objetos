package BancoGeneralizado;

public class Previdencia extends Conta {
	private double taxaRendimento;
	private double taxaRetirada;

	public Previdencia(String numero, int digito, int agencia, int cvc, int nascimento, double taxaRendimento, double taxaRetirada) {
		super(numero,digito,agencia,cvc,nascimento);
		this.taxaRendimento = taxaRendimento;
		this.taxaRetirada = taxaRetirada;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRetirada() {
		return taxaRetirada;
	}

	public void setTaxaRetirada(double taxaRetirada) {
		this.taxaRetirada = taxaRetirada;
	}

	@Override
	public String toString() {
		return "Previdencia [" + super.toString() + "taxaRendimento=" + taxaRendimento + ", taxaRetirada="
				+ taxaRetirada + "]";
	}

}
