import greenfoot.*; 

public class cut2 extends Actor
{ 
    private GreenfootImage cat1 = new GreenfootImage("bg/cat/cat1s2.png");
    private GreenfootImage cat2 = new GreenfootImage("bg/cat/cat2s2.png");
    private GreenfootImage cat3 = new GreenfootImage("bg/cat/cat3s2.png");
    private GreenfootImage cat4 = new GreenfootImage("bg/cat/cat4s2.png");
    private GreenfootImage cat5 = new GreenfootImage("bg/cat/cat5s2.png");
    private GreenfootImage cat6 = new GreenfootImage("bg/cat/cat6s2.png");
    private GreenfootImage cat7 = new GreenfootImage("bg/cat/cat7s2.png");
    private GreenfootImage cat8 = new GreenfootImage("bg/cat/cat8s2.png");
    private GreenfootImage cat9 = new GreenfootImage("bg/cat/cat9s2.png");
    private GreenfootImage cat10 = new GreenfootImage("bg/cat/cat10s2.png");
    private GreenfootImage cat11 = new GreenfootImage("bg/cat/cat11s2.png");
    
    GreenfootSound kick1 = new GreenfootSound("kick1.mp3"); 
    GreenfootSound kick2 = new GreenfootSound("kick2.mp3"); 
    
    private int time = 0;
    private int pos=0;
    private int pause = 0;
    
    public void act() {
        pause = new Sys().pause;
        if(pause == 0){
             time++;
             pos++;
             
             kick1.setVolume(new Storage().getdata(1));
             kick2.setVolume(new Storage().getdata(1));

             if(time==1800) getImage().setTransparency(255);
             if(time<1800) getImage().setTransparency(0);
             if(time >= 1800 && time<=2400){
                 train();
             }
             if(time >= 2350 && time<3200){
                 train2();
             if(time==2351) pos=0;
             }
             if(time==3200)
                setImage(cat7);
             if(time==3250){
                 setImage(cat8);
             }
             if(time>=3600 && time < 4000)
                train();
             if(time>=4000 && time <= 4300)
                train3();
        }
    }
    
    public void train(){
        if(pos==1) setImage(cat1);
        if(pos==51){
            setImage(cat2);
            kick1.play();
        }
        if(pos==101) setImage(cat1);
        if(pos==201){ 
            setImage(cat3);
            kick2.play();
        }
        if(pos>=252) pos=0;
    }
    
    public void train2(){
        if(pos==1) setImage(cat4);
        if(pos==51){
            setImage(cat5);
            kick1.play();
        }
        if(pos==101) setImage(cat4);
        if(pos==201){
            setImage(cat6);
            kick2.play();
        }
        if(pos>=252) pos=0;
    }
    
    public void train3(){
        if(pos==1) setImage(cat9);
        if(pos==51){
            setImage(cat10);
            kick1.play();
        }
        if(pos==101) setImage(cat9);
        if(pos==201){ 
            setImage(cat11);
            kick2.play();
        }
        if(pos>=252) pos=0;
    }
}
