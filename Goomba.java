import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goomba here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class Goomba extends Mover
{
    private final GreenfootImage gWalk1 = new GreenfootImage("goomba-walk1.gif");
    private final GreenfootImage gWalk2 = new GreenfootImage("goomba-walk2.gif");
    protected final GreenfootImage gDead = new GreenfootImage("goomba-dead.gif");
    
    /**
     * Act - do whatever the Goomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveGoomba();
        animateGoomba();
        collisionDetection();
    }
    
    public Goomba()
    {
        this.speed = 1;
        setImage(gWalk1);
        
        gWalk1.scale(38,50);
        
        gWalk2.scale(38,50);
    }
    
    private void animateGoomba()
    {
        animationCounter ++;
        
        if (animationCounter < 7)
        {
            setImage(gWalk1);
        }
        else if (animationCounter < 14)
        {
            setImage(gWalk2);
        }
        else if (animationCounter > 21)
        {
            animationCounter = 0;
            setImage(gWalk1);
        }
    }
    
    /**
     * Collision detection between mario and goomba
     */
    private void collisionDetection()
    {
        if (getOneObjectAtOffset(-19, -50, Mario.class) != null || getOneObjectAtOffset(19, -50,
        Mario.class) != null)
        {
            getWorld().addObject(new GoombaDead(), getX(), getY() + 9);
            getWorld().removeObject(this);
        }
        else if (getOneObjectAtOffset(-19, 10, Mario.class) != null || getOneObjectAtOffset(19, 10,
        Mario.class) != null)
        {
            Mario.isDead = true;
        }
    }
    
    
}
