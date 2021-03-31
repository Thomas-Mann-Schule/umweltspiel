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
        super(900, 550, 1); 
        this.showText("Welcher Kontinent ist der größte Müllproduzent?", 450, 50);
        this.showText("Tippe auf die Müllobjekte für Tipps",450, 80);
        this.addObject( new Muellobjekt1(),600,470);
        this.addObject( new Muellobjekt2(),280,470);
        this.addObject( new Muellobjekt3(),450,380);
        this.addObject( new Antwortmoeglichkeit1(),100,500);
        this.addObject( new Antwortmoeglichkeit2(),450,500);
        this.addObject( new Antwortmoeglichkeit3(),800,500);
        
    }
}
