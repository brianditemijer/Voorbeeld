package h04;

/**
 * Created by Brian on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.lightGray);
        g.drawLine(30, 20, 30, 260);
        g.drawLine(30, 260, 230, 260);
        g.drawLine(25, 220, 35, 220);
        g.drawLine(25, 180, 35, 180);
        g.drawLine(25, 140, 35, 140);
        g.drawLine(25, 100, 35, 100);
        g.drawLine(25, 60, 35, 60);
        g.drawLine(25, 20, 35, 20);
        g.drawString("20", 3, 225);
        g.drawString("40", 3, 185);
        g.drawString("60", 3, 145);
        g.drawString("80", 3, 105);
        g.drawString("100", 3, 65);
        g.drawString("120", 3, 25);
        g.drawLine(80, 265, 80, 255);
        g.drawLine(130, 265, 130, 255);
        g.drawLine(180, 265, 180, 255);
        g.drawString("Brian", 60, 280);
        g.drawString("Jeremy", 110, 280);
        g.drawString("Ruben", 165, 280);
        g.setColor(Color.BLUE);
        g.fillRect(70, 180, 20, 80);
        g.setColor(Color.YELLOW);
        g.fillRect(120, 60, 20, 200);
        g.setColor(Color.PINK);
        g.fillRect(170, 100, 20, 160);

    }
}