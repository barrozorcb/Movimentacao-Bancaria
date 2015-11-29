package Controller;

import View.TelaCriaConta;

import java.util.ArrayList;

/**
 * Created by Rafael on 28/11/2015.
 */
public class ContaController {
    public TelaCriaConta tela;
    public ArrayList opcoesOperacoes;
    public String nome;
    public String cpf;
    public String numConta;
    public Double saldoInicial;
    public ArrayList historico;

    public ContaController(IConta contaSelecionada, String nome, String cpf, String nunConta, Double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = nunConta;
        this.saldoInicial = saldoInicial;
        this.historico = new ArrayList();

        Conta conta = (Conta) contaSelecionada;
        opcoesOperacoes = new ArrayList();

        IConta ope1 = conta.sacar();
        IConta ope2 = conta.depositar();
        IConta ope3 = conta.transferir();




        opcoesOperacoes.add(ope1);
        opcoesOperacoes.add(ope2);
        opcoesOperacoes.add(ope3);

        tela = new TelaCriaConta(this, "Tela para criar conta");

    }

    public ArrayList montaMenuOpercoes(){
        return this.opcoesOperacoes;
    }
}
