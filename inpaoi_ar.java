import greenfoot.*;

public class inpaoi_ar extends Actor
{
    private GreenfootImage start = new GreenfootImage("inapoi.png");
    private GreenfootImage starta = new GreenfootImage("inapoiactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public boolean str = false;
    private boolean music = true;
    private int sw = 1;
    private int time = 0;
    public void act() 
    {
      time++;
      if(Greenfoot.mouseMoved(null))
        str = Greenfoot.mouseMoved(this);
      if(str){
          if(sw==0){
            time=0;
            sw=1;
            bhover.setVolume(new Storage().getdata(1));
            bhover.play();
        }
        if(time<=2){
        setLocation(getX(),getY()-time);
        setImage(starta);
        }
      } else if(time>=3){
          sw=0;
          setLocation(getX(),430);
          setImage(start);
      }
      if(Greenfoot.mouseClicked(this)){
          click.setVolume(new Storage().getdata(1));
          click.play();
          Greenfoot.setWorld(new town());
      }
    }    
}
