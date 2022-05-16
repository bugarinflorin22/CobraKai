import greenfoot.*;

public class intro extends Actor
{
    private int trans = 255;
    private int time = 0;
    private int go = Start.go;
    private int sw = 1;
    public void act() 
    {
      time++;
      go = Start.go;
      if(this.getWorld().getClass() == MyWorld.class){
          if(time<=1850)
          trans--;
          else {
              if(time==2000)
              trans=0;
              trans++;
          }
          if(trans>0 && trans<=255)
          getImage().setTransparency(trans);
      }
      if(this.getWorld().getClass() == MeetSensei.class){
          if(time<=1850)
          trans--;
          else {
              if(time==4270)
              trans=0;
              if(time>=4270)
              trans++;
              if(time==4800)
              Greenfoot.setWorld(new battlefield());
          }
          if(trans>0 && trans<=255)
          getImage().setTransparency(trans);
      }
      if(this.getWorld().getClass() == MainMenu.class){
          getImage().setTransparency(trans);
          if(trans>1 && go==0)
          trans--;
          if(trans==1 && go==0)
          {
              World world;
              world = getWorld();
              world.removeObject(this);
          }
          if(go==1 && sw==1)
          {
            trans=0;
            sw=0;
          }
          if(go==1 && trans<254){
              trans=trans+2;
              if(trans==200){
              if(new Storage().getdata(2) != 0)
              Greenfoot.setWorld(new town());
               }
              
          }
      }
    }
}
