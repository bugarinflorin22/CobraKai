import greenfoot.*;

public class exit_sensei extends sensei_txt
{
    private int sw = 0;
    private int sw2 = 0;
    private boolean str = false;
    public static int c = 1;
    private GreenfootImage start = new GreenfootImage("iesire_store.png");
    private GreenfootImage starta = new GreenfootImage("iesire_storeactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
        
        if(Greenfoot.mouseMoved(null))
            str = Greenfoot.mouseMoved(this);
        
        if(str){
            setImage(starta);
            sw=1;
        } else setImage(start); 
        
        if(sw==1 && sw2==0){
            bhover.setVolume(new Storage().getdata(1));
            bhover.play();
            sw2=1;
        }
        
        if(!str){
            sw=0;
            sw2=0;
        }
        
        if(Greenfoot.mouseClicked(this)){
            c=0;
            townbg.tbg(0);
            getWorld().removeObjects(getWorld().getObjects(i1.class));
            getWorld().removeObjects(getWorld().getObjects(exit_sensei.class));
        }
        
    }
    public static void reset(){
        c=1;
    }
}
