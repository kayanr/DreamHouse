package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window1;
    private Triangle roof;
    private Circle sun;
    private Triangle tree1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Square window6;
    private Square door1;
    private Square door2;
    private Circle pool;
    private Triangle doorStep1;
    private Square grounds;
    private Triangle tree2;
    private Triangle tree3;
    private Triangle tree4;
    private Triangle tree5;
    private Triangle tree6;
    private Triangle tree7;
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
        grounds = new Square();
        grounds.changeColor("yellow");
        grounds.moveVertical(180);
        grounds.moveHorizontal(5);
        grounds.changeSize(500);
        grounds.changeColor("green");
        grounds.makeVisible();

        doorStep1 = new Triangle();
        doorStep1.changeSize(20, 120);
        doorStep1.moveHorizontal(150);
        doorStep1.moveVertical(295);
        //doorStep1.changeColor("white");
        doorStep1.makeVisible();



        wall = new Square();
        wall.moveVertical(80);
        wall.moveHorizontal(45);
        wall.changeSize(190);

        wall.makeVisible();

        window1 = new Square();
        window1.changeColor("yellow");
        window1.moveHorizontal(60);
        window1.moveVertical(100);
        window1.makeVisible();

        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveHorizontal(100);
        window2.moveVertical(100);
        window2.makeVisible();

        window3 = new Square();
        window3.changeColor("yellow");
        window3.moveHorizontal(150);
        window3.moveVertical(100);
        window3.makeVisible();

        window4 = new Square();
        window4.changeColor("yellow");
        window4.moveHorizontal(60);
        window4.moveVertical(210);
        window4.makeVisible();

        window5 = new Square();
        window5.changeColor("yellow");
        window5.moveHorizontal(190);
        window5.moveVertical(210);
        window5.makeVisible();

        window6 = new Square();
        window6.changeColor("yellow");
        window6.moveHorizontal(190);
        window6.moveVertical(100);
        window6.makeVisible();

        door1 = new Square();
        door1.changeColor("black");
        door1.moveHorizontal(120);
        door1.moveVertical(200);
        door1.makeVisible();

        door2 = new Square();
        door2.changeColor("black");
        door2.moveHorizontal(120);
        door2.moveVertical(230);
        door2.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 280);
        roof.moveHorizontal(150);
        roof.moveVertical(80);
        roof.makeVisible();


        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(280);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();

        pool = new Circle();
        pool.changeColor("blue");
        pool.moveHorizontal(120);
        pool.moveVertical(300);
        pool.changeSize(450);
        pool.makeVisible();

        tree1 = new Triangle();
        tree1.changeSize(50, 20);
        tree1.moveHorizontal(300);
        tree1.moveVertical(100);
        tree1.makeVisible();

        tree2 = new Triangle();
        tree2.changeSize(50, 20);
        tree2.moveHorizontal(320);
        tree2.moveVertical(100);
        tree2.makeVisible();

        tree3 = new Triangle();
        tree3.changeSize(50, 20);
        tree3.moveHorizontal(340);
        tree3.moveVertical(100);
        tree3.makeVisible();

        tree4 = new Triangle();
        tree4.changeSize(50, 20);
        tree4.moveHorizontal(340);
        tree4.moveVertical(160);
        tree4.makeVisible();

        tree5 = new Triangle();
        tree5.changeSize(50, 20);
        tree5.moveHorizontal(300);
        tree5.moveVertical(160);
        tree5.makeVisible();

        tree6 = new Triangle();
        tree6.changeSize(50, 20);
        tree6.moveHorizontal(320);
        tree6.moveVertical(160);
        tree6.makeVisible();

        tree7 = new Triangle();
        tree7.changeSize(50, 20);
        tree7.moveHorizontal(340);
        tree7.moveVertical(160);
        tree7.makeVisible();

        doorStep1 = new Triangle();
        doorStep1.changeSize(20, 120);
        doorStep1.moveHorizontal(145);
        doorStep1.moveVertical(290);
        doorStep1.changeColor("black");
        doorStep1.makeVisible();



    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            window2.changeColor("white");
            window2.changeColor("white");
            window4.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("magenta");
            window1.changeColor("black");
            window2.changeColor("black");
            window3.changeColor("black");
            window4.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            doorStep1.changeColor("white");
            grounds.changeColor("yellow");
        }
    }

}
