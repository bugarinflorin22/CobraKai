import greenfoot.*;

public class C extends Actor
{
    private GreenfootImage trei = new GreenfootImage("/numere/3.png");
    private GreenfootImage doi = new GreenfootImage("/numere/2.png");
    private GreenfootImage unu = new GreenfootImage("/numere/1.png");
    private int time = 0;
    private int x = 500;
    private int y = 500;
    private int sw = 1;
    private int pause = 0;
    private int p = 0;
    private int p2 = 0;
    public static int done = 0;
    public void act() 
    {
        pause = new Sys().pause;
        p = new Storage().getdata(2);
        if(pause == 0 && p >= 1){
            time++;
            if(time==0){
            setImage(trei);
            trei.scale(500,500);
            }
            if(time%2==0){
                if(x>20 && sw==1){
                    x=x-20;
                    y=y-20;
                    trei.scale(x,y);
                    setImage(trei);
                } else if(sw==1){
                    sw=2;
                    x=500;
                    y=500;
                }
                
                if(x>20 && sw==2){
                    x=x-20;
                    y=y-20;
                    doi.scale(x,y);
                    setImage(doi);
                } else if(sw==2){
                    sw=3;
                    x=500;
                    y=500;
                }
                
                if(x>20 && sw==3){
                    x=x-20;
                    y=y-20;
                    unu.scale(x,y);
                    setImage(unu);
                } else if(sw==3){
                    sw=4;
                    x=500;
                    y=500;
                }
                if(sw==4){
                    getImage().setTransparency(0);
                    done=1;
                } else done = 0;
            }
        }
    }    
}
