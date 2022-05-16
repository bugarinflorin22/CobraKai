import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musicmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musicmenu extends Actor
{
    GreenfootSound bgm = new GreenfootSound("menu.mp3");
    private int go = Start.go;
    private int volume = 50;
    private int sw=1;
    public void act() 
    {
        go = Start.go;
        volume = new Storage().getdata(0);
        if(go==0){
        bgm.setVolume(volume);
        if(sw==1){
            bgm.playLoop();
            sw=0;
        }
        } else bgm.stop();
    }
}
