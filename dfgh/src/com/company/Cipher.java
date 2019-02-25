package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cipher {

    public static void main(String[] args) {
        JFrame frame = createFrame();
        JTextField field1 = createTextField(0, 0, 100, 100);
        JTextField field2 = createTextField(200,0, 100, 100);
        JButton buttonEncode = createButton(0, 200, 100, 100, "Encode");
        JButton buttonDecode = createButton(200,200,100,100, "Decode");

        int i = 1;

        while (i < 10) {
            System.out.println(i);
            i = i + 1;
        }

        frame.add(field1);
        frame.add(field2);
        frame.add(buttonEncode);
        frame.add(buttonDecode);

        buttonEncode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                encodeClicked(field1, field2);
            }
        });

        buttonDecode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decodeClicked(field2, field1);
            }
        });



    }

    public static JFrame createFrame() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        return frame;
    }

    public static JTextField createTextField(int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setSize(width, height);
        textField.setLocation(x, y);
        return textField;
    }

    public static JButton createButton(int x, int y, int width, int height, String text) {
        JButton button = new JButton();
        button.setText(text);
        button.setSize(width, height);
        button.setLocation(x, y);

        return button;
    }

    public static String encode(String text) {
        String result = text.replace("a","0").replace("b", "1").replace("c", "2")
                .replace("d", "3").replace("f", "4");

        return result;
    }

    public static String decode(String string) {
        String result = string.replace("0","a").replace("1", "b").replace("2", "c")
                .replace("3", "d").replace("4", "f");
        return result;
    }

    public static void encodeClicked(JTextField field1, JTextField field2) {
        String text = field1.getText();
        String encoded = encode(text);
        field2.setText(encoded);
    }

    public static void decodeClicked(JTextField field2, JTextField field1) {
        String text1 = field2.getText();
        String decoded = decode (text1);
        field1.setText(decoded);

    }
}