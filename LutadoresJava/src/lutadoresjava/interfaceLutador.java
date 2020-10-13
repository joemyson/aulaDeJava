/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutadoresjava;

/**
 *
 * @author joemyson
 */

//---modulo de emcapsulamento de metodos
public interface interfaceLutador {
    
    // metodos abstratos-------------------------
    public abstract void apresentar();
    public abstract void status();
    public abstract void ganhaLutar();
    public abstract void perdeLuta();
    public abstract void empatarluta();
    
}
