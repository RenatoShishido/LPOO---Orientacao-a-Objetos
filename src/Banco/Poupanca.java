package Banco;

public class Poupanca extends Conta {
	private double taxaRendimento;

	public Poupanca(int numero, String nomeTitular, double saldo, double taxaRendimento) {
		super(numero, nomeTitular, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public boolean saca(double valor) {
		if (saldo < valor)
			return false;
		else if (saldo > valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public void fimDoMes() {
		saldo = saldo + (saldo * taxaRendimento);
	}

	@Override
	public String toString() {
		return "Poupanca [" + super.toString() + ", taxaRendimento=" + taxaRendimento + "]";
	}

}
