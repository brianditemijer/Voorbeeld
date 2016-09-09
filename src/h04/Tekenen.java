package h04;

/**
 * Created by Brian on 9-9-2016.
 */
//4.1 Teken een gelijkebenige driehoek
// de eerste ijn cordinaten en de 2e zijn waar het eindigt
// eerst x-y-x-y

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(20, 20, 80, 120);
        g.drawLine(140, 20, 80, 120);
        g.drawLine(140, 20, 20, 20);
    }

}