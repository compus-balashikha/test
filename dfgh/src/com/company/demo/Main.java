package com.company.demo;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setSize(400, 400);
//
//        frame.setLayout(null);
//
//        NotClip clip = new NotClip();
//        clip.setSize(26, 26);
//        clip.setLocation(150, 150);
//        frame.add(clip);
//        NotClip clip2 = new NotClip();
//        clip2.setSize(26, 26);
//        clip2.setLocation(175, 150);
//        frame.add(clip2);

        String result = readStringFromURL("https://api.hh.ru/metro/1");

        System.out.println(result);
    }

    public static String readStringFromURL(String requestURL) {
        try (Scanner scanner = new Scanner(new URL(requestURL).openStream(),
                StandardCharsets.UTF_8.toString())) {
            scanner.useDelimiter("\\A");
            if (scanner.hasNext()) {
                return scanner.next();
            } else {
                return "";
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Error";
    }
}


class NotClip extends JComponent {

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.drawLine(0, 0, 0, 25);
        g.drawLine(0, 25, 25, 25);
        g.drawLine(25, 25, 25, 0);
        g.drawLine(25, 0, 0, 0);
    }
}
