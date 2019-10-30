package Empresa;

public class Funcionario {
	private String nomeFuncionario;
	private int codigoFuncional;
	private Cargo cargo;
	private String sexoFuncionario;
	private double horasSemanais;
	private double salarioBruto;

	public Funcionario() {
	}

	public Funcionario(String nomeFuncionario, int codigoFuncional, int codigoCargo, String nome, double valor,
			String sexoFuncionario, double horasSemanais, double salarioBruto) {
		cargo = new Cargo(codigoCargo, nome, valor);
		this.nomeFuncionario = nomeFuncionario;
		this.codigoFuncional = codigoFuncional;
		this.sexoFuncionario = sexoFuncionario;
		this.horasSemanais = horasSemanais;
		this.salarioBruto = salarioBruto;
	}

	public double calculoSalarioBrutoHora(int horas) {
		double total = 0;
		if (horasSemanais + 2 > horas) {
			double salario = salarioBruto / horasSemanais;
			double sobra = (horasSemanais + 2) - horas;
			total = salarioBruto + salarioBruto * 0.25;
		} else if (horasSemanais < horas) {
			total = salarioBruto;
			double horasNegativas = horasSemanais - horas;
			System.out.println("Voce nao cumpriu o horario " + horasNegativas + "negativas");
		}
		return total;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getSexoFuncionario() {
		return sexoFuncionario;
	}

	public void setSexoFuncionario(String sexoFuncionario) {
		this.sexoFuncionario = sexoFuncionario;
	}

	public double getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(double horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public int codigoCargo() {
		return cargo.getCodigoCargo();
	}

	public String imprimir() {
		return "Funcionario [nomeFuncionario=" + nomeFuncionario + ", codigoFuncional=" + codigoFuncional 
				+ ", sexoFuncionario=" + sexoFuncionario + ", horasSemanais=" + horasSemanais
				+ ", salarioBruto=" + salarioBruto + "Cargo [codigoCargo=" + cargo.getCodigoCargo() + ", nome="
				+ cargo.getNome() + ", valorRecebidoHora=" + cargo.getValorRecebidoHora() + "]";
	}

}
