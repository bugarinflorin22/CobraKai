import greenfoot.*;

public class Start extends Actor
{
    public boolean str = false;
    private int sw = 1;
    private int sw2 = 0;
    private int sw3 = 0;
    private int time = 0;
    private int trans = 255;
    private int x = 269;
    private int y = 62;
    public static int go = 0;
    private GreenfootImage start = new GreenfootImage("start.png");
    private GreenfootImage starta = new GreenfootImage("startactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    GreenfootSound menu = new GreenfootSound("menu.mp3");
    public void act() 
    {
      time++;
      
      if(new Storage().getdata(0) <= 0){
          new Storage().storedata(0,50);
      }
      
      if(new Storage().getdata(1) <= 0){
          new Storage().storedata(0,70);
      }
      
      if(go==1 && trans>2)
      trans=trans-2;
      
      if(Greenfoot.mouseClicked(this) && go==0){
          time=0;
          click.setVolume(new Storage().getdata(1));
          click.play();
          go = 1;
          World world;
          world = getWorld();
          intro intro = new intro();
          world.addObject(intro,540,360);
          
      }
      
      if(go==1){
          if(time>=20){
          setLocation(getX(),getY()+time/4);
          start.setTransparency(trans);
          setImage(start);
          }
      }
      if(time==250 && go==1){
          go=0;
          Greenfoot.setWorld(new MyWorld());
      }
      
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
    }

}
