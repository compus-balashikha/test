package com.company.circel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    static JButton addButton = new JButton();
    static JFrame frame = new JFrame();
    static JTextField textField = new JTextField();
    static JLabel selectedLabel;

    public static void main(String[] args) {

        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setLocation(100, 100);
        label.setSize(200, 50);
        frame.add(label);


        addButton = new JButton();
        addButton.setLocation(100, 200);
        addButton.setSize(200, 50);
        addButton.setText("Add");
        frame.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addClicked();
            }
        });

        JButton save = new JButton();
        save.setLocation(400, 600);
        save.setSize(200, 50);
        save.setText("Save");
        frame.add(save);


        textField.setLocation(400, 100);
        textField.setSize(400, 500);
        frame.add(textField);

        frame.repaint();


    }

    public static void addClicked() {
        createNewLabel();
        moveAddButton();
    }

    public static void moveAddButton() {
        int x = addButton.getX();
        int y = addButton.getY();

        addButton.setLocation(x, y + 100);
    }

    public static void createNewLabel() {
        int x = addButton.getX();
        int y = addButton.getY();

        createLabel(x, y);
    }

    public static void createLabel(int x, int y) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        label.setLocation(x, y);
        label.setText("fd");
        label.setSize(200, 50);
        frame.add(label);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                labelClicked(label);
            }
        });
    }

    public static void labelClicked(JLabel label) {

        label.setBackground(Color.YELLOW);
        textField.setText(label.getText());
    }

}
