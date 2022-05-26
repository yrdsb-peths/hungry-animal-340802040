import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    static int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Seahorse seahorse = new Seahorse();
        addObject(seahorse, 300, 200);
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 300, 20);
        
        createBlueberry();
        createDeath();
        
        resetStatic();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 130);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level++;
        }
        
        
    }
    
    public void createBlueberry()
    {
        Blueberry blueberry = new Blueberry();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(300);
        addObject(blueberry, x, y);
    }
    
    public void resetStatic()
    {
        level = 1;
    }
    
    public void createDeath()
    {
        Death death = new Death();
        int a = Greenfoot.getRandomNumber(600);
        int b = Greenfoot.getRandomNumber(400);
        addObject(death, a, b);
    }
}
