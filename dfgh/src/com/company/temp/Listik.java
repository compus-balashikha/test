package com.company.temp;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

//нужно указать, что листик является компонентом
//компоненты это как раз такие штуки, в которых можно рисовать
public class Listik extends JComponent {

    @Override
    public void paint(Graphics g) {
        //4 линии у квадрата с координатами точек
        // (100, 100) (200, 100) (200, 200) (100, 200)
        g.drawLine(100, 100, 200, 100); // из (100, 100) в (200, 100)
        g.drawLine(200, 100, 200, 200); // из (200, 100) в (200, 200)
        g.drawLine(200, 200, 100, 200);
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        g.drawLine(100, 200, 100, 100);

    }
}
