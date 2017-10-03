import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author Robby Tan
 * @version 1.0
 */
public class Wombat extends Actor
{
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        detectInput();
    }    

    public void move() {
        move(1);
    }

    public void turnLeft() {
        turn(-90);
    }

    public void detectInput() {
        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        } else if (Greenfoot.isKeyDown("up")) {
            move(1);
        } else if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        } else if (Greenfoot.isKeyDown("down")) {
            move(-1);
        } else if (Greenfoot.isKeyDown("space")) {
            move(10);
        }
    }
}
