package h04;

/**
 * Created by Brian on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillArc(40, 40, 100, 100, 0, 360);
        g.fillRect(40, 90, 100, 140);
        g.fillArc(40, 180, 100, 100, 0, -360);
        g.setColor(Color.red);
        g.fillArc(65, 70, 50, 50, 0, 180);
        g.fillArc(65, 70, 50, 50, 0, -180);
        g.setColor(Color.orange);
        g.fillArc(65, 130, 50, 50, 0, 180);
        g.fillArc(65, 130, 50, 50, 0, -180);
        g.setColor(Color.green);
        g.fillArc(65, 190, 50, 50, 0, 180);
        g.fillArc(65, 190, 50, 50, 0, -180);



    }
}