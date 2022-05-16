import greenfoot.*;

public class optiuni extends Start
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
    public static int volume = 100;
    private GreenfootImage start = new GreenfootImage("optiuni.png");
    private GreenfootImage starta = new GreenfootImage("optiuniactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
      time++;
      go = Start.go;
      
      if(go==1 && trans>2)
      trans=trans-2;
      
      if(Greenfoot.mouseMoved(null))
        str = Greenfoot.mouseMoved(this);
     
      if(go==1){
          if(sw4==0){
          time=0;
          sw4=1;
          }
          if(time>=20){
          setLocation(getX(),getY()+time/4);
          start.setTransparency(trans);
          setImage(start);
          }
      }
      
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
          setLocation(getX(),530);
          setImage(start);
      }
      
      if(Greenfoot.mouseClicked(this)){
          click.setVolume(new Storage().getdata(1));
          click.play();
          
          World world;
          world = getWorld();
          getWorld().removeObjects(getWorld().getObjects(Start.class));
          inapoi inapoi = new inapoi();
          world.addObject(inapoi,550,630);
          
          musicbar musicbar = new musicbar();
          world.addObject(musicbar,550,530);
          leftarrow leftarrow = new leftarrow();
          world.addObject(leftarrow,380,530);
          rightarrow rightarrow = new rightarrow();
          world.addObject(rightarrow,720,530);
          musicline musicline = new musicline();
          world.addObject(musicline,550,530);
          
          sfxbar sfxbar = new sfxbar();
          world.addObject(sfxbar,550,630);
          leftarrowsfx leftarrowsfx = new leftarrowsfx();
          world.addObject(leftarrowsfx,380,630);
          rightarrowsfx rightarrowsfx = new rightarrowsfx();
          world.addObject(rightarrowsfx,720,630);
          sfxline sfxline = new sfxline();
          world.addObject(sfxline,550,630);
      }
    }
}
