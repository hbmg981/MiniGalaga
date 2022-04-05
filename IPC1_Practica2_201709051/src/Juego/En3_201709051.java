
package Juego;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;

public class En3_201709051 extends Thread {
    JLabel enem3;
    static int posx3, limite;
    
    public En3_201709051 (int psx3, int limite3, JLabel en3){
        this.posx3= psx3;
        this.limite = limite3;
        this.enem3= en3;
    }
    @Override
    public void run(){
        for (int k = -30; k<= limite; k+=2){
            enem3.setBounds(posx3,k,50,50);
            try{
                sleep(7);
            } catch (Exception e){              
            }
        }
    }
}
