package com.company.temp;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class Main {

    public static void main(String[] args) {



        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);


        ArrayList<Color> colors = new ArrayList<>();

        colors.add(Color.orange);
        colors.add(Color.blue);

        int i = 0;



        JPanel container = new JPanel();
        container.setBackground(Color.GREEN);
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        frame.add(container);

        while (i < colors.size()) {
            JPanel panel = new JPanel();
            panel.setBackground(colors.get(i));
            container.add(panel);

            i = i + 1;
        }

//        JPanel panel = new JPanel();
//        panel.setBackground(Color.white);
//        container.add(panel);
//
//        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.blue);
//        container.add(panel2);
//
//        JPanel panel3 = new JPanel();
//        panel3.setBackground(Color.red);
//        container.add(panel3);









//        JPanel container = new JPanel();
//        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
//        container.setBackground(Color.GREEN);
//        frame.add(container);
//
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.WHITE);
//        container.add(panel);
//
//        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.BLUE);
//        container.add(panel2);
//
//        JPanel panel3 = new JPanel();
//        panel3.setBackground(Color.RED);
//        container.add(panel3);
//




//        JScrollPane scrPane = new JScrollPane(container);
//        frame.add(scrPane);


//        JPanel panel = new JPanel();
//        panel.setBackground(Color.BLUE);
//        panel.setPreferredSize(new Dimension(100, 100));
//        frame.add(panel, BorderLayout.LINE_END);
//
//        JPanel panel2 = new JPanel();
//        frame.add(panel2);


//        JButton button1 = new JButton();
//        button1.setText("1");
//        button1.setPreferredSize(new Dimension(100, 200));
//
//
//        panel.add(button1);


    }
}

//
//
//
//    JPanel container = new JPanel();
////        JScrollPane scrPane = new JScrollPane(container);
////        frame.add(scrPane);
//        frame.add(container);
//
//                container.setBackground(Color.GREEN);
//                container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
//
//                JPanel panel = new JPanel();
////        panel.setPreferredSize(new Dimension(100, 200));
//                panel.setBackground(Color.WHITE);
//                container.add(panel);
//
//                JPanel panel2 = new JPanel();
////        panel2.setPreferredSize(new Dimension(100, 200));
//                container.add(panel2);
//                panel.setLayout(new FlowLayout(FlowLayout.RIGHT));



//        ArrayList<Color> colors = new ArrayList<>();
//        colors.add(Color.orange);
//        colors.add(Color.white);
//        colors.add(Color.orange);
//        colors.add(Color.green);
//        colors.add(Color.green);
//        colors.add(Color.green);
//        colors.add(Color.green);
//        colors.add(Color.green);
//        colors.add(Color.green);
//        colors.add(Color.green);
//
//        int i = 0;
//
//        while (i < colors.size()) {
//            Color color = colors.get(i);
//            JPanel panel = new JPanel();
//            panel.setBackground(color);
//            container.add(panel);
//            i = i + 1;
//        }




















//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setSize(400, 400);
//
//
//        JPanel container = new JPanel();
//        container.setBackground(Color.GREEN);
//        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
//        frame.add(container);
//
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
//        panel.setBackground(Color.WHITE);
//        container.add(panel);
//
//        JPanel panel2 = new JPanel();
//        panel2.setBackground(Color.BLUE);
//        container.add(panel2);
//
//
//        JLabel button = new JLabel();
//        button.setText("dsvef");
//        panel.add(button);