package h11;

import java.applet.Applet;
import java.awt.*;


public class Opdracht7 extends Applet {


    public void paint (Graphics g)
    {
        int i = 0;
        int x = 500;
        int y = 250;
        int width = 20;
        int height = 20;
        while (i < 51)
        {

            g.drawOval(x, y, width, height);
            width += 10;
            x -= 5;
            y -= 5;
            height += 10;
            i++;
        }
    }
}
