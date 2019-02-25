package com.company.circel;

import javax.swing.*;
import java.awt.*;

public class Circle extends JComponent {

    int radius;

    Circle(int radius) {
        this.radius = radius;
        this.setSize(2 * radius, 2 * radius);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(0, 0, 2 * radius, 2 * radius);
    }

    @Override
    public void setSize(int width, int height) {
        if (width > height) {
            height = width;
        } else {
            width = height;
        }

        radius = width / 2;

        super.setSize(width, height);
    }
}
