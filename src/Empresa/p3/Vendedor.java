package Empresa.p3;

public class Vendedor extends Funcionario {

	private double valorVendas;

	public Vendedor(String nome, double salarioFixo) {
		super(nome, salarioFixo);
	}

	@Override
	public double getRendimentoMensal() {
		return getSalarioFixo() + valorVendas * 0.01;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	@Override
	public String toString() {
		return String.format("\tVendedor:\n%s\t\tValor vendas: %f\n\t\tRendimento mensal: %f\n", super.toString(),
				valorVendas, getRendimentoMensal());
	}
}
