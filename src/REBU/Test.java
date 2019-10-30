package REBU;

public class Test {

	public static void main(String[] args) {
		Motorista motorista1 = new Motorista("Alexandre", "159357", "AH3408", 3 , "Rua Jordao"),
				motorista2 = new Motorista("Pedro", "357159", "AP1593", 2 , "Rua Pedro");
		
		Passageiro passageiro1 = new Passageiro("Joaquim","258147" ,"33494064", "Rua Joaquim"),
				passageiro2 = new Passageiro("Joao","2563849" ,"30427298", "Rua Joao");
				
		Viagem viagem1 = new Viagem(passageiro1, motorista1, "SP", "RJ", 15000),
				viagem2 = new Viagem(passageiro2, motorista2, "RJ", "SP", 05000);
		
		System.out.println(viagem1.imprimeInformacoesCorrida());
		System.out.println();
		System.out.println(viagem2.imprimeInformacoesCorrida());
		
		
		
		

	}

}
