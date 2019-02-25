package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {

    static JLabel lastLabel;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);



//        lastLabel = createLabel();




        int x = 100;
        int y = 100;
        int counter = 1;

        JTextField textField = new JTextField();
        textField.setSize(300, 100);
        textField.setLocation(100, 0);

        while (counter < 10) {
            JButton button = new JButton();
            button.setSize(100, 100);
            button.setLocation(x, y);
            button.setText("" + counter);
            frame.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText("Красавчик!");
                }
            });

            x = x + 100;

            if (counter % 3 == 0) {
                x = 100;
                y = y + 100;
            }
            counter = counter + 1;

        }


        frame.add(textField);


    }

}
