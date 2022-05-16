import greenfoot.*;

public class fillbar extends Actor
{
    private GreenfootImage img = new GreenfootImage("barfill.png");
    private int time = 0;
    public static int timex2 = 0;
    private int speed = 3;
    private int x=255;
    private int y=255;
    private int z=255;
    private Color color = new Color (x,y,z);
    private int pause = 1;
    private int p = 1;
    private int sw = 0;
    public static int sw3 = 1;
    public static int sw2 = 1;
    public void act() 
    {
        p = new Storage().getdata(2);
        pause = new Sys().pause;
        
        if(pause == 0 && p >= 1 && sw2 == 1){
            time++;
            if(time>=120 && C.done == 1)
            timer();
        }
        if(sw3 == 0){
            sw3 = 1;
            setLocation(551,getY());
            x=255;
            y=255;
            z=255;
            time=120;
            sw=0;
        }
    }
    public static void start_stop(int x){
        if(x==0){
            sw2 = 0;
        } else {
            sw2 = 1;
        }
    }
    public void timer(){
       if(time%3==0){
            setLocation(getX() - (speed/2),getY());
       }
       if(getX() == 70 && sw == 0){
           sw = 1;
           if(this.getWorld().getClass() == battlefield.class)
           new Storage().storedata(-1, new Storage().getdata(-1)-1);
           fillbar.start_stop(0);
           new Sys().raspuns(0);
           getWorld().removeObjects(getWorld().getObjects(intrebare.class));
       }
       if(time%10==0){
            if(y>=10 && z>=10){
                y=y-(2+speed);
                z=z-(5+speed);
            }else if(x>=5){
                if(x<=220){
                y=0;
                z=0;
                }
                x=x-2;
            } 
            color = new Color (x,y,z);
            img.setColor(color);
            img.fill();
            setImage(img);
       }
    }
    public static void reset(){
        sw3=0;
    }
}
