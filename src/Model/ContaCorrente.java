package Model;

import javax.swing.*;
import javax.swing.text.StringContent;

/**
 * Created by Rafael on 28/11/2015.
 */
public class ContaCorrente extends Conta {

    @Override
    public void sacar(Double valorSacado) {
        saldo -= valorSacado;
        this.historico.getTransacoes().add("Saque no valor de: " + valorSacado);
    }

    @Override
    public void depositar(Double valorDepositado) {
        saldo += valorDepositado;
        this.historico.getTransacoes().add("Deposito no valor de: " + valorDepositado);
    }

    @Override
    public void transferir(Double valorTransferido, String numeroContaTransferencia) {
        saldo -= valorTransferido;
        this.historico.getTransacoes().add("Transferencia no valor de: " + valorTransferido +
                                             " para conta " + numeroContaTransferencia);

    }

    @Override
    public String emitirExtarto() {
        String extrato = "";
        for (int i=0; i<this.historico.getTransacoes().size(); i++) {
            extrato += this.historico.getTransacoes().get(i) + "\n";
        }

        return extrato;
    }


}
