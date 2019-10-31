package BancoGeneralizado;

public class Poupanca extends Conta{
	private double taxaRendimento;
	

	public Poupanca(String numero, int digito, int agencia, int cvc, int nascimento, double taxaRendimento) {
		super(numero,digito,agencia,cvc,nascimento);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [" + super.toString() + "taxaRendimento =" + taxaRendimento + "]";
	}
	
	
}
