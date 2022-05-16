import greenfoot.*; 

public class i3 extends i1
{
    private GreenfootImage re = new GreenfootImage("i/lvl"+new Storage().getdata(2)+"/i3.png");
    
    private GreenfootSound click = new GreenfootSound("click.mp3");
    GreenfootSound errors = new GreenfootSound("error.mp3");
    public void act() 
    {
       if(exit_sensei.c==0)
            getWorld().removeObject(this);
        
       setImage(re);
       if(Greenfoot.mouseClicked(this)){
            click.setVolume(new Storage().getdata(1));
            click.play();
            if(new Storage().getdata(3) >= 50){
                new Storage().storedata(3, new Storage().getdata(3)-50);
                r r = new r();
                getWorld().addObject(r,540,320);
                new r().changei(3);
                ok ok = new ok();
                getWorld().addObject(ok,540,520);
                townbg.tbg(3);
                getWorld().removeObjects(getWorld().getObjects(exit_sensei.class));
                getWorld().removeObjects(getWorld().getObjects(i1.class));
            }
            else {
                new error().eroare(3);
                errors.setVolume(new Storage().getdata(1));
                errors.play();
            }
        }
    }    
}
