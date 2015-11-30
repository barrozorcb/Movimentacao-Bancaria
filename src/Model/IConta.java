package Model;

/**
 * Created by Rafael on 28/11/2015.
 */
public interface IConta {

    void sacar(Double valorSacado);
    void depositar(Double valorDepositado);
    void transferir(Double valorTransferido, String numeroContaTransferencia);
    String emitirExtarto();

    void setSaldo(Double saldoInicial);
    Double getSaldo();
    Pessoa getPessoa();
    void setPessoa(Pessoa pessoa);

    String getNumeroConta();
    void setNumeroConta(String numeroConta);


}
