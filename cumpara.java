import greenfoot.*;  

public class cumpara extends Actor
{
    private int sw = 0;
    private int sw2 = 0;
    private boolean str = false;
    private GreenfootImage start = new GreenfootImage("cumpara.png");
    private GreenfootImage starta = new GreenfootImage("cumparaactive.png");
    GreenfootSound bhover = new GreenfootSound("hover.mp3");
    GreenfootSound click = new GreenfootSound("click.mp3");
    GreenfootSound errors = new GreenfootSound("error.mp3");
    public void act() 
    {
        if(Greenfoot.mouseMoved(null))
            str = Greenfoot.mouseMoved(this);
        
        if(str){
            setImage(starta);
            sw=1;
        } else setImage(start); 
        
        if(sw==1 && sw2==0){
            bhover.setVolume(new Storage().getdata(1));
            bhover.play();
            sw2=1;
        }
        
        if(!str){
            sw=0;
            sw2=0;
        }
        
        if(Greenfoot.mouseClicked(this)){
            if(new Storage().getdata(3) >= 20 && new Storage().getdata(-1) < 5){
                click.setVolume(new Storage().getdata(1));
                click.play();
                new Storage().storedata(3, new Storage().getdata(3)-20);
                new Storage().storedata(-1, new Storage().getdata(-1)+1);
                
                if(new Storage().getdata(-1) == 1){
                    inima inima = new inima();
                    getWorld().addObject(inima,60,25);
                }
                if(new Storage().getdata(-1) == 2){
                    inima inima2 = new inima();
                    getWorld().addObject(inima2,110,23);
                }
                if(new Storage().getdata(-1) == 3){
                    inima inima3 = new inima();
                    getWorld().addObject(inima3,162,21);
                }
                if(new Storage().getdata(-1) == 4){
                    inima inima4 = new inima();
                    getWorld().addObject(inima4,214,21);
                }
                if(new Storage().getdata(-1) == 5){
                    inima inima5 = new inima();
                    getWorld().addObject(inima5,265,22);
                }
            } else {
                errors.setVolume(new Storage().getdata(1));
                errors.play();
                
                if(new Storage().getdata(-1) >= 5 && new Storage().getdata(3) >= 20)
                error.eroare(4);
                
                if(new Storage().getdata(3) <= 20)
                error.eroare(3);
            }
        }
    }    
}
