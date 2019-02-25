package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class File1 {
    public static void main(String[] args) {
//        File folder = new File("заметки");
//        folder.mkdirs();
//        File file = new File("заметки/1 заметка.txt");
//
//        try {
//            Writer writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
//
//            writer.append("Hello file!");
//
//            writer.flush();
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        File file = new File("1 заметка");

        File folder = new File("заметки");

        File[] files = folder.listFiles();
        int i = 0;
        while (i < files.length) {
//            File file = files[i];
            // get string from file
            // create label
            // set string to label
            i = i + 1;
        }

        try {
            String strFromFile = new String(Files.readAllBytes(file.toPath()));
            System.out.println(strFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
