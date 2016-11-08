package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Brian on 26-9-2016.
 */
public class Opdracht2 extends Applet{

    Button knop;
    String schermtekst;


    public void init() {

        knop = new Button();
        knop.setLabel("Doet deze het wel");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

    }

    public void paint(Graphics g) {

        g.drawString(schermtekst, 50,60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            schermtekst = "ja deze doet het";
            repaint();
        }
    }

}

