import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeWorld extends World
{

    /**
     * Constructor for objects of class SnakeWorld.
     * 
     */
    static Counter score = new Counter ("Score : ");
    private GameOver gameOver = new GameOver();
    public SnakeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(550, 550, 1); 
        prepare();
        
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new SnakeHead(), x, y);
        
    
        addFood();
        
    }
    public void addFood(){
        
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new Food(), x, y);
        
    }
    
    private void prepare(){
        addObject(score, 53, 25);
        score.setValue(0);
    }
    public void act(){
        // Tambahkan kode tambahan di sini jika diperlukan
        
        if (isGameOverConditionMet()) {
            showGameOver();
        }
    }
    private boolean isGameOverConditionMet()
    {
        // Tentukan kondisi game over di sini
        // Misalnya, jika ular menabrak tepi layar atau kondisi khusus lainnya
        return false; // Ganti dengan kondisi sesuai kebutuhan
    }

    private void showGameOver()
    {
        addObject(gameOver, getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
    }
}