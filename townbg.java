import greenfoot.*;  

public class townbg extends Actor
{
    public static int sw = 0;
    private GreenfootImage store = new GreenfootImage("store_bg.png");
    private GreenfootImage sb = new GreenfootImage("senseibg.png");
    private GreenfootImage sb2 = new GreenfootImage("senseibg2.png");
    public void act() 
    {
        if(sw==1){
            setImage(store);
            getImage().setTransparency(255);
        } else if(sw==2){
            setImage(sb);
            getImage().setTransparency(255);
        } else if(sw==3){
            setImage(sb2);
            getImage().setTransparency(255);
        } else getImage().setTransparency(0);
    }
    public static void tbg(int b){
        if(b==1)
        sw=1;
        if(b==0)
        sw=0;
        if(b==2)
        sw=2;
        if(b==3)
        sw=3;
    }
}
