package com.company;

import javax.swing.*;
import java.awt.*;

public class Tank2 extends JComponent {

    public static void main(String[] args) {
        tes t = new tes();
        System.out.println(t.a());
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
    }




    Tank2() {

    }


}
