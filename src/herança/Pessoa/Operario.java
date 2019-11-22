package herança.Pessoa;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	@Override
	public double calcularSalario() throws valorNegativoException {
		if(getSalarioBase() > 0) {
			double total = (getSalarioBase() * getImposto()) + comissao;
			return total;
		}else
			throw new valorNegativoException("Valor negativo encontrado");
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
