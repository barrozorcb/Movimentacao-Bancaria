package Controller;

import Controller.IConta;

/**
 * Created by Rafael on 28/11/2015.
 */
public abstract class Conta implements IConta {

    public abstract IConta sacar();
    public abstract IConta depositar();
    public abstract IConta transferir();


}
