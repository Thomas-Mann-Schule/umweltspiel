import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2()
    {   
        super(800, 500, 1); 
        this.showText("Welches Obst verbraucht am meisten Wasser?", 400, 50);
        this.showText("Tippe auf die Objekte für Tipps", 400, 80);
        this.addObject( new Tipp1(),150,250);
        this.addObject( new Tipp2(),350,300);
        this.addObject( new Answer1(),150,400);
        this.addObject( new Answer2(),400,400);
        this.addObject( new Answer3(), 700,400);
    }
}
