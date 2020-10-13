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
public class LutadoresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Lutador l[] = new Lutador[6];
        
        l[0]=new Lutador("joe","africana" ,36,1.80f,80.0f,5,1,2);
        l[1]= new Lutador("Dani","brasil",30,1.75f,90f,2, 0,1);
        l[2]=new Lutador("Van","frança",25,1.70f,100f,10,3,1);
        l[3]= new Lutador("Eme","jamaica",37,1.80f,90f,20,3,1);
        l[4]= new Lutador("jacque","Alemanha",40,1.65f,100f,30,5,1);
        l[5]= new Lutador("joas","Africa do sul",45, 1.75f,180f,20,8, 1);
        
        
       Luta lu = new Luta();
       lu.marcaLuta(l[3], l[1]);
       lu.luta();
       l[3].status();
       l[1].status();
    
}
}
