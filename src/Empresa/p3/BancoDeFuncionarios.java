package Empresa.p3;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class BancoDeFuncionarios {

	private List<Funcionario> funcionarios;

	public BancoDeFuncionarios() {
		funcionarios = new LinkedList<>();
	}

	public void inclui(Funcionario f) {
		funcionarios.add(f);
	}

	public void remove(String nome) throws NomeInexistenteException {
		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			Funcionario f = it.next();
			if (f.getNome().equals(nome)) {
				it.remove();
				return;
			}
		}

		throw new NomeInexistenteException(String.format("Nome '%s' inexistente no banco", nome));
	}

	public double valorRendimentos() {
		double valor = 0;
		for (Funcionario f : funcionarios)
			valor += f.getRendimentoMensal();
		return valor;
	}

	public void exibe() {
		exibe("");
	}

	public void exibe(String msg) {
		System.out.printf("=== Lista de Funcionários (%s) ===\n", msg);
		for (Funcionario f : funcionarios)
			System.out.println(f);
	}

	public void ordenarPorNome() {
		// Implementa um Comparator usando expressão lambda.
		funcionarios.sort((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
	}

	public void ordenarPorRendimento() {
		// Implementa um Comparator usando classe anônima.
		funcionarios.sort(new Comparator<Funcionario>() {
			@Override
			public int compare(Funcionario f1, Funcionario f2) {
				double rm1 = f1.getRendimentoMensal();
				double rm2 = f2.getRendimentoMensal();

				if (rm1 < rm2)
					return -1;
				else if (rm1 > rm2)
					return 1;
				return 0;
			}
		});
	}

	public void escrever(String arquivo) throws FileNotFoundException {
		PrintStream ps = new PrintStream(arquivo);
		for (Funcionario f : funcionarios)
			ps.println(f);
		ps.close();
	}

	public void relatorioHorasExtras() {
		int totalHE = 0;
		double totalRendimentosHE = 0;

		for (Funcionario f : funcionarios) {
			if (f instanceof HoraExtra) {
				HoraExtra he = (HoraExtra) f;
				System.out.println("Nome: " + f.getNome());
				System.out.println("Horas Extras: " + he.getHorasExtras());
				System.out.println("Rendimento horas extras: " + he.getRendimentoHorasExtras());
				System.out.println();

				totalHE += he.getHorasExtras();
				totalRendimentosHE += he.getRendimentoHorasExtras();
			}
		}

		System.out.println("Total horas extras: " + totalHE);
		System.out.println("Total rendimentos por horas extras: " + totalRendimentosHE);
	}

}
