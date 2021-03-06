import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Death here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Death extends Actor
{
    /**
     * Act - do whatever the Death wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 1;
    public void act()
    {
        MyWorld world = (MyWorld) getWorld();
        
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(400);
        if(isAtEdge())
        {
            turnTowards(x, y);
        }

        move(MyWorld.level);
            
        if(isTouching(Seahorse.class))
        {
            removeTouching(Seahorse.class);
            world.gameOver();
            world.removeObject(this);
        }
    }
    

}
