package Banco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class Gerencia {
	private ArrayList<Conta> conta;
	
	public Gerencia() {
		conta = new ArrayList<>();
	}

	public void Adicionar(Conta c1) {
		conta.add(c1);
	}

	public boolean Remover(String cpfCnpjNomeNumeroConta) {
		Iterator<Conta> it = conta.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getName().equalsIgnoreCase(cpfCnpjNomeNumeroConta)) {
				return true;
			} else if (c1.getId().equals(cpfCnpjNomeNumeroConta)) {
				return true;
			} else if (c1.getVerificacao().equals(cpfCnpjNomeNumeroConta)) {
				return true;
			}
		}
		return false;
	}

	public Conta Pesquisar(String cpfCnpjNomeNumeroConta) {
		Iterator<Conta> it = conta.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getName().equalsIgnoreCase(cpfCnpjNomeNumeroConta)) {
				return  c1;
			} else if (c1.getId().equals(cpfCnpjNomeNumeroConta)) {
				return  c1;
			} else if (c1.getVerificacao().equals(cpfCnpjNomeNumeroConta)) {
				return  c1;
			}
		}
		return null;
	}

	  public void ordenaCpf() {
			conta.sort(new Comparator<Conta>() {
				@Override
				public int compare(Conta p1, Conta p2) {
					boolean p1fisica = p1 instanceof PessoaFisica;
					boolean p2fisica = p2 instanceof PessoaFisica;
					if (p1fisica == p2fisica)
						return p1.getName().compareTo(p2.getName());
					else if (p1fisica)
						return -1;
					else 
						return 1;
				}
			});
		}
	public void exebi() {
		System.out.println(conta.toString());
	}
	public void Exibir() {
		Iterator<Conta> it = conta.iterator();
		while(it.hasNext()) {
			Conta c1 = it.next();
			System.out.println(c1);
		}
	}
}
