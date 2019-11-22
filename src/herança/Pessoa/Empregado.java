package herança.Pessoa;

public abstract class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public double calcularSalario() throws valorNegativoException {
		double total;
		if (salarioBase > 0) {
			total = salarioBase * imposto;
			return total;
		} else
			throw new valorNegativoException("Valor negativo encontrado");
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) throws valorNegativoException {
		if (salarioBase > 0) {
			this.salarioBase = salarioBase;
		} else
			throw new valorNegativoException("Valor negativo");
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

}
