import greenfoot.*; 

public class battleintro extends Actor
{
    private int time = 0;
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        if(pause == 0){
            time++;
            if(time>=800){
                getWorld().removeObject(this);
            }
        }
    }    
}
