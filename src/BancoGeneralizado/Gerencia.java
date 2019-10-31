package BancoGeneralizado;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class Gerencia {
	private ArrayList<Pessoa> pessoa;
	
	public Gerencia() {
		pessoa = new ArrayList<>();
	}

	public void Adicionar(Pessoa p1) {
		pessoa.add(p1);
	}

	public boolean Remover(String cpfCnpjNomeNumeroConta) {
		Iterator<Pessoa> it = pessoa.iterator();
		while (it.hasNext()) {
			Pessoa p1 = it.next();
			if (p1.getName().equalsIgnoreCase(cpfCnpjNomeNumeroConta)) {
				return true;
			} else if (p1.getId().equals(cpfCnpjNomeNumeroConta)) {
				return true;
			} else if (p1.getVerificacao().equals(cpfCnpjNomeNumeroConta)) {
				return true;
			}
		}
		return false;
	}

	public Pessoa Pesquisar(String cpfCnpjNomeNumeroConta) {
		Iterator<Pessoa> it = pessoa.iterator();
		while (it.hasNext()) {
			Pessoa p1 = it.next();
			if (p1.getName().equalsIgnoreCase(cpfCnpjNomeNumeroConta)) {
				return  p1;
			} else if (p1.getId().equals(cpfCnpjNomeNumeroConta)) {
				return  p1;
			} else if (p1.getVerificacao().equals(cpfCnpjNomeNumeroConta)) {
				return  p1;
			}
		}
		return null;
	}

	  public void ordenaCpf() {
			pessoa.sort(new Comparator<Pessoa>() {
				@Override
				public int compare(Pessoa p1, Pessoa p2) {
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
		System.out.println(pessoa.toString());
	}
	public void exibir() {
		Iterator<Pessoa> it = pessoa.iterator();
		while(it.hasNext()) {
			Pessoa p1 = it.next();
			System.out.println(p1);
		}
	}
}
