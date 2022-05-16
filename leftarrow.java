import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class leftarrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leftarrow extends musicbar
{
    private int volume = 0;
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            click.setVolume(new Storage().getdata(1));
            click.play();
            volume = new Storage().getdata(0) - 10;
            if(volume >= 0){
                if(volume==0)
                new Storage().storedata(0,1);
                else
                new Storage().storedata(0,volume);
            }
        }
    }    
}
