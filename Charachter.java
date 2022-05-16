import greenfoot.*;

public class Charachter extends Actor
{
    private GreenfootImage walkr1 = new GreenfootImage("walk/ch_wr1.png");
    private GreenfootImage walkr2 = new GreenfootImage("walk/ch_wr2.png");
    private GreenfootImage walkr3 = new GreenfootImage("walk/ch_wr3.png");
    private GreenfootImage walkl1 = new GreenfootImage("walk/ch_wl1.png");
    private GreenfootImage walkl2 = new GreenfootImage("walk/ch_wl2.png");
    private GreenfootImage walkl3 = new GreenfootImage("walk/ch_wl3.png");
    
    private GreenfootImage stand = new GreenfootImage("walk/ch_stand.png");
    
    private int pos = 1;
    private int animc = 1;
    private int speedmove = 2;
    private int altcv=103;
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        if(pause == 0){
            movement();
        }
    }
    
    public void movement(){
        animc++;
        if(Greenfoot.isKeyDown("D") && !Greenfoot.isKeyDown("A")){
            if(animc % 8 == 0)
                walk_anim_right();
            setLocation(getX()+speedmove, getY());
        } 
        
        if(Greenfoot.isKeyDown("A") && !Greenfoot.isKeyDown("D")){
            if(animc % 8 == 0)
                walk_anim_left();
            setLocation(getX()-speedmove, getY());
        }
        
        if((!Greenfoot.isKeyDown("A") && !Greenfoot.isKeyDown("D") && altcv>=9) || 
        (Greenfoot.isKeyDown("D") && Greenfoot.isKeyDown("A"))){
        setImage(stand);
        }
    }
    
    public void walk_anim_right(){
        if(pos==1)
        setImage(walkr1);
        if(pos==2)
        setImage(walkr2);
        if(pos==3)
        setImage(walkr3);
        if(pos==4)
        pos=0;
     
        pos++;
    }
    
    public void walk_anim_left(){
        if(pos==1)
        setImage(walkl1);
        if(pos==2)
        setImage(walkl2);
        if(pos==3)
        setImage(walkl3);
        if(pos==4)
        pos=0;
     
        pos++;
    }
}
