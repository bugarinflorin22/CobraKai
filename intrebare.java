import greenfoot.*;

public class intrebare extends Actor
{
    private int sw = 0;
    public static int sws = 0;
    private int sw2=0;
    public static int sv = 0;
    public static int cv = 0;
    GreenfootImage i1 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i1.png");
    GreenfootImage i2 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i2.png");
    GreenfootImage i3 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i3.png");
    GreenfootImage i4 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i4.png");
    GreenfootImage i5 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i5.png");
    
    public void act() 
    {
        
        if(this.getWorld().getClass() == battlefield.class){
            if(new Storage().getdata(2) != 0){
                 i1 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i1.png");
                 i2 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i2.png");
                 i3 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i3.png");
                 i4 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i4.png");
                 i5 = new GreenfootImage("intrebari/lvl"+new Storage().getdata(2)+"/i5.png");
            }
        }
        
        if(this.getWorld().getClass() == prepare.class){
             i1 = new GreenfootImage("intrebari/lvl"+new intrebare().cv+"/i1.png");
             i2 = new GreenfootImage("intrebari/lvl"+new intrebare().cv+"/i2.png");
             i3 = new GreenfootImage("intrebari/lvl"+new intrebare().cv+"/i3.png");
             i4 = new GreenfootImage("intrebari/lvl"+new intrebare().cv+"/i4.png");
             i5 = new GreenfootImage("intrebari/lvl"+new intrebare().cv+"/i5.png");
             if(sv == 0){
                 sv=1;
                 new Sys().in();
                 cv = new Sys().in;
             }
        }
        if(sw == 0){
            sw=1;
            new Sys().randomnumber();
        }
        if(sw2==0){
            sw2=1;
            reset();
        }
        if(sws == 1){
            sws = 0;
        if(new Sys().intrebare == 1)
            setImage(i1);
        if(new Sys().intrebare == 2)
            setImage(i2);
        if(new Sys().intrebare == 3)
            setImage(i3);
        if(new Sys().intrebare == 4)
            setImage(i4);
        if(new Sys().intrebare == 5)
            setImage(i5);
        }
    }
    public static void reset(){
    sws = 1;
    }
    public static void svch(){
        sv=0;
    }
    public static int cv(){
        return cv;
    }
}
