import greenfoot.*;

public class error extends Actor
{
    public static int time = 0;
    public static int timez = 254;
    public static int sw = 0;
    public static int xz = 1;
    private GreenfootImage error = new GreenfootImage("errors/eroare"+xz+".png");

    public void act() 
    {
        
        if(sw==1){
            error = new GreenfootImage("errors/eroare"+xz+".png");
            setImage(error);
            
            if(sw==1){
                time=time+2;
                if(time<=253)
                getImage().setTransparency(time);
            }
            if(time>254){
                timez=timez-3;
                if(timez>=0)
                    getImage().setTransparency(timez);
                if(timez<=3)
                    sw=0;
            }
        } else getImage().setTransparency(1);
    }
    public static void eroare(int x){
        xz = x;
        sw=1;
        time=0;
        timez=254;
    }
}
