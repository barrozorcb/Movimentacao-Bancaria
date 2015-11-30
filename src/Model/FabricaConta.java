package Model;

public class FabricaConta {
    public static IConta criaConta(int e){

        if(e == 1){
            return new ContaCorrente();
        }else if(e == 2){
            return new ContaPoupanca();
        }else {
            return new ContaSalario();
        }

    }
}
