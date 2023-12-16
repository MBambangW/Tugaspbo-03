import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class Coin extends Mover
{
    private final GreenfootImage Coin1 = new GreenfootImage("new_coin1.gif");
    private final GreenfootImage Coin2 = new GreenfootImage("new_coin2.gif");
    private final GreenfootImage Coin3 = new GreenfootImage("new_coin3.gif");
    
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animateCoin();
        checkCollision();
    }    
    
    private void animateCoin()
    {
        animationCounter ++;
        
        if (animationCounter < 9 )
        {
            setImage(Coin1);
            Coin1.scale(35,35);
        }
        else if (animationCounter < 18)
        {
            setImage(Coin2);
            Coin2.scale(35,35);
        }
        else if (animationCounter < 27)
        {
            setImage(Coin3);
            Coin3.scale(35,35);
        }
        else if (animationCounter < 36)
        {
            setImage(Coin2);
            Coin2.scale(35,35);
        }
        if (animationCounter > 36)
        {
            animationCounter = 0;
            setImage(Coin1);
            Coin1.scale(35,35);
        }
        
    }
    
    /**
     * if mario collides with the coin, remove this instance from the level
     */
    private void checkCollision()
    {
        Actor Mario = getOneIntersectingObject(Mario.class);
        if (Mario != null)
        {
            Greenfoot.playSound("smb_coin.wav"); 
            
            Levels L = (Levels)getWorld();
            Counter scoreCounter = L.getScoreCounter();
            scoreCounter.add(5);
            getWorld().removeObject(this);
        }
       
        
    }
    
    }

