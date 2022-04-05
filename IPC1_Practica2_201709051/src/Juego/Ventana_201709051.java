
package Juego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

//implements KeyListener
public class Ventana_201709051  implements KeyListener{
    public Image imgfondo;
    public URL fondoo;
    JFrame Ven;
    JLabel   bienve;
    static JLabel nave, en1, en2, en3,disparo, fondolb, top, crono;
    static int xnave = 225, ynave=400 , xen1= 120, yen1 = -40,xen2= 250, yen2 = -40,xen3= 380, yen3 = -40;
    static JButton Iniciar, Pausar, aceptar, top3, nombre;
    JPanel VentanaLogi;
    static char ini='h';
    static int rd1, rd2, rd3, rd4;
    Timer timer, timer1, timer2, timer3;
    
    public Ventana_201709051() {
        
        Border border = LineBorder.createGrayLineBorder();
       
        Ven = new JFrame();
        Ven.setTitle("GALAGA");
        Ven.setSize(500,500);
        Ven.setLocationRelativeTo(null);
        Ven.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ven.setResizable(false);
        fondoo=this.getClass().getResource("/Im_201709051/fondo.jpg");
        imgfondo= new ImageIcon(fondoo).getImage();
        bienve = new JLabel("<html><body>Bienvenido Al Juego GALAGA </body></html>" );
        bienve.setBorder(border);
        bienve.setHorizontalAlignment(JLabel.CENTER);
        bienve.setOpaque(true);
        bienve.setBackground(Color.white);bienve.setBounds(10,5,380,35);
        ImageIcon nav  = new ImageIcon(getClass().getResource("/Im_201709051/nave.png"));
        ImageIcon inav = new ImageIcon(nav.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        ImageIcon ene  = new ImageIcon(getClass().getResource("/Im_201709051/en1.png"));
        ImageIcon ene1 = new ImageIcon(ene.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        ImageIcon ene2 = new ImageIcon(getClass().getResource("/Im_201709051/en2.png"));
        ImageIcon ene22 = new ImageIcon(ene2.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        ImageIcon ene3  = new ImageIcon(getClass().getResource("/Im_201709051/en3.png"));
        ImageIcon ene33= new ImageIcon(ene3.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING));
        fondolb = new JLabel(); fondolb.setBounds(0,0,Ven.getWidth(),Ven.getHeight()); 
        ImageIcon fondo  = new ImageIcon(getClass().getResource("/Im_201709051/fondo.jpg"));
        ImageIcon fondo1 = new ImageIcon(fondo.getImage().getScaledInstance(fondolb.getWidth(), fondolb.getHeight(), Image.SCALE_AREA_AVERAGING));
        fondolb.setIcon(fondo1); fondolb.setOpaque(true);Ven.add(fondolb);
        nave = new JLabel(); nave.setBounds(xnave,ynave,50,50);   nave.setOpaque(false); nave.setIcon(inav);
        en1 = new JLabel(); en1.setBounds(xen1,yen1,50,50);     en1.setOpaque(false); en1.setIcon(ene1);
        en2 = new JLabel(); en2.setBounds(xen2,yen2,50,50);     en2.setOpaque(false); en2.setIcon(ene22);
        en3 = new JLabel(); en3.setBounds(xen3,yen3,50,50);     en3.setOpaque(false); en3.setIcon(ene33);
        top = new JLabel("<html><body>Juanito; 30 <br> Maria; 50 <br> Heidy: 30 </body></html>" ); top.setBounds(100,110,250,100);     top.setOpaque(true); top.setVisible(false);
        fondolb.add(top);
        crono = new JLabel(); crono.setBounds(390,5,90,35);     crono.setOpaque(true); crono.setVisible(true);
        Iniciar = new JButton("Iniciar");Iniciar.setBounds(10,40,100,30);
        Iniciar.addActionListener((ActionEvent ae) -> {
            Ven.setVisible(false);
            iniciar_juego();
         });    
        Pausar = new JButton("Pausar");Pausar.setBounds(110,40,90,30);
        Pausar.addActionListener((ActionEvent ae) -> { 
           
                pausar();
            
        });
        aceptar = new JButton("Reanudar");aceptar.setBounds(200,40,100,30);
        aceptar.addActionListener((ActionEvent ae) -> {
            Ven.setVisible(false);
            iniciar_juego();
         });   
        top3 = new JButton("Top3");top3.setBounds(300,40,80,30);
        top3.addActionListener((ActionEvent ae) -> {
           top.setVisible(true);
           // Ven.setVisible(false);
           // iniciar_juego();
         });   
        nombre = new JButton("Jugador");nombre.setBounds(380,40,100,30);
        nombre.addActionListener((ActionEvent ae) -> {
            //Ven.setVisible(false);
           // iniciar_juego();
         });   
        
        
        
        fondolb.add(bienve);
        fondolb.add(crono);
        fondolb.add(Iniciar);
        fondolb.add(Pausar);
        fondolb.add(aceptar);
        fondolb.add(nombre);  
        fondolb.add(top3);
        Ven.addKeyListener(this);
        Ven.setFocusable(true);
        fondolb.add(nave);  
        fondolb.add(en1);
        fondolb.add(en2);  
        fondolb.add(en3);
        
        Ven.setVisible(true);
        
}
    public  JPanel panel = new JPanel(){
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(imgfondo,0,0,getWidth(),getHeight(),this);
    }
};
    //class Control_tecla_pulsada extends KeyAdapter{
   @Override
   public void keyPressed(KeyEvent ke){
       if (ke.getExtendedKeyCode()==KeyEvent.VK_RIGHT){
           if (xnave <415){
        xnave = xnave + 15;
        nave.setBounds(xnave,ynave,50,50);}
       }
       else {
           if (ke.getExtendedKeyCode()==KeyEvent.VK_LEFT){
           if (xnave >15){
        xnave =xnave - 15;
        nave.setBounds(xnave-10,ynave,50,50);}
       }
       }
   }

    @Override
    public void keyTyped(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if (ke.getKeyChar()==ini){
        disparar();
        Dis_201709051 disnave = new Dis_201709051(xnave,ynave,350,disparo);
        disnave.start();
        
    }
    
    }

    @Override
    public void keyReleased(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void disparar(){
        disparo= new JLabel(); 
        ImageIcon dis  = new ImageIcon(getClass().getResource("/Im_201709051/misil.png"));
        disparo.setBounds(xnave+20,ynave,20,25);
        ImageIcon dis1 = new ImageIcon(dis.getImage().getScaledInstance(disparo.getWidth(), disparo.getHeight(), Image.SCALE_DEFAULT));
        disparo.setIcon(dis1);
        
       fondolb.add(disparo);
    }
    public void iniciar_juego(){
         
       Ventana_201709051 inicio = new Ventana_201709051();
        
        
         timer = new Timer(8000,(ActionEvent e)->{
            rd1= (int)(Math.random()*(470-30));
            En_201709051 enemigo1 = new En_201709051(rd1,470,Ventana_201709051.en1);
            enemigo1.start();
            if (En_201709051.posx == Dis_201709051.x1 || En_201709051.y== Dis_201709051.y1){
                en1.setVisible(false);
              
            }
            
        });
        timer.start();
        
        timer2 = new Timer(8000,(ActionEvent e)->{
            rd2= (int)(Math.random()*(470-30));
            En2_201709051 enemigo2 = new En2_201709051(rd2,470,Ventana_201709051.en2);
            enemigo2.start();
           
        });
        timer2.start();
        
        timer3 = new Timer(4000,(ActionEvent e)->{
            rd3= (int)(Math.random()*(470-30));
            En3_201709051 enemigo3 = new En3_201709051(rd3,470,Ventana_201709051.en3);
            enemigo3.start();
        });
        timer3.start();
      
        
        
        inicio.Ven.setVisible(true);
    };
    public void pausar () {
        en1.setVisible(false);
        en2.setVisible(false);
        en3.setVisible(false);
    };
    
}
