import greenfoot.*;

public class Cut1 extends Actor
{
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        if(pause==0){
        GreenfootImage image = getImage();
        image.scale(1920, 1080);
        setImage(image);
        }
    }    
}
