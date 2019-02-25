package com.company.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Memorino {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(830, 850);
        frame.setLayout(null);

        ImageIcon backIconNotResized = new ImageIcon("back.png");
        ImageIcon backIcon = resizeIcon(backIconNotResized, 150, 150);

        ArrayList<JButton> buttons = new ArrayList<>();
        ArrayList<ImageIcon> images = new ArrayList<>();

        images.add(resizeIcon(new ImageIcon("1.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("1.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("2.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("2.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("3.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("3.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("4.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("4.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("5.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("5.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("6.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("6.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("7.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("7.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("8.png"), 150, 150));
        images.add(resizeIcon(new ImageIcon("8.png"), 150, 150));

        Collections.shuffle(images);


        ArrayList<Integer> pressed = new ArrayList<>();
        int k = 0;
        while (k < 16) {
            pressed.add(0);
            k = k + 1;
        }

        int x = 0;
        int y = 0;
        int i = 0;

        while (i < 16) {
            if (i == 4 || i == 8 || i == 12) {
                y = y + 210;
                x = 0;
            }

            JButton button = new JButton();
            button.setSize(200, 200);
            button.setLocation(x, y);
            button.setIcon(backIcon);
            frame.add(button);
            buttons.add(button);

            int finalI = i;

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ImageIcon icon = images.get(finalI); // находим картинку для нажатой кнопки в списке

                    JButton pressedButton = buttons.get(finalI); // находим нажатую кнопку
                    pressedButton.setIcon(icon); // отображаем картинку на кнопке

                    pressed.set(finalI, 1);

                    int i = 0;
                    int sum = 0;
                    while (i < pressed.size()) {
                        sum = sum + pressed.get(i);
                        i = i + 1;
                    }

                    i = 0;

                    if (sum > 2) {
                        while (i < buttons.size()) {
                            JButton button = buttons.get(i);
                            button.setIcon(backIcon);
                            pressed.set(i, 0);
                            i = i + 1;
                        }
                    }
                }
            });

            x = x + 210;
            i = i + 1;
        }

        frame.repaint();
    }

    public static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(resizedImage);
        imageIcon.setDescription(icon.getDescription());
        return imageIcon;
    }

}
