package Controller;

import Model.FabricaConta;
import Model.IConta;
import Model.Pessoa;
import View.TelaCriaConta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rafael on 29/11/2015.
 */
public class EventoCriarConta implements ActionListener {

    private TelaCriaConta exec;

    public EventoCriarConta(TelaCriaConta exec){
        this.exec = exec;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        IConta contaSelecionada = FabricaConta.criaConta(exec.jComboBox.getSelectedIndex());

        String nome = exec.jtfNome.getText();
        String cpf = exec.jtfCPF.getText();
        String numConta = exec.jtfNumConta.getText();
        Double saldoInicial = Double.parseDouble(exec.jtfSaldoInicial.getText());

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(cpf);
        pessoa.setNomeTitular(nome);

        contaSelecionada.setSaldo(saldoInicial);
        contaSelecionada.setNumeroConta(numConta);
        contaSelecionada.setPessoa(pessoa);

        new ContaController(contaSelecionada);

        exec.setVisible(false);


    }
}
