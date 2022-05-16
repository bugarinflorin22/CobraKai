import greenfoot.*;  

public class leftarrowsfx extends sfxbar
{
    GreenfootSound click = new GreenfootSound("click.mp3");
    private int volume = 0;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            click.setVolume(new Storage().getdata(1));
            click.play();
            volume = new Storage().getdata(1) - 10;
            if(volume >= 0){
                if(volume==0)
                new Storage().storedata(1,1);
                else
                new Storage().storedata(1,volume);
            }
        }
    } 
}
