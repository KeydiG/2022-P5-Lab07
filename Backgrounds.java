import java.awt.*;
import java.applet.*;
public class Backgrounds {
    public static void drawSky(Graphics g){
        g.setColor(new Color(76, 116, 243));
        g.fillRect(0,0,1000,325);

    }
    public static void drawGround(Graphics g){
        g.setColor(new Color(100,200,130));
        g.fillRect(0,325,1000,650);

    }
    public static void drawClouds(Graphics g){
        g.setColor(new Color(255, 255, 255));
        g.fillOval(350,50,100,50);
        g.setColor(new Color(255, 255, 255));
        g.fillOval(900,75,100,50);

    }
    public static void drawSun(Graphics g){
        g.setColor(new Color(255, 248, 40, 224));
        g.fillOval(25,25,100,100);

    }

}
