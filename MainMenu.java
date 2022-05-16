import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,550,430);
        optiuni optiuni = new optiuni();
        addObject(optiuni,550,530);
        iesire iesire = new iesire();
        addObject(iesire,550,630);
        intro intro = new intro();
        addObject(intro,540,360);
        
        musicmenu musicmenu = new musicmenu();
        addObject(musicmenu,982,247);
    }
}
