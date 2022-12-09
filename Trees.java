import java.awt.*;
import java.applet.*;

public class Trees {

    public static void drawSmallTrees(Graphics g){
        g.setColor(new Color(150,100,15));
        g.fillRect(500,350,50,200);

        g.setColor(new Color(37, 150, 63));
        g.fillOval(425,195,100,150);

        g.setColor(new Color(37, 150, 63));
        g.fillOval(775,350,100,150);

        g.setColor(new Color(150,100,15));
        g.fillRect(150,350,50,200);

    }
    public static void drawBigTrees(Graphics g){
        g.setColor(new Color(150,100,15));
        g.fillRect(700,350,50,200);

        g.setColor(new Color(37, 150, 63));
        g.fillOval(625,195,150,210);

        g.setColor(new Color(37, 150, 63));
        g.fillOval(75,195,150,210);

        g.setColor(new Color(150,100,15));
        g.fillRect(150,350,50,200);
    }
}
