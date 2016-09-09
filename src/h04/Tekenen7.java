package h04;

/**
 * Created by Brian on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(120, 120, 500, 120);
        g.drawLine(120, 120, 120, 480);
        g.drawLine(120, 480, 500, 480);
        g.drawLine(500, 480, 500, 120);
        g.fillArc(135, 135, 135, 130, 0, 360);
        g.fillArc(335, 135, 135, 130, 0, 360);
        g.fillArc(135, 335, 135, 130, 0, 360);
        g.fillArc(335, 335, 135, 130, 0, 360);

    }
}