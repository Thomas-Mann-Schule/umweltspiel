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
        this.showText("Welcher Kontinent ist der größte Müllproduzent?", 300, 50);
        this.showText("Tippe auf die Müllobjekte für Tipps", 300, 80);
        this.addObject( new Muellobjekt1(),150,350);
        this.addObject( new Muellobjekt2(),350,400);
        this.addObject( new Muellobjekt3(),500,350);
        this.addObject( new Antwortmoeglichkeit1(),100,500);
        this.addObject( new Antwortmoeglichkeit2(),450,500);
        this.addObject( new Antwortmoeglichkeit3(),800,500);
        
    }
}
