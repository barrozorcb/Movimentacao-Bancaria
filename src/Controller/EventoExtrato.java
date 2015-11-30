package Controller;

import View.TelaOperacoesConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoExtrato implements ActionListener {

    private TelaOperacoesConta telaOperacoesConta;

    public EventoExtrato(TelaOperacoesConta telaOperacoesConta) {
        this.telaOperacoesConta = telaOperacoesConta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String extrato = telaOperacoesConta.contaController.getConta().emitirExtarto();

        JOptionPane.showMessageDialog(null, extrato + "\n" + "Seu saldo atual e de : "
                                        + telaOperacoesConta.contaController.getConta().getSaldo());
    }
}
