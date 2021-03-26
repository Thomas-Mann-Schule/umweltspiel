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
        super(640, 430, 1); 
        this.showText("In welchem Bereich wird am meisten Müll produziert?", 300, 50);
        this.showText("Tippe auf die Objekte für Tipps", 300, 80);
        this.addObject( new Tipp1(),150,250);
        this.addObject( new Tipp2(),350,300);
        this.addObject( new Answer1(),60,380);
        this.addObject( new Answer2(),320,380);
        this.addObject( new Answer3(), 600,380);
    }
}
