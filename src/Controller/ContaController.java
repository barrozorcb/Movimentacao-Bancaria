package Controller;

import View.TelaOperacoesConta;
import Model.IConta;

/**
 * Created by Rafael on 28/11/2015.
 */
public class ContaController {
    public TelaOperacoesConta tela;
    private IConta conta;

    public ContaController(IConta contaSelecionada) {
        this.conta = contaSelecionada;

        tela = new TelaOperacoesConta(this, "Tela para criar conta");

    }

    public IConta getConta() {
        return conta;
    }

    public void setConta(IConta conta) {
        this.conta = conta;
    }
}
