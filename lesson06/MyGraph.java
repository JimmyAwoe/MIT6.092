import java.awt.*;

public class MyGraph implements Sprite{
   private int height;
   private int width;
   private Color color;

   public MyGraph(int height, int width, Color color){
        this.height = height;
        this.width = width;
        this.color = color;
   }

   public void draw(Graphics surface, int x, int y){
       surface.setColor(color);
       surface.fillOval(x, y, width, height);
       surface.setColor(Color.BLACK);
       ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
       surface.drawOval(x, y, width, height);
   }

   public int getHeight(){return this.height;}
   public int getWidth(){return this.width;}

}
