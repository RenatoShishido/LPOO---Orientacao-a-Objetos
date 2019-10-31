package BancoGeneralizado;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String datNascimento;

    public PessoaFisica(String nome, String endereco, String telefone,String cpf, String datNascimento, Conta conta) {
    	super.nome = nome;
    	super.endereco = endereco;
    	super.conta = conta;
        if (validaTelefone(telefone)) {
            super.telefone = telefone;
        }
        if (verificarData(datNascimento)) {
            this.datNascimento = datNascimento;
        }
        if (valida(cpf)) {
            this.cpf = cpf;
        }
    }
    public boolean validaTelefone(String telefone) {
        if (telefone.length() == 9) {
            return true;
        } else
            return false;
    }

    public boolean valida(String numeroCpf) {
        if (numeroCpf.length() == 11) {
            return true;
        } else
            return false;
    }

    public boolean verificarData(String date) {
        if (date.length() == 8) {
            return true;
        } else
            return false;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(String datNascimento) {
        this.datNascimento = datNascimento;
    }
    
    public String getId() {
        return cpf;
    }
    @Override
    public String toString() {
        return "PessoaFisica [" + super.toString() + ", cpf=" + cpf
                + ", datNascimento=" + datNascimento + "]\n";
    }
	@Override
	public String getVerificacao() {
		// TODO Auto-generated method stub
		return null;
	}
}