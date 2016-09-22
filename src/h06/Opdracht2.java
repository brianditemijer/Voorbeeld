package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Brian on 22-9-2016.
 */
public class Opdracht2 extends Applet {

    int seconden;
    int uur;
    int dag;
    int jaar;

    @Override
    public void init() {
        super.init();
        seconden = 60 * 60;
        uur = 3600 * 24;
        dag = 86400 * 365;
        jaar = 31536000;
    }

    @Override
    public void paint(Graphics g) {
    super.paint(g);
    g.drawString("60x60 seconden =" + seconden, 50, 50);
    g.drawString("en dat is 1 uur", 205, 50);

    g.drawString("3600 Sec * 24 uur =" + uur, 50, 70);
    g.drawString("en dat is 1 dag", 225, 70);

    g.drawString("86400 Sec * 365 dagen=" + dag, 50, 90);
    g.drawString("en dat is 1 jaar", 260, 90);



    }













}
