package Banco;

public class Corrente extends Conta {
	private double limite;
	private double taxaJuros;

	public Corrente(int numero, String nomeTitular, double saldo, double limite, double taxaJuros) {
		super(numero, nomeTitular, saldo);
		this.limite = limite;
		this.taxaJuros = taxaJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public boolean saca(double valor) {
		if (saldo - valor > limite)
			return false;
		else if (saldo - valor <= limite) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public void fimDoMes() {
		saldo = saldo + (saldo * taxaJuros);
	}

	@Override
	public String toString() {
		return "Corrente [" + super.toString() + ", limite=" + limite + ", taxaJuros=" + taxaJuros + "]";
	}

}
