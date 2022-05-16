import greenfoot.*;

public class prepare extends World
{
    
    public prepare()
    {    
        super(1080, 720, 1); 

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

        
        inpaoi_ar inpaoi_ar = new inpaoi_ar();
        addObject(inpaoi_ar,921,668);
    }
}
