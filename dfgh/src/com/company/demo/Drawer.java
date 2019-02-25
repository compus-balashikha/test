package com.company.demo;

import javax.swing.*;
import java.awt.*;

public class Drawer extends JComponent {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawLine(100, 100, 200, 200);
    }
}
