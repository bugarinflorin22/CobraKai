import greenfoot.*; 

public class raspuns1 extends intrebare
{
    private int gen = new Sys().gen;
    public static int sw = 0;
    GreenfootSound click = new GreenfootSound("click.mp3");
    private int sw2=0;
    
    private GreenfootImage r_1 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r1-1.png");
    private GreenfootImage r_2 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r2-1.png");
    private GreenfootImage r_3 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r3-1.png");
    private GreenfootImage r_4 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r4-1.png");
    private GreenfootImage r_5 = new GreenfootImage("raspunsuri/lvl"+new Storage().getdata(2)+"/r5-1.png");
    private int mm = 0;
    
    public void act() 
    {
        gen = new Sys().gen;
        
        if(this.getWorld().getClass() == prepare.class){
            r_1 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r1-1.png");
            r_2 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r2-1.png");
            r_3 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r3-1.png");
            r_4 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r4-1.png");
            r_5 = new GreenfootImage("raspunsuri/lvl"+new intrebare().cv+"/r5-1.png");
        }
        
        if(sw2==0){
            sw2=1;
            reset();
        }
        if(gen == 0){
            setLocation(540,223);
        }
        if(gen == 1){
            setLocation(194,223);
        }
        if(gen == 2){
            setLocation(886,223);
        }
        if(Greenfoot.mouseClicked(this) && C.done == 1){
            if(this.getWorld().getClass() == prepare.class){
                if(new Storage().getdata(2) == 1)
                mm = Greenfoot.getRandomNumber(9);
                if(new Storage().getdata(2) == 2)
                mm = Greenfoot.getRandomNumber(15);
                if(new Storage().getdata(2) == 3)
                mm = Greenfoot.getRandomNumber(22);
                if(new Storage().getdata(2) == 4)
                mm = Greenfoot.getRandomNumber(30);
                if(new Storage().getdata(2) == 5)
                mm = Greenfoot.getRandomNumber(51);
                
                new Storage().storedata(3, new Storage().getdata(3)+mm);
            }
            click.setVolume(new Storage().getdata(1));
            click.play();
            fillbar.start_stop(0);
            new Sys().raspuns(1);
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
