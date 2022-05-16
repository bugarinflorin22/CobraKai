import greenfoot.*;

public class txtintro extends battleintro
{
    private int time = 0;
    private int trans = 0;
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        if(pause == 0){
            time++;
            if(time<100)
            getImage().setTransparency(0);
            if(time >= 100 && trans<=254 && time < 400){
                trans++;
                getImage().setTransparency(trans);
            }
            if(time > 400 && trans>1){
                trans--;
                getImage().setTransparency(trans);
            }
            if(time==800)
            getWorld().removeObject(this);
        }
    }    
}
