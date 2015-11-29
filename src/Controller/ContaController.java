package Controller;

import View.TelaCriaConta;

import java.util.ArrayList;

/**
 * Created by Rafael on 28/11/2015.
 */
public class ContaController {
    private Conta conta;
    private TelaCriaConta tela;
    public ArrayList menuOperacoes;

    public ContaController(IConta contaSelecionada, String nome, String cpf, String nunConta, Double saldoInicial) {
        Conta conta = (Conta) contaSelecionada;
        menuOperacoes = new ArrayList();

        IConta ope1 = conta.sacar();
        IConta ope2 = conta.depositar();
        IConta ope3 = conta.transferir();

        menuOperacoes.add(ope1);
        menuOperacoes.add(ope2);
        menuOperacoes.add(ope3);
        tela = new TelaCriaConta(this, "Tela para criar conta");

    }
}
