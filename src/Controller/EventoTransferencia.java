package Controller;

import View.TelaOperacoesConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoTransferencia implements ActionListener {

    private TelaOperacoesConta telaOperacoesConta;

    public EventoTransferencia(TelaOperacoesConta telaOperacoesConta) {
        this.telaOperacoesConta = telaOperacoesConta;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String numContaTransferencia = JOptionPane.showInputDialog(null, "Informe a conta a ser transferida");
        String valorInformado = JOptionPane.showInputDialog(null, "Informe o valor da transferencia");

        telaOperacoesConta.contaController.getConta().transferir(Double.parseDouble(valorInformado), numContaTransferencia);

        telaOperacoesConta.jlSaldo.setText("Seu saldo Atual e de: " + String.valueOf(telaOperacoesConta.contaController.getConta().getSaldo()));

    }
}
