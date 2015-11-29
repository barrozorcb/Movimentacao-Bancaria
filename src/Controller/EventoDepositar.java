package Controller;

import View.TelaCriaConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoDepositar implements ActionListener {

    private TelaCriaConta telaCriaConta;

    public EventoDepositar(TelaCriaConta telaCriaConta) {
        this.telaCriaConta = telaCriaConta;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String valorInformado = JOptionPane.showInputDialog(null, "Informe o valor do saque");

        Double valorDeposito = Double.parseDouble(valorInformado);

        telaCriaConta.contaController.saldoInicial += valorDeposito;

        telaCriaConta.jlSaldo.setText("Seu saldo Atual e de: " + String.valueOf(telaCriaConta.contaController.saldoInicial));

    }
}