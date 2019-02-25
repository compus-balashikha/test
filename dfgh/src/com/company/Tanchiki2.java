package com.company;

import javax.swing.*;

public class Tanchiki2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);

        Tank2 tank = new Tank2();
        tank.setSize(100, 100);
        tank.setLocation(100, 100);
        frame.add(tank);
    }
}
