package BancoGeneralizado;
public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected Conta conta;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String endereco, String telefone,Conta conta) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.conta = conta;
    }
    public boolean validaTelefone(String telefone){
        if(telefone.length() == 10){
            return true;
        }else return false;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public abstract String getId();
    
    public abstract String getVerificacao();
    
    public String getName() {
    	return nome;
    }
    @Override
    public String toString() {
        return  "nome=" + nome +" endereco=" + endereco + ", telefone=" + telefone + super.toString() + "]";
    }
}