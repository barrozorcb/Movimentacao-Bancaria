package Controller;

/**
 * Created by Rafael on 28/11/2015.
 */
public interface IConta {
    // Isso não faz sentido. Uma interface não possui implementação nenhuma.
    // A interface define apenas um contrato, algo que quem assinar este contrato deve fazer.
    // Exemplo : Intercace Conta, define que todo mundo que quiser assinar este contrato
    // deve implementar os metodos, sacar, depositar e transferir. Sua classe abstrata Conta faz isso.
    // Uma interface é muito mais abstrata que uma classe concreta, pois não possui codigo nenhum, somente o que deve ser feito.
    int contaCorrente = 1;
    int contaPoupanca = 2;
    int contaSalario = 3;

    FabricaConta fabricaConta = new FabricaConta();
}
