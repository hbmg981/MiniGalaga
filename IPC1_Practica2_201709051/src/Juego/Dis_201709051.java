
package Juego;

import javax.swing.JLabel;

public class Dis_201709051 extends Thread{
    static int x1, y1 , lim, v;
    JLabel misil;
    
    public Dis_201709051(int posicionxnav, int posicionynav, int limite, JLabel misil){
        this.x1 = posicionxnav;
        this.y1= posicionynav;
        this.lim= limite;
        this.misil=misil;
    }
    @Override
    public void run(){
    for(int i=y1 ; i>=-30; i--){
        misil.setBounds(x1+15,i ,20,25);
        try{
            sleep(5);}
        catch (Exception e){}
        }
    }
}

