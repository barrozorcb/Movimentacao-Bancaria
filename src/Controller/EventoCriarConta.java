package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoCriarConta implements ActionListener {

    private Exec exec;

    public EventoCriarConta(Exec exec){
        this.exec = exec;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        IConta contaSelecionada = IConta.fabricaConta.criaConta(exec.jComboBox.getSelectedIndex());

        String nome = exec.jtfNome.getText();
        String cpf = exec.jtfCPF.getText();
        String numConta = exec.jtfNumConta.getText();
        Double saldoInicial = Double.parseDouble(exec.jtfSaldoInicial.getText());

        new ContaController(contaSelecionada, nome, cpf, numConta, saldoInicial);

        exec.setVisible(false);


    }
}
