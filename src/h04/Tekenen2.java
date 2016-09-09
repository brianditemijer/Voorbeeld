package h04;

/**
 * Created by Brian on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 20, 20, 50);
        g.drawLine(50, 20, 80, 50);
        g.drawLine(20, 50, 20, 100);
        g.drawLine(20, 100, 80, 100);
        g.drawLine(80, 50, 80, 100);
        g.drawLine(60, 100, 60, 80);
        g.drawLine(60, 80, 75, 80);
        g.drawLine(75, 80, 75, 100);
        g.drawLine(40, 65, 40, 50);
        g.drawLine(60, 80, 60, 80);
        g.drawLine(40, 65, 55, 65);
        g.drawLine(55, 65, 55, 50);
        g.drawLine(40, 50, 55, 50);
    }

}