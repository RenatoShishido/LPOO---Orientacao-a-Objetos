package Banco;

public class TestBanco {
	public static void main(String[] args) {
		Conta popupanca = new Poupanca(8408, "Joao", 1000, 0.5), popupanca2 = new Poupanca(9448, "Amanda", 5000, 0.5);

		Conta corrente = new Corrente(1408, "Pedro", 1000, -200, 0.5),
				corrente2 = new Corrente(6448, "Aguena", 5000, -200, 0.5);

		BancoGerencia gerencia = new BancoGerencia();
		gerencia.inserir(popupanca);
		gerencia.inserir(popupanca2);
		gerencia.inserir(corrente);
		gerencia.inserir(corrente2);
		gerencia.ordernarNumero();
		// gerencia.ordernarNome();
		gerencia.exibir();

	}
}
