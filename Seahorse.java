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
            move(1);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            move(-1);
        }
    }
}
