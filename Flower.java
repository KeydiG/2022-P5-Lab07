import java.awt.*;
import java.applet.*;

public class Flower {

    public static void drawPetals(Graphics g){
        g.setColor(new Color(255, 248, 40, 224));
        g.fillOval(100,225,50,50);
        g.setColor(new Color(200,100,100));
        g.fillOval(100,225,100,100);
    }
    public static void drawStem(Graphics g){
        g.setColor(new Color(32, 126, 49));
        g.fillRect(150,225,25,100);

    }

    public static void drawLeaves(Graphics g){
        g.setColor(new Color(32,126,49));
        g.fillOval(75,225,50,100);
    }
}