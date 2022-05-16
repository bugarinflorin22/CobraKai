import greenfoot.*;

public class Rain extends Actor
{
    private GreenfootImage Rain1 = new GreenfootImage("bg/rain/Rain1.png");
    private GreenfootImage Rain2 = new GreenfootImage("bg/rain/Rain2.png");
    private GreenfootImage Rain3 = new GreenfootImage("bg/rain/Rain3.png");
    private GreenfootImage Rain4 = new GreenfootImage("bg/rain/Rain4.png");
    private GreenfootImage Rain5 = new GreenfootImage("bg/rain/Rain5.png");
    
    private GreenfootImage Rain21 = new GreenfootImage("bg/rain2/Rain1.png");
    private GreenfootImage Rain22 = new GreenfootImage("bg/rain2/Rain2.png");
    private GreenfootImage Rain23 = new GreenfootImage("bg/rain2/Rain3.png");
    private GreenfootImage Rain24 = new GreenfootImage("bg/rain2/Rain4.png");
    private GreenfootImage Rain25 = new GreenfootImage("bg/rain2/Rain5.png");
    
    private int time = 0;
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        if(pause == 0){
            time++;
            if(this.getWorld().getClass() == MeetSensei.class){
                if(time==6)
                setImage(Rain21);
                else if(time==12)
                setImage(Rain22);
                else if(time==18)
                setImage(Rain23);
                else if(time==24)
                setImage(Rain24);
                else if(time==30)
                setImage(Rain25);
                else if(time>36)
                time=0;
            }
            if(this.getWorld().getClass() == MyWorld.class){
                if(time==6)
                setImage(Rain1);
                else if(time==12)
                setImage(Rain2);
                else if(time==18)
                setImage(Rain3);
                else if(time==24)
                setImage(Rain4);
                else if(time==30)
                setImage(Rain5);
                else if(time>36)
                time=0;
            }
        }
    }    
}
