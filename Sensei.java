import greenfoot.*;

public class Sensei extends Actor
{
    private GreenfootImage sensei = new GreenfootImage("sensei/sensei.png");
    private GreenfootImage sensei2 = new GreenfootImage("sensei/sensei2.png");
    
    private int time = 0;
    
    public void act() 
    {
        time++;
        if(this.getWorld().getClass() == MeetSensei.class)
        MeetSensei();
    }
    public void MeetSensei(){
        if(time >= 4050){
            getImage().setTransparency(255);
            if(time==4050){
            setLocation(185,450);
            sensei.scale(200,206);
            setImage(sensei);
            }
            if(time>=4230){
            setLocation(185,450);
            sensei2.scale(200,206);
            setImage(sensei2);
            }
        }else getImage().setTransparency(0);
    }
}
