import greenfoot.*;

public class sensei_txt extends Actor
{
    private GreenfootImage img = new GreenfootImage("sensei_txt.png");
    public void act() 
    {
        if(this.getObjectsInRange(180, Charachter.class).isEmpty()){
            img.setTransparency(0);
        } else {
            img.setTransparency(255);
            if(Greenfoot.isKeyDown("E")){
                townbg.tbg(2);
                exit_sensei exit_sensei = new exit_sensei();
                getWorld().addObject(exit_sensei,200,570);
                exit_sensei.reset();
                
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
            }
        }
        setImage(img);
    }   
}
