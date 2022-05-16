import greenfoot.*;

public class bg extends Actor
{
    private int time = 0;
    private int pause = 0;
    GreenfootSound zap = new GreenfootSound("zap.mp3");
    private GreenfootImage efx0 = new GreenfootImage("bg1.png");
    private GreenfootImage efx1 = new GreenfootImage("bg/bg1efx/efx1.png");
    private GreenfootImage efx2 = new GreenfootImage("bg/bg1efx/efx2.png");
    private GreenfootImage efx3 = new GreenfootImage("bg/bg1efx/efx3.png");
    private GreenfootImage efx4 = new GreenfootImage("bg/bg1efx/efx4.png");
    private GreenfootImage efx5 = new GreenfootImage("bg/bg1efx/efx5.png");
    private GreenfootImage efx6 = new GreenfootImage("bg/bg1efx/efx6.png");
    private GreenfootImage cat1 = new GreenfootImage("bg/cat/cat1.png");
    private GreenfootImage cat2 = new GreenfootImage("bg/cat/cat2.png");
    private GreenfootImage cat3 = new GreenfootImage("bg/cat/cat3.png");
    private GreenfootImage cat4 = new GreenfootImage("bg/cat/cat4.png");
    public void act() 
    {
      pause = new Sys().pause;
        if(pause == 0){
            efx();
      }
    }
    
    public void efx(){
        time++;
        if(time==100){
        setImage(efx1);
        zap.play();
        }
        if(time==110){
        setImage(efx0);
        zap.stop();
        }
        if(time==120){
        setImage(efx1);
        zap.play();
        }
        if(time==250){
        setImage(efx0);
        zap.stop();
        }
        if(time==260){
        setImage(efx1);
        zap.play();
        }
        if(time==270){
        setImage(efx0);
        zap.stop();
        }
        if(time==280){
        setImage(efx1);
        zap.play();
        }
        if(time==290){
        setImage(efx0);
        zap.stop();
        }
        
        if(time==300){
        setImage(efx2);
        zap.play();
        }
        if(time==310){
        setImage(efx0);
        zap.stop();
        }
        if(time==330){
        setImage(efx2);
        zap.play();
        }
        if(time==350){
        setImage(efx0);
        zap.stop();
        }
        if(time==390){
        setImage(efx3);
        zap.play();
        }
        if(time==400)
        setImage(efx0);
        if(time==570)
        setImage(efx4);
        
        if(time==650)
        setImage(efx6);
        if(time==1050)
        setImage(efx5);
        
        if(time==1200)
        setImage(cat1);
        
        if(time==2350)
        Greenfoot.setWorld(new MeetSensei());
    }
}
