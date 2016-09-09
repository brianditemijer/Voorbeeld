package h03;

/**
 * Created by Brian on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.fillRect(100, 30, 600, 100);
        g.setColor(Color.white);
        g.fillRect(100, 130, 600, 100);
        g.setColor(Color.blue);
        g.fillRect(100, 230, 600, 100);
        g.setColor(Color.lightGray);
        g.fillRect(100, 30, 100, 600);

    }
}