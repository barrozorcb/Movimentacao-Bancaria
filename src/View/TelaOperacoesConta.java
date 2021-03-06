package View;

import Controller.*;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Rafael on 28/11/2015.
 */
public class TelaOperacoesConta extends JFrame{

    public ContaController contaController;
    public JLabel jlSaldo;


    public TelaOperacoesConta(ContaController controller, String title){
        setTitle(title);
        this.contaController = controller;
        this.montaTela(controller);

        this.setSize(600,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void montaTela(ContaController controller){
        JPanel jPanel = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel.setLayout(new GridLayout(7, 1, 10, 10));

        JLabel jlNome = new JLabel("Bem Vindo a conte de: " + controller.getConta().getPessoa().getNomeTitular());
        jlSaldo = new JLabel("Seu saldo Atual e de: " + controller.getConta().getSaldo());
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

        sacar.addActionListener(new EventoSacar(this));
        depositar.addActionListener(new EventoDepositar(this));
        transferir.addActionListener(new EventoTransferencia(this));
        extrato.addActionListener(new EventoExtrato(this));
    }

}
