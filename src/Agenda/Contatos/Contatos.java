package Agenda.Contatos;

public class Contatos {
	private String nome;
	private long numero;
	private String rua;

	public Contatos(String nome, long numero, String rua) {
		this.nome = nome;
		this.numero = numero;
		this.rua = rua;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	/*
	 * Esta é a metodo toString que ela uma sobrescrita de uma outra classe mae.
	 */
	@Override
	public String toString() {
		return "Contatos [nome=" + nome + ", numero=" + numero + ", rua=" + rua + "]";
	}

}
