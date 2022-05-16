import greenfoot.*; 

public class r extends Actor
{
    private GreenfootImage ii_1 = new GreenfootImage("raspunsuri/r/"+new Storage().getdata(2)+"i1.png");
    private GreenfootImage ii_2 = new GreenfootImage("raspunsuri/r/"+new Storage().getdata(2)+"i2.png");
    private GreenfootImage ii_3 = new GreenfootImage("raspunsuri/r/"+new Storage().getdata(2)+"i3.png");
    private GreenfootImage ii_4 = new GreenfootImage("raspunsuri/r/"+new Storage().getdata(2)+"i4.png");
    private GreenfootImage ii_5 = new GreenfootImage("raspunsuri/r/"+new Storage().getdata(2)+"i5.png");
    
    public static int i = 1;
    public void act() 
    {
        if(i==1)
        setImage(ii_1);
        if(i==2)
        setImage(ii_2);
        if(i==3)
        setImage(ii_3);
        if(i==4)
        setImage(ii_4);
        if(i==5)
        setImage(ii_5);
    }
    public void changei(int x){
        i=x;
    }
}
