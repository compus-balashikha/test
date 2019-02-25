package com.company;

import javax.swing.*;
import java.awt.*;

public class Main354 extends JComponent {

    @Override
    public void paint(Graphics g) {

    }

    public static void main(String[] args) {

        int a = 1;

        while (a <= 10) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a = a + 1;
        }
    }
}
