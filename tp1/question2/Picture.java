package question2;

import question1.Circle;
import question1.Square;
import question1.Triangle;

/**
 * This class represents a simple picture. You can draw the picture using the
 * draw method. But wait, there's more: being an electronic picture, it can be
 * changed. You can set it to black-and-white display and back to colors (only
 * after it's been drawn, of course).
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun, blue_sun;
    private int yPosition;
    private boolean terrefixe = false; //Valeur par default
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
         blue_sun = new Circle();
        blue_sun.changeColor("blue");
        blue_sun.moveHorizontal(10);
        blue_sun.moveVertical(-10);
        blue_sun.changeSize(60);
        blue_sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }
    /**
     * Change the status of the earth
     */
    public void setEarth(boolean earth_status){
        this.terrefixe = earth_status;
        if (earth_status == false){
        System.out.println("The earth now isn't fixed");
        }else{
            System.out.println("The earth is now fixed");
        }
    }
    /**
     * Change this picture to use color display
     */
    public void setColor() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    public void sunset(int distance) {
        if (this.terrefixe == true){
            blue_sun.slowMoveVertical(distance);
            System.out.println("The blue sun was slowly moved vertically");
    }else {
        System.out.println("The earth isn't fixed, you can't move the blue sun");
    }

}
}
