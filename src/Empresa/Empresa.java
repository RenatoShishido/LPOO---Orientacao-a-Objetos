package Empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa implements EmpresaMethods {
	ArrayList<Funcionario> funcionarios;

	public Empresa() {
		funcionarios = new ArrayList<>();
	}

	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void pesquisarFuncionarioCodigo(int Codigo) {
		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			Funcionario fc = it.next();
			if (fc.getCodigoFuncional() == (Codigo)) {
				System.out.println(fc.imprimir());
			}
		}
	}

	public void pesquisarFuncionarioNome(String nome) {
		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			Funcionario fc = it.next();
			if (fc.getNomeFuncionario().equalsIgnoreCase(nome)) {
				System.out.println(fc.imprimir());
			}
		}
	}

	public void funcionarioCodigo() {
		Funcionario temp;
		int n = funcionarios.size();

		for(int i = 0 ; i < n - 1; i ++ )
		{
			int min = i;
			for(int j = i +1 ; j < n ; j++)
			{
				if(funcionarios.get(j).codigoCargo() < funcionarios.get(i).codigoCargo())
					min = j;
			}
			temp = funcionarios.get(i);
			funcionarios.set(i, funcionarios.get(min));
			funcionarios.set(min, temp);
		}
	}
	public void funcionarioSexo(String sexo) {
		Funcionario temp;
		int n = funcionarios.size();

		for(int i = 0 ; i < n - 1; i ++ )
		{
			int min = i;
			for(int j = i +1 ; j < n ; j++)
			{
				if(funcionarios.get(j).getSexoFuncionario().equalsIgnoreCase(sexo))
					min = j;
				else if(funcionarios.get(j).getSexoFuncionario().equalsIgnoreCase(sexo))
					min = j;
			}
			temp = funcionarios.get(i);
			funcionarios.set(i, funcionarios.get(min));
			funcionarios.set(min, temp);
		}
	}

	public double mediaSalarioFuncionarios() {
		double total = 0, media = 0;
		int cont = 0;
		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			Funcionario fc = it.next();
			total += fc.getSalarioBruto();
			cont++;
		}
		media = total / cont;
		return media;
	}

	public void mediaSalarioCargo() {
		double total = 0, media1 = 0, total2 = 0, media2 = 0;
		int cont = 0, cont2 = 0;
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).codigoCargo() == 1) {
				total += funcionarios.get(i).getSalarioBruto();
				cont++;
			} else if (funcionarios.get(i).codigoCargo() == 2) {
				total2 += funcionarios.get(i).getSalarioBruto();
				cont2++;
			}
		}
		media1 = total / cont;
		media2 = total2 / cont2;
		System.out.println("Codigo cargo 1: " + media1);
		System.out.println("Codigo cargo 2: " + media2);
	}

	public void imprimir() {
		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			Funcionario fc = it.next();
			System.out.println(fc.imprimir());
		}
	}
}
