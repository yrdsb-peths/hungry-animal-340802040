import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seahorse extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] idle = new GreenfootImage[6];
    
    public Seahorse()
    {
        for(int i = 0; i < 6; i++)
        {
            idle[i] = new GreenfootImage("images/tile00" + i + ".png");
            idle[i].scale(40, 60);
        }
        setImage(idle[0]);
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateSeahorse()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
            move(3);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            move(-2);
        }
        
        eat();
        
        animateSeahorse();
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
