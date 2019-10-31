package Empresa;

public class TestEmpresa {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Joao", 17, 2, "Padeiro", 15, "Masculino", 20, 2000),
				funcionario2 = new Funcionario("Pedro", 16, 1, "Acougueiro", 20, "Feminino", 30, 4000),
				funcionario3 = new Funcionario("Joaquim", 18, 3, "Acougueiro", 20, "Masculino", 30, 4000),
				funcionario4 = new Funcionario("Joaquim", 18, 3, "Acougueiro", 20, "Feminino", 30, 4000);

		Empresa empresa = new Empresa();
		empresa.cadastrarFuncionario(funcionario1);
		empresa.cadastrarFuncionario(funcionario2);
		empresa.cadastrarFuncionario(funcionario3);
		empresa.cadastrarFuncionario(funcionario4);
		empresa.funcionarioSexo("masculino");
		empresa.imprimir();
		System.out.println(empresa.mediaSalarioFuncionarios());
		empresa.mediaSalarioCargo();
	}
}
