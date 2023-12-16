import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoombaDead here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class GoombaDead extends Goomba
{
  
    
    /**
     * Act - do whatever the GoombaDead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gDead);
        animateDeath();
    }    
    
    private void animateDeath()
    {
        
        //add 10 points to the score for stepping on a goomba
        Levels L = (Levels)getWorld();
        Counter scoreCounter = L.getScoreCounter();
        scoreCounter.add(10);
        
        Greenfoot.playSound("smb_stomp.wav");
        this.speed = 3;
        moveDown();

        getWorld().removeObject(this);
        
    }
    
    
    
}
