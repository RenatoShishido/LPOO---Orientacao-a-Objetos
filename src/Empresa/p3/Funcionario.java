package Empresa.p3;

public abstract class Funcionario {
	private String nome;
	private double salarioFixo;

	public Funcionario(String nome, double salarioFixo) {
		this.nome = nome;
		this.salarioFixo = salarioFixo;
	}

	public abstract double getRendimentoMensal();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	@Override
	public String toString() {
		return String.format("\t\tNome: %s\n\t\tSalário Fixo: %f\n", nome, salarioFixo);
	}

}

