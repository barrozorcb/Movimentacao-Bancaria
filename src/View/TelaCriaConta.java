package View;

import Controller.ContaController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Rafael on 28/11/2015.
 */
public class TelaCriaConta extends JFrame{

    private ContaController contaController;

    public TelaCriaConta(ContaController controller, String title){
        setTitle(title);
        this.contaController = controller;
        this.montaTela(controller);

        this.setSize(600,300);
        this.setVisible(true);

    }

    public void montaTela(ContaController controller){
        JPanel jPanel = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel.setLayout(new GridLayout(7, 1, 10, 10));

        JLabel jlNome = new JLabel("Bem Vindo a conte de: " + controller.nome);
        JLabel jlSaldo = new JLabel("Seu saldo Atual e de: " + controller.saldoInicial);
        JLabel jlPergunta = new JLabel("O que deseja fazer?");
        JButton sacar = new JButton("Fazer Saque");
        JButton depositar = new JButton("Fazer Deposito");
        JButton transferir = new JButton("Fazer Transferencia");
        JButton extrato = new JButton("Emitir Extrato da conta");

        jPanel.add(jlNome);
        jPanel.add(jlSaldo);
        jPanel.add(jlPergunta);
        jPanel.add(sacar);
        jPanel.add(depositar);
        jPanel.add(transferir);
        jPanel.add(extrato);
        add(jPanel);
    }
}
