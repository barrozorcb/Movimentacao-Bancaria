package Controller;

import View.TelaCriaConta;

import java.util.ArrayList;

/**
 * Created by Rafael on 28/11/2015.
 */
public class CriaContaController {
    private Conta conta;
    private TelaCriaConta tela;
    public ArrayList comboTipoContas;

    public CriaContaController(){
        comboTipoContas = new ArrayList();
        Conta conta = new Conta();

        IConta contaCorrente = IConta.fabricaConta.criaConta(1);
        IConta contaPoupanca = IConta.fabricaConta.criaConta(2);
        IConta contaSalario = IConta.fabricaConta.criaConta(3);

        comboTipoContas.add(contaCorrente);
        comboTipoContas.add(contaPoupanca);
        comboTipoContas.add(contaSalario);

        tela = new TelaCriaConta(this, "Tela para criar conta");

    }
}
