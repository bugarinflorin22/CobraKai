import greenfoot.*;

public class AnimationCharachter extends Actor
{
    private GreenfootImage walkr1 = new GreenfootImage("ch_p1_r.png");
    private GreenfootImage walkr2 = new GreenfootImage("ch_p2_r.png");
    private GreenfootImage walkr3 = new GreenfootImage("ch_p3_r.png");
    private GreenfootImage walkr4 = new GreenfootImage("ch_p4_r.png");
    private GreenfootImage walkr5 = new GreenfootImage("ch_p5_r.png");
    private GreenfootImage walkl1 = new GreenfootImage("ch_p1_l.png");
    private GreenfootImage walkl2 = new GreenfootImage("ch_p2_l.png");
    private GreenfootImage walkl3 = new GreenfootImage("ch_p3_l.png");
    private GreenfootImage walkl4 = new GreenfootImage("ch_p4_l.png");
    private GreenfootImage walkl5 = new GreenfootImage("ch_p5_l.png");
    private GreenfootImage stand = new GreenfootImage("ch_p_stand.png");
    private GreenfootImage back = new GreenfootImage("back/ch_bp1.png");
    private GreenfootImage walkup1 = new GreenfootImage("back/ch_bp1.png");
    private GreenfootImage walkup2 = new GreenfootImage("back/ch_bp2.png");
    private GreenfootImage walkup3 = new GreenfootImage("back/ch_bp3.png");
    private GreenfootImage lookup = new GreenfootImage("back/ch_bp5.png");
    private GreenfootImage lookdown = new GreenfootImage("back/ch_bp4.png");
    private GreenfootImage sit1 = new GreenfootImage("sit/ch_sit1.png");
    private GreenfootImage sit2 = new GreenfootImage("sit/ch_sit2.png");
    private GreenfootImage sit3 = new GreenfootImage("sit/ch_sit3.png");
    private GreenfootImage sit4 = new GreenfootImage("sit/ch_sit4.png");
    private GreenfootImage sit5 = new GreenfootImage("sit/ch_sit5.png");
    private GreenfootImage sit6 = new GreenfootImage("sit/ch_sit6.png");
    private GreenfootImage sit7 = new GreenfootImage("sit/ch_sit7.png");
    private GreenfootImage sit8 = new GreenfootImage("sit/ch_sit8.png");
    private GreenfootImage sit9 = new GreenfootImage("sit/ch_sit9.png");
    private GreenfootImage sit10 = new GreenfootImage("sit/ch_sit10.png");
    
    private GreenfootImage walkr1s2 = new GreenfootImage("meetsensei/ch_p1_r.png");
    private GreenfootImage walkr2s2 = new GreenfootImage("meetsensei/ch_p2_r.png");
    private GreenfootImage walkr3s2 = new GreenfootImage("meetsensei/ch_p3_r.png");
    private GreenfootImage walkr4s2 = new GreenfootImage("meetsensei/ch_p4_r.png");
    private GreenfootImage walkr5s2 = new GreenfootImage("meetsensei/ch_p5_r.png");
    private GreenfootImage walkl1s2 = new GreenfootImage("meetsensei/ch_p1_l.png");
    private GreenfootImage walkl2s2 = new GreenfootImage("meetsensei/ch_p2_l.png");
    private GreenfootImage walkl3s2 = new GreenfootImage("meetsensei/ch_p3_l.png");
    private GreenfootImage walkl4s2 = new GreenfootImage("meetsensei/ch_p4_l.png");
    private GreenfootImage walkl5s2 = new GreenfootImage("meetsensei/ch_p5_l.png");
    
    GreenfootSound maudio = new GreenfootSound("intro.mp3"); 
    GreenfootSound hit = new GreenfootSound("hit.mp3"); 
    
    private int pos = 1;
    private int time = 1;
    private int speedmove = 1;
    private int scena = 0;
    private int pause = 0;
    
    public void act() 
    {
        pause = new Sys().pause;
        if(pause==0){
            if(this.getWorld().getClass() == MyWorld.class){
            MyWorld();
            scena = 0;
            }
            if(this.getWorld().getClass() == MeetSensei.class){
            MeetSensei();
            if(time>=1800 && time <=1900)
            scena = 0;
            else scena=1;
            }
            maudio.setVolume(new Storage().getdata(0));
        }
    }
    
    public void MyWorld(){
        time++;
        if(time>=1)
        maudio.play();

        if(time<390 || (time>550 && time<1050) || (time>=1850)){
        if(time % 10 == 0)
                walk_anim_right();
            setLocation(getX()+speedmove, getY());
        }
        if(time>390 && time<550 || (time>=1050 && time<1150)){
            setImage(back);
        }
        if(time==1150)
        pos=1;
        if(time>1150 && time<1280){
            if(time % 10 == 0)
                walk_anim_up();
                setLocation(getX(), getY()-speedmove);
        }
        if(time>1280 && time<1330){
           if(time>1200){
               back.scale(250,256);
               setImage(back);
           }else 
               setImage(back);
        }
        if(time==1200){
            back.scale(250,256);
            setImage(back);
            setLocation(400, getY()+10);
        }
        if(time>=1400 && time<=1600){
            lookup.scale(250,256);
            setImage(lookup);
        }
        if(time>=1600 && time<=1700){
            back.scale(250,256);
            setImage(back);
        }
        if(time>=1700 && time<=1850){
            lookdown.scale(250,256);
            setImage(lookdown);
        }
    }
   
    public void MeetSensei(){
        time++;
        sit1.scale(200,206);
        sit2.scale(200,206);
        sit3.scale(200,206);
        stand.scale(210,216);
        if(time == 10)
        setImage(sit1);
        if(time == 500)
        setImage(sit2);
        if(time == 800)
        setImage(sit3);
        if(time == 900){
        setImage(stand);
        setLocation(getX(), getY()+50);
        }
        if(time>=950 && time<=1500){
        if(time % 10 == 0)
                walk_anim_right();
            setLocation(getX()+speedmove, getY());
        }
        if(time>=1500 && time<=1800){
        if(time % 10 == 0)
                walk_anim_up();
            setLocation(getX(), getY()-speedmove);
        }
        if(time==1500){
        walkup2.scale(200,206);
        walkup3.scale(200,206);
        }
        if(time==1800){ 
        speedmove=2;
        setLocation(1080, 490);
        }
        if(time>=1800 && time <= 1950){
        if(time % 9 == 0)
                walk_anim_left();
            setLocation(getX()-speedmove, 490);
        }
        if(time==1951){
        setImage(back);
        }
        if(time>=2000 && time <= 2300){
        if(time % 8 == 0)
                walk_anim_left();
            setLocation(getX()-speedmove, 490);
        }
        if(time==2300){
        setImage(back);
        }
        if(time==2350)
        getImage().setTransparency(0);
        if(time==3250){
        getImage().setTransparency(255);
        setImage(sit4);
        setLocation(30,480);
        }
        if(time==3820) setImage(sit5);
        if(time==4050) setLocation(240,480);
        if(time>=4200 && time<=4230){
        if(time % 8 == 0)
            walk_anim_left();
        setLocation(getX()-(speedmove-1), 480);
        }
        if(time==4235){
            hit.setVolume(new Storage().getdata(1));
            hit.play();
            setImage(sit6);
            setLocation(245,480);
        }
        if(time==4240){
            setImage(sit7);
            setLocation(247,490);
        }
        if(time==4245){
            setImage(sit8);
            setLocation(249,500);
        }
        if(time==4255){
            setImage(sit9);
            setLocation(251,510);
        }
        if(time==4270){
            setImage(sit10);
            setLocation(245,520);
        }
    }
    
    public void walk_anim_right(){
        if(pos==1){
            if(scena == 1){
                walkr1s2.scale(200,206);
                setImage(walkr1s2);
            }
            if(scena == 0){
                if(time>=1850)
                    walkr1.scale(250,256);
                setImage(walkr1);
            }
        }
        if(pos==2){
            if(scena == 1){
                walkr2s2.scale(200,206);
                setImage(walkr2s2);
            }
            if(scena == 0){
                if(time>=1850)
                    walkr2.scale(250,256);
                setImage(walkr2);
            }
        }
        if(pos==3){
            if(scena == 1){
                walkr3s2.scale(200,206);
                setImage(walkr3s2);
            }
            if(scena == 0){
                if(time>=1850)
                    walkr3.scale(250,256);
                setImage(walkr3);
            }
        }
        if(pos==4){
            if(scena == 1){
                walkr4s2.scale(200,206);
                setImage(walkr4s2);
            }
            if(scena == 0){
                if(time>=1850)
                    walkr4.scale(250,256);
                setImage(walkr4);
            }
        }
        if(pos==5){
            if(scena == 1){
                walkr5s2.scale(200,206);
                setImage(walkr5s2);
            }
            if(scena == 0){
                if(time>=1850)
                    walkr5.scale(250,256);
                setImage(walkr5);
            }
        }
        if(pos==6){
        pos=0;
        }
        pos++;
    }
    
    public void walk_anim_left(){
        if(pos==1){
            if(scena==0) setImage(walkl1);
            if(scena==1) setImage(walkl1s2);
        }
        if(pos==2){
            if(scena==0) setImage(walkl2);
            if(scena==1) setImage(walkl2s2);
        }
        if(pos==3){
            if(scena==0) setImage(walkl3);
            if(scena==1) setImage(walkl3s2);
        }
        if(pos==4){
            if(scena==0) setImage(walkl4);
            if(scena==1) setImage(walkl4s2);
        }
        if(pos==5){
            if(scena==0) setImage(walkl5);
            if(scena==1) setImage(walkl5s2);
        }
        if(pos==6){
        pos=0;
        }
        pos++;
    }
    
    public void walk_anim_up(){
        if(pos==1){
        if(scena==0){
            if(time>1200){
                   walkup2.scale(250,256);
                   setImage(walkup2);
            }else 
            setImage(walkup2);
            }
        if(scena==1){
               setImage(walkup2);
               walkup2.scale(getImage().getHeight()-10,getImage().getWidth()-10);
            }
        }
        if(pos==2){
        if(scena==0){
            if(time>1200){
                   walkup3.scale(250,256);
                   setImage(walkup3);
            }else     
            setImage(walkup3);
        }
        if(scena==1){         
               setImage(walkup3);
               walkup3.scale(getImage().getHeight()-10,getImage().getWidth()-10);
            }
        }
        if(pos==3)
        pos=0;
        pos++;
    }
}
