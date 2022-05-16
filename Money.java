import greenfoot.*;

public class Money extends Actor
{
    public int time = 0;
    public int money = 0;
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        money = new Storage().getdata(3);
        if(pause == 0){
            if(this.getWorld().getClass() == MyWorld.class){   
                time++;
                if(time>=1330)
                getImage().setTransparency(255);
                else getImage().setTransparency(0);
            }else {
                if(new Storage().getdata(2) == 0)
                    getImage().setTransparency(0);
                else {
                   getImage().setTransparency(0);
                   getWorld().showText("Money: "+money+"$",925,25);
                }
            }
        }
        
        if(new Storage().getdata(-1) == 4){
            getWorld().removeObjects(getObjectsInRange(700, inima.class));
        }
        if(new Storage().getdata(-1) == 3){
            getWorld().removeObjects(getObjectsInRange(730, inima.class));
        }
        if(new Storage().getdata(-1) == 2){
            getWorld().removeObjects(getObjectsInRange(770, inima.class));
        }
        if(new Storage().getdata(-1) == 1){
            getWorld().removeObjects(getObjectsInRange(830, inima.class));
        }
        if(new Storage().getdata(-1) == 0){
            getWorld().removeObjects(getObjectsInRange(880, inima.class));
        }
    }    
}
