import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HUD here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class HUD extends Mover
{
    private final GreenfootImage life = new GreenfootImage ("life.gif");
    private final GreenfootImage coin = new GreenfootImage ("coin-1.gif");
    
    /**
     * Act - do whatever the HUD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animationCounter++;
        if (selection == 3) 
            showHighScore();
    }    
    
    
    
     public HUD(int selection)
    {
        this.selection = selection;
        if (selection == 1)
        {
            setImage(life);
            life.scale(35,35);
      
        }
        else if (selection == 2)
        {
            setImage(coin);
            coin.scale(35,35);
            
        }
    }
     private void showHighScore() {
        Levels level = (Levels) getWorld();
        Counter scoreCounter = level.getScoreCounter();
        GreenfootImage img = getImage();
        img.setColor(Color.WHITE);
        img.setFont(new Font("Arial", true, false, 24));
        img.drawString("High Score: " + level.getHighScore(), getX() - 80, getY() + 40);
    }
    
}
