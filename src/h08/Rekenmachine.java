package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.security.PublicKey;

/**
 * Created by Brian on 28-9-2016.
 */
public class Rekenmachine extends Applet {

    TextField vak1;
    TextField vak2;
    Button keerKnop;
    Button deelKnop;
    Button minKnop;
    Button plusKnop;

    double getal1;
    double getal2;
    double uitkomst;

    @Override
    public void init() {
        super.init();

        vak1 = new TextField("", 5);
        add(vak1);

        vak2 = new TextField("", 5);
        add(vak2);

        keerKnop = new Button("X");
        add(keerKnop);
        keerKnopListener kkl = new keerKnopListener();
        keerKnop.addActionListener(kkl);

        deelKnop = new Button("/");
        add(deelKnop);
        deelKnopListener dkl = new deelKnopListener();
        deelKnop.addActionListener(dkl);

        minKnop = new Button("-");
        add(minKnop);
        minKnopListener mkl = new minKnopListener();
        minKnop.addActionListener(mkl);

        plusKnop = new Button("+");
        add(plusKnop);
        plusKnopListener pkl = new plusKnopListener();
        plusKnop.addActionListener(pkl);


    }

    class keerKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 * getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }


    class deelKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 / getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }

    class minKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 - getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }

    class plusKnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 + getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }
}