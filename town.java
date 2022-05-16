import greenfoot.*;

public class town extends World
{
    public town()
    {   
        super(1080, 720, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Charachter charachter = new Charachter();
        addObject(charachter,700,514);
        store store = new store();
        addObject(store,820,670);
        sensei_txt sensei_txt = new sensei_txt();
        addObject(sensei_txt,530,670);
        repeta repeta = new repeta();
        addObject(repeta,92,670);
        arena arena = new arena();
        addObject(arena,991,670);

        townbg townbg = new townbg();
        addObject(townbg,540,360);

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

        error error = new error();
        addObject(error,540,695);
        
        
    }
}
