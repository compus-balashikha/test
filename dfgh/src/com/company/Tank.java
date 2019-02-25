package com.company;

import javax.swing.*;
import java.awt.*;

public class Tank extends JComponent {

    @Override
    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
    }
}
