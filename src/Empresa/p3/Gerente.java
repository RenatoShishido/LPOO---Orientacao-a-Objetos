package Empresa.p3;


public class Gerente extends Funcionario implements HoraExtra {

	private int horasExtras;
	private int numClientes;

	public Gerente(String nome, double salarioFixo) {
		super(nome, salarioFixo);
	}

	@Override
	public double getRendimentoMensal() {
		return getSalarioFixo() + getRendimentoHorasExtras() + numClientes * 100;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

	@Override
	public double getRendimentoHorasExtras() {
		return horasExtras * 25;
	}

}

