import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class iesire extends Start
{
    public boolean str = false;
    private int sw = 1;
    private int sw2 = 0;
    private int sw3 = 0;
    private int sw4 = 0;
    private int time = 0;
    private int trans = 255;
    private int x = 269;
    private int y = 62;
    public int go = Start.go;
    private GreenfootImage start = new GreenfootImage("iesire.png");
    private GreenfootImage starta = new GreenfootImage("iesireactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
      time++;
      go = Start.go;
      if(go==1 && trans>2)
      trans=trans-2;
      if(Greenfoot.mouseClicked(this)){
          Greenfoot.stop();
          click.setVolume(new Storage().getdata(1));
          click.play();
      }
      if(go==1){
          if(time>=20){
          setLocation(getX(),getY()+time/4);
          start.setTransparency(trans);
          setImage(start);
          }
      }
      if(Greenfoot.mouseMoved(null))
        str = Greenfoot.mouseMoved(this);
      if(str && go==0){
        if(sw4==0){
          time=0;
          sw4=1;
          }
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
          setLocation(getX(),630);
          setImage(start);
      }
    }  
}
