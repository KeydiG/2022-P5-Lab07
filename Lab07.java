import java.awt.*;
import java.applet.*;
public class Lab07 {
    public void paint(Graphics g){
        Background.drawSky(g);
        Background.drawGround(g);
        Background.drawClouds(g);

        Mountains.drawSmallMountains(g);
        Mountains.drawBigMountains(g);

        Flowers.drawPetals(g);
        Flowers.drawStem(g);
        Flowers.drawLeaves(g);
    }

}
