package h04;

/**
 * Created by Brian on 10-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Tekenen8 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(20, 20, 220, 20);
        g.drawString("Lijn", 110, 35 );
        g.drawRect(20, 50, 220, 60);
        g.drawString("Rechthoek", 20, 130);
        g.drawRoundRect(20, 145, 220, 60, 20, 20);
        g.drawString("Afgeronde rechhoek", 20, 220);
        g.setColor(Color.magenta);
        g.fillRect(250, 50, 250, 60);
        g.setColor(Color.black);
        g.drawOval(250, 50, 250, 60);
        g.drawString("Gevulde rechthoek met ovaal", 250, 120);
        g.setColor(Color.magenta);
        g.fillOval(250, 145, 250, 60);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 250, 220);
        g.drawOval(510, 50, 110, 60);
        g.setColor(Color.magenta);
        g.fillArc(510, 50, 110, 60, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 510, 120);
        g.drawArc(20, 225, 70, 60, 0, 360);
        g.drawString("Cirkel", 20, 300);
    }
}
