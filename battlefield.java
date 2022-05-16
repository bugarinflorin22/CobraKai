import greenfoot.*;
  
public class battlefield extends World
{
    public battlefield()
    {    
        super(1080, 720, 1); 
        prepare();
    }

    private void prepare()
    {

        bar bar = new bar();
        addObject(bar,550,26);
        fillbar fillbar = new fillbar();
        addObject(fillbar,550,25);
        hidebar hidebar = new hidebar();
        addObject(hidebar,150,26);
        fillbar.setLocation(551,26);

        C c = new C();
        addObject(c,533,383);
        intrebare intrebare = new intrebare();
        addObject(intrebare,520,109);
        raspuns1 raspuns1 = new raspuns1();
        addObject(raspuns1,194,223);
        raspuns2 raspuns2 = new raspuns2();
        addObject(raspuns2,540,223);
        raspuns3 raspuns3 = new raspuns3();
        addObject(raspuns3,886,223);

        inima inima = new inima();
        addObject(inima,60,25);
        inima inima2 = new inima();
        addObject(inima2,110,23);
        inima inima3 = new inima();
        addObject(inima3,162,21);
        inima inima4 = new inima();
        addObject(inima4,214,21);
        inima inima5 = new inima();
        addObject(inima5,265,22);

        Money money = new Money();
        addObject(money,927,23);
        
        FightCh fightCh = new FightCh();
        addObject(fightCh,500,579);
        Enemy enemy = new Enemy();
        addObject(enemy,580,579);
        
        tutorial tutorial = new tutorial();
        addObject(tutorial,540,360);
        Next next = new Next();
        addObject(next,930,640);
        Finish finish = new Finish();
        addObject(finish,150,640);
        if(new Storage().getdata(2) == 0){
        battleintro battleintro = new battleintro();
        addObject(battleintro,540,360);
        txtintro txtintro = new txtintro();
        addObject(txtintro,540,360);
        }
    }
}
