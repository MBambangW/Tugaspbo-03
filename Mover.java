import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class Mover extends Actor
{
    protected int speed;
    protected int animationCounter;
    protected int selection;
    protected int movementCounter;
    
    /**
     * Move an object to the right
     */
    
    protected void moveRight()
    
    {
        setLocation(getX() + speed, getY());
    }
    
    
    /**
     * Move an object to the right
     */
    
    protected void moveLeft()
    
    {
        setLocation(getX() - speed, getY());
    }
    
    protected void moveUp()
    {
        setLocation(getX(), getY()- speed);
    }
    
    protected void moveDown()
    {
        setLocation(getX(), getY() + speed);
    } 
    
    
    protected void moveGoomba()
    {
        if (movementCounter <= 250)
        {
            moveLeft();
            
        }
        else if (movementCounter <= 500)
        {
            moveRight();
            
        }
        
        movementCounter++;
        
        if (movementCounter >= 500)
        {
            
            movementCounter = 0;
        }
        
        
    }
    
    protected void moveUpAndDown()
    {
        if (movementCounter <= 150)
        {
            setLocation(getX() - 1, getY() );
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX() + 1, getY() );
            moveUp();
            
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() , Mario.getY()- speed);
            }
            
            
        }
        else if (movementCounter <= 300)
        {
            setLocation(getX() - 1, getY());
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX() + 1, getY() );
            
            moveDown();
            
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() , Mario.getY()+ speed);
            }
            
        }
        
        movementCounter++;
        if (movementCounter >= 300)
        {
            
            movementCounter = 0;
        }
        
        
        
        
    }
    
    protected void moveHFPlatform()
    {
        if (movementCounter <= 150)
        {
            setLocation(getX(), getY() - 1);
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX(),getY() + 1);
            moveLeft();
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() - speed, Mario.getY());
            }
            
            
            
        }
        else if (movementCounter <= 300)
        {
            setLocation(getX(), getY() - 1);
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX(),getY() + 1);
            
            moveRight();
            
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() + speed, Mario.getY());
            }
            
        }
        
        movementCounter++;
        if (movementCounter >= 300)
        {
            
            movementCounter = 0;
        }
        
        
        
        
        
    }
    
}
