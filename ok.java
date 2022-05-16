import greenfoot.*; 

public class ok extends sensei_txt
{
    private int sw = 0;
    private int sw2 = 0;
    private boolean str = false;
    private GreenfootImage start = new GreenfootImage("ok.png");
    private GreenfootImage starta = new GreenfootImage("okactive.png");
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
            townbg.tbg(2);
            exit_sensei exit_sensei = new exit_sensei();
            getWorld().addObject(exit_sensei,200,570);
            exit_sensei.reset();
            getWorld().removeObjects(getWorld().getObjects(r.class));
            
            i1 i1 = new i1();
            getWorld().addObject(i1,540,220);
            i2 i2 = new i2();
            getWorld().addObject(i2,540,300);
            i3 i3 = new i3();
            getWorld().addObject(i3,540,380);
            i4 i4 = new i4();
            getWorld().addObject(i4,540,460);
            i5 i5 = new i5();
            getWorld().addObject(i5,540,540);
            getWorld().removeObject(this);
        }
    }    
}
