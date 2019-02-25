package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Tanchikit {



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(null);


        JButton button = new JButton();
        button.setText("fsd");
        button.setSize(100, 100);
        button.setLocation(100, 100);

        frame.add(button);

        Tank tank = new Tank();
        tank.setSize(100, 100);
        tank.setLocation(300, 300);
        frame.add(tank);

        Tank tank1 = new Tank();
        tank1.setSize(100, 100);
        tank1.setLocation(300, 300);
        frame.add(tank1);



        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x = button.getX();
                int y = button.getY();
                button.setLocation(x + 5, y);

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                        x = button.getX();
                        button.setLocation(x - 5, y);
                        frame.repaint();
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    button.setLocation(x, y + 5);
                } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    Timer timer = new Timer(20, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            tank1.setLocation(tank1.getX() + 1, tank1.getY());
                        }
                    });
                    timer.start();
                }

            }
        });

    }
}