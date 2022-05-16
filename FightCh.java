import greenfoot.*;  

public class FightCh extends Actor
{
    public static int time = 0;
    private int pos = 0;
    private int pause = 0;
    private int corect = 0;
    private int gresit = 0;
    private int sw = 0;
    private int sw2 = 0;
    private int m = 0;
    public static int w = 0;
    public static int bm = 0;
    private GreenfootImage stand = new GreenfootImage("ch_stand.png");
    private GreenfootImage fall_1 = new GreenfootImage("fight/ch_fall-1.png");
    private GreenfootImage fall_2 = new GreenfootImage("fight/ch_fall-2.png");
    
    private GreenfootImage f1_1 = new GreenfootImage("fight/ch_f1-1.png");
    private GreenfootImage f1_2 = new GreenfootImage("fight/ch_f1-2.png");
    private GreenfootImage f1_3 = new GreenfootImage("fight/ch_f1-3.png");
    
    private GreenfootSound bmusic = new GreenfootSound("bmusic.mp3");
    private GreenfootSound kick1 = new GreenfootSound("kick1.mp3");
    private GreenfootSound fall = new GreenfootSound("hit.mp3");

    public void act() 
    {
        if(this.getWorld().getClass() == prepare.class)
            w=1;
        else w = 0;
        
        if(m==0 && bm == 0){
            bm=1;
            m=1;
            bmusic.setVolume(new Storage().getdata(0));
            bmusic.playLoop();
        }
        pause = new Sys().pause;
        if(new Storage().getdata(-1)==0){
            Greenfoot.setWorld(new town());
            error.eroare(1);
        }
        if(pause == 0){
            corect = new Sys().corect;
            gresit = new Sys().gresit;
            if(corect == 1 || gresit == 1)
            time++;
            if(time == 59 && sw2==1){
                new Sys().reset();
                sw2=0;
                fillbar.start_stop(1);
                sw = 0;
                time = 0;
                add();
                raspuns1.reset();
                raspuns2.reset();
                raspuns3.reset();
                fillbar.reset();
                Enemy.reset();
                setImage(stand);
                setLocation(500,579);
            }
  
            if(corect == 1) {
                if(sw==0){
                    sw2=1;
                    time=0;
                    fight1();
                }
            }
            
            if(gresit == 1) {
                if(sw==0){
                    sw2=1;
                    time=0;
                    defeat();
                }
            }
        }
    }
    public void add(){
        intrebare intrebare = new intrebare();
        getWorld().addObject(intrebare,520,109);
        raspuns1 raspuns1 = new raspuns1();
        getWorld().addObject(raspuns1,194,223);
        raspuns2 raspuns2 = new raspuns2();
        getWorld().addObject(raspuns2,540,223);
        raspuns3 raspuns3 = new raspuns3();
        getWorld().addObject(raspuns3,886,223);
    }
    public void defeat(){
        pos++;
        if(pos==2)
            setLocation(530,getY());
        if(pos==25){
            setImage(fall_1);
            setLocation(getX()-100,getY()+10);
            fall.setVolume(new Storage().getdata(1));
            fall.play();
        }
        if(pos==44)
            setImage(fall_2);
        if(pos==45){
            pos=0;
            sw=1;
            time=0;
        }
    }
    public void fight1(){
        pos++;
        if(pos==8)
            setImage(f1_1);
        if(pos==16)
            setImage(f1_2);
        if(pos==24){
            setImage(f1_3);
            kick1.setVolume(new Storage().getdata(1));
            kick1.play();
        }
        if(pos==60){
            time = 0;
            setImage(stand);
            pos=0;
            sw=1;
        }
    }
}
