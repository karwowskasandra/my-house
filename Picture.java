/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square garden;
    private Circle sun;
    private Circle moon;
    private Person persona;
    private Person muñeco;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        
        garden = new Square();
        garden.makeVisible();
        garden.changeColor("green");
        garden.moveVertical(140);
        garden.moveHorizontal(-320);
        garden.changeSize(2300);
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(320);
        
        
        moon = new Circle();
        moon.makeVisible();
        moon.changeColor("magenta");
        moon.changeSize(40);
        moon.moveHorizontal(-150);
        
        
    }
    
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Draw this picture.
     */
    public void amanecer()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        
        garden = new Square();
        garden.makeVisible();
        garden.changeColor("green");
        garden.moveVertical(140);
        garden.moveHorizontal(-320);
        garden.changeSize(2300);
        
        
        moon.makeInvisible();
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.changeSize(80);
        sun.makeVisible();
        sun.moveVertical(210);
        sun.slowMoveVertical(-270);
        
        
        persona = new Person();
        persona.makeVisible();
        persona.moveHorizontal(200);
        persona.slowMoveHorizontal(-170);
        muñeco = new Person();
        muñeco.makeVisible();
        muñeco.moveHorizontal(-230);
        muñeco.slowMoveHorizontal(100);
        
        
        
    }
}
