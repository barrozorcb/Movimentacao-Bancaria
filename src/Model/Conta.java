package Model;

/**
 * Created by Rafael on 28/11/2015.
 */
public abstract class Conta implements IConta {

    public Conta() {
        this.historico = new Historico();
    }

    protected Double saldo;
    protected Historico historico;
    protected Pessoa pessoa;
    private String numeroConta;

    public Double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(Double valor){
        this.saldo = valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
