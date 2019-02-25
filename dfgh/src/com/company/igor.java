package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class igor {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(2000, 1000);
        frame.setLayout(null);





        JLabel label = new JLabel();
        label.setSize(50, 50);
        label.setLocation(200, 200);
        label.setText("edsfe");
        label.setOpaque(true);


        label.setBackground(Color.WHITE);

        Color color = new Color(219, 219, 100);

        label.setOpaque(true);
        label.setBackground(color);



        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("********************");
            }
        });



        JTextArea area = new JTextArea();



        area.setSize(100, 100);
        area.setLocation(200, 200);
        area.setText("edsfe");

        frame.add(label);

        frame.add(area);



    }

    public static void createButton() {
        JLabel label = new JLabel();
        label.setSize(50, 50);
        label.setLocation(200, 200);
        label.setText("edsfe");
        label.setOpaque(true);
    }


    static void saveFile(String content, String filename) {

    }
}
