import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1); 
        this.showText("Was kostet die Welt", 100, 50);
        this.addObject( new Muellobjekt1(),450,500);
        this.addObject( new Antwortmoeglichkeit1(),1,1);
    }
}
