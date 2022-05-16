import greenfoot.*;

public class repeta extends Actor
{
    private GreenfootImage img = new GreenfootImage("repeta.png");
    public void act() 
    {
        if(this.getObjectsInRange(180, Charachter.class).isEmpty()){
            img.setTransparency(0);
        } else{ 
            img.setTransparency(255);
            if(Greenfoot.isKeyDown("E")){
                Greenfoot.setWorld(new prepare());
            }
        }
        setImage(img);
    }   
}
