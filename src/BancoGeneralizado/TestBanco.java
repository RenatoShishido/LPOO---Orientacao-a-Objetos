package BancoGeneralizado;

public class TestBanco {
	public static void main(String[] args) {
		Conta poupanca1 = new Poupanca("19277",5,3408,72,06122000,0.5),
	    		 poupanca2 = new Poupanca("19248", 3, 152749, 62, 06122000, 0.5);
		
		Conta previdencia1 = new Previdencia("19248", 2, 152749, 50, 06122000, 0.4, 0.8),
				previdencia2 = new Previdencia("19248", 9, 250749, 42, 06122000, 0.5, 1);
		
		Pessoa pessoaJuridica = new PessoaJuridica("Renato", "Rua", "995827536","340812", "5",poupanca1),
	     		pessoaJuridica2 = new PessoaJuridica("Lucas", "Rua", "993478185","064178", "6",poupanca2);      
	    
 		Pessoa pessoaFisica = new PessoaFisica("Joaquim", "Rua", "993857315","740812","12022000",previdencia1),
	     		pessoaFisica2 = new PessoaFisica("Luan", "Rua", "159357456","940812","340812",previdencia2);
 		
	     Gerencia g1 = new Gerencia();
	     g1.Adicionar(pessoaJuridica);
	     g1.Adicionar(pessoaJuridica2);
	     g1.Adicionar(pessoaFisica);
	     g1.Adicionar(pessoaFisica2);
	     g1.ordenaCpf();
	     g1.exibir();
	}
}
