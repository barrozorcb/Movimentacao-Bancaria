package View;

import Controller.CriaContaController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Rafael on 28/11/2015.
 */
public class TelaCriaConta extends JFrame{

    private CriaContaController criaContaController;

    public TelaCriaConta(CriaContaController controller, String title){
        setTitle(title);
        this.criaContaController = controller;

    }

    public void configuraTela(){
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void montaTela(){
        JPanel jPanel = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel jlConta = new JLabel("Selecione qual tipo de conta voce quer criar.");

        String[] opcoesContas = new String[]{" ", "Conta-Corrente", "Conta-Poupanca", "Conta-Salario"};
        JComboBox comboBoxContas = new JComboBox(opcoesContas);

        jPanel.add(jlConta);
        jPanel.add(comboBoxContas);
        add(jPanel);

    }
}
