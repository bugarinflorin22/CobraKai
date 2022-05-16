import greenfoot.*;

public class MeetSensei extends World
{
    public MeetSensei()
    {    
        
        super(1080, 720, 1); 
        prepare();
    }
    
    private void prepare()
    {
        cut2 cut2 = new cut2();
        addObject(cut2,539,359);
        AnimationCharachter animationCharachter = new AnimationCharachter();
        addObject(animationCharachter,197,512);
        Rain rain = new Rain();
        addObject(rain,526,359);
        Sensei sensei = new Sensei();
        addObject(sensei,189,470);
        intro intro = new intro();
        addObject(intro,540,360);
        
    }
}
