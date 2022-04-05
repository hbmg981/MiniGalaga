
package Juego;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;

public class En2_201709051 extends Thread {
    JLabel enem1;
    static int posx2, limite2;
    
    public En2_201709051 (int psx2, int limite2, JLabel en1){
        this.posx2= psx2;
        this.limite2 = limite2;
        this.enem1= en1;
    }
    @Override
    public void run(){
        for (int k = -20; k<= limite2; k++){
            enem1.setBounds(posx2,k,50,50);
            try{
                sleep(7);
            } catch (Exception e){              
            }
        }
    }
}
