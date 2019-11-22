package herança.Pessoa;

public class Vendedor extends Empregado{
	private double valorVendas;
	private double comissao;

	@Override
	public double calcularSalario() throws valorNegativoException {
		if(getSalarioBase() > 0) {
			double total = (getSalarioBase() * getImposto()) + comissao + valorVendas;
			return total;
		}else
			throw new valorNegativoException("Valor negativo encontrado");		
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
