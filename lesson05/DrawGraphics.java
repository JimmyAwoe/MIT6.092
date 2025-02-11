import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> box = new ArrayList<BouncingBox>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        for(int i = 0; i < 3; i++){
            box.add(new BouncingBox(200, 50 * i, Color.RED));
        }
        box.get(0).setMovementVector(1, 0);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawRect(50, 50, 100, 100);
        surface.drawRoundRect(100, 100, 50, 50, 15, 15);
        surface.drawOval(150, 150, 20, 20);
        for(BouncingBox b: box){
            b.draw(surface);
        }
        // box.draw(surface);
    }
} 