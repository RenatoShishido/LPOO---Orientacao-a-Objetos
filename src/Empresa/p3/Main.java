package Empresa.p3;

import java.io.FileNotFoundException;


public class Main {

	public static void main(String[] args) {
		BancoDeFuncionarios base = new BancoDeFuncionarios();

		OperadorCaixa op1 = new OperadorCaixa("Joao", 1000);
		op1.setHorasExtras(5);

		Gerente g1 = new Gerente("Maria", 1000);
		g1.setHorasExtras(20);
		g1.setNumClientes(5);

		Vendedor v1 = new Vendedor("Jose", 1200);
		v1.setValorVendas(5000);

		Vendedor v2 = new Vendedor("Ana", 1200);
		v2.setValorVendas(10000);

		base.inclui(op1);
		base.inclui(g1);
		base.inclui(v1);
		base.inclui(v2);

		System.out.printf("Valor rendimentos: %f\n\n", base.valorRendimentos());

		base.exibe();

		base.ordenarPorNome();

		base.exibe("ordenada por nome");

		base.ordenarPorRendimento();

		base.exibe("ordenada por rendimento");

		System.out.println("*** Relatório de Horas Extras ***");
		base.relatorioHorasExtras();
		System.out.println();

		System.out.println("Remove Jose");
		try {
			base.remove("Jose");
			base.exibe();
		} catch (NomeInexistenteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Remove Douglas");
		try {
			base.remove("Douglas");
			base.exibe();
		} catch (NomeInexistenteException e) {
			System.out.println(e.getMessage());
		}

		try {
			base.escrever("funcionarios.txt");
		} catch (FileNotFoundException e) {
			System.out.println(String.format("Não foi possível abrir o arquivo (%s)", e.getMessage()));
		}
	}

}
