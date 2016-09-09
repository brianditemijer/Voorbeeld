package h04;

/**
 * Created by Brian on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(40, 40, 160, 200, 0, 360);
       

    }
}