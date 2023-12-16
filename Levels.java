import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class Levels extends World
{
    private Counter scoreCounter;
    private Counter lifeCounter;
    private Counter coinCounter;
    public int level;
    public int marioStartX;
    public int marioStartY;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Levels()
    {    
        // Create a new world with 1100x590 cells with a cell size of 1x1 pixels.
        super(1100, 590, 1, false); 
        Greenfoot.setSpeed(50);
        
        //Greenfoot.playSound("mariothemesong.wav");
        scoreCounter = new Counter ("Score:");
        lifeCounter = new Counter ("x");
        coinCounter = new Counter ("x");
        lifeCounter.setValue(3);
        setupLevel(1);
        setPaintOrder(HUD.class, Counter.class, Transition.class, Mario.class, MarioDead.class, Coin.class, Goomba.class, Ground.class, BgItem.class);
    }
    
    public void setupLevel(int lvl)
    {
        removeObjects(getObjects(null));
        level = lvl;
        if (level == 1)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
            HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new Goomba(),1076, 471);
            addObject(new Ground(3),650,443);
            addObject(new BgItem(3), 178, 441);
            addObject(new BgItem(4), 349, 178);
            addObject(new BgItem(4), 780, 178);
            addObject(new Coin(),577,353);
            addObject(new Coin(),494,351);
            addObject(new Coin(),455,292);
            addObject(new Coin(), 535, 301);
            addObject(new Coin(),577,353);
            addObject(new Coin(),606,294);
            addObject(new Coin(),539,396);
            
            
            for (int x = 15; x < 351; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
           for (int x = 800; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
          
        }
        else if (level == 2)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
             HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new Goomba(), 341, 472);
            addObject(new Goomba(), 1081, 471);
            addObject(new Ground(5),540,443);
            addObject(new BgItem(3), 178, 441);
            addObject(new BgItem(4), 349, 178);
            addObject(new BgItem(4), 780, 178);
            addObject(new Coin(),556,395);
            addObject(new Coin(),556,199);
            addObject(new Coin(),547,123);
            
            
            for (int x = 15; x < 351; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
           for (int x = 800; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            

        }
        else if (level == 3)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
             HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new Ground(3),650,443);
            addObject(new Goomba(), 1081, 471);
            addObject(new BgItem(4), 349, 178);
            addObject(new BgItem(4), 780, 178);
            
            addObject(new Coin(),222,459);
            addObject(new Coin(),565,374);
            addObject(new Coin(),778,384);
            
            for (int x = 15; x < 200; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
            addObject(new Ground(1), 335, 521);
            addObject(new Ground(1), 335, 566);
            
           for (int x = 800; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
        }
        else if (level == 4)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
            HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new BgItem(1), 850 , 252);
            addObject(new BgItem(2), 500 , 311);
            
            addObject(new Coin(),210,470);
            addObject(new Coin(),312,470);
            addObject(new Coin(),428,470);
            
            for (int x = 15; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
        
        }
        else if (level == -1)
        {
            GreenfootImage background = getBackground();
            background.setColor(new Color(0, 0, 0));
           
            background.fill();
          
        }
    }
    
    public void worldColorLevel()
    {
        GreenfootImage background = getBackground();
        background.setColor(new Color(92, 148, 252));
        background.fill();
            
    }
    
    public void worldColorGameOver()
    {
        GreenfootImage background = getBackground();
        background.setColor(new Color(0,0,0));
        background.fill();
    }
    
    /**
     * scoreCounter reference
     */
    public Counter getScoreCounter()
    {
        return scoreCounter;
    }
    
    /**
     * lifeCounter reference
     */
    public Counter getLifeCounter()
    {
        return lifeCounter;
    }
    
    /**
     * coinCounter reference
     */
    public Counter getCoinCounter()
    {
        return coinCounter;
    }
    
    /**
     * level hud
     */
    public void HUD()
    {
        addObject(coinCounter, 1041, 21);
        addObject(scoreCounter, 1019, 51);
        addObject(lifeCounter, 67,21);
        addObject(new HUD(1), 34,21);
        addObject(new HUD(2), 1010,21);
    }
    private int highScore = 0;


    public void act() {
        int currentScore = scoreCounter.getValue();
        if (currentScore > highScore) {
            highScore = currentScore;
        }
        

    
    }
    public int getHighScore() {
        return highScore;
    }
}

