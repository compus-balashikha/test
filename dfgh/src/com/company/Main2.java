package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main2 extends JPanel {
    @Override
    public void paint(Graphics g) {
        Random random = new Random();
        int width = getSize().width;
        int height = getSize().height;

        drawCity(g, 50, 0, 200, width, height);

    }

    public static void main(String[] args) {

        String text = "8";
        if (text.length() == 0){
            JOptionPane.showMessageDialog(null, "if");
        }
        else{
            JOptionPane.showMessageDialog(null, "else");

        }




    }

    public static void drawSquare(Graphics g, int x, int y, int l) {
        g.drawLine(x, y, x + l, y);
        g.drawLine(x + l, y, x + l, y + l);
        g.drawLine(x, y + l, x + l, y + l);
        g.drawLine(x, y, x, y + l);
    }

    public static void drawHouse(Graphics g, int l, int x, int y) {
        drawSquare(g, x, y, l);
        g.drawLine(x, y, x + (l / 2), y - (l / 2));
        g.drawLine(x + l, y, x + (l / 2), y - (l / 2));

    }

    public static void drawCity(Graphics g, int l, int x, int y, int width, int height) {
        int per = 1;
        while (y <= height) {
            while (x <= width) {
                Random random = new Random();
                int i = random.nextInt(5) + 2;
                System.out.println(per);
                System.out.println(i);
                if (per % i != 0) {
                    drawHouse(g, l, x, y);
                }
                x = x + l + 100;
                per++;
            }
            y = y + 150 + l;
            x = 0;
        }

    }


    public static boolean shouldDrawHouse(int per, int i) {
        return per % i != 0;
    }
}