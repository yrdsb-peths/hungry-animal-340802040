import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen of the game
 * 
 * @author Jonathan Zhao
 * @version 2
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Animal", 75);
    Label instruction1 = new Label("Press <space> to Start!", 40);
    Label instruction2 = new Label("Press a and d to turn", 40);
    Label instruction3 = new Label("Press w and s to move forward and back", 40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 300, 100);
        addObject(instruction1, 300, 200);
        addObject(instruction2, 300, 250);
        addObject(instruction3, 300, 300);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
