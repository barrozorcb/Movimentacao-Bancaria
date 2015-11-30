package Controller;

import View.TelaOperacoesConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoSacar implements ActionListener {

    private TelaOperacoesConta telaOperacoesConta;

    public EventoSacar(TelaOperacoesConta telaOperacoesConta) {
       this.telaOperacoesConta = telaOperacoesConta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String valorInformado = JOptionPane.showInputDialog(null, "Informe o valor do saque");

        telaOperacoesConta.contaController.getConta().sacar(Double.parseDouble(valorInformado));


        telaOperacoesConta.jlSaldo.setText("Seu saldo Atual e de: " + String.valueOf(telaOperacoesConta.contaController.getConta().getSaldo()));

    }
}