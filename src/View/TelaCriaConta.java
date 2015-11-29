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
        this.montaTela();

        this.setSize(600,300);
        this.setVisible(true);

    }

    public void montaTela(){
        JPanel jPanel = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel.setLayout(new GridLayout(3, 2, 10, 10));


        JOptionPane.showMessageDialog(null, contaController);


    }
}
