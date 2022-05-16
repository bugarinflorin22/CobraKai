import greenfoot.*;

public class store extends Actor
{
    private GreenfootImage img = new GreenfootImage("apasa.png");
    public void act() 
    {
        
        if(this.getObjectsInRange(180, Charachter.class).isEmpty()){
            img.setTransparency(0);
        } else {
            img.setTransparency(255);
            if(Greenfoot.isKeyDown("E")){
                townbg.tbg(1);
                iesire_store iesire_store = new iesire_store();
                getWorld().addObject(iesire_store,450,431);
                cumpara cumpara = new cumpara();
                getWorld().addObject(cumpara,640,431);
            }
        }
        setImage(img);
    }    
}
