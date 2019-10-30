package Empresa;

public class Cargo {
	private int codigoCargo;
	private String nome;
	private double valorRecebidoHora;

	public Cargo(int codigoCargo, String nome, double valorRecebidoHora) {
		this.codigoCargo = codigoCargo;
		this.nome = nome;
		this.valorRecebidoHora = valorRecebidoHora;
	}

	public int getCodigoCargo() {
		return codigoCargo;
	}

	public void setCodigoCargo(int codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorRecebidoHora() {
		return valorRecebidoHora;
	}

	public void setValorRecebidoHora(double valorRecebidoHora) {
		this.valorRecebidoHora = valorRecebidoHora;
	}

}
