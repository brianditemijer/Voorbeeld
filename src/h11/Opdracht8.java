package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht8 extends Applet
{
    public void paint (Graphics g)
    {
        int i = 0;
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 10;
        while (i < 101)
        {

            g.drawOval(x, y, width, height);
            x += 0;
            y += 0;
            width += 10;
            height += 10;
            i++;


        }
    }
}