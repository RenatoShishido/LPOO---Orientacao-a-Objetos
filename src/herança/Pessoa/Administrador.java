package herança.Pessoa;

public class Administrador extends Empregado {
	private double ajudaDeCusto;

	@Override
	public double calcularSalario() throws valorNegativoException {
		if(getSalarioBase() > 0) {
			double total = (getSalarioBase() * getImposto()) + ajudaDeCusto;
			return total;
		}else
			throw new valorNegativoException("Valor negativo encontrado");
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto)  {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}
