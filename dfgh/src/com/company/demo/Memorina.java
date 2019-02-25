package com.company.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Memorina {

    static ImageIcon backIcon = new ImageIcon("back.png");
    static JFrame frame = new JFrame();

    public static void main(String[] args) {


        frame.setVisible(true);
        frame.setSize(830, 850);
        frame.setLayout(null);

        ArrayList<Element> elements = new ArrayList<>();

        int i = 0;
        int x = 0;
        int y = 0;

        while (i < 16) {
            Element element = new Element();
            ImageIcon imageIcon = new ImageIcon(i / 2 + 1 + ".png");
            element.type = i / 2 + 1;
            element.icon = imageIcon;

            element.pressed = 0;


            if (i % 4 == 0 && i != 0) {
                y = y + 210;
                x = 0;
            }
            JButton button = new JButton();
            button.setSize(200, 200);
            button.setLocation(x, y);
            frame.add(button);
//            ImageIcon icon = new ImageIcon("1.png"); // создаем картинку
//            icon = resizeIcon(icon, 100, 100); // меняем размер
//            button.setIcon(icon);                             // отображаем картинку на кнопке
            button.setIcon(resizeIcon(backIcon, 150, 150));

            element.button = button;
            int index = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setIcon(resizeIcon(elements.get(index).icon, 150, 150));

                    int pressed = elements.get(index).pressed;
                    if (pressed == 1) {
                        elements.get(index).pressed = 0;
                        hide(element, index);
                    } else {
                        deleteIfNeeded(elements);
                        hideIfNeeded(elements);
                        show(element, index);
                        elements.get(index).pressed = 1;
                    }

                }
            });
            x = x + 210;


            elements.add(element);

            i = i + 1;
        }

    }

    public static void deleteIfNeeded(ArrayList<Element> elements) {
        ArrayList<Element> selected = new ArrayList<>();
        int i = 0;
        while (i < elements.size()) {
            if (elements.get(i).pressed == 1) {
                selected.add(elements.get(i));
            }
            i = i + 1;
        }


        if (selected.size() == 2) {
            if (selected.get(0).type == selected.get(1).type) {
                frame.remove(selected.get(0).button);
                frame.remove(selected.get(1).button);
            }
        }

        frame.repaint();


    }

    public static void hide(Element element, int index) {
        element.button.setIcon(resizeIcon(backIcon, 150, 150));
    }

    public static void show(Element element, int index) {
        element.button.setIcon(resizeIcon(element.icon, 150, 150));
    }

    public static void hideIfNeeded(ArrayList<Element> elements) {
        int i = 0;
        int sum = 0;

        while (i < elements.size()) {
            sum = sum + elements.get(i).pressed;
            i = i + 1;
        }

        if (sum >= 2) {
            i = 0;
            while (i < elements.size()) {
                hide(elements.get(i), i);
                elements.get(i).pressed = 0;
                i = i + 1;
            }
        }


    }

    private static ImageIcon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }


    static class Element {
        JButton button;
        int pressed;
        ImageIcon icon;
        int type;
    }
}
