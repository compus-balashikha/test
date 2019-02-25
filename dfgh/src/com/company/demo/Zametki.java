package com.company.demo;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Zametki {

    static String bip = "Тима Белорусских - Незабудка.mp3";

    static JLabel lastLabel;
    static JFrame frame;
    static JButton buttonNewNote;
    static JTextArea textArea;
    static JLabel currentLabel;
    static JButton buttonSave;
    static int counter = 0;

    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException, JavaLayerException {

//        FileDialog fileDialog = new FileDialog((Frame) null);
//        fileDialog.setVisible(true);
//
//        File file = new File(fileDialog.getDirectory() + fileDialog.getFile());
//
//        System.out.println(fileDialog.getDirectory());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//
//        File fileCopy = new File(file.getName());
//        System.out.println(fileCopy.getAbsolutePath());
//        System.out.println(fileCopy.getName());
//        System.out.println(fileCopy.getPath());
//
//        Files.copy(file.toPath(), fileCopy.toPath());




//        FileInputStream fis = new FileInputStream(bip);
//        Player playMP3 = new Player(fis);
//
//        playMP3.play();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    FileInputStream fis = new FileInputStream(bip);
                    Player playMP3 = new Player(fis);

                    playMP3.play();
                } catch (Exception e) {

                }
            }
        }).start();




        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1920, 1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);




        lastLabel = createLabel(50, 50, 50, 200, " Заметка");
        textArea = createTextArea(300, 50, 750, 1000);
        buttonNewNote = createButton(lastLabel.getX() + lastLabel.getWidth() / 2 - 50, lastLabel.getY() + lastLabel.getHeight() + 50, 100, 50, "new");
        buttonSave = createButton(400, 700, 100, 50, "save");
        InitText();

        frame.add(buttonSave);
        frame.add(textArea);
        frame.add(lastLabel);
        frame.add(buttonNewNote);
        frame.repaint();

        buttonNewNote.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MakeANoteClicked();
            }
        });

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveText();
                SaveInFile();
            }
        });

    }

    public static JLabel createLabel(int x, int y, int height, int width, String string) {
        JLabel label = new JLabel();
        label.setLocation(x, y);
        label.setSize(width, height);
        label.setText(string);
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setName(counter + "note");
        label.setFont(new Font("", 0, 24));

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LabelClicked(label);
            }
        });

        return label;
    }

    public static JTextArea createTextArea(int x, int y, int height, int width) {
        JTextArea textArea = new JTextArea();
        textArea.setLocation(x, y);
        textArea.setSize(width, height);

        textArea.setFont(new Font("", 0, 32));

        return textArea;
    }

    public static JButton createButton(int x, int y, int width, int height, String text) {
        JButton button = new JButton();
        button.setSize(width, height);
        button.setLocation(x, y);
        button.setText(text);

        return button;
    }

    static int i = 1;

    public static void MakeANoteClicked() {
        lastLabel = createLabel(lastLabel.getX(), lastLabel.getY() + lastLabel.getHeight() + 50, 50, 200, "New Note");

        lastLabel.setName("" + i);

        File file = new File(lastLabel.getName());

        i = i + 1;
        String name = lastLabel.getName();
        frame.add(lastLabel);
        frame.repaint();

        buttonNewNote.setLocation(lastLabel.getX() + lastLabel.getWidth() / 2 - 50, lastLabel.getY() + lastLabel.getHeight() + 50);

    }

    public static void LabelClicked(JLabel label) {

        if (label == currentLabel) {
            return;
        }


        label.setOpaque(true);
        label.setBackground(Color.BLACK);


        textArea.setText(label.getText());

        if (currentLabel == null) {

        } else {
            currentLabel.setOpaque(true);
            currentLabel.setBackground(Color.white);
        }
        currentLabel = label;

    }

    public static void SaveText() {
        currentLabel.setText(textArea.getText());
    }

    public static void SaveInFile() {
        File folder = new File("Notes");
        folder.mkdirs();
        File file = new File("Notes/" + currentLabel.getName() + ".txt");

        try {
            Writer writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            writer.append(currentLabel.getText());

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void InitText() {
        File folder = new File("Notes");
        File[] files = folder.listFiles();
        int i = 0;
        while (i < files.length) {
            File file = files[i];
            i = i + 1;
            if (file.getName().equals(".DS_Store")) {
                continue;
            }
            try {
                String strFromFile = new String(Files.readAllBytes(file.toPath()));
                System.out.println(strFromFile);
                MakeANoteClicked();
                lastLabel.setText(strFromFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}