import greenfoot.*;  

public class Enemy extends Actor
{
    private int pause = 0;
    public static int sw = 0;
    public static int sw2 = 1;
    private int corect = 0;
    private int gresit = 0;
    private int gresit2 = 0;
    private int pos = 0;
    private GreenfootImage stand = new GreenfootImage("e_stand.png");
    private GreenfootImage e_fall1 = new GreenfootImage("enemy/enemy1/e_fall1.png");
    private GreenfootImage e_fall2 = new GreenfootImage("enemy/enemy1/e_fall2.png");
    
    private GreenfootImage f1_1 = new GreenfootImage("enemy/enemy1/e_f1-1.png");
    private GreenfootImage f1_2 = new GreenfootImage("enemy/enemy1/e_f1-2.png");
    private GreenfootImage f1_3 = new GreenfootImage("enemy/enemy1/e_f1-3.png");
    
    private GreenfootSound kick2 = new GreenfootSound("kick2.mp3");
    private GreenfootSound fall = new GreenfootSound("hit.mp3");
    
    public void act() 
    {
        pause = new Sys().pause;
        corect = new Sys().corect;
        gresit = new Sys().gresit;
        if (pause == 0){
            if(corect == 1) {
                if(sw==0)
                defeat();
            }
            if(gresit == 1) {
                if(sw==0)
                fight1();
            }
            if(sw2==0){
                sw2=1;
                setLocation(580,579);
                setImage(stand);
            }
        }
    }
    public static void reset(){
        sw2=0;
        sw=0;
    }
    public void defeat(){
        pos++;
        if(pos==2)
            setLocation(545,getY());
        if(pos==25){
            setImage(e_fall1);
            setLocation(getX()+100,getY()+10);
        }
        if(pos==44){
            setImage(e_fall2);
            fall.setVolume(new Storage().getdata(1));
            fall.play();
        }
        if(pos==45){
            pos=0;
            sw=1;
        }
    }
    public void fight1(){
        pos++;
        if(pos==8)
            setImage(f1_1);
        if(pos==16)
            setImage(f1_2);
        if(pos==24){
            setImage(f1_3);
            kick2.setVolume(new Storage().getdata(1));
            kick2.play();
        }
        if(pos==60){
            setImage(stand);
            pos=0;
            sw=1;
        }
    }
}
