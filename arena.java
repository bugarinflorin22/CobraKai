import greenfoot.*;

public class arena extends Actor
{
    private GreenfootImage img = new GreenfootImage("arena.png");
    public void act() 
    {
        if(this.getObjectsInRange(180, Charachter.class).isEmpty()){
            img.setTransparency(0);
        } else {
            img.setTransparency(255);
            if(Greenfoot.isKeyDown("E")){
                if(new Storage().getdata(-1)>0){
                Greenfoot.setWorld(new battlefield());
                new Sys().rein();
            }
                else error.eroare(2);
            }
        }
        setImage(img);
    }   
}
