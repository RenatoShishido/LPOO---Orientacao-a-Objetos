package Agenda;

public class Test {
    public static void main(String[] args) {

        Pessoa pessoaJuridica = new PessoaJuridica(2,"Renato", "Rua", "995827536","06879416415416","1215454"),
        		pessoaJuridica2 = new PessoaJuridica(4,"Lucas", "Rua", "993478185", "06879416415416", "156456465");      
       
        Pessoa pessoaFisica = new PessoaFisica(1,"Joaquim", "Rua", "993857315","06979145185","06122000"),
        		pessoaFisica2 = new PessoaFisica(3,"Luan", "Rua", "1593574565","06979145186", "14101997");
        
        
        Agenda agenda = new Agenda();

        agenda.inserir(pessoaJuridica);
        agenda.inserir(pessoaJuridica2);
        agenda.inserir(pessoaFisica);
        agenda.inserir(pessoaFisica2);
        agenda.ordenarId();
        //agenda.remover("06979145185");
        //agenda.remover("LUAN");
        agenda.exibir();
        //System.out.println(agenda.pesquisar("Renato"));
    }
}