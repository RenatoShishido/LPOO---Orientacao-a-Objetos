package Agenda.Contatos;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Iterator;


public class Agenda{
	private ArrayList<Contatos> contatos;

	/*
	 * Constructor que inicializa o vetor com um tamanho pre-definido
	 */
	public Agenda() {
		contatos = new ArrayList<Contatos>();
	}

	/*
	 * Adiciona um contato pelo forma mais simplificada utilizando os operadores ++
	 *
	 * @param c1
	 */
	public void adicionar(Contatos c1) {
		contatos.add(c1);
	}

	/*
	 * for para percorrer o vetor e o primeiro if serve para eliminar os ponteiros
	 * nulos dentro do vetor para nao ocorrer algum erro e o segundo if serve para
	 * verificar se tem alguma posição igual ao parametro que voce estabeleceu caso
	 * essa condição esteja verdadeira voce atribui naquela posição null.
	 *
	 * @param nome
	 */
	public void remover(String nome) {
		Iterator<Contatos> it = contatos.iterator();
		while (it.hasNext()) {
			Contatos c1 = it.next();
			if (c1.getNome().equalsIgnoreCase(nome)) {
				it.remove();
			}
		}
	}

	public void ordenarNome() {
		contatos.sort(new Comparator<Contatos>() {
			public int compare(Contatos c1, Contatos c2) {
				return c1.getNome().compareToIgnoreCase(c2.getNome());
			}
		});
	}

	/*
	 * Usamos um for para percorrer o vetor inteiro.O if serve para eliminar as
	 * posiçoes nulas do vetor que no caso se elas estiverem pode dar alguma
	 * confusão.
	 * 
	 */
	public void exibir() {
		for (Contatos contatos2 : contatos) {
			System.out.println(contatos2);
		}
	}
}
