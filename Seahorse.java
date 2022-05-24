import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seahorse extends Actor
{

    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            turn(-5);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            turn(5);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            move(2);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            move(-1);
        }
        
        eat();
        
    }
    
    public void eat()
    {
        if(isTouching(Blueberry.class))
        {
            removeTouching(Blueberry.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBlueberry();
            world.increaseScore();
        }
    }    
}
