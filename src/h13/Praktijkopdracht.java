package h13;

import java.applet.*;
import java.awt.*;

/**
 * Created by Brian on 1-1-2017.
 */

public class Praktijkopdracht extends Applet
{
    public void init()
    {
        setSize(100,100);
    }
    public void paint(Graphics g)
    {
        for(int teller=0; teller <5; teller++)
        {
            for(int teller1=0; teller1<2; teller1++)
            {
                tekenboom(g, teller *  + 20 *(teller1%2),(teller1+5)*40);
            }
        }
    }
    void tekenboom(Graphics g,int x,int y)
    {
        g.setColor(new Color(51,25,0));
        g.fillRect(x, y, 20, 40);
        g.setColor(Color.green);
        g.fillOval(x-20, y-30, 60, 40);
    }
}