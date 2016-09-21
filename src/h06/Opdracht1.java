package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Brian on 21-9-2016.
 */
public class Opdracht1 extends Applet{

    double a, b, uitkomst;



    public void init() {

        a = 113;
        b = 4;
        uitkomst = (double) 113 / 4;
    }

    public void paint(Graphics g) {
        g.drawString("Iedereen krijgt" + uitkomst, 80, 80);
    }


}
