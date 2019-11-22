package herança.Pessoa;

public class Funcionario extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	
	public double obterSaldo() {
		return valorCredito - valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
