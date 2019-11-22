package herança.Pessoa;

import java.util.Scanner;

public class TestPessoa {
	public static void main(String[] args) throws valorNegativoException {
		Scanner sc = new Scanner(System.in);

		//Funcionario f = lerFuncionario(sc);
		Administrador adm = lerAdministrador(sc);

	}

	public static Funcionario lerFuncionario(Scanner sc) {
		Funcionario f = new Funcionario();
		System.out.println("Digite seu nome: ");
		f.setNome(sc.nextLine());
		System.out.println("Digite seu endereco: ");
		f.setEndereco(sc.nextLine());
		System.out.println("Digite seu telefone");
		f.setTelefone(sc.nextLine());
		return f;
	}

	public static Administrador lerAdministrador(Scanner sc) throws valorNegativoException {
		Administrador adm = new Administrador();
		System.out.println("Digite seu nome: ");
		adm.setNome(sc.nextLine());
		System.out.println("Digite seu endereco: ");
		adm.setEndereco(sc.nextLine());
		System.out.println("Digite seu telefone");
		adm.setTelefone(sc.nextLine());
		System.out.println("Codigo do seletor: ");
		adm.setCodigoSetor(Integer.parseInt(sc.nextLine()));
		System.out.println("Salario Base: ");
		adm.setSalarioBase(Double.parseDouble(sc.nextLine()));
		System.out.println("Imposto");
		adm.setImposto(Double.parseDouble(sc.nextLine()));
		System.out.println("Ajuda de custo");
		adm.setAjudaDeCusto(Double.parseDouble(sc.nextLine()));
		return adm;
	}
}
