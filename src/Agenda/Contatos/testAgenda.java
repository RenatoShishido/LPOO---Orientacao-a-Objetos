package Agenda.Contatos;

public class testAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contatos c1 = new Contatos("RENATO", 993478185, "Rua da flauta"),
				c2 = new Contatos("JOAO", 154645645, "Rua pedro celestino"),
				c3 = new Contatos("Cleber", 993478185, "Rua da flauta"),
				c4 = new Contatos("Joaquim", 154645645, "Rua pedro celestino"),
				c5 = new Contatos("Lucas", 154645645, "Rua pedro celestino");
		
		agenda.adicionar(c1);
		agenda.adicionar(c2);
		agenda.adicionar(c3);
		agenda.adicionar(c4);
		agenda.adicionar(c5);
		
		//agenda.remover("CLEBER");
		
		agenda.ordenarNome();
		
		agenda.exibir();
		
		
		

	}

}
