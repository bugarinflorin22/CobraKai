import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sfxline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sfxline extends sfxbar
{
    /**
     * Act - do whatever the sfxline wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(new Storage().getdata(1) == 100)
        setLocation(690,getY());
        if(new Storage().getdata(1) == 90)
        setLocation(660,getY());
        if(new Storage().getdata(1) == 80)
        setLocation(630,getY());
        if(new Storage().getdata(1) == 70)
        setLocation(600,getY());
        if(new Storage().getdata(1) == 60)
        setLocation(570,getY());
        if(new Storage().getdata(1) == 50)
        setLocation(550,getY());
        if(new Storage().getdata(1) == 40)
        setLocation(530,getY());
        if(new Storage().getdata(1) == 30)
        setLocation(500,getY());
        if(new Storage().getdata(1) == 20)
        setLocation(470,getY());
        if(new Storage().getdata(1) == 10)
        setLocation(440,getY());
        if(new Storage().getdata(1) == 1)
        setLocation(410,getY());
    }    
}
