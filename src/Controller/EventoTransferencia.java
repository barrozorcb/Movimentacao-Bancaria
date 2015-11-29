package Controller;

import View.TelaCriaConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoTransferencia implements ActionListener {

    private TelaCriaConta telaCriaConta;

    public EventoTransferencia(TelaCriaConta telaCriaConta) {
        this.telaCriaConta = telaCriaConta;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String numContaTransferencia = JOptionPane.showInputDialog(null, "Informe a conta a ser transferida");
        String valorInformado = JOptionPane.showInputDialog(null, "Informe o valor da transferencia");

        Double valorTransferencia = Double.parseDouble(valorInformado);

        telaCriaConta.contaController.historico.add("Transferencia no valor de: " + valorInformado +
                                                    " para conta " + numContaTransferencia);

        telaCriaConta.contaController.saldoInicial -= valorTransferencia;

        telaCriaConta.jlSaldo.setText("Seu saldo Atual e de: " + String.valueOf(telaCriaConta.contaController.saldoInicial));

    }
}
