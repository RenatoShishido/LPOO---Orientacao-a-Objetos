package BancoGeneralizado;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String insEstadual;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String insEstadual,Conta conta) {
    	super.nome = nome;
    	super.endereco = endereco;
    	super.conta = conta;
        this.insEstadual = insEstadual;
        if (validaTelefone(telefone)) {
            super.telefone = telefone;
        }
        if (valida(cnpj)) {
            this.cnpj = cnpj;
        }
    }

    public boolean valida(String cnpj) {
        if (cnpj.length() == 14 && telefone.length() == 9) {
            return true;
        } else
            return false;
    }

    public boolean validaTelefone(String telefone) {
        if (telefone.length() == 9) {
            return true;
        } else
            return false;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsEstadual() {
        return insEstadual;
    }

    public void setInsEstadual(String insEstadual) {
        this.insEstadual = insEstadual;
    }

    public String getId() {
        return cnpj;
    }
    @Override
    public String toString() {
        return "PessoaJuridica ["+ super.toString() + ", cnpj=" + cnpj + ", insEstadual=" + insEstadual + "]\n";
    }

	@Override
	public String getVerificacao() {
		// TODO Auto-generated method stub
		return null;
	}
}