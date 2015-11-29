package Controller;

import View.TelaCriaConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoExtrato implements ActionListener {

    private TelaCriaConta telaCriaConta;

    public EventoExtrato(TelaCriaConta telaCriaConta) {
        this.telaCriaConta = telaCriaConta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String extrato = "";
        for (int i=0; i<telaCriaConta.contaController.historico.size(); i++) {
            extrato += telaCriaConta.contaController.historico.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, extrato + "\n" + "Seu saldo atual e de : "
                                        + telaCriaConta.contaController.saldoInicial);
    }
}
