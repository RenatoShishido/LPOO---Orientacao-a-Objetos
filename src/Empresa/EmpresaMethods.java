package Empresa;

public interface EmpresaMethods {

	void cadastrarFuncionario(Funcionario funcionario);

	void pesquisarFuncionarioCodigo(int Codigo);

	void pesquisarFuncionarioNome(String nome);

	void funcionarioCodigo();

	void funcionarioSexo(String sexo);

	double mediaSalarioFuncionarios();

	void mediaSalarioCargo();
	
	void imprimir();
}
