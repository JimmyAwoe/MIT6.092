import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Bouncer> box = new ArrayList<Bouncer>();
    ArrayList<StraightMover> movebox = new ArrayList<StraightMover>();
    Rectangle moverec;
    MyGraph movemygraph;
    Rectangle rec;
    MyGraph mygraph;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        rec = new Rectangle(8, 2, Color.BLUE);
        mygraph = new MyGraph(7, 7, Color.RED);
        moverec = new Rectangle(6, 6, Color.BLACK);
        movemygraph = new MyGraph(3, 3, Color.GRAY);
        movebox.add(new StraightMover(170, 20, moverec));
        movebox.add(new StraightMover(230, 10, movemygraph));
        box.add(new Bouncer(200, 50, rec));
        box.add(new Bouncer(100,100, mygraph));
        box.get(0).setMovementVector(1, 0);
        box.get(1).setMovementVector(0,1);
        movebox.get(0).setMovementVector(1, 0);
        movebox.get(1).setMovementVector(0,1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(50, 50, 100, 100);
        surface.drawRoundRect(100, 100, 50, 50, 15, 15);
        surface.drawOval(150, 150, 20, 20);
        for(Bouncer b: box){
            b.draw(surface);
        }
        for(StraightMover s: movebox){
            s.draw(surface);
        }
        // box.draw(surface);
    }
} 