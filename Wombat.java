import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        //  moveRandomly();
        moveAtScreenEdge();
    }    

    public void move() {
        move(1);
    }

    public void turnLeft() {
        turn(-90);
    }

    public void moveRandomly() {
        int randomNumber = Greenfoot.getRandomNumber(30);
        if (randomNumber == 3) {
            turnLeft();
        }
        move();
    }

    public void moveAtScreenEdge() {
        if (getX() == 20 || getX() == getWorld().getWidth() - 20 || getY() == 20 || getY() ==  getWorld().getHeight() - 20) {
            move(-1);
            turnLeft();
        }
        move();
    }
}
