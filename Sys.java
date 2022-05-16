import greenfoot.*;
public class Sys  
{
    public static int gen = 0;
    public static int in = 0;
    public static int pause = 0;
    public static int corect = 0;
    public static int gresit = 0;
    public static int intrebare = 1;
    public Sys()
    {
        
    }
    public static void reset(){
        if(intrebare == 6 && new FightCh().w == 1)
        intrebare = 0;
        
        if(intrebare == 6 && new FightCh().w==0){
            intrebare = 1;
            if(new Storage().getdata(-1) == 5){
                new Storage().storedata(2,new Storage().getdata(2)+1);
                new Storage().storedata(3,new Storage().getdata(3)+100);
                error.eroare(5);
            }
            if(new Storage().getdata(-1) < 5){ 
                error.eroare(6);
            }
            Greenfoot.setWorld(new town());
        
        }
        corect = 0;
        gresit = 0;
    }
    public void randomnumber(){
        gen =  Greenfoot.getRandomNumber(3);
    }
    public void in(){
        in = Greenfoot.getRandomNumber(new Storage().getdata(2)+1);
        
    }
    public void pauza(int x){
        if(x==1)
        pause = 1;
        else pause = 0;
    }
    public void raspuns(int x){
        if(x == 1){
            corect = 1;
        } else {
            gresit = 1;
        }
        intrebare++;
    }
    public static void rein(){
        intrebare = 1;
    }
}
