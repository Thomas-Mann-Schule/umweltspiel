import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startbildschirm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startbildschirm extends World
{

    /**
     * Constructor for objects of class Startbildschirm.
     * 
     */
    public Startbildschirm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1); 
        this.addObject( new Startknopf(),450,250);
    }
}
