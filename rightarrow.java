import greenfoot.*; 

public class rightarrow extends musicbar
{
    private int volume = 0;
    GreenfootSound click = new GreenfootSound("click.mp3");
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            click.setVolume(new Storage().getdata(1));
            click.play();
            volume = new Storage().getdata(0) + 10;
            if(volume <= 100){
                if(volume==11)
                new Storage().storedata(0,10);
                else
                new Storage().storedata(0,volume);
            }
        }
    }    
}
