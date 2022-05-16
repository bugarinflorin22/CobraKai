import greenfoot.*; 

public class Next extends tutorial
{
    public static int tutorial = 0;
    private int sw = 0;
    private int sw2 = 0;
    private boolean str = false;
    private GreenfootImage start = new GreenfootImage("continua.png");
    private GreenfootImage starta = new GreenfootImage("continuaactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            tutorial++;
            click.setVolume(new Storage().getdata(1));
            click.play();
        }
        
        if(tutorial == 4)
        getWorld().removeObject(this);
        
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
    }    
}
