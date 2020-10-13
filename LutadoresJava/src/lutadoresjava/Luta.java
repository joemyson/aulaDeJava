/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutadoresjava;

import java.util.Random;

/**
 *
 * @author joemyson
 */
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    public void marcaLuta(Lutador l1,Lutador l2){
        
        if (l1.getCategorias().equals(l2.getCategorias()) && l1 != l2){
        
        this.aprovada=true;
        this.desafiado=l1;
        this.desafiante =l2;
        
        
        } else{
        
        
        this.aprovada=false;
        this.desafiado=null;
        this.desafiante=null;
        
        }
        
        
        
    
    }
    public void luta(){
        if (this.aprovada){
        
        
            System.out.println("###########DESAFIADO##########");
            this.desafiado.apresentar();
            System.out.println("#######DESAFIANTE#########");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor =aleatorio.nextInt(3);
            
            
            switch(vencedor){
                
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.ganhaLutar();
                    this.desafiante.perdeLuta();
                    
                    break;
                case 1:
                    System.out.println("Ganhou  "+this.getDesafiado());
                    this.desafiado.ganhaLutar();
                    this.desafiante.perdeLuta();
                    
                    break;
                case 2:
                    System.out.println("vitoria do "+this.getDesafiante());
                    this.desafiante.ganhaLutar();
                    this.desafiado.perdeLuta();
                    break;
                
            }
            
            
        
        }else{
        
            System.out.println("A luta não pode acontecer");
        
        }
    
    
    
    }
    
}
