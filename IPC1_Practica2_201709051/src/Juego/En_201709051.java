
package Juego;

import javax.swing.JLabel;

public class En_201709051 extends Thread {
    JLabel enem1;
    static int posx,y, limite;
    
    public En_201709051 (int psx, int limite, JLabel en1){
        this.posx= psx;
        this.limite = limite;
        this.enem1= en1;
        
    }
    @Override
    public void run(){
        
        for (int k = -30; k<= limite; k++){
            y = k;
            enem1.setBounds(posx,k,50,50);
            try{
                //if(colision(this.posx,this.y,this.alto1, this.ancho1,))
                sleep(8);
            } catch (Exception e){              
            }
        }
    }}
  //  public boolean colision (int x, int y, int alto, int ancho, int x1, int y1,int  altoen,int anchoen){
      //  return false;
    

