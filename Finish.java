import greenfoot.*; 

public class Finish extends tutorial
{
    private int tutorial = 0;
    private int sw = 0;
    private int sw2 = 0;
    public static int p = 0;
    private boolean str = false;
    private GreenfootImage start = new GreenfootImage("termina.png");
    private GreenfootImage starta = new GreenfootImage("terminaactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
        tutorial = Next.tutorial;
        if(tutorial == 4)
            setLocation(540,getY());
        
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
            click.setVolume(new Storage().getdata(1));
            click.play();
            getWorld().removeObjects(getWorld().getObjects(tutorial.class));
            p = 1;
            new Storage().storedata(2, 1);
        }
    }    
}
