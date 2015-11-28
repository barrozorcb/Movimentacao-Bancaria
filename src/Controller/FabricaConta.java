package Controller;

public class FabricaConta {
    public static IConta criaConta(int e){
        IConta icon = null;
        if(icon.contaCorrente == e){
            icon = new ContaCorrente();
        }else if(icon.contaPoupanca == e){
            icon = new ContaPoupanca();
        }else if(icon.contaSalario == e){
            icon = new ContaSalario();
        }
        return icon;
    }
}
