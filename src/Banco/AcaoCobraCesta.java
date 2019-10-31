package Banco;

public class AcaoCobraCesta implements AcaoConta {
	private double valorCobrado;

	public AcaoCobraCesta() {

	}

	public void aplica(Conta c) {
		c.saldo -= valorCobrado;
	}
}
