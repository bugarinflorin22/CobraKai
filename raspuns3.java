import greenfoot.*;  

public class raspuns3 extends intrebare
{
    private int gen = new Sys().gen;
    public static int sw = 0;
    GreenfootSound click = new GreenfootSound("click.mp3");
    private int sw2=0;
    
    private GreenfootImage r_1 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r1-3.png");
    private GreenfootImage r_2 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r2-3.png");
    private GreenfootImage r_3 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r3-3.png");
    private GreenfootImage r_4 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r4-3.png");
    private GreenfootImage r_5 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r5-3.png");
    
    public void act() 
    {
        gen = new Sys().gen;
        
        if(this.getWorld().getClass() == prepare.class){
            r_1 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r1-3.png");
            r_2 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r2-3.png");
            r_3 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r3-3.png");
            r_4 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r4-3.png");
            r_5 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r5-3.png");
        }
        
        if(sw2==0){
            sw2=1;
            reset();
        }
        if(gen == 0){
            setLocation(194,223);
        }
        if(gen == 1){
            setLocation(886,223);
        }
        if(gen == 2){
            setLocation(540,223);
        }
        if(Greenfoot.mouseClicked(this) && C.done == 1){
            if(this.getWorld().getClass() == prepare.class){ 
                new Sys().in();
            }
            if(this.getWorld().getClass() == battlefield.class)
            new Storage().storedata(-1, new Storage().getdata(-1)-1);
            click.setVolume(new Storage().getdata(1));
            click.play();
            fillbar.start_stop(0);
            new Sys().raspuns(0);
            getWorld().removeObjects(getWorld().getObjects(intrebare.class));
        }
        
        if(sw == 1){
            sw = 0;
            if(new Sys().intrebare == 1)
            setImage(r_1);
            if(new Sys().intrebare == 2)
            setImage(r_2);
            if(new Sys().intrebare == 3)
            setImage(r_3);
            if(new Sys().intrebare == 4)
            setImage(r_4);
            if(new Sys().intrebare == 5)
            setImage(r_5);
        }
    }
    public static void reset(){
        sw = 1;
    }
}
