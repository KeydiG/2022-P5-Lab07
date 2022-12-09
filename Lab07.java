import java.awt.*;
import java.applet.*;

public class Lab07 extends Applet {

    public void paint(Graphics g){
        g.drawRect(0,0,1000,650);

        Backgrounds.drawSky(g);
        Backgrounds.drawGround(g);
        Backgrounds.drawClouds(g);
        Backgrounds.drawSun(g);

        Trees.drawSmallTrees(g);
        Trees.drawBigTrees(g);

        Flower.drawPetals(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
    }

}