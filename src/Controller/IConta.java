package Controller;

/**
 * Created by Rafael on 28/11/2015.
 */
public interface IConta {

    int contaCorrente = 1;
    int contaPoupanca = 2;
    int contaSalario = 3;

    FabricaConta fabricaConta = new FabricaConta();
}
