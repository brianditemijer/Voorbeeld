package h11;


import java.applet.Applet;
import java.awt.Graphics;


public class Opdracht2 extends Applet{
    public void paint(Graphics g)
    {
        int i = 10;
        int x = 50;
        int y = 70;
        while (i < 21)
        {
            g.drawString(""+i, x, y);
            y += 20;
            i++;
        }
    }
}