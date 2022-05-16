import greenfoot.*;

public class inapoi extends Actor
{
    private GreenfootImage start = new GreenfootImage("inapoi.png");
    private GreenfootImage starta = new GreenfootImage("inapoiactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public boolean str = false;
    private boolean music = true;
    private int sw = 1;
    private int time = 0;
    private int go = Start.go;
    public void act() 
    {
      time++;
      go = Start.go;
      if(Greenfoot.mouseMoved(null))
        str = Greenfoot.mouseMoved(this);
      if(str && go==0){
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
      } else if(time>=3 && go==0){
          sw=0;
          setLocation(getX(),430);
          setImage(start);
      }
      if(Greenfoot.mouseClicked(this)){
          click.setVolume(new Storage().getdata(1));
          click.play();
          World world;
          world = getWorld();
          getWorld().removeObjects(getWorld().getObjects(musicbar.class));
          getWorld().removeObjects(getWorld().getObjects(sfxbar.class));
          getWorld().removeObjects(getWorld().getObjects(inapoi.class));
          Start start = new Start();
          iesire iesire = new iesire();
          optiuni optiuni = new optiuni();
          world.addObject(start,550,630);
          world.addObject(optiuni,550,530);
          world.addObject(iesire,550,430);
      }
    }    
}
