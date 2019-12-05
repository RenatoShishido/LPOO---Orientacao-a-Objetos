package Empresa.p3;

public class OperadorCaixa extends Funcionario implements HoraExtra {

	private int horasExtras;

	public OperadorCaixa(String nome, double salarioFixo) {
		super(nome, salarioFixo);
	}

	@Override
	public double getRendimentoMensal() {
		return getSalarioFixo() + getRendimentoHorasExtras();
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public String toString() {
		return String.format("\tOperador de Caixa:\n%s\t\tHoras extra: %d\n\t\tRendimento mensal: %f\n",
				super.toString(), horasExtras, getRendimentoMensal());
	}

	@Override
	public double getRendimentoHorasExtras() {
		return horasExtras * 20;
	}
}
