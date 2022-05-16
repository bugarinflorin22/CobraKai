import greenfoot.*;  

public class tutorial extends Actor
{
    private GreenfootImage t2 = new GreenfootImage("tutorial/t2.png");
    private GreenfootImage t3 = new GreenfootImage("tutorial/t3.png");
    private GreenfootImage t4 = new GreenfootImage("tutorial/t4.png");
    private GreenfootImage t5 = new GreenfootImage("tutorial/t5.png");
    
    private int tutorial = 0;
    private int pause = 0;
    public void act() 
    {
        pause = new Sys().pause;
        if(pause == 0){
            tutorial = Next.tutorial;
            
            if(tutorial == 1)
            setImage(t2);
            if(tutorial == 2)
            setImage(t3);
            if(tutorial == 3)
            setImage(t4);
            if(tutorial == 4)
            setImage(t5);
        }
        if(new Storage().getdata(2) != 0){
            getWorld().removeObjects(getWorld().getObjects(tutorial.class));
        }
    }    
}
