import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class Ground extends Mover
{
    private final GreenfootImage Stile = new GreenfootImage("stepping-tile.gif");
    private final GreenfootImage FPlatform = new GreenfootImage("floating-platform.gif");
    private final GreenfootImage Block = new GreenfootImage("block.gif");
    
    /**
     * Ground constructor
     */
    public Ground(int selection)
    {
        this.selection = selection;
        if(selection == 1)
        {
            setImage(Stile);
            Stile.scale(50,50);
        }
        else if ((selection == 2) || (selection == 3)){  
            setImage(FPlatform);
            FPlatform.scale(200,35);  
            this.speed = 2;
        }
        else if (selection == 4) { setImage(Block);
            Block.scale(30,30);  
        } 
        else if  (selection == 5)
        {
            setImage(FPlatform);
            FPlatform.scale(200,35);  
            this.speed = 2;
        }
    }
    
   
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (selection == 1)
        {
            steppingTileCollisionDetection();
        }
        else if (selection ==2)
        {
        }
        else if (selection == 3)
        {
            movementCounter++;
            moveHFPlatform();
        }
        else if (selection == 4)
        {
        }
         else if  (selection == 5)
        {
            movementCounter++;
            moveUpAndDown();
        }
    }    
    
    private void steppingTileCollisionDetection()
    {
        Actor MarioLeft = getOneObjectAtOffset (27, 0, Mario.class);
        Actor MarioRight = getOneObjectAtOffset (-27, 0, Mario.class);
        Actor MarioHead = getOneObjectAtOffset (0, 50, Mario.class);
        if (MarioLeft != null)
        {
            MarioLeft.setLocation (MarioLeft.getX() + 7, MarioLeft.getY());
            return;
        }
        else if (MarioRight != null)
        {
            MarioRight.setLocation (MarioRight.getX() - 7, MarioRight.getY());
            return;
        }
        else if (MarioHead!= null)
        {
            MarioHead.setLocation (MarioHead.getX() , MarioHead.getY()+ 10);
            return;
        }
    }
}
