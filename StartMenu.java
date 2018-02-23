import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    private GreenfootImage startBackground = new GreenfootImage( "Battleship.jpg" );
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        
        startBackground.scale( getWidth(), getHeight() );
        
        setBackground( startBackground );
        
        addObject( new StartButton(), getWidth()/2, getHeight() - 100 );
    }
}
